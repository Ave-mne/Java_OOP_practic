package Seminar4.Warrior;

import Seminar4.Weapons.Weapons;
import Seminar4.Weapons.RangedWeapons.Ranged;

public class Archer extends Warrior<Ranged>{
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}