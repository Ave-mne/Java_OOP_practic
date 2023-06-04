package Seminar2_HomeWork.Animal;


import Seminar2_HomeWork.Soundable;
import Seminar2_HomeWork.SwimSpeed;
import Seminar2_HomeWork.Animal.base.Reptile;

public class Snake extends Reptile implements SwimSpeed, Soundable {
    public Snake(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "сш-сш-сш";
    }

    @Override
    public String feed() {
        return "мелкие грызуны";
    }

    @Override
    public String toString() {
        return String.format("Змея: %s; Корм: %s; Скорость плавания: %d", super.toString(), feed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }
}