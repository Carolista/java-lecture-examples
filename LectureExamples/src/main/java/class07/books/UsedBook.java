package class07.books;

// TODO: implement Discountable interface

public class UsedBook extends Book {

    private final String condition;

    public UsedBook(String name, String desc, double originalPrice, int quantity, String author, String genre, String format, int numPages, String condition) {
        super(name, desc, originalPrice, quantity, author, genre, format, numPages);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCondition: " + condition;
    }

    // TODO: add methods required by Discountable interface

}
