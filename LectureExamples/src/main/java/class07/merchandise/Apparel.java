package class07.merchandise;

import java.util.ArrayList;
import java.util.Collections;

public class Apparel extends Merchandise {

    private final ArrayList<String> sizes = new ArrayList<>();
    private final ArrayList<String> colors = new ArrayList<>();

    public Apparel(String name, String desc, double originalPrice, int quantity, String category, String theme, String[] sizeArray, String[] colorArray) {
        super(name, desc, originalPrice, quantity, category, theme);
        Collections.addAll(sizes, sizeArray);
        Collections.addAll(colors, colorArray);
    }

    public ArrayList<String> getSizes() {
        return sizes;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSizes: " + String.join(", ", sizes) +
                "\nColors: " + String.join(", ", colors);
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
}
