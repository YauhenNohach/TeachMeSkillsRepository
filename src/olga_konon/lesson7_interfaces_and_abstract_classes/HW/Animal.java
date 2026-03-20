package olga_konon.lesson7_interfaces_and_abstract_classes.HW;

import java.util.Objects;

public abstract class Animal {

    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        }

    // абстрактный makeSound() — выводит звук, который издаёт животное (например, "Some sound")
    public abstract void makeSound();

    // абстрактный eat(food) — принимает название еды и выводит, что животное ест
    public abstract void eat(String food);

    // общий getInfo() — возвращает строку с информацией о животном
    public String getInfo() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight + '}';
    }

    // to return not memory, but strings
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight + '}';
    }

    // Задание 1: Изменить вес у одного животного (иетод принимает животное и новый вес и меянет его)
    static void changeAnimalWeight(Animal animal, double newWeight) {
        animal.weight = newWeight;
    }

    // Задание 2: Сумма возраста всех животных
    static double sumOfAllAnimalAges(Animal[] animals) {
        int sumOfAllAnimalAge = 0;
        for (Animal animal : animals) {
            sumOfAllAnimalAge += animal.age;
        }
        return sumOfAllAnimalAge;
    }

    // Задание 3: метод принимает searchName и массив животных, и по указанному парметру находит животное

    static Animal findAnimalByName(Animal[] animals, String searchName) {
        for (Animal animal : animals) {
            if (Objects.equals(animal.name, searchName)) {
                return animal;
            }

        }
        return null;
    }
    // Задание 4: метод принимает 2 животных и выводит какое из них больше

    static void compareTwoAnimals(Animal animal1, Animal animal2) {
        if (animal1.weight > animal2.weight) {
            System.out.println(animal1.name + " is heavier than " + animal2.name);
        } else if (animal1.weight < animal2.weight) {
            System.out.println(animal2.name + " is heavier than " + animal1.name);

        } else {
            System.out.println(animal1.name + " is equal than " + animal2.name);
        }
    }


    //  Задание 5: найти средний вес всех животных
    static double averageWeightOfAllAnimals(Animal[] animals) {
        double sumOfAllAnimalWeight = 0;
        for (Animal animal : animals) {
            sumOfAllAnimalWeight += animal.weight;
        }
        return sumOfAllAnimalWeight / animals.length;
    }

    // Задание 6: Посчитать животных тяжелее среднего?? количество
    static int countAnimalsHeavierThanAverage(Animal[] animals) {
        double averageWeightOfAllAnimals = averageWeightOfAllAnimals(animals);
        int count = 0;
        for (Animal animal : animals) {
            if (animal.weight > averageWeightOfAllAnimals) {
                count++;
            }
        }
        return count;
    }

    // Задание 7: Вывести только взрослых животных. (старше 6 лет)
    public static void printAnimalsOlderSixYears(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.age > 6) {
                System.out.println(animal);
            }
        }
    }

    // Задание 8: Поиск самого тяжёлого животного
    public static Animal mostHeavyAnimal(Animal[] animals) {
        //double mostHeavyWeight = animals[0].weight;
        Animal heaviestAnimal = animals[0];
        for (Animal animal : animals) {
            if (animal.weight > heaviestAnimal.weight) {
               // mostHeavyWeight = animal.weight;
                heaviestAnimal = animal;
            }

        }
        return heaviestAnimal;
    }

    // Задание 9: Найти первое подходящее животное, которое больше 6 кг
    public static Animal findFirstAnimalMoreThanSixKG(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.weight > 6) {
                return animal;
            }
        }
        return null;

    }

    //  Задание 10: Проверить есть ли старые животные (больше 6 лет и вернуть true или false)
    public static boolean isAnimalExistsOlderSixYears(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.age > 6) {
                return true;
            }
        }
        return false;


    }
}











