package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Roger Aller", 18.99f);
		cart.addDigitalVideoDisc(dvd3);

		cart.printList();
		cart.searchById(1);
		cart.searchById(5);
		cart.searchByName("Aladin");
		cart.searchByName("test");
	}
}
