package class07.merchandise;

public class Drinkware extends Merchandise {

    private final String material;
    private final double ounces;

    public Drinkware(String name, String desc, double originalPrice, int quantity, String category, String theme, String material, double ounces) {
        super(name, desc, originalPrice, quantity, category, theme);
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
                "\nMaterial: " + material +
                "\nOunces: " + ounces;
    }
}
