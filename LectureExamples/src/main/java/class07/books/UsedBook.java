package class07.books;

import class07.Discountable;
import class07.Utils;

public class UsedBook extends Book implements Discountable {

    private String condition;

    public UsedBook(String name, String desc, double originalPrice, int quantity, String author, String genre, String format, int numPages, String condition) {
        super(name, desc, originalPrice, quantity, author, genre, format, numPages);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCondition: " + condition;
    }

    @Override
    public void applyPercentDiscount(double percent) {
        if (percent > 1) {
            percent /= 100;
        }
        double newPrice = getCurrentPrice() * (1 - percent);
        setCurrentPrice(Utils.roundToPenny(newPrice));
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of " + percent +
                    "% has been applied to product " + getId() +
                    ", " + getName());
        } else {
            System.out.println("\nAdditional discount of " + percent +
                    "% has been applied to product " + getId() +
                    ", " + getName());
        }
    }

    @Override
    public void applyFlatDiscount(double amount) {
        setCurrentPrice(getCurrentPrice() - amount);
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName());
        } else {
            System.out.println("\nAdditional discount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName());
        }
    }

    @Override
    public void removeDiscount() {
        setCurrentPrice(getOriginalPrice());
        System.out.println("Used book " + getId() + ", " +
                getName() + ", has been reset to the original price of $" +
                getOriginalPrice());
    }
}
