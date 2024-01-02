package chapter08.books;

// TODO: Implement Discountable interface
public class UsedBook extends Book {

    private final String condition;

    public UsedBook(String name, String desc, double price, int quantity, String author, String genre, String format, String condition) {
        super(name, desc, price, quantity, author, genre, format);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Condition: " + condition + newline;
    }

    @Override
    public String describe() {
        String newline = System.lineSeparator();
        String pipe = " | ";
        return getName() + " by " + getAuthor() + newline +
                getDesc() + newline +
                getGenre() + pipe + getGenre() + pipe + condition + pipe + getPrice() + newline;
    }
}
