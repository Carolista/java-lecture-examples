package chapter08.merchandise;

import chapter08.Common;

public class Drinkware extends Merchandise {

    private final String material;
    private final double ounces;

    public Drinkware(String name, String desc, double price, int quantity, String category, String theme, String material, double ounces) {
        super(name, desc, price, quantity, category, theme);
        this.material = material;
        this.ounces = ounces;
    }

    public String getMaterial() {
        return material;
    }

    public double getOunces() {
        return ounces;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Material: " + material + Common.newline +
                "Volume: " + ounces + " ounces" + Common.newline;
    }

    @Override
    public String describe() {
        return ounces + "-oz. " + material + " " + getName() + Common.newline +
                getDesc() + Common.newline +
                getCategory() + Common.pipe + getTheme() + Common.pipe + getPrice() + Common.newline;
    }
}
