package veronika_akulovich.lesson7_interfaces_and_abstract_classes.hometask;

import veronika_akulovich.lesson7_interfaces_and_abstract_classes.lesson.Bus;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cow = new Mammal("cow", 9, 500, 32, "cloven-footed");
        Animal qiwi = new Bird("qiwi", 2, 1, 2, false);
        Animal rattlesnake = new Reptile("rattlesnake", 7, 3, 10, true);
        Animal bullfinch = new Bird("bullfinch", 5, 1, 1, true);
        Animal crocodile = new Reptile("crocodile", 50, 150, 60, false);

        Animal[] animal = new Animal[5];
        animal[0] = cow;
        animal[1] = qiwi;
        animal[2] = rattlesnake;
        animal[3] = bullfinch;
        animal[4] = crocodile;

        changeWeightForAnyAnimal(cow, 600);
        System.out.println(cow.animalWeight);

        sumAnimalsAge(animal);

        Animal foundSpecificAnimalByName = searchSpecificAnimalByName(animal, "qiwi");
        if (foundSpecificAnimalByName != null) {
            System.out.println("Мы нашли следующее животное: " + foundSpecificAnimalByName);
        } else {
            System.out.println("Введите другое название животного, мы ничего не нашли! ");
        }

        Animal compareTwoAnimalByWeight = compareTwoAnimalByWeight(crocodile, cow);
        System.out.println("Выводим какое из животных больше: " + compareTwoAnimalByWeight.getInfo());

        System.out.println("Средний вес всех животных: " + averageWeightOfAllAnimals(animal));

        System.out.println("Количество животных у которых вес выше среднего: " + countOfAnimalsMoreThanAverageWeight(animal));

        System.out.println("Выводим только взрослых животных старше 6 лет" + Arrays.toString(animalWithAgeMoreThan6(animal)));

        System.out.println("Самое тяжелое животное: " + findAnimalWithHighestWeight(animal));

        System.out.println("Первое подходящее животное, которое весит больше 6 кг: " + findFirstAnimalWithWeightMoreThan6(animal));

        System.out.println("Есть ли животные старше 6 лет: " + findIfWeHaveOldAnimals(animal));
    }

    //Задание 1
    public static void changeWeightForAnyAnimal(Animal animal, double newWeight) {
        animal.animalWeight = newWeight;
    }

    //Задание 2
    public static int sumAnimalsAge(Animal[] animal) {
        int sumAnimalsAge = 0;
        for (int i = 0; i < animal.length; i++) {
            sumAnimalsAge += animal[i].animalAge;
        }
        System.out.println("Cумма возраста всех животных: " + sumAnimalsAge);
        return sumAnimalsAge;
    }

    // Задание 3
    public static Animal searchSpecificAnimalByName(Animal[] animal, String searchName) {
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].animalName.equals(searchName)) {
                return animal[i];
            }
        }
        return null;
    }

    //Задание 4
    public static Animal compareTwoAnimalByWeight(Animal animal, Animal animal1) {
        if (animal.animalWeight > animal1.animalWeight) {
            return animal;
        } else {
            return animal1;
        }
    }

    // Задание 5
    public static double averageWeightOfAllAnimals(Animal[] animal) {
        double averageWeightOfAllAnimals = 0;
        for (int i = 0; i < animal.length; i++) {
            averageWeightOfAllAnimals += animal[i].animalWeight;
        }
        return averageWeightOfAllAnimals / animal.length;
    }
    // Задание 6
    public static int countOfAnimalsMoreThanAverageWeight (Animal[] animal){
        int countOfAnimalsMoreThanAverageWeight = 0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].animalWeight > averageWeightOfAllAnimals(animal)){
                countOfAnimalsMoreThanAverageWeight++;
            }
        }
        return countOfAnimalsMoreThanAverageWeight;
    }
    // Задание 7
    public static Animal[] animalWithAgeMoreThan6 (Animal[] animal) {
        Animal[] arrayAnimalWithAgeMoreThan6 = new Animal[animal.length];
        int indexOfAnimals = 0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].animalAge > 6) {
                arrayAnimalWithAgeMoreThan6[indexOfAnimals] = animal[i];
                indexOfAnimals++;
            }

        }
        return arrayAnimalWithAgeMoreThan6;
    }
    //Задание 8
    public static Animal findAnimalWithHighestWeight (Animal[] animal){
        Animal theMostFatAnimal = animal[0];
        for (int i = 1; i < animal.length; i++) {
            if (animal[i].animalWeight > theMostFatAnimal.animalWeight){
                theMostFatAnimal = animal[i];
            }
        }
        return theMostFatAnimal;
    }
    // Задание 9
   public static Animal findFirstAnimalWithWeightMoreThan6 (Animal[] animal) {
       for (int i = 0; i < animal.length; i++) {
           if (animal[i].animalWeight > 6) {
               return animal[i];
           }

       }
       return null;
   }
   // Задание 10
    public static boolean findIfWeHaveOldAnimals (Animal[] animal){
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].animalAge > 6) {
                return true;
            }
        }
        return false;

    }
}
