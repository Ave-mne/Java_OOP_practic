package Seminar1;

public class Cheese extends Product{
    private final String cheeseType;
    private final double weight;

    public Cheese(String name, double price, String cheeseType, double weight) {
        super(name, price);
        this.cheeseType = cheeseType;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Cheese: %s, Type: %s, Weight: %f", super.toString(), cheeseType, weight);
    }
}