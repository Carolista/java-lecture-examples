package class06.merchandise;

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
        String newline = System.lineSeparator();
        return super.toString() +
                "Material: " + material + newline +
                "Volume: " + ounces + " ounces" + newline;
    }

    @Override
    public String describe() {
        String newline = System.lineSeparator();
        String pipe = " | ";
        return ounces + "-oz. " + material + " " + getName() + newline +
                getDesc() + newline +
                getCategory() + pipe + getTheme() + pipe + getPrice() + newline;
    }
}
