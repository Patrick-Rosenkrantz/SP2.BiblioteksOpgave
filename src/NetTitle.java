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


    public double getPseudoCopies(){
        double totalPoints = 0;
        totalPoints = ((reach*5)+(availability*0.5) + getUseFactor());
        return totalPoints;
    }

    public int getUseFactor(){
        return use;
    }




}