package olga_konon.lesson7_interfaces_and_abstract_classes.HW;

public class Main {
    public static void main(String[] args) {

        //create 5 Objects
        Animal[] animals = new Animal[5];

        animals[0] = new Bird("Simba", 5, 5, "clover", true);
        animals[1] = new Mammal("Kesha", 2, 16, "corn", true);
        animals[2] = new Mammal("Gosha", 2, 3, "lettuce", false);
        animals[3] = new Reptile("Leo", 8, 8, 54, 53.2);
        animals[4] = new Reptile("Leo2", 7, 20, 100, 53.2);

        // Ten tasks from Animal's methods

        // Для Жени--> я могу просто выводить метод через sout не используя создание новых переменных (закоменчены)

        //Task 1
        System.out.println("\nTask 1: Change animal weight");

        double newWeight = 6.0;

        Methods.changeAnimalWeight(animals[0], newWeight);
        System.out.println(animals[0].getInfo());

        //Task 2
        System.out.println("\nTask 2: Sum of all animal's ages");

        System.out.println("Sum of ages = " +  Methods.sumOfAllAnimalAges(animals));

        //Task 3
        System.out.println("\nTask 3: Search animals by SearchName");
        // can be added not found
        String searchName = "Leo";

        //Animal searched = Animal.findAnimalByName(animals, searchName);
        System.out.println( Methods.findAnimalByName(animals, searchName));

        //Task 4
        System.out.println("\nTask 4: ");
        Methods.compareTwoAnimals(animals[0], animals[1]);

        //Task 5
        System.out.println("\nTask 5: Average of all animal's weights");

        //double averageOfAllAnimalWeight = averageWeightOfAllAnimals(animals);
        System.out.println("Average of weights = " +  Methods.averageWeightOfAllAnimals(animals));

        //Task 6
        System.out.println("\nTask 6: Amount heavier than average");
        // int countAnimalsHeavierThanAverage = Animal.countAnimalsHeavierThanAverage(animals);
        System.out.println("Amount heavier than average = " +  Methods.countAnimalsHeavierThanAverage(animals));

        //Task 7
        System.out.println("\nTask 7: Print animals older than 6 year");
        Methods.printAnimalsOlderSixYears(animals);

        //Task 8
        System.out.println("\nTask 8: Most heavy animal");
        //Animal heaviestAnimal = Animal.mostHeavyAnimal(animals);
        System.out.println( Methods.mostHeavyAnimal(animals));

        //Task 9
        System.out.println("\nTask 9: Find first animal more than six");
        //  Animal animalMoreThanSixKG =findFirstAnimalMoreThanSixKG(animals);
        System.out.println( Methods.findFirstAnimalMoreThanSixKG(animals));

        //Task 10
        System.out.println("\nTask 10: Does Animal exist Older than Six Year? ");
        //  boolean IsAnimalExistsOlderSixYears = Animal.isAnimalExistsOlderSixYears(animals);
        System.out.println( Methods.isAnimalExistsOlderSixYears(animals));

    }
}
