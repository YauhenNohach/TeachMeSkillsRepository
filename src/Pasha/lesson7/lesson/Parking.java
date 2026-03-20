package Pasha.lesson7.lesson;

public class Parking extends Car {
    int costs;

    public Parking(String model, int year, int speed, int costs) {
        super(model, year, speed);
        this.costs = costs;
    }

    public static void main(String[] args) {

        Parking mitsubishi = new Parking("Mitsubishi", 1993, 200, 5000);
        Parking mercedes = new Parking("Mercedes", 1985, 190, 1000);
        Parking honda = new Parking("Honda", 2005, 85, 4000);
        Parking toyota = new Parking("Toyota", 1990, 95, 2500);
        Parking ford = new Parking("Ford", 1980, 120, 800);
        Parking bmw = new Parking("BMW", 2010, 220, 15000);
        Parking nissan = new Parking("Nissan", 1995, 78, 3000);

        Parking[] carPark = {mitsubishi, mercedes, honda, toyota, ford, bmw, nissan};

        task2PrintOldParking(carPark);

        task3UpdateCostForFastParking(carPark);

        String searchViaModel1 = "Mitsubishi";
        String searchViaModel2 = "Tesla";

        System.out.println("\nTask 4");
        boolean isCarFound1 = task4FindCarByModel(carPark, searchViaModel1);
        System.out.println("Is car " + searchViaModel1 + " in the car park? " + isCarFound1);
        boolean isCarFound2 = task4FindCarByModel(carPark, searchViaModel2);
        System.out.println("Is car " + searchViaModel2 + " in the car park? " + isCarFound2);
    }

    public static void task2PrintOldParking(Parking[] Parking) {
        System.out.println("Task 2");
        System.out.println("Parking manufactured before 1992");
        for (Parking car : Parking) {
            if (car.year < 1992) {
                System.out.println(car.model + " - Year: " + car.year);
            }
        }
    }

    public static void task3UpdateCostForFastParking(Parking[] carPark) {
        System.out.println("\nTask 3");
        System.out.println("Updating Costs for Parking where Speed > 100");
        for (Parking car : carPark) {
            if (car.costs > 100) {
                int oldCost = car.costs;
                car.costs += 150;
                System.out.println("\t" + "* " + car.model + ": Speed is " + car.speed + " -> costs increased from " + oldCost + " to " + car.costs);
            }
        }
    }

    public static boolean task4FindCarByModel(Parking[] Parking, String searchModel) {
        boolean carFound = false;
        for (Parking car : Parking) {
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