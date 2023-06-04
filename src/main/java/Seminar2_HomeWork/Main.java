package Seminar2_HomeWork;

import Seminar2_HomeWork.Animal.Frog;
import Seminar2_HomeWork.Animal.Lizard;
import Seminar2_HomeWork.Animal.Snake;

public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(new Frog("Квакуша")).addAnimal(new Snake("Змеюка")).addAnimal(new Lizard("Бакс"));

        System.out.println(terrarium);

        System.out.println("--- Звуки в террариуме: ---");
        System.out.println(terrarium.getSounds());

        System.out.println("--- Самая высокая скорость плавания: ---");
        System.out.println(terrarium.getFastestSwimmer());
    }
}