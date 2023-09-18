package class07.merchandise;

import class07.Discountable;
import class07.Product;
import class07.Utils;

public abstract class Merchandise extends Product implements Discountable {

    private final String category;
    private final String theme;

    public Merchandise(String name, String desc, double price, int quantity, String category, String theme) {
        super(name, desc, price, quantity);
        this.category = category;
        this.theme = theme;
    }

    public String getCategory() {
        return category;
    }

    public String getTheme() {
        return theme;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Category: " + category + newline +
                "Theme: " + (theme.isBlank() ? "(none)" : theme) + newline;
    }

    public abstract String describe();

    @Override
    public void applyPercentDiscount(double percent) {
        String newline = System.lineSeparator();
        if (percent > 1) {
            percent /= 100;
        }
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of " + (percent * 100)  +
                    "% has been applied to product " + getId() +
                    ", " + getName() + newline);
        } else {
            System.out.println("\nPrevious discount on " + getName() +
                    " has been replaced with a discount of " + (percent * 100)  + "%." + newline);
        }
        double newPrice = getOriginalPrice() * (1 - percent);
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
            System.out.println("\nPrevious discount on " + getName() +
                    " has been replaced with a discount of $" + amount + "." + newline);
        }
        setCurrentPrice(getOriginalPrice() - amount);
    }

    @Override
    public void removeDiscount() {
        String newline = System.lineSeparator();
        setCurrentPrice(getOriginalPrice());
        System.out.println("Product " + getId() + ", " +
                getName() + ", has been reset to the original price of $" +
                getOriginalPrice() + newline);
    }
}
