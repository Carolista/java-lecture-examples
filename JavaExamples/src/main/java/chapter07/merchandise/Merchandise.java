package chapter07.merchandise;

// TODO: Refactor to inherit from Product
// TODO: Make abstract for extending to subclasses
public class Merchandise {

    private static int nextId = 1;

    private final int id;
    private String name;
    private String desc;
    private double price;
    private int quantity;

    private final String category;
    private final String theme;

    public Merchandise(String name, String desc, double price, int quantity, String category, String theme) {
        this.id = nextId;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.theme = theme;
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

    public String getCategory() {
        return category;
    }

    public String getTheme() {
        return theme;
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
                "Quantity: " + quantity + newline +
                "Category: " + category + newline +
                "Theme: " + theme + newline;
    }

    // TODO: Pass on abstract describe() to be defined in subclasses
}
