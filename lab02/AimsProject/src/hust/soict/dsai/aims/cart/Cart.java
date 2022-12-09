
import java.util.ArrayList;
import java.util.Collections;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);

    public void addMedia(Media media) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full now");
        } else {
            itemsOrdered.add(media);
            System.out.println("Add completed");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Remove completed");
            return;
        }
        System.out.println("not found");

    }

    public float totalCost() {
        float ans = 0.0f;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            ans += itemsOrdered.get(i).getCost();
        }
        return ans;
    }

    public void printList() {
        System.out.println("***********************CART***********************\n");
        System.out.println("Ordered Items:\n");

        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.print((i + 1) + ".");
            itemsOrdered.get(i).toPrintString();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        int count = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getId() == id) {
                System.out.println("match is found");
                itemsOrdered.get(i).toPrintString();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found DVD");
        }
    }

    public void searchByName(String title) {
        int count = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getTitle().equals(title)) {
                System.out.println("match is found");
                itemsOrdered.get(i).toPrintString();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found DVD");
        }
    }

}
