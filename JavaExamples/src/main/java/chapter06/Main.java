package chapter06;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book3 = new Book("1984", "George Orwell");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        book1.checkOut();
        book3.checkOut();

        book1.checkIn();

        System.out.println(library);

        library.printAvailableBooks();

    }
}
