package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.lesson;

public class SportCar extends Car {

    double max0To100;

    public SportCar(String model, int year, int speed) {
        super(model, year, speed);
    }

    @Override
    public void race() {
        System.out.println("sport car race");
    }

    public SportCar() {
    }

    public SportCar(String model, int year, int speed, int price, double max0To100) {
        super(model, year, speed, price);
        this.max0To100 = max0To100;
    }
}
