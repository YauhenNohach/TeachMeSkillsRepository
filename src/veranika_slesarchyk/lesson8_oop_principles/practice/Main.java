package veranika_slesarchyk.lesson8_oop_principles.practice;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car(1990, "BMW", 1000, 150);
        cars[1] = new Car(2000, "Audi", 2000, 120);
        cars[2] = new Car(1995, "Ford", 1500, 90);

    }
    public static void changeYear(Car a, int newYear) {
        a.setYear(1991);
    }
}
