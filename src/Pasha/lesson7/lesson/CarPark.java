package Pasha.lesson7.lesson;

public class CarPark extends Pasha.lesson7.lesson.Car {
    int costs;
    public CarPark(String model, int year, int speed, int costs) {
        super(model, year, speed);
        this.costs = costs;
    }
}