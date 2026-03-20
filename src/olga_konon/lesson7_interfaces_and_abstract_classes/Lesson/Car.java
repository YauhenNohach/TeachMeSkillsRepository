package olga_konon.lesson7_interfaces_and_abstract_classes.Lesson;

import java.util.Objects;

public class Car {

    String model;
    int year;
    int speed;
    int price;

    //create object
    public Car(String model, int year, int speed, int price) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.price = price;
    }


    // Для Жени: я бы переписала Sout и сделала бы return --> не было возможности

    // method to find card before 1992

    public static void findCarsBefore1992(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year < 1992) {
                System.out.println("Car before 1992 with index " + i + " " + cars[i]);
            }
        }
    }

    /*добавить новое поле в класс Car "стоимость авто".
  создать метод, который изменит стоимость тех автомобилей,
  которые разгоняются более 100 на 150 рублей */
    public static void changePrice(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].speed >= 100) {
                cars[i].price +=150;
                System.out.println(cars[i]);
            }
        }
    }

    //4) написать метод, который найдёт автомобиль по его модели
    public static void findCarByModel(Car[] cars, String searchedModel) {
        for (Car car : cars) {
            if (Objects.equals(car.model, searchedModel)) {
                System.out.println(car);
            }
        }
    }

    // to return not memory, but strings
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
