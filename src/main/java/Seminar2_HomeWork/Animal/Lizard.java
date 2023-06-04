package Seminar2_HomeWork.Animal;


import Seminar2_HomeWork.Animal.base.Reptile;
import Seminar2_HomeWork.Soundable;
import Seminar2_HomeWork.SwimSpeed;


public class Lizard extends Reptile implements SwimSpeed, Soundable {
    public Lizard(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "ш-ш-ш-ш";
    }

    @Override
    public String feed() {
        return "сверчки";
    }

    @Override
    public int getSwimSpeed() {
        return 1;
    }

    @Override
    public String toString() {
        return String.format("Ящерица: %s; Корм: %s; Скорость плавания: %d", super.toString(), feed(), getSwimSpeed());
    }
}