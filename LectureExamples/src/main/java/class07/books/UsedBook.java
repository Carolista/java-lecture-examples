package class07.books;

// TODO: implement Discountable interface

import class07.Discountable;
import class07.Utils;

public class UsedBook extends Book implements Discountable {

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

    @Override
    public void applyPercentDiscount(double percent) {
        if (percent > 1) {
            percent /= 100;
        }
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of " + (percent * 100) +
                    "% has been applied to product " + getId() +
                    ", " + getName());
        } else {
            System.out.println("\nAdditional discount of " + (percent * 100)  +
                    "% has been applied to product " + getId() +
                    ", " + getName());
        }
        double newPrice = getCurrentPrice() * (1 - percent);
        setCurrentPrice(Utils.roundToPenny(newPrice));
    }

    @Override
    public void applyFlatDiscount(double amount) {
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName());
        } else {
            System.out.println("\nAdditional discount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName());
        }
        setCurrentPrice(getCurrentPrice() - amount);
    }

    @Override
    public void removeDiscount() {
        setCurrentPrice(getOriginalPrice());
        System.out.println("Used book " + getId() + ", " +
                getName() + ", has been reset to the original price of $" +
                getOriginalPrice());
    }
}
