package hust.soict.dsai.aims.media;

public class Disc extends Media {
    int length;
    String director;

    public Disc(String director, int length, String title, String category, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

}
