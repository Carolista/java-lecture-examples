package class03;

import java.util.ArrayList;

public class Library {

    // TODO: Declare a field, books, as an ArrayList of Book objects
    // Give it private access
    private ArrayList<Book> books = new ArrayList<>();

    // Note: no constructor is required to instantiate a library object

    // TODO: Define a public method, addBook()
    public void addBook(Book book) {
        books.add(book);
    }

    // TODO: Define a public method, printAvailableBooks()
    // It should print only books that aren't checked out
    public void printAvailableBooks() {
        System.out.println("\nLIST OF BOOKS AVAILABLE:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitleAndAuthor());
            }
        }
    }
}
