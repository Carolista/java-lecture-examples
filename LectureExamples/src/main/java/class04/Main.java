package class04;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book3 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks();

        book1.checkOut();
        library.printAvailableBooks();

        book2.checkOut();
        book1.checkIn();
        library.printAvailableBooks();

    }
}
