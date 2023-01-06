package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class TestStore {
    public static void main(String[] args) {
        Store store = new Store();
        store.printStore();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "David", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("attack on titan", "Anime", "Han", 88, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("jujutsukaisen", "Anime", "mappa", 89, 18.99f);

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        store.printStore();

        store.removeMedia(dvd3);

        store.printStore();
    }
}