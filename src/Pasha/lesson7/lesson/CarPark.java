package Pasha.lesson7.lesson;

public class CarPark extends Car {
    int costs;
    protected CarPark(String model, int year, int speed, int costs) {
        super(model, year, speed);
        this.costs = costs;
    }
}