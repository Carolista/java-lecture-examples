package chapter05;

import java.util.ArrayList;

public class Library {

    // FIELDS

    final ArrayList<Book> books = new ArrayList<>();


    // OVERRIDE SPECIAL METHODS

    @Override
    public String toString() {
        StringBuilder allBookInfo = new StringBuilder();
        for (Book book : books) {
            allBookInfo.append(book.toString());
            allBookInfo.append("\n------------------------------------\n");
        }
        return "\nWELCOME TO OUR LIBRARY!\n\n" +
                "View our full collection:\n" +
                "------------------------------------\n" +
                allBookInfo; // automatically converted to String due to concatenation
    }

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


    // INSTANCE METHODS

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
