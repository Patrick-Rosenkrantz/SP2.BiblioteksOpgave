public class PhysicalTitle extends Title{
    protected int copies;

    public PhysicalTitle(String title, String literaturType, int copies){
        super(title, literaturType);
        this.copies = copies;
    }

    @Override
    protected double calculatePoints() {
        return 0;
    }
}
