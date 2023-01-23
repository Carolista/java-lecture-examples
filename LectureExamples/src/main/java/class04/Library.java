package class04;

import java.util.ArrayList;
import java.util.Objects;

public class Library {

    // TODO: Ensure books cannot be overwritten by another object
    // Also, make books available to package
    private ArrayList<Book> books = new ArrayList<>();

    // TODO: Write a custom equals() method to compare the contents of books
    // Use the @Override annotation
    // First include a reference check, null check, class check, and cast (see chapter 5.3.2.2)
    // Then compare the size of the books lists
    // Finally, loop through both lists and compare the books on their title & author


    public void addBook(Book book) {
        books.add(book);
    }

    public int findBook(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public void printAvailableBooks() {
        System.out.println("\nLIST OF BOOKS AVAILABLE:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitleAndAuthor());
            }
        }
    }
}
