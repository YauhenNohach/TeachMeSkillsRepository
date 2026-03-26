package veranika_slesarchyk.lesson8_oop_principles.practice;

public class Car {
    String model;
    int year;
    int speed;
    int price;

    public Car(int year, String model, int price, int speed) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return model + "  " + year + " " + speed + " км/ч  " + price + " руб";
    }
}
