package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.lesson;

public class MiniBus extends Bus {

    public MiniBus() {
    }

    public MiniBus(String model, int year, int speed, int countPlaces) {
        super(model, year, speed, countPlaces);
    }

    public MiniBus(String model, int year, int speed, int price, int countPlaces) {
        super(model, year, speed, price, countPlaces);
    }
}
