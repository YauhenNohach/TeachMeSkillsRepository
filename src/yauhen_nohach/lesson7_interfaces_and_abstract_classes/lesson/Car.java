package yauhen_nohach.lesson7_interfaces_and_abstract_classes.lesson;

public abstract class Car {

    String model;
    int year;
    int speed;

    public Car() {
    }

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public void drive(){
        System.out.println("I drive car");
    }

    public abstract void race();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    // много
}
