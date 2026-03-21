package Pasha.lesson7.lesson;

public class Main {

    public static void main(String[] args) {

        CarPark[] carPark = getCarParks();

        task2PrintOldCarPark(carPark);

        task3UpdateCostForFastCarPark(carPark);

        String searchViaModel1 = "Mitsubishi";
        String searchViaModel2 = "Tesla";

        System.out.println("\nTask 4");
        boolean isCarFound1 = task4FindCarByModel(carPark, searchViaModel1);
        System.out.println("Is car " + searchViaModel1 + " in the car park? " + isCarFound1);
        boolean isCarFound2 = task4FindCarByModel(carPark, searchViaModel2);
        System.out.println("Is car " + searchViaModel2 + " in the car park? " + isCarFound2);
    }

    private static CarPark[] getCarParks() {
        CarPark mitsubishi = new CarPark("Mitsubishi", 1993, 200, 5000);
        CarPark mercedes = new CarPark("Mercedes", 1985, 190, 1000);
        CarPark honda = new CarPark("Honda", 2005, 85, 4000);
        CarPark toyota = new CarPark("Toyota", 1990, 95, 2500);
        CarPark ford = new CarPark("Ford", 1980, 120, 800);
        CarPark bmw = new CarPark("BMW", 2010, 220, 15000);
        CarPark nissan = new CarPark("Nissan", 1995, 78, 3000);

        return new CarPark[]{mitsubishi, mercedes, honda, toyota, ford, bmw, nissan};
    }

    private static void task2PrintOldCarPark(CarPark[] CarPark) {
        System.out.println("Task 2");
        System.out.println("CarPark manufactured before 1992");
        for (CarPark car : CarPark) {
            if (car.year < 1992) {
                System.out.println(car.model + " - Year: " + car.year);
            }
        }
    }

    private static void task3UpdateCostForFastCarPark(CarPark[] carPark) {
        System.out.println("\nTask 3");
        System.out.println("Updating Costs for CarPark where Speed > 100");
        for (CarPark car : carPark) {
            if (car.costs > 100) {
                int oldCost = car.costs;
                car.costs += 150;
                System.out.println("\t" + "* " + car.model + ": Speed is " + car.speed + " -> costs increased from " + oldCost + " to " + car.costs);
            }
        }
    }

    private static boolean task4FindCarByModel(CarPark[] CarPark, String searchModel) {
        boolean carFound = false;
        for (CarPark car : CarPark) {
            if (car.model.equals(searchModel)) {
                carFound = true;
                break;
            }
        }
        if (!carFound) {
            return carFound;
        }
        return carFound;
    }
}
