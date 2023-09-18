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

    public static int getNextId() {
        return nextId;
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

    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        quantity -= amount;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return "PRODUCT INFORMATION:" + newline +
                "ID: " + id + newline +
                "Item: " + name + newline +
                "Description: " + desc + newline +
                "Original Price: " + originalPrice + newline +
                "Current Price: " + currentPrice + newline +
                "Quantity: " + quantity + newline;
    }

    public abstract String describe();

}
