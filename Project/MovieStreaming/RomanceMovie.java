package Project.MovieStreaming;

public class RomanceMovie extends Movie{

    public RomanceMovie(String title, String director) {
        super(title, director);
    }


    @Override
    public String getGenre() {
        return "";
    }

    @Override
    public double rate() {
        return 0.0;
    }


}
