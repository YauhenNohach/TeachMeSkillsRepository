package veronika_akulovich.lesson7_interfaces_and_abstract_classes.lesson;

public class Main {
    public static void main(String[] args) {
//        Object - класс над всеми классами

//        final int num = 6;
//
//        Bus bus = new Bus("bus", 1299, 345, 43);
//        System.out.println(bus);
////        bus.countPlaces;
//
//        Car bus2 = new Bus("bus2", 1699, 375, 13);
//
//        Bus miniBus = new MiniBus();
//        Car miniBus2 = new MiniBus();
//
//
//        SportCar sportCar = new SportCar();
//
////        Bus[] buses = new Bus[3];
////        buses[0] = bus;
////        buses[1] = bus2;
////        buses[2] = miniBus2;
//
//        Car[] cars = new Car[3];
//        cars[0] = bus2;
//        cars[1] = bus;
//        cars[2] = sportCar;
//
//
//
//        for (Car car : cars) {
//            if (car != null) {}
//        }


        Bus audi = new Bus("audi", 2025, 305, 4);
        Bus ford = new Bus("ford", 1991, 160, 5);
        Bus opel = new Bus("opel", 1989, 130, 5);
        Bus lada = new Bus("lada", 2020, 100, 5);


        Bus[] buses = new Bus[4];
        buses[0] = audi;
        buses[1] = ford;
        buses[2] = opel;
        buses[3] = lada;

        Bus[] oldestCarOnSite = findCarBefore1992(buses);
        raisePriceOfBusses(buses);

        Bus specificCarWithModel = autoWithCurrentModel(buses,"audi");
        if (specificCarWithModel != null) {
            specificCarWithModel.printInfoAboutBusses();
        }
        else {
            System.out.println("Выберите существующую модель авто!");
        }


    }

    public static Bus[] findCarBefore1992(Bus[] buses) {
        Bus[] carsWithSpecificAge = new Bus[buses.length];
        int indexOfBusses = 0;
        for (int i = 0; i < buses.length; i++) {
            if (buses[i].year <= 1992) {
                carsWithSpecificAge[indexOfBusses] = buses[i];
                carsWithSpecificAge[indexOfBusses].printInfoAboutBusses();
                indexOfBusses++;
            }
        }
        return carsWithSpecificAge;

    }
    public static void raisePriceOfBusses(Bus[] buses){
        for (int i = 0; i < buses.length; i++) {
            if (buses[i].speed > 100) {
                buses[i].costOfAuto += 150;
            }
            buses[i].printInfoAboutBusses();
        }
    }
    public static Bus autoWithCurrentModel (Bus[] buses, String model){
        for (int i = 0; i < buses.length; i++) {
            if(buses[i].model.equals(model)){
                return buses[i];
            }
        }
        return null;
    }
}
