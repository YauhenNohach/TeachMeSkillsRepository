package irina_lisovskaya.lesson7_interfaces_and_abstract_classes;

import irina_lisovskaya.lesson7_interfaces_and_abstract_classes.dz.*;
import irina_lisovskaya.lesson7_interfaces_and_abstract_classes.lesson.Bus;
import irina_lisovskaya.lesson7_interfaces_and_abstract_classes.lesson.Car;
import irina_lisovskaya.lesson7_interfaces_and_abstract_classes.lesson.MiniBus;
import irina_lisovskaya.lesson7_interfaces_and_abstract_classes.lesson.SportCar;

public class Main {
    public static void main(String[] args) {

//  МАШИНЫ
        Bus bus = new Bus("bus", 1299, 90, 43, 43);

        Car bus2 = new Bus("bus2", 1699, 99, 13, 13);

        Car lotus = new SportCar("lotus", 2003, 300);

        Bus maxi = new Bus("maxi", 2018, 220, 12, 12);

        MiniBus mini = new MiniBus("mini", 1999, 290, 8, 8);

        SportCar subaru = new SportCar("subaru", 1890, 500, 1, 12);


        Car[] allCars = new Car[6];
        allCars[0] = bus;
        allCars[1] = bus2;
        allCars[2] = lotus;
        allCars[3] = maxi;
        allCars[4] = mini;
        allCars[5] = subaru;

        printOldCars(allCars);
        updatePrices(allCars);
        findCarByModel(allCars);

//  ЖИВОТНЫЕ
        GrassAnimal animal1 = new GrassAnimal("Жужа", 1, 0.1, "clover");
        Predator animal2 = new Predator("Томас", 2, 1, "mouse");
        Bird animal3 = new Bird("Кеша", 9, 0.2, "grass", 0.1);
        Reptile animal4 = new Reptile("Слайдер", 1, 8, "mouse", true);
        Mammal animal5 = new Mammal("Персик", 6, 8, "valerian", 31.2);

        Animal[] allAnimal = new Animal[5];
        allAnimal[0] = animal1;
        allAnimal[1] = animal2;
        allAnimal[2] = animal3;
        allAnimal[3] = animal4;
        allAnimal[4] = animal5;

// Задание 1: Изменить вес у одного животного (метод принимает животное и новый вес и меняет его)
        System.out.println("== Задание 1. Животные. Меняем вес Кеши ==");
        System.out.println("Изначальный вес : " + animal3.getWeight());
        animal3.setWeight(0.5);
        System.out.println("Вес после изменений :" + animal3.getWeight());


//  Задание 2. Сумма возраста всех животных
        System.out.println("== Задание 2. Сумма возраста всех животных ==");
        calculateTotalAge(allAnimal);

// Задание 3. Метод принимает searchName и массив животных, и по указанному парметру находит животное
        System.out.println("== Задание 3. Ищем, есть ли среди наших животных Жужа ==");
        findAnimal("Жужа", allAnimal);

//  Задание 4. Метод принимает 2 животных и выводит какое из них больше
        System.out.println("== Задание 4. Сравниваем двух животных и узнаём, кто весит больше ==");
        compareAnimals(animal3, animal5);

//  Задание 5: найти средний вес всех животных
        System.out.println("== Задание 5. ищем средний вес всех животных ==");
        printAverageWeight(allAnimal);

//  Задание 6: Посчитать животных тяжелее среднего
        System.out.println("== Задание 6. Считаем животных тяжелее среднего ==");
        printHeavierThanAverage(allAnimal);

// Задание 7: Вывести только взрослых животных (старше 6 лет)
        System.out.println("== Задание 7. Список животных старше 6 лет ==");
        printAdultAnimals(allAnimal);

//  Задание 8: Поиск самого тяжёлого животного
        System.out.println("== Задание 8. Ищем самого тяжёлого животного ==");
        findHeaviestAnimal(allAnimal);

//  Задание 9: Найти первое подходящее животное, которое больше 6 кг
        System.out.println("== Задание 9. Первое подходящее животное, которое больше 6 кг ==");
        findFirstHeavyAnimal(allAnimal);

//  Задание 10: Проверить есть ли старые животные (больше 6 лет и вернуть true или false)
        System.out.println("== Задание 10. Проверяем, есть ли животное старичок, которому больше 6 лет ==");
        boolean result = OldAnimals(allAnimal);
        System.out.println("Есть ли в списке старые животные? " + result);

    }

    // ЗАДАНИЯ С АВТО
    //    создать метод, который найдёт автомобили до 1992 и выведет их все на экран
    public static void printOldCars(Car[] allCars) {
        System.out.println("Список автомобилей до 1992 года");
        for (int i = 0; i < allCars.length; i++) {
            // Если год меньше 1992 — печатаем
            if (allCars[i] != null && allCars[i].getYear() < 1992) {
                System.out.println("Модель: " + allCars[i].getModel() + ", год выпуска: " + allCars[i].getYear());
            }
        }
    }

