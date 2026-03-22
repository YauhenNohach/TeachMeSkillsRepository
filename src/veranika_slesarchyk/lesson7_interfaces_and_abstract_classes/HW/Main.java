package veranika_slesarchyk.lesson7_interfaces_and_abstract_classes.HW;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Mammal("Cow", 4, 200, "Grass", true);
        animals[1] = new Bird("Eagle", 2, 5, 25, true);
        animals[2] = new Reptile("Snake", 2, 3, 10, 12);
        animals[3] = new GrassAnimal("Rabbit", 3, 5, "Carrot");
        animals[4] = new Predator("Fox", 4, 7, 20);

        changeWeight(animals[0], 450); //1
        System.out.println("After: " + animals[0].getInfo());
        System.out.println("Sum age: " + sumAge(animals)); //2
        System.out.println(findByName("Wolf", animals)); //3
        compareAnimals(animals[0], animals[1]); //4
        double avg = averageWeight(animals); //5
        System.out.println("Average weight: " + avg);
        System.out.println("Heavier than avg: " + countHeavierThanAvg(animals, avg)); //6
        printAdults(animals); //7
        System.out.println("Heaviest: " + findHeaviest(animals).getInfo()); //8
        System.out.println("First > 6kg: " + findFirstAbove6(animals).getInfo()); //9
        System.out.println("Has old animals: " + hasOldAnimals(animals)); //10

    }

    //    Задание 1: Изменить вес у одного животного(иетод принимает животное и новый вес и меняет его)
    public static void changeWeight(Animal a, double newWeight) {
        a.setWeight(newWeight);
    }

    //Задание 2: Сумма возраста всех животных
    public static int sumAge(Animal[] animals) {
        int sum = 0;
        for (Animal a : animals) {
            sum += a.getAge();
        }
        return sum;
    }

    //Задание 3: метод принимает searchName и массив животных, и по указанному парметру находит животное
    public static Animal findByName(String name, Animal[] animals) {
        for (Animal a : animals) {
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        return null;
    }

    //Задание 4: метод принимает 2 животных и выводит какое из них больше
    public static void compareAnimals(Animal a1, Animal a2) {
        if (a1.getWeight() > a2.getWeight()) {
            System.out.println(a1.getName() + " is bigger");
        } else {
            System.out.println(a2.getName() + " is bigger");
        }
    }

    //    Задание 5: найти средний вес всех животных
    public static double averageWeight(Animal[] animals) {
        double sum = 0;
        for (int i = 0; i < animals.length; i++) {
            sum += animals[i].getWeight();
        }
        return sum / animals.length;
    }

    //    Задание 6: Посчитать животных тяжелее среднего
    public static int countHeavierThanAvg(Animal[] animals, double avg) {
        int count = 0;
        for (Animal a : animals) {
            if (a.getWeight() > avg) {
                count++;
            }
        }
        return count;
    }

//    Задание 7: Вывести только взрослых животных. (старше 6 лет)
public static void printAdults(Animal[] animals) {
    for (Animal a : animals) {
        if (a.getAge() > 6) {
            System.out.println(a.getInfo());
        }
    }
}

//    Задание 8: Поиск самого тяжёлого животного
public static Animal findHeaviest(Animal[] animals) {
    Animal max = animals[0];
    for (Animal a : animals) {
        if (a.getWeight() > max.getWeight()) {
            max = a;
        }
    }
    return max;
}

//    Задание 9: Найти первое подходящее животное, которое больше 6 кг
public static Animal findFirstAbove6(Animal[] animals) {
    for (Animal a : animals) {
        if (a.getWeight() > 6) {
            return a;
        }
    }
    return null;
}
//    Задание 10: Проверить есть ли старые животные (больше 6 лет и вернуть true или false)
public static boolean hasOldAnimals(Animal[] animals) {
    for (Animal a : animals) {
        if (a.getAge() > 6) {
            return true;
        }
    }
    return false;
}
}
