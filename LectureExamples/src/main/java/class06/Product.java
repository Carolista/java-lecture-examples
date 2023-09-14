package class06;

// TODO: Make class abstract
public class Product {

    private static int nextId = 1;

    private final int id;
    private String name;
    private String desc;
    private double price;
    private int quantity;

    public Product(String name, String desc, double price, int quantity) {
        this.id = nextId;
        this.name = name;
        this.desc = desc;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
                "Price: " + price + newline +
                "Quantity: " + quantity + newline;
    }

    // TODO: Add an abstract method, describe()

}
