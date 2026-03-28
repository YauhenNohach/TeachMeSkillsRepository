package yanina_savich.lesson7_interfaces_and_abstract_classes.HM;

import static yanina_savich.lesson7_interfaces_and_abstract_classes.HM.Animal.*;

public class Main {
    public static void main(String[] arg) {
        Animal[] animals = new Animal[5];
        animals[0] = new GrassAnimalFirst("Cow", 3, 180);
        animals[1] = new PredatorFirst("Tiger", 7, 160);
        animals[2] = new MammalSecond("Cat", 10, 4);
        animals[3] = new BirdSecond("Eagle", 2, 5.2);
        animals[4] = new ReptileSecond("Snake", 1, 3);
        System.out.println("----1----");
        changeWeight(animals[0], 200);
        System.out.println(animals[0].getInfo());
        System.out.println("----2----");
        int sumAnimalsAge = sumAge(animals);
        System.out.println("Total age: " + sumAnimalsAge);
        System.out.println("----3----");
        Animal found = searchName(animals, "Cat");
        if (found != null) {
            System.out.println(found.getInfo());
        } else {
            System.out.println("Animal not found");
        }
        System.out.println("----4----");
        moreWeight(animals[0], animals[1]);
        System.out.println("----5----");
        double averageWeightAnimals = averageWeight(animals);
        System.out.println("Average weight is: " + averageWeightAnimals);
        System.out.println("----6----");
        int count = countAnimalsMoreAverageWeight(animals);
        System.out.println("Animals more then average weight: " + count);
        System.out.println("----7----");
        oldAnimals(animals);
        System.out.println("----8----");
        Animal big = heaviestAnimal(animals);
        System.out.println("Heaviest: " + big.getInfo());
        System.out.println("----9----");
        Animal animal6Kg = firstAnimalIsMoreThan6(animals);
        if (animal6Kg != null){
            System.out.println("Found: " + animal6Kg.getInfo());
        } else {
            System.out.println("No animal with 6 kg");
        }
        System.out.println("----10----");
        boolean result = isOldAnimals(animals);
        System.out.println("Are there any animals older than 6 years old -> " + result);




    }
}