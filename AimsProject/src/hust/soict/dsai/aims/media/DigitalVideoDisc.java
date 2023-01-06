package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(director, length, title, category, cost);
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title) {
        super(title);
        this.setId(++nbDigitalVideoDiscs);
    }

    public String toString() {
        return this.getId() + ".DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector()
                + " - " + this.getLength() + ": " + this.getCost() + " $";
    }

    public boolean isMatch(String title) {
        return this.getTitle().contains(title);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());

        System.out.println("DVD length: " + this.getLength());
    }
}
