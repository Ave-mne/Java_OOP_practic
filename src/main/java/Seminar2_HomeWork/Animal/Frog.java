package Seminar2_HomeWork.Animal;

import Seminar2_HomeWork.Soundable;
import Seminar2_HomeWork.SwimSpeed;
import Seminar2_HomeWork.Animal.base.Amphibian;

public class Frog extends Amphibian implements SwimSpeed, Soundable {
    public Frog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "ква-ква";
    }

    @Override
    public String feed() {
        return "мелкие насекомые";
    }

    @Override
    public int getSwimSpeed() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("Лягушка: %s; Корм: %s; Скорость плавания: %d", super.toString(), feed(), getSwimSpeed());
    }
}