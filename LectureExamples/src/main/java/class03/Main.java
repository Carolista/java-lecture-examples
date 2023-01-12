package class03;

public class Main {

    public static void main(String[] args) {

        // TODO: Instantiate a Library object called library
        Library library = new Library();

        // TODO: Instantiate 3 books — two with numPages and one without
        Book book1 = new Book("Contact", "Carl Sagan", 430);
        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book3 = new Book("1984", "George Orwell");

        // TODO: Add each book to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // TODO: Print available books
        library.printAvailableBooks();

        // TODO: Check out the first book
        book1.checkOut();

        // TODO: Print available books again
        library.printAvailableBooks();

        // TODO: Check out the second book and check in the first book
        book2.checkOut();
        book1.checkIn();

        // TODO: Print available books again
        library.printAvailableBooks();

    }
}
