package viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.lesson;

import java.util.Arrays;

public class CarService {
    //метод, который находит автомобили до 1992 и выводит их все на экран
    public static void oldCard(Car[] cars) {
        int year = 1992;
        for (Car car: cars) {
            if (car.getYear() <=year) {
                System.out.println("The car " + car.getModel() + " is older than " + year);
            }
        }
    }

    // метод, который изменяет стоимость тех автомобилей, которые разгоняются более 100 на 150 рублей
    public static void changeCarPrice(Car[] cars) {
        int carSpeed = 100;
        int newCarPrice = 150;
        for (int i=0; i<cars.length; i++) {
            if (cars[i].getSpeed() >=carSpeed) {
                double updatedPrice = cars[i].getCarPrice() + newCarPrice;
                cars[i].setCarPrice(updatedPrice);
                System.out.println("Price updated for: " + cars[i].getModel() + " Current price: " + cars[i].getCarPrice());
            }
        }
    }

    //метод, который находит автомобиль по его модели
    public static void carSearch(Car[] cars, String model) {
        for (Car car : cars) {
            if (model .equals(car.getModel())) {
                System.out.println("Car " + model + " is found: " + car.getModel());
            }
        }
    }
}
