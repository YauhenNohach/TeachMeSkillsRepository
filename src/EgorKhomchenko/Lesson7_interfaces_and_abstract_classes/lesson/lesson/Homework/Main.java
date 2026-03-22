package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Homework;

public abstract class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Bird("Eagle", 15, 10.3, true, true),
                new Insects("Termite", 5, 0.000025, "tree", "brown"),
                new Mammal("Cow", 3, 3.2, "grass", "white"),
                new Reptile("Cobra", 7, 5.0, true, false),
                new Fish("Shark", 10, 1520.3, true)
        };

        // Вывести для всех животных: info, звук, еда
        for (Animal a : animals) {
            printInfoAndActions(a);
            System.out.println("-------------------------");
        }

        // Задание 1: изменить вес у одного животного

        changeWeight(animals[0], 100.0);
        System.out.println("После смены веса: " + animals[0].getInfo());

        // Задание 2: сумма возрастов всех животных
        System.out.println("Сумма возрастов: " + sumAge(animals));

        // Задание 3: найти животное по имени
        Animal found = findByName(animals, "Shark");
        if (found != null) {
            System.out.println("Найдено: " + found.getInfo());
        } else {
            System.out.println("Животное не найдено");
        }

        // Задание 4: сравнить два животных по весу
        compareAnimals(animals[2], animals[4]);

        // Задание 5: средний вес всех животных
        System.out.printf("Средний вес в кг: %.3f%n", avgWeight(animals));

        // Задание 6: количество животных тяжелее среднего
        System.out.println("Число животных тяжелее среднего: " + countHeavyAnimals(animals));

        // Задание 7: вывести взрослых животных (старше 6 лет)
        System.out.println("Взрослые животные (>6 лет):");
        printAdults(animals);

        // Задание 8: самое тяжёлое животное
        Animal heaviest = findHeaviest(animals);
        System.out.println("Самое тяжёлое животное: " + heaviest.getInfo());

        // Задание 9: первое животное больше 6 кг
        Animal firstOver6 = findFirstOver6kg(animals);
        System.out.println("Первое >6кг: " + (firstOver6 != null ? firstOver6.getInfo() : "не найдено"));

        // Задание 10: есть ли старые животные (>6 лет)
        System.out.println("Есть ли старые животные (>6 лет): " + hasOldAnimals(animals));
    }
    static void printInfoAndActions(Animal a) {
        if (a == null) return;
        System.out.println(a.getInfo());
        a.makeSound();
        String food = chooseFood(a);
        a.eat(food);
    }

    private static String chooseFood(Animal a) {
        if (a instanceof Fish) return "рыба";
        if (a instanceof Bird) return "мясо";
        if (a instanceof Mammal) return "трава";
        if (a instanceof Reptile) return "мышь";
        if (a instanceof Insects) return "листья";
        return "еда";
    }

    // Задание 1
    static void changeWeight(Animal a, double newWeight) {
        if (a == null) return;
        a.setWeight(newWeight);
    }

    // Задание 2
    static int sumAge(Animal[] arr) {
        int sum = 0;
        for (Animal a : arr) {
            if (a != null) sum += a.getAge();
        }
        return sum;
    }

    // Задание 3
    static Animal findByName(Animal[] arr, String searchName) {
        if (searchName == null) return null;
        for (Animal a : arr) {
            if (a != null && searchName.equalsIgnoreCase(a.getName())) {
                return a;
            }
        }
        return null;
    }

    // Задание 4
    static void compareAnimals(Animal a1, Animal a2) {
        if (a1 == null || a2 == null) {
            System.out.println("Одно из животных отсутствует.");
            return;
        }
        if (Double.compare(a1.getWeight(), a2.getWeight()) == 0) {
            System.out.println("Оба животного имеют одинаковый вес.");
        } else {
            Animal bigger = a1.getWeight() > a2.getWeight() ? a1 : a2;
            System.out.println(bigger.getName() + " больше.");
        }
    }

    // Задание 5
    static double avgWeight(Animal[] arr) {
        double sum = 0;
        int count = 0;
        for (Animal a : arr) {
            if (a != null) {
                sum += a.getWeight();
                count++;
            }
        }
        return count == 0 ? 0.0 : sum / count;
    }

    // Задание 6
    static int countHeavyAnimals(Animal[] arr) {
        double avg = avgWeight(arr);
        int count = 0;
        for (Animal a : arr) {
            if (a != null && a.getWeight() > avg) count++;
        }
        return count;
    }

    // Задание 7
    static void printAdults(Animal[] arr) {
        for (Animal a : arr) {
            if (a != null && a.getAge() > 6) System.out.println(a.getInfo());
        }
    }

    // Задание 8
    static Animal findHeaviest(Animal[] arr) {
        Animal heaviest = null;
        for (Animal a : arr) {
            if (a == null) continue;
            if (heaviest == null || a.getWeight() > heaviest.getWeight()) {
                heaviest = a;
            }
        }
        return heaviest;
    }

    // Задание 9
    static Animal findFirstOver6kg(Animal[] arr) {
        for (Animal a : arr) {
            if (a != null && a.getWeight() > 6.0) return a;
        }
        return null;
    }

    // Задание 10
    static boolean hasOldAnimals(Animal[] arr) {
        for (Animal a : arr) {
            if (a != null && a.getAge() > 6) return true;
        }
        return false;
    }
}
