package Project.MovieStreaming;

public class ActionMovie extends Movie{

    public ActionMovie(String title, String director) {
        super(title, director);
    }


    @Override
    public String getGenre() {
        return "액션영화입니다.";
    }

    @Override
    public double rate() {
        return 0.0;
    }
}
