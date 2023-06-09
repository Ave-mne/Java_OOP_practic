package Seminar3_HomeWork;

public class Main {
    public static void main(String[] args) {

        LinkedUnits<String> linkedUnits = new LinkedUnits<>();
        linkedUnits.add("--1--");
        linkedUnits.add("--2--");
        linkedUnits.add("--3--");
        linkedUnits.add("--4--");
        linkedUnits.add("--5--");
        linkedUnits.add("--6--");

        System.out.printf("list size: %d\n", linkedUnits.size());

        System.out.println("---for-each---");
        for (String value : linkedUnits) {
            System.out.println(value);
        }
        System.out.println("----------");

        System.out.println("---remove-index-2---");
        System.out.println(linkedUnits.remove(2));

        System.out.println("----------");

        System.out.println("---set-element-index-3--");
        linkedUnits.set("new value", 3);

        System.out.println("----------");

        System.out.println("---get-elements-by-index---");
        for (int i = 0; i < linkedUnits.size(); i++) {
            System.out.println(linkedUnits.get(i));
        }
        System.out.println("----------");
        System.out.println("---clear---");
        linkedUnits.clear();
        System.out.printf("list size: %d\n", linkedUnits.size());
    }
}