package anna_sidorova.lesson7.lessons;

import yauhen_nohach.lesson7_interfaces_and_abstract_classes.lesson.Car;

public class Bus extends Car {

    int countPlaces;

    public Bus() {
    }

    @Override
    public void race() {
        System.out.println("bus is top 1");
    }

//    public Tree(String name, double height) {
//        this.name = name;
//        this.height = height;
//    }

    public Bus(String model, int year, int speed, int countPlaces) {
        super(model, year, speed);
        this.countPlaces = countPlaces;
    }
}
