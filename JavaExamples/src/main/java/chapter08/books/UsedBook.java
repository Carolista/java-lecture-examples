package chapter08.books;

import chapter08.Common;
import chapter08.Discountable;
import chapter08.Utils;

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
        return super.toString() +
                "Condition: " + condition + Common.newline;
    }

    @Override
    public String describe() {
        return getName() + " by " + getAuthor() + Common.newline +
                getDesc() + Common.newline +
                getGenre() + Common.pipe + getFormat() + Common.pipe + condition + Common.pipe + getCurrentPrice() + Common.newline;
    }

    @Override
    public void applyPercentDiscount(double percent) {
        if (percent > 1) {
            percent /= 100;
        }
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of " + (percent * 100) +
                    "% has been applied to product " + getId() +
                    ", " + getName() + Common.newline);
        } else {
            System.out.println("\nAdditional discount of " + (percent * 100)  +
                    "% has been applied to product " + getId() +
                    ", " + getName() + Common.newline);
        }
        double newPrice = getCurrentPrice() * (1 - percent);
        setCurrentPrice(Utils.roundToPenny(newPrice));
    }

    @Override
    public void applyFlatDiscount(double amount) {
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName() + Common.newline);
        } else {
            System.out.println("\nAdditional discount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName() + Common.newline);
        }
        setCurrentPrice(getCurrentPrice() - amount);
    }

    @Override
    public void removeDiscount() {
        setCurrentPrice(getOriginalPrice());
        System.out.println("Used book " + getId() + ", " +
                getName() + ", has been reset to the original price of $" +
                getOriginalPrice() + Common.newline);
    }
}
