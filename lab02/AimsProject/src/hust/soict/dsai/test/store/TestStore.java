package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class TestStore {
    public static void main(String[] args) {
        Store StoreDemo = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
        StoreDemo.addDVD(dvd1, dvd2);
        StoreDemo.print();
        StoreDemo.removeDVD(dvd2);
        StoreDemo.print();
    }
}
