package anna_lyasota.lesson7_interfaces_and_abstract_classes.lesson;

public class SportCar extends Car {

    double max0To100;

    public SportCar(String model, int year, int speed, double cost, double max0To100) {
        super(model, year, speed, cost);
        this.max0To100 = max0To100;
    }

    public SportCar() {
    }
}
