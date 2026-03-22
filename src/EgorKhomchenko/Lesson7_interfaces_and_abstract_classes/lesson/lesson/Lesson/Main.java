package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Lesson;

public class Main {
    public static void main(String[] args) {
//        Object - класс над всеми классами

        final int num = 6;

        Bus bus = new Bus("bus", 1299, 345, 43);
        System.out.println(bus);
//        bus.countPlaces;

        Car bus2 = new Bus("bus2", 1699, 375, 13);

        Bus miniBus = new MiniBus();
        Car miniBus2 = new MiniBus();


        SportCar sportCar = new SportCar();

//        Bus[] buses = new Bus[3];
//        buses[0] = bus;
//        buses[1] = bus2;
//        buses[2] = miniBus2;

        Car[] cars = new Car[3];
        cars[0] = bus2;
        cars[1] = bus;
        cars[2] = sportCar;



        for (Car car : cars) {
            if (car != null) {}
        }

    }


}
