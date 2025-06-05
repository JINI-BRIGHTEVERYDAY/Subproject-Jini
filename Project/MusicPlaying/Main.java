package Project.MusicPlaying;

public class Main {
    public static void main(String[] args) {
        Instrument[] band = {new Piano(), new Drum(), new Violin()};

        MusicConductor musicConductor = new MusicConductor();
        musicConductor.smartPerformance(band);
    }
}
