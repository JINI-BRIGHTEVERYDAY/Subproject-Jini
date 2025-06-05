package Project.ArtPlatform;

public class Sculpture extends ArtWork{
    public Sculpture(String title, String artistName, int year, String style) {
        super(title, artistName, year, style);
    }

    @Override
    public void display() {
        System.out.println("[조각] \"" + title + "\" by " + artistName + " (" + year + ", " + style + ")");
    }
}
