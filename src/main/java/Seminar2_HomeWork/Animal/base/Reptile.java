package Seminar2_HomeWork.Animal.base;

import Seminar2_HomeWork.Animal.base.Animal;

public abstract class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("рептилия; %s", super.toString());
    }
}
