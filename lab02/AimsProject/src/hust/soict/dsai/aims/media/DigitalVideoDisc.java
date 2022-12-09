package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private String director;
    private int length;
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

    public void toPrintString() {
        System.out.println(
                "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.director + " - " + this.length
                        + ": " + this.getCost() + "\n");
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());

        System.out.println("DVD length: " + this.getLength());
    }
}
