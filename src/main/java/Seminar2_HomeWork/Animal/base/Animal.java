package Seminar2_HomeWork.Animal.base;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s", name);
    }

    public abstract String makeSound();

    public abstract String feed();

}