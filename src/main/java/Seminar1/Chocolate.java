package Seminar1;

public class Chocolate extends Product{
    private final String color;
    private final String chocType;
    private final int calories;

    public Chocolate(String name, double price, String color, String chocType, int calories) {
        super(name, price);
        this.color = color;
        this.chocType = chocType;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format("Chocolate: %s, Color: %s, Taste: %s, Calories: %d", super.toString(), color, chocType, calories);
    }
}