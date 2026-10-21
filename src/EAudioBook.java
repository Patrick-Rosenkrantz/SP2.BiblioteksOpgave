public class EAudioBook extends NetTitle implements IAudioBook {
    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        double calculatedPoints= 0;
        calculatedPoints = calculatePoints(getDurationInMinutes());
        return calculatedPoints;
    }

    @Override
    public int getDurationInMinutes() {
        int calculatedMinutes = 0;
        calculatedMinutes = durationInMinutes / 2;
        return calculatedMinutes;
    }
}