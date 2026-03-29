package veranika_slesarchyk.lesson7_interfaces_and_abstract_classes.Practice;

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

    @Override
    public String toString() {
        return model + "  " + year + " " + speed + " км/ч  " + price + " руб";
    }
}
