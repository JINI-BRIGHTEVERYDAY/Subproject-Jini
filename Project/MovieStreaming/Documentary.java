package Project.MovieStreaming;

public class Documentary extends Movie{

    public Documentary(String title, String director) {
        super(title, director);
    }


    @Override
    public String getGenre() {
        return "다큐멘터리입니다";
    }

    @Override
    public double rate() {
        return 0.0;
    }
}
