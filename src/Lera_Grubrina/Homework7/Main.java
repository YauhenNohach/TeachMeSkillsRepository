package Lera_Grubrina.Homework7;

public class Main {
    public static void main(String[] args) {

        Mammal cow = new Mammal("Корова Буренка", 5, 400.0, true, "Пятнистый", "Мууу");
        Mammal sheep = new Mammal("Овечка Мими", 2, 40.0, false, "Белый", "Бееее");

        Bird eagle = new Bird("Орел Рагнар", 3, 6.5, 3.2, 2000, "Кхе-кхе-кхе");
        Bird owl = new Bird("Сова Совуня", 1, 2.0, 1.5, 50, "Ух-ух-ух");

        Reptile snake = new Reptile("Кобра Нагайна", 4, 3.0, 4.5, true, "сссс");

        Animal[] zoo = {cow, sheep, eagle, owl, snake};

        for (int i = 0; i < zoo.length; i++) {
            System.out.println("-------------------------");
            System.out.println(zoo[i].getInfo());

            if (zoo[i] instanceof GrassAnimal) {
                zoo[i].eat("Сено");
            } else {
                zoo[i].eat("Мышь");
            }

            zoo[i].makeSound();
        }

        System.out.println("\nЗАДАНИЕ 1");
        changeAnimalWeight(cow, 450.5);

        System.out.println("\nЗАДАНИЕ 2");
        printTotalAge(zoo);

        System.out.println("\nЗАДАНИЕ 3");
        findAnimalByName(zoo, "Орел Рагнар");
        findAnimalByName(zoo, "Кароста");

        System.out.println("\nЗАДАНИЕ 4");
        compareAnimals(cow, sheep);
        compareAnimals(eagle, snake);

        System.out.println("\nЗАДАНИЕ 5");
        printAverageWeight(zoo);

        System.out.println("\nЗАДАНИЕ 6");
        countAnimalsHeavierThanAverage(zoo);

        System.out.println("\nЗАДАНИЕ 7");
        printAdultAnimals(zoo);

        System.out.println("\nЗАДАНИЕ 8");
        findHeaviestAnimal(zoo);

        System.out.println("\nЗАДАНИЕ 9");
        findFirstAnimalHeavierThan6Kg(zoo);

        System.out.println("\nЗАДАНИЕ 10");
        boolean hasOld = checkHasOldAnimals(zoo);
        System.out.println("Есть ли старые животные? Ответ: " + hasOld);

    }

    //Задание 1

    /**
     * Изменить вес у одного животного(метод принимает животное и новый вес и меняет его)
     *
     * @param animal
     * @param newWeight
     */
    public static void changeAnimalWeight(Animal animal, double newWeight) {
        System.out.println("Старый вес: " + animal.getName() + " был " + animal.getWeight() + " кг");

        animal.setWeight(newWeight);

        System.out.println("Новый вес: " + animal.getName() + " стал " + animal.getWeight() + " кг");
    }

    // Задание 2

    /**
     * Сумма возраста всех животных
     * @param animals
     */
    public static void printTotalAge(Animal[] animals) {
        int sum = 0;

        for (int i = 0; i < animals.length; i++) {
            sum = sum + animals[i].getAge();
        }

        System.out.println("Суммарный возраст всех животных: " + sum + " лет");
    }

    // Задание 3

    /**
     * Метод принимает searchName и массив животных, и по указанному парметру находит животное
     * @param animals
     * @param searchName
     */
    public static void findAnimalByName(Animal[] animals, String searchName) {
        boolean isFound = false;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getName().equalsIgnoreCase(searchName)) {
                System.out.println("Животное '" + searchName + "' найдено");
                System.out.println(animals[i].getInfo());

                isFound = true;
                break;
            }
        }
        if (isFound == false) {
            System.out.println("Животное '" + searchName + "' не найдено");
        }
    }

    // Задание 4

    /**
     * Метод принимает 2 животных и выводит какое из них больше
     * @param animal1
     * @param animal2
     */
    public static void compareAnimals(Animal animal1, Animal animal2) {
        double weight1 = animal1.getWeight();
        double weight2 = animal2.getWeight();

        System.out.println("Сравнивается: " + animal1.getName() + " (" + weight1 + " кг) и " +
                animal2.getName() + " (" + weight2 + " кг)");
        if (weight1 > weight2) {
            System.out.println("Результат: " + animal1.getName() + " тяжелее");
        } else if (weight1 < weight2) {
            System.out.println("Результат: " + animal2.getName() + " тяжелее");
        } else {
            System.out.println("Результат: Вес одинаковый");
        }

    }

    //Задание 5

    /**
     * Найти средний вес всех животных
     * @param animals
     */
    public static double printAverageWeight(Animal[] animals) {
        double totalWeight = 0;

        for (int i = 0; i < animals.length; i++) {
            totalWeight = totalWeight + animals[i].getWeight();
        }
        double averageWeight = totalWeight / animals.length;
        System.out.println("Средний вес всех животных: " + averageWeight + " кг");
        return averageWeight;
    }

    //Задание 6

    /**
     * Посчитать животных тяжелее среднего
     * @param animals
     */
    public static void countAnimalsHeavierThanAverage(Animal[] animals) {
        double averageWeight = printAverageWeight(animals);
        int count = 0;
        System.out.println("Животные тяжелее среднего веса " + averageWeight + " кг:");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getWeight() > averageWeight) {
                count++;
                System.out.println(animals[i].getName() + " - " + animals[i].getWeight() + " кг");
            }
        }

        System.out.println("Итого таких животных: " + count);
    }

    //Задание 7

    /**
     * Вывести только взрослых животных. (старше 6 лет)
     * @param animals
     */
    public static void printAdultAnimals(Animal[] animals) {
        System.out.println("Животные старше 6 лет:");
        boolean hasAdults = false;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getAge() > 6) {
                System.out.println("- " + animals[i].getName() + " (возраст: " + animals[i].getAge() + " лет)");
                hasAdults = true;
            }
        }

        if (hasAdults == false) {
            System.out.println("Нет животных старше 6 лет");
        }
    }

    //Задание 8

    /**
     * Поиск самого тяжёлого животного
     * @param animals
     */
    public static void findHeaviestAnimal(Animal[] animals) {
        Animal heaviest = animals[0];
        for (int i = 1; i < animals.length; i++) {
            if (animals[i].getWeight() > heaviest.getWeight()) {
                heaviest = animals[i];
            }
        }

        System.out.println("Кто же это?: " + heaviest.getName());
        System.out.println("Вес составляет " + heaviest.getWeight() + " кг!");
    }

    //Задание 9

    /**
     * Найти первое подходящее животное, которое больше 6 кг
     * @param animals
     */
    public static void findFirstAnimalHeavierThan6Kg(Animal[] animals) {
        boolean isFound = false;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getWeight() > 6.0) {
                System.out.println("Первое найденное животное тяжелее 6 кг - " + animals[i].getName() + " (" + animals[i].getWeight() + " кг)");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Нет животных тяжелее 6 кг.");
        }
    }

    //Задание 10

    /**
     * Проверить есть ли старые животные (больше 6 лет и вернуть true или false)
     * @param animals
     * @return
     */
    public static boolean checkHasOldAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getAge() > 6) {
                return true;
            }
        }

        return false;
    }

}

