package class07.books;

import class07.Discountable;
import class07.Utils;

public class UsedBook extends Book implements Discountable {

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
                getGenre() + pipe + getGenre() + pipe + condition + pipe + getCurrentPrice() + newline;
    }

    @Override
    public void applyPercentDiscount(double percent) {
        String newline = System.lineSeparator();
        if (percent > 1) {
            percent /= 100;
        }
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of " + (percent * 100) +
                    "% has been applied to product " + getId() +
                    ", " + getName() + newline);
        } else {
            System.out.println("\nAdditional discount of " + (percent * 100)  +
                    "% has been applied to product " + getId() +
                    ", " + getName() + newline);
        }
        double newPrice = getCurrentPrice() * (1 - percent);
        setCurrentPrice(Utils.roundToPenny(newPrice));
    }

    @Override
    public void applyFlatDiscount(double amount) {
        String newline = System.lineSeparator();
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName() + newline);
        } else {
            System.out.println("\nAdditional discount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName() + newline);
        }
        setCurrentPrice(getCurrentPrice() - amount);
    }

    @Override
    public void removeDiscount() {
        String newline = System.lineSeparator();
        setCurrentPrice(getOriginalPrice());
        System.out.println("Used book " + getId() + ", " +
                getName() + ", has been reset to the original price of $" +
                getOriginalPrice() + newline);
    }
}
