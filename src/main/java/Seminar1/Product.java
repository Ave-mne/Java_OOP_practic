package Seminar1;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product : %s, Price: %f", name, price);
    }

    public String getProductName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }

}
