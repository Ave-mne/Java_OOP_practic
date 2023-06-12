package Seminar4;

import Seminar4.Warrior.Archer;
import Seminar4.Warrior.Infantryman;
import Seminar4.Warrior.Warrior;
import Seminar4.Weapons.MeleeWeapons.Axe;
import Seminar4.Weapons.MeleeWeapons.Sword;
import Seminar4.Weapons.RangedWeapons.Bow;
import Seminar4.Weapons.RangedWeapons.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow()));
        team1.add(new Infantryman("John", 150,new Axe()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow()));
        teamArchers.add(new Archer("Piter",100, new Bow()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);


        Battle battle1 = new Battle(new Infantryman("John", 150,new Axe()), (new Archer("Robin", 100, new Bow())));

        battle1.fight();

    }
}