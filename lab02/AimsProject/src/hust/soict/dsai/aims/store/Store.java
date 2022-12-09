package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    public static final int MAX_NUMBERS_STORED = 20;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media item) {
        if (item != null) {
            itemsInStore.add(item);
            System.out.println("Add successfully!");
        } else {
            System.out.println("Error");
        }
    }

    public void removeMedia(Media item) {
        if (item != null) {
            itemsInStore.remove(item);
            System.out.println("Remove successfully!");
        } else {
            System.out.println("Error");
        }
    }

    public void print() {
        if (itemsInStore.isEmpty()) {
            System.out.println("Empty store");
        } else {
            itemsInStore.forEach((item) -> System.out.println(item.toString()));
        }
    }
}
