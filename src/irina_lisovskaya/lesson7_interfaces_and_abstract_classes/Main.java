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
        GrassAnimal animal1 = new GrassAnimal("Zuza", 1, 0.1, "clover");
        Predator animal2 = new Predator("Tomas", 2, 1, "mouse");
        Bird animal3 = new Bird("Kesha", 3, 0.2, "grass", 0.1);
        Reptile animal4 = new Reptile("Slider", 1, 0.5, "mouse", true);
        Mammal animal5 = new Mammal("Peach", 5, 8, "valerian", 31.2);

        Animal[] allAnimal = new Animal[5];
        allAnimal[0] = animal1;
        allAnimal[1] = animal2;
        allAnimal[2] = animal3;
        allAnimal[3] = animal4;
        allAnimal[4] = animal5;

// Задание 1: Изменить вес у одного животного (метод принимает животное и новый вес и меняет его)
        animal3.setWeight(0.5);
        System.out.println(animal3.getWeight());
//  Задание 2. Сумма возраста всех животных
        calculateTotalAge(allAnimal);

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
// Задание 2: Сумма возраста всех животных
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


}
