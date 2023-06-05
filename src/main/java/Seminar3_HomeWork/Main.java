package Seminar3_HomeWork;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.addCar(new CarNumber("001"));
        parking.addCar(new CarNumber("002"));
        parking.addCar(new CarNumber("003"));

        for (CarNumber carNumber : parking) {
            System.out.println(carNumber);
        }

        System.out.println("---------------");
        parking.addFirstCar(new CarNumber("999"));
        for (CarNumber carNumber : parking) {
            System.out.println(carNumber);
        }

    }
}