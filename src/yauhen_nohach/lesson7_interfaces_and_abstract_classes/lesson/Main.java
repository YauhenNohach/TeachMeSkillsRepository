package yauhen_nohach.lesson7_interfaces_and_abstract_classes.lesson;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        Object - класс над всеми классами

        final int num = 6;

        Bus bus = new Bus("bus", 1299, 345, 43);
        System.out.println(bus);
//        bus.countPlaces;

        Car bus2 = new Bus("bus2", 1699, 375, 13);
        bus2.drive();

        Bus miniBus = new MiniBus();
        miniBus.drive();

        Car miniBus2 = new MiniBus();


        SportCar sportCar = new SportCar() {
            @Override
            public int move() {
                return 0;
            }

            @Override
            public void car(int speed) {

            }
        };
        sportCar.drive();


//        Bus[] buses = new Bus[3];
//        buses[0] = bus;
//        buses[1] = bus2;
//        buses[2] = miniBus2;

        Car[] cars = new Car[3];
        cars[0] = bus2;
        cars[1] = bus;
        cars[2] = sportCar;


        for (Car car : cars) {
            if (car != null) {
            }
        }

        sumNumbers(1, 3);
        sumNumbers(1, "sdgdfg");

    }

    private static void sumNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private static void sumNumbers(int num1) {
        System.out.println(num1);
    }

    private static double sumNumbers(double num1, double num2) {
        return num1 + num2;
    }

    private static double sumNumbers(int num1, double num2) {
        return num1 + num2;
    }

    private static String sumNumbers(int num1, String num2) {
        return num1 + "" + num2;
    }


}
