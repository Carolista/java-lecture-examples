package class07.merchandise;

import java.util.ArrayList;
import java.util.Collections;

public class Apparel extends Merchandise {

    private final ArrayList<String> sizes = new ArrayList<>();
    private final ArrayList<String> colors = new ArrayList<>();

    public Apparel(String name, String desc, double price, int quantity, String category, String theme, String[] sizeArray, String[] colorArray) {
        super(name, desc, price, quantity, category, theme);
        Collections.addAll(sizes, sizeArray);
        Collections.addAll(colors, colorArray);
    }

    public ArrayList<String> getSizes() {
        return sizes;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void addSize(String size) {
        sizes.add(size);
    }

    public void removeSize(String size) {
        sizes.remove(size);
    }

    public void addColor(String color) {
        colors.add(color);
    }

    public void removeColor(String color) {
        colors.remove(color);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Sizes: " + String.join(", ", sizes) + newline +
                "Colors: " + String.join(", ", colors) + newline;
    }

    @Override
    public String describe() {
        String newline = System.lineSeparator();
        String pipe = " | ";
        return getName() + newline +
                getDesc() + newline +
                "Available Sizes: " + String.join(", ", sizes) + newline +
                "Available Colors: " + String.join(", ", colors) + newline +
                getCategory() + pipe + getTheme() + pipe + getPrice() + newline;
    }
}
