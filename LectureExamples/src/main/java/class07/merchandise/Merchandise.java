package class07.merchandise;

import class07.Discountable;
import class07.Product;
import class07.Utils;

public class Merchandise extends Product implements Discountable {

    private String category;
    private String theme;

    public Merchandise(String name, String desc, double originalPrice, int quantity, String category, String theme) {
        super(name, desc, originalPrice, quantity);
        this.category = category;
        this.theme = theme;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCategory: " + category +
                "\nTheme: " + theme;
    }

    @Override
    public void applyPercentDiscount(double percent) {
        if (percent > 1) {
            percent /= 100;
        }
        double newPrice = getOriginalPrice() * (1 - percent);
        setCurrentPrice(Utils.roundToPenny(newPrice));
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of " + percent +
                    "% has been applied to product " + getId() +
                    ", " + getName());
        } else {
            System.out.println("\nOriginal discount on " + getName() +
                    " has been replaced with a discount of " + percent + "%.");
        }
    }

    @Override
    public void applyFlatDiscount(double amount) {
        setCurrentPrice(getOriginalPrice() - amount);
        if (getCurrentPrice() == getOriginalPrice()) {
            System.out.println("\nDiscount of $" + amount +
                    " has been applied to product " + getId() +
                    ", " + getName());
        } else {
            System.out.println("\nOriginal discount on " + getName() +
                    " has been replaced with a discount of $" + amount + ".");
        }
    }

    @Override
    public void removeDiscount() {
        setCurrentPrice(getOriginalPrice());
        System.out.println("Product " + getId() + ", " +
                getName() + ", has been reset to the original price of $" +
                getOriginalPrice());
    }
}
