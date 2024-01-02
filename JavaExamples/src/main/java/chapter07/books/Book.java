package chapter07.books;

// TODO: Refactor class to inherit from Product
public class Book {

    private static int nextId = 1;

    private final int id;
    private String name;
    private String desc;
    private double price;
    private int quantity;

    private String author;
    private String genre;
    private String format;

    public Book(String name, String desc, double price, int quantity, String author, String genre, String format) {
        this.id = nextId;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
        this.genre = genre;
        this.format = format;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        quantity -= amount;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return "PRODUCT INFORMATION:" + newline +
                "ID: " + id + newline +
                "Item: " + name + newline +
                "Description: " + desc + newline +
                "Price: " + price + newline +
                "Quantity: " + quantity + newline +
                "Author: " + author + newline +
                "Genre: " + genre + newline +
                "Format: " + format + newline;
    }

    // TODO: Define describe() as required by Product
}
