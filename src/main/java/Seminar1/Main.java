package Seminar1;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeAutomate = new CoffeeMachine();
        coffeeAutomate.addCoffee(new Coffee("Americano", 50, 150, 70, 10))
                .addCoffee(new Coffee("Capuchino", 60, 100, 75, 5))
                .addCoffee(new Coffee("Latte", 80, 150, 80, 10))
                .addCoffee(new Coffee("Nescafe", 40, 200,90, 5));

        System.out.println("Включение...");
        System.out.println(coffeeAutomate);

        System.out.println("-------------------");
        System.out.println(coffeeAutomate);
        System.out.println("-------------------");

        System.out.println("Выберите напиток:");
        PrintSell(coffeeAutomate,"Nescafe");

        System.out.println("-------------------");

        System.out.println("Выберите напиток:");
        PrintSell(coffeeAutomate,"Americano");



        System.out.println("-------------------");

        System.out.println("Выберите напиток: ");
        PrintSell(coffeeAutomate,"Цикорий");


        System.out.println("-------------------");
        System.out.println(coffeeAutomate);
        System.out.println("Выключение...");
    }

    public static void PrintSell (CoffeeMachine machine, String nameCafe){
        try{
            System.out.println(machine.sell(nameCafe));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}
