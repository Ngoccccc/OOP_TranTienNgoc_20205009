package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;

    private ArrayList<Track> tracks = new ArrayList<Track>();
    
    public CompactDisc() {
    	
    }
    public CompactDisc(String director, int length, String title, String category, float cost, String artist,
            ArrayList<Track> tracks) {
        super(director, length, title, category, cost);
        this.artist = artist;
    }
    
    public void setTracks(ArrayList<Track> input) {
    	this.tracks = input;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            return;
        }
        System.out.println("This track is already exist");
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            return;
        }
        System.out.println("This track is not exist");
    }

    public int getLength() {
        int length = 0;
        for (int i = 0; i < tracks.size(); i++) {
            length += tracks.get(i).getLength();
        }
        return length;
    }

    public void play() {
        for (int i = 0; i < tracks.size(); ++i) {
            tracks.get(i).play();
        }
    }

    public String toString() {
        return this.getId() + ".CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector()
                + " - " + this.getLength() + " - " + this.getArtist() + ": " + this.getCost() + " $";
    }
}
