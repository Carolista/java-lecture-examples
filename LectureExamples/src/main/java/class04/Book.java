package class04;

public class Book {

    // FIELDS

    private static int nextIdNum = 1;

    private final String bookId;
    private String title;
    private String author;
    private int numPages;
    private boolean available = true;


    // CONSTRUCTORS

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.bookId = generateBookId(); // last because other fields must already have values
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }


    // GETTERS & SETTERS

    // Customized
    public static String getNextIdNum() {
        return "\nThe next available number for a book Id will be " + nextIdNum;
    }

    public String getBookId() {
        return bookId;
    }

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

    @Override
    public String toString() {
        return "\n" + getTitleAndAuthor() + "\n" + numPages + " pages \nID: " + bookId;
    }


    // INSTANCE METHODS

    private String generateBookId() {
        String id = Utils.getInitials(author) + "-" + title.substring(0,3).toUpperCase() + "-" + nextIdNum;
        nextIdNum++;
        return id;
    }

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
