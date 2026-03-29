package Pasha.lesson7.lesson;

public class Car {
    public String model;
    public int year;
    public int speed;

    protected Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}