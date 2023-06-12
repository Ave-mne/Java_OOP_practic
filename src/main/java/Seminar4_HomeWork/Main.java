package Seminar4_HomeWork;

import Seminar4_HomeWork.Armors.Leather;
import Seminar4_HomeWork.Armors.Plate;
import Seminar4_HomeWork.Warrior.Archer;
import Seminar4_HomeWork.Warrior.Infantryman;
import Seminar4_HomeWork.Warrior.Warrior;
import Seminar4_HomeWork.Weapons.MeleeWeapons.Axe;
import Seminar4_HomeWork.Weapons.MeleeWeapons.Sword;
import Seminar4_HomeWork.Weapons.RangedWeapons.Bow;
import Seminar4_HomeWork.Weapons.RangedWeapons.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new Leather()));
        team1.add(new Infantryman("John", 150, new Axe(), new Plate()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new Leather()));
        teamArchers.add(new Archer("Piter", 100, new Bow()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new Plate()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);

        Infantryman melee = new Infantryman("John", 50,new Axe(), new Plate());
        Archer range = new Archer("Robin", 30, new Bow(), new Leather());
        Battle battle1 = new Battle(melee, range);

        System.out.println("---fight---");
        battle1.fight();
    }

}