    // добавить новое поле в класс Car "стоимость авто".  создать метод, который изменит стоимость тех автомобилей, которые разгоняются более 100 на 150 рублей
    public static void updatePrices(Car[] allCars) {
        System.out.println("Установка цены (150 руб.) для авто со скоростью > 100");
        for (int i = 0; i < allCars.length; i++) {
            if (allCars[i] != null && allCars[i].getSpeed() > 100) {
                allCars[i].setPrice(150);
                System.out.println("Модель: " + allCars[i].getModel() + ", скорость: " + allCars[i].getSpeed() + " , новая цена: " + allCars[i].getPrice());
            }
        }

    }

    // написать метод, который найдёт автомобиль по его модели
    public static void findCarByModel(Car[] allCars) {
        String carSearch = "subaru";
        System.out.println("Поиск автомобиля: " + carSearch);
        for (int i = 0; i < allCars.length; i++) {
            if (allCars[i] != null && carSearch.equalsIgnoreCase(allCars[i].getModel())) {
                System.out.println("Найдено: " + allCars[i].getModel() + ", год: " + allCars[i].getYear() + ", цена: " + allCars[i].getPrice());

            }
        }

    }

    // ЗАДАНИЯ С ЖИВОТНЫМИ
    public static void calculateTotalAge(Animal[] allAnimal) {
        int totalAge = 0; // Наша "копилка"

        for (int i = 0; i < allAnimal.length; i++) {
            // Проверяем, что в ячейке не пусто
            if (allAnimal[i] != null) {
                totalAge += allAnimal[i].getAge(); // Прибавляем возраст текущего животного
            }
        }
        System.out.println("Общий возраст всех пациентов вет.клиники: " + totalAge + " лет");
    }

    public static void findAnimal(String searchName, Animal[] allAnimal) {
        for (int i = 0; i < allAnimal.length; i++) {
            if (allAnimal[i] != null) {
                if (allAnimal[i].getName().equalsIgnoreCase(searchName)) {
                    System.out.println("Найдено: " + allAnimal[i].getInfo());
                    return;
                }
            }
        }
        System.out.println("Животное '" + searchName + "' не найдено.");
    }

    public static void compareAnimals(Animal a1, Animal a2) {
        if (a1 == null || a2 == null) {
            System.out.println("Одно из животных отсутствует для сравнения.");
            return;
        }
        if (a1.getWeight() > a2.getWeight()) {
            System.out.println("Животное " + a1.getName() + " тяжелее, чем " + a2.getName());
        } else if (a1.getWeight() < a2.getWeight()) {
            System.out.println("Животное " + a2.getName() + " тяжелее, чем " + a1.getName());
        } else {
            System.out.println("Животные " + a1.getName() + " и " + a2.getName() + " весят одинаково.");
        }
    }

    public static void printAverageWeight(Animal[] animals) {
        if (animals == null || animals.length == 0) {
            System.out.println("Список животных пуст.");
            return;
        }
        double sum = 0;
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                sum += animal.getWeight();
                count++;
            }
        }
        if (count > 0) {
            double average = sum / count;
            System.out.printf("Средний вес %d животных: %.2f кг%n", count, average);
        } else {
            System.out.println("Список животных пуст.");
        }
    }


    public static void printHeavierThanAverage(Animal[] animals) {
        if (animals == null || animals.length == 0) {
            System.out.println("Список животных пуст.");
        }
        double totalWeight = 0;
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                totalWeight += animal.getWeight();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В списке нет животных.");
        }
        double average = totalWeight / count;
        System.out.printf("Средний вес: %.2f кг%n", average);
        System.out.println("Животные, чей вес выше среднего:");
        int heavierCount = 0;
        for (Animal animal : animals) {
            if (animal != null && animal.getWeight() > average) {
                System.out.println("- " + animal.getName() + ": " + animal.getWeight() + " кг");
                heavierCount++;
            }
        }
        System.out.println("Всего таких животных: " + heavierCount);
    }

    public static void printAdultAnimals(Animal[] animals) {
        boolean found = false;
        for (Animal animal : animals) {
            if (animal != null) {
                if (animal.getAge() >= 6) {
                    System.out.println("- " + animal.getName() + ", возраст (лет): " + animal.getAge() + ".");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("В системе нет животных старше 6 лет.");
        }
    }

    public static void findHeaviestAnimal(Animal[] animals) {
        double maxWeight = 0;
        for (Animal a : animals) {
            if (a != null && a.getWeight() > maxWeight) {
                maxWeight = a.getWeight();
            }
        }
        System.out.println("Самый большой вес: " + maxWeight + " кг");
        for (Animal animal : animals) {
            if (animal != null && animal.getWeight() == maxWeight) {
                System.out.println("Победитель: " + animal.getName());
            }
        }
    }

    public static void findFirstHeavyAnimal(Animal[] animals) {
        if (animals == null) return;
        for (Animal animal : animals) {
            if (animal != null && animal.getWeight() > 6) {
                System.out.println("Найдено: " + animal.getName() + " (" + animal.getWeight() + " кг)");
                return;
            }
        }
        System.out.println("Животных тяжелее 6 кг не обнаружено.");
    }

    public static boolean OldAnimals(Animal[] animals) {
        if (animals == null) {
            return false;
        }
        for (Animal animal : animals) {
            if (animal != null && animal.getAge() > 6) {
                return true;
            }
        }
        return false;
    }
}
