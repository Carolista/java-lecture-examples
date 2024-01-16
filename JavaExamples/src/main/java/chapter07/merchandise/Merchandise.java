package chapter07.merchandise;

import chapter07.Common;
import chapter07.Product;

public abstract class Merchandise extends Product {

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
}
