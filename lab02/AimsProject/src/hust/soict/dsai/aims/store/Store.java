package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_STORED = 20;
    DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_STORED];
    public int qtyStored = 0;

    public void addDVD(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            itemsInStore[qtyStored] = dvd;
            qtyStored++;
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        int dvdID = 0;
        for (int i = 0; i < qtyStored; i++) {
            if (itemsInStore[i].equals(disc)) {
                break;
            }
            dvdID++;
        }
        for (int i = dvdID; i < qtyStored; i++) {
            itemsInStore[i] = itemsInStore[i + 1];
        }
        qtyStored--;
    }

    public void print() {
        System.out.println("*******************CART****************");
        for (int i = 0; i < qtyStored; i++) {
            itemsInStore[i].toPrintString();
        }
        System.out.println("***************************************");
    }
}
