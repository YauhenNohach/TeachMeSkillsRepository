package anna_lyasota.lesson7_interfaces_and_abstract_classes.lesson;

import anna_lyasota.lesson7_interfaces_and_abstract_classes.dz.Animal;

public class Main {
    public static void main(String[] args) {
//        Object - класс над всеми классами


        final int num = 6;
        String model = "bus1";

        Bus bus = new Bus("bus1", 1990, 120, 50000.00, 50);
        System.out.println(bus);
//        bus.countPlaces;

        Car bus2 = new Bus("bus2", 1980, 150, 55000.00, 60);
        SportCar car1 = new SportCar("car1", 2020, 200, 100000.00, 2);

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
        cars[2] = car1;


        for (Car car : cars) {
            if (car != null) {
            }
        }

        Main main = new Main();
        main.carWithYearEarlierThan1992(cars);

        Main changeCost = new Main();
        changeCost.changeCostmorethen100(cars);

        String searchCar = "bus2";
        main.searchCarParameters(cars,searchCar);

    }



    //task 3
    public void changeCostmorethen100(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].speed() >= 100) {
                cars[i].cost = cars[i].cost + 150.00;
                System.out.println("Обновленная стоимость машины " + cars[i].model + ": " + cars[i].cost);
            }
        }
    }

    //task 2
    public void carWithYearEarlierThan1992(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year() < 1992) {
                System.out.println("Автомобиль до 1992: " + cars[i].model);
            }
        }

    }
    //task 4
    private void searchCarParameters(Car[] cars, String searchCar) {
        boolean found = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].model.equals(searchCar)) {
                System.out.println("Машина найдена: " + cars[i].model + ", год: " + cars[i].year + ", скорость: " + cars[i].speed + ",цена: " + cars[i].cost);
                found = true;
                break;
            }
        }
    }
}