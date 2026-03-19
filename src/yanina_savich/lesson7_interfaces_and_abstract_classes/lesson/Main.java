package yanina_savich.lesson7_interfaces_and_abstract_classes.lesson;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volkswagen", 2024, 160);
        Car car2 = new Car("BMW", 1999, 220);
        Car car3 = new Car("Audi", 1985, 200);
        Car[] cars = {car1, car2, car3};

        oldCar(cars);

        car1.carCost = 11000;
        car2.carCost = 12000;
        car3.carCost = 15000;

        increaseCostForCars(cars);

        Car foundCar = Car.findByModel(cars, "BMW");
        if (foundCar != null) {
            System.out.println("Найдена:" + foundCar);
        } else {
            System.out.println("Не найдена машина с такой моделью");
        }
    }
    private static void oldCar(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year < 1992) {
                System.out.println("Old car here:" + cars[i]);
            }
        }
    }
    private static void increaseCostForCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].increaseCostForSpeed();
        }
    }
}
