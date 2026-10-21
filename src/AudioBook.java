public class AudioBook extends PhysicalTitle implements IAudioBook{
    private int durationMinutes;

    public AudioBook(String title, String literatureType,int copies, int durationMinutes){
        super(title, literatureType, copies);
        this.durationMinutes = durationMinutes;
    }

    @Override
    protected double calculatePoints() {
        double points = 0;
        points = (durationMinutes*0.5) * convertLiteratureType() * copies;
        return points;
    }

    @Override
    public int getDurationInMinutes() {
        return durationMinutes;
    }
}
