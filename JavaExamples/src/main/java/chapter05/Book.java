package chapter05;

public class Book {

    // FIELDS

    // TODO: Declare a class-level int field that will hold the next available number for book IDs
    // Initialize it to 1

    // TODO: Declare a String field for each unique bookId, but do not initialize it
    // Make sure each book's ID cannot be changed after it is set in the constructor

    private String title;
    private String author;
    private int numPages;
    private boolean available = true;


    // CONSTRUCTORS

    // TODO: In the primary constructor, set the bookId (but not using a parameter) using instance method
    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }


    // GETTERS & SETTERS

    // TODO: Add a getter for the static field nextIdNum that can be called on the class
    // Use the IntelliJ generator and notice it makes it a static method automatically
    // Then customize to make it a meaningful sentence and change the return type to String


    // TODO: Add getter for bookId (but no setter since it is final)


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }


    // OVERRIDE SPECIAL METHODS

    // TODO: Write a custom toString() method that nicely formats the book data
    // Use the @Override annotation


    // INSTANCE METHODS

    // TODO: Define an instance method to generate a unique book Id
    // It should be private because we want it to be called ONLY from the constructor
    // Use the format (author initials)-(first three letters of title)-(next available number)
    // All letters should be capitalized
    // Increment the next ID number for the class to use next time a new Book object is instantiated


    String getTitleAndAuthor() {
        return title + " by " + author;
    }

    public void checkOut() {
        available = false;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked out of the library.");
    }

    public void checkIn() {
        available = true;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked in.");
    }
}
