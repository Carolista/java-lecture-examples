package class07.books;

import class07.Product;

public class Book extends Product {

    private String author;
    private String genre;
    private String format;
    private int numPages;

    public Book(String name, String desc, double originalPrice, int quantity, String author, String genre, String format, int numPages) {
        super(name, desc, originalPrice, quantity);
        this.author = author;
        this.genre = genre;
        this.format = format;
        this.numPages = numPages;
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

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAuthor: " + author +
                "\nGenre: " + genre +
                "\nFormat: " + format +
                "\nNumPages: " + numPages;
    }
}
