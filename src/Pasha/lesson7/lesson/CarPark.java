package Pasha.lesson7.lesson;

public class CarPark extends Car {
    int costs;
    protected CarPark(String model, int year, int speed, int costs) {
        super(model, year, speed);
        this.costs = costs;
    }
    public static void main(String[] args) {
        CarPark bmw = new CarPark("bmw", 1990, 150, 2000);
        int speed = bmw.getSpeed();
        System.out.println(speed);
        bmw.setSpeed(190);
        System.out.println(bmw.getSpeed());
    }
}