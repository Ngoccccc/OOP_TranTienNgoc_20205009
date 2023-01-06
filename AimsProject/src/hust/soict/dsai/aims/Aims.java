package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    // Add Book to Cart(Method in AddToStore)
    public static void addBookToStore(Scanner sc, Store anStore) {
        Media book = new Book();
        System.out.println("Book title: ");
        String title = sc.nextLine();
        // Check Book to Store.
        if (anStore.search(title)) {
            System.err.println("The Media already exists");
        } else {
            book.setTitle(title);
            System.out.println("Book category: ");
            book.setCategory(sc.nextLine());
            System.out.println("Book cost: ");
            book.setCost(sc.nextFloat());
            sc.nextLine();
            System.out.println("Book id: ");
            book.setId(sc.nextInt());
            System.out.println("Book added");
            anStore.addMedia(book);
        }
    }

    // Add CD to Cart(Method in AddToStore)
    public static void addCDToStore(Scanner sc, Store anStore) {
        Media cd = new CompactDisc(null, 0, null, null, 0, null, null);
        System.out.println("CD title: ");
        String title = sc.nextLine();
        // Check CD to Store
        if (anStore.search(title)) {
            System.err.println("The Media already exists");
        } else {
            cd.setTitle(title);
            System.out.println("CD artist: ");
            cd.setArtist(sc.nextLine());
            System.out.println("CD category: ");
            cd.setCategory(sc.nextLine());
            System.out.println("CD cost: ");
            cd.setCost(sc.nextFloat());
            sc.nextLine();
            System.out.println("CD id: ");
            cd.setId(sc.nextInt());
            anStore.addMedia(cd);
            System.out.println("CD added");
        }
    }

    // Add DVD to Cart(Method in AddToStore)
    public static void addDVDToStore(Scanner sc, Store anStore) {
        Media dvd = new DigitalVideoDisc(null, null, null, 0, 0);
        System.out.println("DVD title: ");
        String title = sc.nextLine();
        // Check DVD to Store
        if (anStore.search(title)) {
            System.err.println("The Media already exists");
        } else {
            dvd.setTitle(title);
            System.out.println("DVD category: ");
            dvd.setCategory(sc.nextLine());
            System.out.println("DVD cost: ");
            dvd.setCost(sc.nextFloat());
            sc.nextLine();
            System.out.println("DVD id: ");
            dvd.setId(sc.nextInt());
            System.out.println("DVD length: ");
            dvd.setLength(sc.nextInt());
            System.out.println("DVD added");
            anStore.addMedia(dvd);
            System.out.println("DVD added");
        }
    }

    public static void addToStore(Scanner sc, Store anStore) {
        System.out.println("Add Media To Store");
        System.out.println("What is the item type ?\n1. Book\n2. CD\n3. DVD");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                addBookToStore(sc, anStore);
                break;
            case 2:
                addCDToStore(sc, anStore);
                break;
            case 3:
                addDVDToStore(sc, anStore);
                break;
            default:
                System.out.println("Not Corrected");
        }
    }

    public static void removeToStore(Scanner sc, Store anStore) {
        System.out.println("Remove Media To Store");
        System.out.print("Media title remove is: ");
        String title = sc.nextLine();
        if (!anStore.search(title)) {
            System.out.println("The media doesn't exist");
        } else {
        }
    }

    public static void UpdateStore(Scanner sc, Store anStore) {
        System.out.println("Update Store");
        System.out.println("Add or Remove\n 1.Add\n 2.Remove");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                addToStore(sc, anStore);
                break;
            case 2:
                removeToStore(sc, anStore);
                break;
            default:
                System.out.println("Not Corrected");
        }
    }

    // Add Book to Cart(Method in AddToCart)
    public static void addBookToCart(Scanner sc, Cart anOrder, Store anStore) {
        Media book = new Book();
        System.out.println("Book title: ");
        String title = sc.nextLine();
        book.setTitle(title);
        System.out.println("Book category: ");
        book.setCategory(sc.nextLine());
        System.out.println("Book cost: ");
        book.setCost(sc.nextFloat());
        sc.nextLine();
        System.out.println("Book id: ");
        book.setId(sc.nextInt());
        System.out.println("Book added");
        anOrder.addMedia(book);
    }

    // Add CD to Cart(Method in AddToCart)
    public static void addCDToCart(Scanner sc, Cart anOrder, Store anStore) {
        Media cd = new CompactDisc(null, 0, null, null, 0, null, null);
        System.out.println("CD title: ");
        String n = sc.nextLine();
        cd.setTitle(n);
        System.out.println("CD artist: ");
        cd.setArtist(sc.nextLine());
        System.out.println("CD category: ");
        cd.setCategory(sc.nextLine());
        System.out.println("CD cost: ");
        cd.setCost(sc.nextFloat());
        sc.nextLine();
        System.out.println("CD id: ");
        cd.setId(sc.nextInt());
        anOrder.addMedia(cd);
        System.out.println("CD added");
    }

    // Add DVD to Cart(Method in AddToCart)
    public static void addDVDToCart(Scanner sc, Cart anOrder, Store anStore) {
        Media dvd = new DigitalVideoDisc(null);
        System.out.println("DVD title: ");
        dvd.setTitle(sc.nextLine());
        System.out.println("DVD category: ");
        dvd.setCategory(sc.nextLine());
        System.out.println("DVD cost: ");
        dvd.setCost(sc.nextFloat());
        sc.nextLine();
        System.out.println("DVD id: ");
        dvd.setId(sc.nextInt());
        System.out.println("DVD length: ");
        dvd.setLength(sc.nextInt());
        System.out.println("DVD added");
        anOrder.addMedia(dvd);
        System.out.println("DVD added");
    }

    public static void addToCart(Scanner sc, Cart anOrder, Store anStore) {
        System.out.println("Add item to the order");
        System.out.println("What is the item type ?\n1. Book\n2. CD\n3. DVD");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                addBookToCart(sc, anOrder, anStore);
                break;
            case 2:
                addCDToCart(sc, anOrder, anStore);
                break;
            case 3:
                addDVDToCart(sc, anOrder, anStore);
                break;
            default:
                System.out.println("Not Corrected");
        }
    }

    public static void seeAMediaDetails(Scanner sc, Cart anOrder, Store anStore) {
        System.out.println("See A Media Details");
        System.out.print("Media Title is: ");
        String title = sc.nextLine();
        System.out.println("");
    }

    public static void playMedia(Scanner sc, Cart anOrder, Store anStore) {
        System.out.println("Play");
        System.out.print("Media Title is: ");
        String title = sc.nextLine();
        System.out.println("");
        // Check Media in Store and Play. But Store is null.
        // if(anStore.search(title)) {
        // True: Play Media in Store
        // False: Exit Method
        // }
    }

    public static void menu_1(Scanner sc, Cart anOrder, Store anStore) {
        int k = sc.nextInt();
        do {
            switch (k) {
                case 0:
                    k = 0;
                    break;
                case 1:
                    seeAMediaDetails(sc, anOrder, anStore);
                    mediaDetailsMenu();
                    break;
                case 2:
                    addToCart(sc, anOrder, anStore);
                    anOrder.printList();
                    break;
                case 3:
                    playMedia(sc, anOrder, anStore);
                    break;
                case 4:
                    break;
                default:
                    k = 0;
                    break;
            }
        } while (k == 0);
    }

    public static void menu(Scanner sc, Cart anOrder, Store anStore) {
        int k = sc.nextInt();
        do {
            switch (k) {
                case 0:
                    k = 0;
                    System.out.println("Exit");
                    break;
                case 1:
                    anOrder.printList();
                    storeMenu();
                    menu_1(sc, anOrder, anStore);
                    break;
                case 2:
                    addToCart(sc, anOrder, anStore);
                    anOrder.printList();
                    break;
                case 3:
                    UpdateStore(sc, anStore);
                    break;
                default:
                    k = 0;
                    break;
            }
        } while (k == 0);
    }

    public static void main(String[] args) {
        showMenu();
        Scanner sc = new Scanner(System.in);
        Cart anOrder = new Cart();
        Store anStore = new Store();
        menu(sc, anOrder, anStore);
        // TODO Auto-generated method stub
        sc.close();
    }
}
