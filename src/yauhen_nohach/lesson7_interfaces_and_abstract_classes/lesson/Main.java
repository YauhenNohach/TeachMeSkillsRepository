package yauhen_nohach.lesson7_interfaces_and_abstract_classes.lesson;

import yauhen_nohach.lesson6_classes_and_objects.lesson.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Tree tree = new Tree();
        try {
            tree.setHeight(-3);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        int a = 5;
        int b = 0;
        int[] array = new int[1];

        try {
            array[2] = a;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception: " + e.getMessage());
        }



//        Object - класс над всеми классами

        final int num = 6;

        Bus bus = new Bus("bus", 1299, 345, 43);
        System.out.println(bus);
//        bus.countPlaces;

        Car bus2 = new Bus("bus2", 1699, 375, 13);
        bus2.drive();

        bus.speed = 5;
        bus2.speed = 7;

//        Bus.countPeople = 7;
        Bus.infoAboutBus();

//        Bus.countPeople = 8;

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

        Main main = new Main();
        main.nonStaticMethod();


        Bus busNew2 = new Bus();
        Bus busNew3 = new Bus();

        Bus busNew5 = busNew3;
        busNew3 = busNew5;

//        try {
//
//        }

//        File file2 = new File("new.txt");
//        FileReader fileReader2 = new FileReader(file2);

        fileNotFound();

        System.out.println("continue");



//        Exception exception = new Exception();

//        while(true){
//            Bus busNew6 = new Bus();
//        }

        System.out.println("countPeople = " + Bus.countPeople);

        fileNotFound2();
    }

    private static void fileNotFound2() throws FileNotFoundException {
        File file = new File("new.txt");
        FileReader fileReader = new FileReader(file);
    }

    private static void fileNotFound() {
        try {
//            int[] array = new int[2];
//            array[4] = 1;
            File file = new File("new.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("file not found " + e.getMessage());
        } catch (Exception e){
            System.out.println("unknown exception " + e.getMessage());
        } finally {
            System.out.println("close connection with db");
        }
    }

    public void nonStaticMethod(){
        sumNumbers(1, 5);
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
