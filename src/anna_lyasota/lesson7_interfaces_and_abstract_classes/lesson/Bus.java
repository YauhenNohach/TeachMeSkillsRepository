package anna_lyasota.lesson7_interfaces_and_abstract_classes.lesson;

public class Bus extends Car {

    int countPlaces;

    public Bus() {
    }

//    public Tree(String name, double height) {
//        this.name = name;
//        this.height = height;
//    }


    public Bus(String model, int year, int speed, double cost, int countPlaces) {
        super(model, year, speed, cost);
        this.countPlaces = countPlaces;
    }
}
