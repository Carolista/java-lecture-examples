package chapter07.merchandise;

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
        String newline = System.lineSeparator();
        return super.toString() +
                "Category: " + category + newline +
                "Theme: " + (theme.isBlank() ? "(none)" : theme) + newline;
    }

    public abstract String describe();
}
