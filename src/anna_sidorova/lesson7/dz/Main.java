package anna_sidorova.lesson7.dz;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new GrassAnimal("cow", 3, 122.2, 14.4);
        Animal animal2 = new Predator("wolf", 10, 35, 23.3);
        Animal animal3 = new Bird("duck", 1, 4.9, 4);
        Animal animal4 = new Reptile("lizard", 2, 1.9, false);
        Animal animal5 = new Mammal("bear", 5, 345, 45);
        Mammal mammal = new Mammal("horse", 3, 455, 5);
        mammal.setAmountOfMilk(4);
        mammal.getAmountOfMilk();

        Animal[] allAnimals = new Animal[5];
        allAnimals[0] = animal1;
        allAnimals[1] = animal2;
        allAnimals[2] = animal3;
        allAnimals[3] = animal4;
        allAnimals[4] = animal5;
        changeAnimalWeight(animal3, 150.0);
        sumAllAge(allAnimals);
        findAnimalByName(allAnimals, "wolf");
        compare2AnimalWeight(animal1, animal2);
        findAverageWeight(allAnimals);
        findAnimalThatHeavierThanAverage(allAnimals);
        findAnimalsThatOlderThanSixYears(allAnimals);
        findTheHeaviestAnimal(allAnimals);
        findFirstAnimalThatHeavierThanSixKilos(allAnimals);
        boolean result = isOlderThanSixYears(allAnimals);
        if (result) {
            System.out.println("Есть животные старше 6 лет");
        } else {
            System.out.println("Таких животных нет");
        }
    }

    //Задание 1
    static void changeAnimalWeight(Animal animal, double newWeight) {
        animal.animalWeight = newWeight;
        System.out.println("Новый вес животного: " + animal.animalWeight);
    }

    //Задание 2
    static void sumAllAge(Animal[] allAnimals) {
        int summa = 0;
        for (Animal an : allAnimals) {
            summa += an.animalAge;
        }
        System.out.println("Сумма возраста всех животных " + summa);
    }

    //Задание 3
    static void findAnimalByName(Animal[] animals, String searchName) {
        for (Animal an : animals) {
            if (searchName.equals(an.animalName)) {
                System.out.println("Найдено животное " + an);
            }
        }
    }

    //Задание 4
    static void compare2AnimalWeight(Animal animal1, Animal animal2) {
        if (animal1.animalWeight > animal2.animalWeight) {
            System.out.println("Тяжелее это животное: " + animal1);
        } else if (animal2.animalWeight > animal1.animalWeight) {
            System.out.println("Тяжелее это животное: " + animal2);
        } else {
            System.out.println("Вес одинаковый");
        }
    }
    //Задание 5

    static void findAverageWeight(Animal[] allanimals) {
        int summa = 0; //начальная сумма
        for (Animal an : allanimals) {
            summa += an.animalWeight;
        }
        double average = summa / allanimals.length; //среднее арифметическое
        System.out.println("Средний вес равно " + average + " кг");
    }

    //Задание 6
    static void findAnimalThatHeavierThanAverage(Animal[] allanimals) {
        int summa = 0; //начальная сумма
        for (Animal an : allanimals) {
            summa += an.animalWeight;
        }
        double average = summa / allanimals.length; //среднее арифметическое
        int count = 0; //счетчик
        for (Animal an : allanimals) {
            if (an.animalWeight > average) {
                count++;
            }
        }
        System.out.println("Количество животных тяжелее среднего: " + count);
    }

    //Задание 7
    static void findAnimalsThatOlderThanSixYears(Animal[] allanimals) {
        for (Animal an : allanimals) {
            if (an.animalAge > 6) {
                System.out.println("Самые взрослые животные " + an);
            }
        }
    }

    //Задание 8
    static void findTheHeaviestAnimal(Animal[] allanimals) {
        Animal max = allanimals[0];
        for (Animal an : allanimals) {
            if (an.animalWeight > max.animalWeight) {
                max = an;
            }
        }
        System.out.println("Самое тяжелое животное " + max);
    }

    //Задание 9
    static void findFirstAnimalThatHeavierThanSixKilos(Animal[] allanimals) {
        for (Animal an : allanimals) {
            if (an.animalWeight > 6) {
                System.out.println("Животное тяжелее 6 кг " + an);
                break; //чтобы остановиться после первого
            }
        }
    }

    //Задание 10
    static boolean isOlderThanSixYears(Animal[] allanimals) {
        for (Animal an : allanimals) {
            if (an.animalAge > 6) {
                return true;
            }
        }
        return false;
    }

}
