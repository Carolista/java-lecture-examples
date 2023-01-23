package class04;

import java.util.ArrayList;

public class Library {

    // TODO: Ensure books cannot be overwritten by another object
    // Also, make books available to package
    final ArrayList<Book> books = new ArrayList<>();

    // TODO: Write a custom equals() method to compare the contents of books
    // Use the @Override annotation
    // First include a reference check, null check, class check, and cast (see chapter 5.3.2.2)
    // Then compare the size of the books lists
    // Finally, loop through both lists and compare the books on their title & author
    @Override
    public boolean equals(Object toBeCompared) {

        // Reference check
        if (this == toBeCompared) {
            return true;
        }

        // Null check
        if (toBeCompared == null) {
            return false;
        }

        // Class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        // Cast
        Library otherLibrary = (Library) toBeCompared;

        // Compare size of lists first
        if (books.size() != otherLibrary.books.size()) {
            return false;
        }

        // Custom comparison of contents
        for (Book book : books) {
            int index = otherLibrary.findBook(book.getTitle(), book.getAuthor());
            if (index == -1) {
                return false;
            }
        }
        return true;
    }

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
