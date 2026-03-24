package anna_sidorova.lesson7.lessons;

import yauhen_nohach.lesson7_interfaces_and_abstract_classes.lesson.Car;

public class SportCar extends Car {

    double max0To100;

//    public SportCar(String model, int year, int speed) {
//        super(model, year, speed);
//    }

    @Override
    public void race() {
        System.out.println("sport car race");
    }


    @Override
    public void car(int speed) {

    }

    @Override
    public int move() {
        return 0;
    }
}
