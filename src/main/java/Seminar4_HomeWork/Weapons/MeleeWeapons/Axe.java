package Seminar4_HomeWork.Weapons.MeleeWeapons;

public class Axe implements Melee{
    @Override
    public int damage() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Axe: %d", damage());
    }
}