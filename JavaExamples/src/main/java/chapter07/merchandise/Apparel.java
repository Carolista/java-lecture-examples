package chapter07.merchandise;

import chapter07.Common;

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
        return super.toString() +
                "Sizes: " + String.join(", ", sizes) + Common.newline +
                "Colors: " + String.join(", ", colors) + Common.newline;
    }

    @Override
    public String describe() {
        return getName() + Common.newline +
                getDesc() + Common.newline +
                "Available Sizes: " + String.join(", ", sizes) + Common.newline +
                "Available Colors: " + String.join(", ", colors) + Common.newline +
                getCategory() + Common.pipe + getTheme() + Common.pipe + getPrice() + Common.newline;
    }
}
