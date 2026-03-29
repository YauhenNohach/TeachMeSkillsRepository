package anna_lyasota.lesson7_interfaces_and_abstract_classes.lesson;

public class Car {

    String model;
    int year;
    int speed;
    double cost;

    public Car() {
    }

    public Car(String model, int year, int speed, double cost) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.cost = cost;
    }

    public void drive(){
        System.out.println("I drive car");
    }

    public int speed() {
        return this.speed;
    }
    public String model() {
        return model;
    }

    public int year() {
        return this.year;
    }

    // много
}
