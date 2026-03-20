package Pasha.lesson7.lesson;

public class Cars extends Car {
    int costs;
    public Cars(String model, int year, int speed, int costs) {
        super(model, year, speed);
        this.costs = costs;
    }

    public static void main(String[] args) {

        Cars mitsubishi = new Cars("Mitsubishi", 1993, 200, 5000);
        Cars mercedes = new Cars("Mercedes", 1985, 190, 1000);
        Cars honda = new Cars("Honda", 2005, 85, 4000);
        Cars toyota = new Cars("Toyota", 1990, 95, 2500);
        Cars ford = new Cars("Ford", 1980, 120, 800);
        Cars bmw = new Cars("BMW", 2010, 220, 15000);
        Cars nissan = new Cars("Nissan", 1995, 78, 3000);

        Cars[] myCars = {mitsubishi, mercedes, honda, toyota, ford, bmw, nissan};

        task2PrintOldCars(myCars);

        task3UpdateCostForFastCars(myCars);

        String searchViaModel1 = "Mitsubishi";
        String searchViaModel2 = "Tesla";

        System.out.println("\nTask 4");
        task4FindCarByModel(myCars, searchViaModel1);
        System.out.println();
        task4FindCarByModel(myCars, searchViaModel2);
    }

    public static void task2PrintOldCars(Cars[] cars) {
        System.out.println("Task 2");
        System.out.println("Cars manufactured before 1992");
        for (Cars car : cars) {
            if (car.year < 1992) {
                System.out.println(car.model + " - Year: " + car.year);
            }
        }
    }

    public static void task3UpdateCostForFastCars(Cars[] cars) {
        System.out.println("\nTask 3");
        System.out.println("Updating Costs for cars where Speed > 100");
        for (Cars car : cars) {
            if (car.speed > 100) {
                int oldCost = car.costs;
                car.costs += 150;
                System.out.println("\t" + "* " + car.model + ": Speed is " + car.speed + " -> costs increased from " + oldCost + " to " + car.costs);
            }
        }
    }

    public static void task4FindCarByModel(Cars[] cars, String searchModel) {
        System.out.println("Looking for model: " + searchModel);
        boolean carFound = false;

        for (Cars car : cars) {
            if (car.model.equals(searchModel)) {
                System.out.println("\t" + "* Model: " + car.model);
                System.out.println("\t" + "* Year: " + car.year);
                System.out.println("\t" + "* Speed: " + car.speed);
                System.out.println("\t" + "* Costs: " + car.costs);
                carFound = true;
                break;
            }
        }
        if (!carFound) {
            System.out.println("\t" + "* Car model \"" + searchModel + "\" was not found.");
        }
    }
}