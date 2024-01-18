package chapter08.books;

import chapter08.Common;

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
        return super.toString() +
                "Condition: " + condition + Common.newline;
    }

    @Override
    public String describe() {
        return getName() + " by " + getAuthor() + Common.newline +
                getDesc() + Common.newline +
                getGenre() + Common.pipe + getFormat() + Common.pipe + condition + Common.pipe + getPrice() + Common.newline;
    }
}
