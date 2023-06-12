package Seminar4_HomeWork.Armors;

public class Leather implements Armor {
    @Override
    public int getDefence() {
        return 2;
    }
    @Override
    public String toString() {
        return String.format("Leather: %d", getDefence());
    }
}