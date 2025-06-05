package Project.MusicPlaying;

public class MusicConductor {

    public void smartPerformance(Instrument[] band) {
        for (Instrument instrument : band) {
            instrument.play();
        }
    }


}
