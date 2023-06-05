package Seminar1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Chocolate("Alpen Gold", 10, "dark", "milk", 100))
                .addProduct(new Product("Apple", 20))
                .addProduct(new Product("Pepsi", 5))
                .addProduct(new Cheese("Russian", 20, "soft", 100));

        for (Product prd: vendingMachine.getGoods()) {
            System.out.println(prd);
        }
        Product foundProduct = vendingMachine.findProduct("Apple");

        System.out.println(foundProduct);

        System.out.println("---------------");
        System.out.println("Sale");
        Product salePrd = vendingMachine.saleProduct("Apple");
        System.out.println(salePrd);
        Product salePrd2 = vendingMachine.saleProduct("Pepsi");
        System.out.println(salePrd2);
        System.out.println(vendingMachine.getCash());

        System.out.println(vendingMachine);
    }
}