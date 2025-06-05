package Project.MusicPlaying;

public abstract class Instrument {
    protected String name;
    protected String type;
    protected int volumeLevel;

//    public Instrument(String name, String type, int volumeLevel) {
//        this.name = name;
//        this.type = type;
//        this.volumeLevel = volumeLevel;
//    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }



    public abstract void play();
}
