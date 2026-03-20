package Pasha.lesson7.dz;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Mammals lion = new Mammals("Lion", "Panthera leo", 4, 190.5, "meat", 8);
        Birds ostrich = new Birds("Ostrich", 97.3, 20, "Struthio camelus", false, "grass");
        Reptiles reptile = new Reptiles("Iguana", "lizard", 6, 3.5, "plants", 39);
        Carnivores wolf = new Carnivores("Wolf", "Canis lupus", 7, 25, "meat");
        Graminivores horse = new Graminivores("Horse", 105.5, 15, "Aptenodytes forsteri", "grass");

        Animal[] animals = {lion, ostrich, reptile, wolf, horse};

        System.out.println("Task 1");
        System.out.println("Weight of ostrich is " + ostrich.weight);
        task1ChangeWeight(ostrich, 100);
        System.out.println("Updated weight of ostrich is " + ostrich.weight);
        System.out.println();

        System.out.println("Task 2");
        System.out.println("Sum of ages of all animals is: " + task2ReturnSumOfAges(animals));
        System.out.println();

        System.out.println("Task 3");
        task3ReturnAnimal(animals, "Wolf");
        System.out.println();

        System.out.println("Task 4");
        task4ReturnBiggestWeight(lion, horse);
        System.out.println();

        System.out.println("Task 5");
        double averageWeight = task5ReturnAverageWeight(animals);
        System.out.println("Average weight of all animals is: " + averageWeight);
        System.out.println();

        System.out.println("Task 6");
        System.out.println("Average weight is: " + averageWeight);
        System.out.println("Amount of animals heavier that average weight is: " + task6ReturnAmountOfAnimalsHeavierThanAverage(animals, averageWeight));
        System.out.println();

        System.out.println("Task 7");
        System.out.println("Animals which are older than 6 years:");
        task7ReturnAnimalsOlderThan6(animals);
        System.out.println();

        System.out.println("Task 8");
        task8ReturnHeaviestAnimal(animals);
        System.out.println();

        System.out.println("Task 9");
        System.out.println("Animal with next weight after 6 kg:");
        Animal firstAfter6Kg = task9ReturnFirstAnimalAfterWeight6(animals);
        if (firstAfter6Kg != null) {
            firstAfter6Kg.getInfo();
        } else {
            System.out.println("No animal heavier than 6kg.");
        }
        System.out.println();

        System.out.println("Task 10");
        System.out.println("Are there animals older than 6 years?" + "\n" + task10ReturnTrueIfThereAreOlderAnimalsThan6Years(animals));

    }

    public static void task1ChangeWeight(Animal animal, double newWeight) {
        animal.weight = newWeight;
    }

    public static int task2ReturnSumOfAges(Animal[] animals) {
        int ageSum = 0;
        for (Animal animal : animals) {
            ageSum += animal.age;
        }
        return ageSum;
    }

    protected static void task3ReturnAnimal(Animal[] animals, String searchName) {
        for (Animal animal : animals) {
            if (animal.name.equals(searchName)) {
                animal.getInfo();
            }
        }
    }

    protected static void task4ReturnBiggestWeight(Animal animal1, Animal animal2) {
        double weight1 = animal1.weight;
        double weight2 = animal2.weight;
        if (weight1 > weight2) {
            System.out.println(animal1.name + " is bigger than " + animal2.name);
        } else if (weight1 == weight2) {
            System.out.println(animal1.name + " have an equal weight as " + animal2.name);
        } else {
            System.out.println(animal2.name + " is bigger than " + animal1.name);
        }
    }

    protected static double task5ReturnAverageWeight(Animal[] animals) {
        double sumOfWeight = 0;
        for (Animal animal : animals) {
            sumOfWeight += animal.weight;
        }
        return sumOfWeight / animals.length;
    }

    protected static int task6ReturnAmountOfAnimalsHeavierThanAverage(Animal[] animals, double averageWeight) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.weight > averageWeight) {
                count++;
            }
        }
        return count;
    }

    protected static void task7ReturnAnimalsOlderThan6(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.age > 6) {
                animal.getInfo();
            }
        }
    }

    protected static void task8ReturnHeaviestAnimal(Animal[] animals) {
        Animal heaviest = animals[0];
        for (Animal animal : animals) {
            if (animal.weight > heaviest.weight) {
                heaviest = animal;
            }
        }
        heaviest.getInfo();
    }

    protected static Animal task9ReturnFirstAnimalAfterWeight6(Animal[] animals) {
        Animal candidate = null;
        for (Animal animal : animals) {
            if (animal.weight > 6) {
                if (candidate == null || animal.weight < candidate.weight) {
                    candidate = animal;
                }
            }
        }
        return candidate;
    }

    protected static boolean task10ReturnTrueIfThereAreOlderAnimalsThan6Years(Animal[] animals) {
        boolean olderThan6 = false;
        for (Animal animal : animals) {
            if (animal.age > 6) {
                olderThan6 = true;
                break;
            }
        }
        return olderThan6;
    }
}
