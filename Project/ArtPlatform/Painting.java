package Project.ArtPlatform;

public class Painting extends ArtWork {
    public Painting(String title, String artistName, int year, String style) {
        super(title, artistName, year, style);
    }

    @Override
    public void display() {
        System.out.println("회화작품: " + title + "by" + artistName);
    }
}
