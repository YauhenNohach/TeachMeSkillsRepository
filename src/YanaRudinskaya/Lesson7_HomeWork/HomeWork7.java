package YanaRudinskaya.Lesson7_HomeWork;

public class HomeWork7 {

    public static void main(String[] args) {
        Bird pigeon = new Bird("Pigeon", 2, 0.2, "seeds", 30);
        GrassAnimal cow = new GrassAnimal("Cow", 8, 350, "grass");
        Mammal tiger = new Mammal("Tiger", 7, 220, 12, "orange");
        Mammal dog = new Mammal("Dog", 3, 18, 3, "brown");
        Reptile snake = new Reptile("Snake", 2, 1.5, 0, true);

        Animal[] animals = {pigeon, cow, tiger, dog, snake};

        System.out.println("Задание 1:");
        System.out.print("Животное с изменённым весом = ");
        changePigeonWeight(animals, 0.5);
        for (Animal animal : animals) {
            if (animal.name.equals("Pigeon")) {
                System.out.println(animal);
            }
        }
        System.out.println();
        System.out.println("Задание 2:");
        System.out.println("Сумма возраста всех животных = " + sumAges(animals));
        System.out.println();
        System.out.println("Задание 3:");
        System.out.println("Поиск животного по имени: " + findAnimalByName(animals, "Dog"));
        System.out.println();
        System.out.println("Задание 4:");
        System.out.println("Одно животное из двух с бОльшим весом:  " + findHeavierAnimal(pigeon, cow));
        System.out.println();
        System.out.println("Задание 5:");
        System.out.println("Средний вес животных: " + averageWeight(animals)); // Неверное округление. Нужна помощь: как сделать верное?
        System.out.println();
        System.out.println("Задание 6:");
        System.out.println("Количество животных тяжелее среднего: " + countHeavierThanAverage(animals));
        System.out.println();
        System.out.println("Задание 7:");
        System.out.println("Животные, старше 6 лет:  ");
        printOldAnimals(animals);
        System.out.println();
        System.out.println("Задание 8:");
        System.out.println("Самое тяжёлое животное:  ");
        printHeaviestAnimal(animals);
        System.out.println();
        System.out.println("Задание 9:");
        System.out.println("Первое подходящее животное больше 6 кг:  " + findFirstHeavierThan6(animals));
        System.out.println();
        System.out.println("Задание 10:");
        System.out.println("Есть ли животные старше  6 лет:  " + hasOldAnimals(animals));

    }

    //    Задание 1: Изменить вес у одного животного(метод принимает животное и новый вес и меняет его)
    static void changePigeonWeight(Animal[] animals, double newWeight) {
        for (Animal animal : animals) {
            if (animal.name.equals("Pigeon")) {
                animal.weight = newWeight;
                break;
            }
        }
    }

    //    Задание 2: Сумма возраста всех животных
    static int sumAges(Animal[] animals) {
        int sumAge = 0;
        for (Animal animal : animals) {
            sumAge += animal.age;
        }
        return sumAge;
    }

    //    Задание 3: метод принимает searchName и массив животных, и по указанному параметру находит животное
    static Animal findAnimalByName(Animal[] animals, String searchName) {
        for (Animal animal : animals) {
            if (animal.name.equals(searchName)) {
                return animal;
            }
        }
        return null;
    }

    //    Задание 4: метод принимает 2 животных и выводит какое из них больше
    static Animal findHeavierAnimal(Animal a1, Animal a2) {
        if (a1.weight > a2.weight) {
            return a1;
        } else {
            return a2;
        }
    }
//    Задание 5: найти средний вес всех животных

    static double averageWeight(Animal[] animals) {
        double count = 0;
        double sumOfWeight = 0;
        for (Animal animal : animals) {
            sumOfWeight += animal.weight;
            count++;
        }
        return sumOfWeight / count;
    }

    //    Задание 6: Посчитать животных тяжелее среднего
    static int countHeavierThanAverage(Animal[] animals) {
        int countAnimalsWithWeightMorThanAverage = 0;
        double averageWeight = averageWeight(animals);
        for (Animal animal : animals) {
            if (animal.weight > averageWeight) {
                countAnimalsWithWeightMorThanAverage++;
            }
        }
        return countAnimalsWithWeightMorThanAverage;
    }

    //    Задание 7: Вывести только взрослых животных. (старше 6 лет)
    static void printOldAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.age > 6) {
                System.out.println(animal);
            }
        }
    }

    //    Задание 8: Поиск самого тяжёлого животного
    static void printHeaviestAnimal(Animal[] animals) {
        double maxWeight = animals[0].weight;
        Animal heaviest = animals[0];
        for (Animal animal : animals) {
            if (animal.weight > maxWeight) {
                maxWeight = animal.weight;
                heaviest = animal;
            }
        }
        System.out.println(heaviest);
    }

    //    Задание 9: Найти первое подходящее животное, которое больше 6 кг
    static Animal findFirstHeavierThan6(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.weight > 6) {
                return animal;
            }
        }
        return null;
    }

//    Задание 10: Проверить есть ли старые животные (больше 6 лет и вернуть true или false)

    static boolean hasOldAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.age > 6) {
                return true;
            }
        }
        return false;
    }
}