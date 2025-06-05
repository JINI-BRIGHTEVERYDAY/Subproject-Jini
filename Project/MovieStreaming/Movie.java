package Project.MovieStreaming;

public abstract class Movie {
    protected String title;
    protected String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public abstract String getGenre();

    public abstract double rate();

}
