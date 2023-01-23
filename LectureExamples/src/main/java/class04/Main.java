package class04;

public class Main {

    public static void main(String[] args) {

        // TODO: Print the first available ID number if a book object were to be created
        System.out.println(Book.getNextIdNum());

        // TODO: After instantiating each book object:
        //  print its id number, then
        //  print the next available ID number now stored at the class level

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        System.out.println("\nBook 1 has an ID of " + book1.getBookId());
        System.out.println(Book.getNextIdNum());

        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        System.out.println("Book 2 has an ID of " + book2.getBookId());
        System.out.println(Book.getNextIdNum());

        Book book3 = new Book("1984", "George Orwell");
        System.out.println("Book 3 has an ID of " + book3.getBookId());
        System.out.println(Book.getNextIdNum());

        // TODO: Test the toString() method of the Book class by printing the first book
        System.out.println(book1);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks();

        // TODO: Create a second set of the same books as above
        Book book4 = new Book("Contact", "Carl Sagan", 430);
        Book book5 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book6 = new Book("1984", "George Orwell");

        // TODO: Create a second library and add all three new books to it
        Library library2 = new Library();

        library2.addBook(book4);
        library2.addBook(book5);
        library2.addBook(book6);

        // TODO: Use the strict equality operator to compare the identity of the two libraries
        System.out.println("\nAre the two libraries identical?");
        System.out.println(library == library2);

        // TODO: Now use the equals() method to compare their contents
        System.out.println("\nAre the two libraries equal?");
        System.out.println(library.equals(library2));

    }
}
