package YanaRudinskaya.Lesson7;

import YanaRudinskaya.Lesson7.lesson.Bus;
import YanaRudinskaya.Lesson7.lesson.Car;
import YanaRudinskaya.Lesson7.lesson.MiniBus;
import YanaRudinskaya.Lesson7.lesson.SportCar;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Car bus1 = new Bus("BMW", 1299, 150, 10, 60000);
        Car bus2 = new Bus("OPEL", 2009, 99, 12, 70000);
        // 1)создать новый обьект, любой на выбор. Создано 2:
        MiniBus  miniBus = new MiniBus("FORD", 1992, 120, 22, 55000);
        SportCar sportCar1 = new SportCar("FERRARI", 1991, 100, 22000, 7);

        Car[] cars = {bus1, bus2, miniBus, sportCar1};

        System.out.println("Автомобили до 1992:");
        printCarsBefore1992(cars);
        System.out.println();
        System.out.println("Изменена стоимость  автомобилей на 150 рублей, которые разгоняются более 100: ");
        increasePriceForFastCars(cars);
        System.out.println();
        findAutoByModel(cars);

    }

    // 2)создать метод, который найдёт автомобили до 1992 и выведет их все на экран
    static void printCarsBefore1992(Car[] cars) {
        for (Car car : cars) {
            if (car.getYear() < 1992) {
                System.out.println(car);
            }
        }
    }

    //3) добавить новое поле в класс Car "стоимость авто". Cоздать метод, который изменит стоимость тех автомобилей, которые разгоняются более 100 на 150 рублей
    static void increasePriceForFastCars(Car[] cars) {
        for (Car car : cars) {
            if (car.getSpeed() > 100) {
                car.price += 150;
                System.out.println(car);
            }
        }
    }

    //4)написать метод, который найдёт автомобиль по его модели
    static void findAutoByModel(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите модель: ");
        String model = scanner.nextLine().toUpperCase();
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                System.out.println("найден автомобиль " + car);
                return;
            }
        }
        System.out.println("такая модель автомобиля не найдена");
    }
}