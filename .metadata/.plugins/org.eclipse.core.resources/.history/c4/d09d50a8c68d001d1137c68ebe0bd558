package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame {
	private Store store;
	private Cart cart;

	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}

	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		JMenu smUpdateStore = new JMenu("Update Store");
		JMenuItem addBook = new JMenuItem("Add Book");
		addBook.addActionListener(new AddBook(this));
		JMenuItem addDvd = new JMenuItem("Add DVD");
		addDvd.addActionListener(new AddDvd(this));
		JMenuItem addCd = new JMenuItem("Add CD");
		addCd.addActionListener(new AddCd(this));
		smUpdateStore.add(addBook);
		smUpdateStore.add(addCd);
		smUpdateStore.add(addDvd);
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View Store"));
		JMenuItem viewCart = new JMenuItem("View Cart");
		viewCart.addActionListener(new ViewCart(this));
		menu.add(viewCart);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		return menuBar;
	}

	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);

		JButton btnCart = new JButton("View cart");

		btnCart.setPreferredSize(new Dimension(100, 50));
		btnCart.setMaximumSize(new Dimension(100, 50));

		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(btnCart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));

		return header;
	}

	JPanel createCenter() {

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));

		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for (int i = 0; i < 6; i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
			center.add(cell);
		}

		return center;
	}

	private class ViewCart implements ActionListener {
		private StoreScreen storeScreen;

		public ViewCart(StoreScreen storeScreen) {
			this.storeScreen = storeScreen;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			this.storeScreen.dispose();
			CartScreen cartScreen = new CartScreen(cart, store, storeScreen);
		}
	}

	public StoreScreen(Store store) {
		this.store = store;

		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);

		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);

	}

	public static void main(String[] args) {
		Store store = new Store();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd1.getId());
		store.addMedia(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd2.getId());
		store.addMedia(dvd2);

		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd4.getId());
		store.addMedia(dvd4);

		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd5.getId());
		store.addMedia(dvd5);

		DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd7.getId());
		store.addMedia(dvd7);

		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd8.getId());
		store.addMedia(dvd8);

		new StoreScreen(store);
	}

	public class AddBook implements ActionListener {
		private StoreScreen storeScreen;

		public AddBook(StoreScreen storeScreen) {
			this.storeScreen = storeScreen;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			this.storeScreen.dispose();
			AddBookToStoreScreen addBookToStoreScreen = new AddBookToStoreScreen(store, cart, this.storeScreen);
		}
	}

	public class AddDvd implements ActionListener {
		private StoreScreen storeScreen;

		public AddDvd(StoreScreen storeScreen) {
			this.storeScreen = storeScreen;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			this.storeScreen.dispose();
			AddDvdToStoreScreen addDvdToStoreScreen = new AddDvdToStoreScreen(store, cart, this.storeScreen);
		}
	}

	public class AddCd implements ActionListener {
		private StoreScreen storeScreen;

		public AddCd(StoreScreen storeScreen) {
			this.storeScreen = storeScreen;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			this.storeScreen.dispose();
			AddCdToStoreScreen addCdToStoreScreen = new AddCdToStoreScreen(store, cart, this.storeScreen);
		}
	}
}
