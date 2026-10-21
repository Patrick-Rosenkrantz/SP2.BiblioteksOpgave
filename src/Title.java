abstract class Title {

    private String title;
    private String literatureType;

    protected double rate(){
        return 0.067574;
    }

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty(){
        double royalties= 0;
        royalties = calculatePoints() * rate();
        return royalties;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType(){
        switch (literatureType.toUpperCase()){
            case "BI":
                return 3;

            case "TE":
                return 3;

            case "LYRIK":
                return 6;

            case "SKØN":
                return 1.7;

            case "FAG":
                return 1;
            default :
                System.out.println("invalid type");
        }
        return 0;
    }

}
