public abstract class NetTitle extends Title {
    private int availability;
    private int reach;
    private int use;


    public NetTitle(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }


    protected double calculatePoints(double pagesOrMinutes) {
        double totalPoints = 0;
        totalPoints = pagesOrMinutes * convertLiteratureType() *((reach*5)+(availability*0.5) + use);
        return totalPoints;
    }
}