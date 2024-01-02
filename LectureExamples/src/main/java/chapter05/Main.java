package chapter05;

public class Main {

    public static void main(String[] args) {

        System.out.println(Book.getNextIdNum());

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        System.out.println("\nBook 1 has an ID of " + book1.getBookId());
        System.out.println(Book.getNextIdNum());

        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        System.out.println("Book 2 has an ID of " + book2.getBookId());
        System.out.println(Book.getNextIdNum());

        Book book3 = new Book("1984", "George Orwell");
        System.out.println("Book 3 has an ID of " + book3.getBookId());
        System.out.println(Book.getNextIdNum());

        System.out.println(book1);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks();

        Book book4 = new Book("Contact", "Carl Sagan", 430);
        Book book5 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book6 = new Book("1984", "George Orwell");

        System.out.println(library);

        Library library2 = new Library();

        library2.addBook(book4);
        library2.addBook(book5);
        library2.addBook(book6);

        System.out.println("\nAre the two libraries identical?");
        System.out.println(library == library2);

        System.out.println("\nAre the two libraries equal?");
        System.out.println(library.equals(library2));

    }
}
