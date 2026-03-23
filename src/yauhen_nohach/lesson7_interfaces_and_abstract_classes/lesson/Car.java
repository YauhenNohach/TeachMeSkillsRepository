package yauhen_nohach.lesson7_interfaces_and_abstract_classes.lesson;

public abstract class Car implements IDrive, ICar{

    public String model;
    public int year;
    int speed;

    public Car() {
    }

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public void drive(){
        System.out.println("I drive abstract car");
    }

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
