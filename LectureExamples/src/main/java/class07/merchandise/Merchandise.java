package class07.merchandise;

import class07.Product;

// TODO: implement Discountable interface

public class Merchandise extends Product {

    private final String category;
    private final String theme;

    public Merchandise(String name, String desc, double originalPrice, int quantity, String category, String theme) {
        super(name, desc, originalPrice, quantity);
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
                "\nCategory: " + category +
                "\nTheme: " + theme;
    }

    // TODO: add methods required by Discountable interface

}
