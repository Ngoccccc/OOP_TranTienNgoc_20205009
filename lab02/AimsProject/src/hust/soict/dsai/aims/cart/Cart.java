

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full now");
        } else {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("Add completed");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The list of Video is overflow");
        } else {
            for (int i = 0; i < dvdList.length; i++) {
                itemsOrdered[qtyOrdered++] = dvdList[i];
            }
            System.out.println("Add list completed");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; ++j) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                break;
            }
        }
        System.out.println("Remove completed");
    }

    public float totalCost() {
        float ans = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            ans += itemsOrdered[i].getCost();
        }
        return ans;
    }

    public void printList() {
        System.out.println("***********************CART***********************\n");
        System.out.println("Ordered Items:\n");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.print((i + 1) + ".");
            itemsOrdered[i].toPrintString();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        int count = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("match is found");
                itemsOrdered[i].toPrintString();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found DVD");
        }
    }

    public void searchByName(String title) {
        int count = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(title)) {
                System.out.println("match is found");
                itemsOrdered[i].toPrintString();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found DVD");
        }
    }

}
