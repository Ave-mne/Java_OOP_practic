package Seminar4_HomeWork.Warrior;

import Seminar4_HomeWork.Armors.Armor;
import Seminar4_HomeWork.Weapons.MeleeWeapons.Melee;

public class Infantryman extends Warrior<Melee, Armor> {
    public Infantryman(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    public Infantryman(String name, int healthPoint, Melee weapon, Armor armor) {
        super(name, healthPoint, weapon, armor);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}