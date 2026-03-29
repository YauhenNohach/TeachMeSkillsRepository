package yauhen_nohach.lesson9_exceptions.lesson;

import yauhen_nohach.lesson7_interfaces_and_abstract_classes.lesson.Car;

public class Main {
    public static void main(String[] args) {
        Car car = null;

        try {
            car.drive();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        if (car == null) {
            throw new CarNotFoundEcxeption("car not found");
        }

        System.out.println("car is " + car);
    }
}
