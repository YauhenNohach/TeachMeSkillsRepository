package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.lesson;

public abstract class Car {

    String model;
    int year;
    int speed;
    int price;

    public Car() {
    }

    public Car(String model, int year, int speed, int price) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.price = price;
    }

    public Car(String model, int year, int speed) {
    }

    public Car(String model) {
        this.model = model;
    }

    public void drive() {
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

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }


}
