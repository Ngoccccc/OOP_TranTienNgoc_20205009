package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private List<String> authors = new ArrayList<String>();

    public Book() {

    }

    public Book(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }

    public void addAuthor(String authorName) {
        int n = authors.size();
        for (int i = 0; i < n; i++) {
            if (!authors.get(i).equals(authorName)) {
                authors.add(authorName);
                System.out.println("Add completed");
            } else
                System.out.println("Author is already exist");
        }
    }

    public void removeAuthor(String authorName) {
        int n = authors.size();
        for (int i = 0; i < n; i++) {
            if (authors.get(i).equals(authorName)) {
                authors.remove(i);
                System.out.println("Remove completed");

            } else
                System.out.println("Author is not exist can not be removed");
        }
    }

    public String toString() {
        return this.getId() + ".CD - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + " $";
    }
}
