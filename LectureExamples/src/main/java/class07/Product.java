package class07;

public abstract class Product {

    private static int nextId = 1;

    private final int id;
    private String name;
    private String desc;
    private final double originalPrice;
    private double currentPrice;
    private int quantity;

    public Product(String name, String desc, double price, int quantity) {
        this.id = nextId;
        this.name = name;
        this.desc = desc;
        this.originalPrice = price;
        this.currentPrice = price;
        this.quantity = quantity;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "\nPRODUCT INFORMATION:" +
                "\nID: " + id +
                "\nItem: " + name +
                "\nDescription: " + desc +
                "\nOriginal Price: " + originalPrice +
                "\nCurrent Price: " + currentPrice +
                "\nQuantity: " + quantity;
    }

    public void updateQuantity(int amount) {
        if (amount > 0) {
            quantity += amount;
        } else {
            quantity -= amount;
        }
    }

}
