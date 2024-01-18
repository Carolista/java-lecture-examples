package chapter08.merchandise;

import chapter08.Common;
import chapter08.Discountable;
import chapter08.Product;
import chapter08.Utils;

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
        return super.toString() +
                "Category: " + category + Common.newline +
                "Theme: " + (theme.isBlank() ? "(none)" : theme) + Common.newline;
    }

    public abstract String describe();

    @Override
    public void applyPercentDiscount(double percent) {
        if (percent > 1) {
            percent /= 100;
        }
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of " + (percent * 100)  +
                    "% has been applied to product " + getId() +
                    ", " + getName() + Common.newline);
        } else {
            System.out.println("\nPrevious discount on " + getName() +
                    " has been replaced with a discount of " + (percent * 100)  + "%." + Common.newline);
        }
        double newPrice = getOriginalPrice() * (1 - percent);
        setCurrentPrice(Utils.roundToPenny(newPrice));
    }

    @Override
    public void applyFlatDiscount(double amount) {
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName() + Common.newline);
        } else {
            System.out.println("\nPrevious discount on " + getName() +
                    " has been replaced with a discount of $" + amount + "." + Common.newline);
        }
        setCurrentPrice(getOriginalPrice() - amount);
    }

    @Override
    public void removeDiscount() {
        setCurrentPrice(getOriginalPrice());
        System.out.println("Product " + getId() + ", " +
                getName() + ", has been reset to the original price of $" +
                getOriginalPrice() + Common.newline);
    }
}
