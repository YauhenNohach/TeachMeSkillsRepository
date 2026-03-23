package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.lesson;

public class Bus extends Car {

    int countPlaces;

    public Bus() {
    }

    @Override
    public void race() {
        System.out.println("bus is top 1");
    }

//    public Tree(String name, double height) {
//        this.name = name;
//        this.height = height;
//    }

    public Bus(String model, int year, int speed, int countPlaces) {
        super(model, year, speed);
        this.countPlaces = countPlaces;
    }

    public Bus(String model, int year, int speed, int price, int countPlaces) {
        super(model, year, speed, price);
        this.countPlaces = countPlaces;
    }
}
