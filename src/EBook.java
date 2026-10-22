public class EBook extends NetTitle {
    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    private double calculatePages(){
        double calculatedPages = 0;
        calculatedPages  = characters / 1800 + 20;
        if (illustrated){
            calculatedPages = calculatedPages * 1.1;
        }
        return calculatedPages;
    }



    @Override
    protected double calculatePoints() {
        double totalPoints = 0;
        totalPoints = calculatePages() * convertLiteratureType() * getPseudoCopies();
        return totalPoints;
    }
}
