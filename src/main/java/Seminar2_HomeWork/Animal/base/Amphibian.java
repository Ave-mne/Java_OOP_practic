package Seminar2_HomeWork.Animal.base;

public abstract class Amphibian extends Animal {
    public Amphibian(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("земноводное; %s ", super.toString());
    }
}
