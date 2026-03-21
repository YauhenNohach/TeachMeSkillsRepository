package viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.lesson;

import static viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.lesson.CarService.*;

public class Main {
    public static void main(String[] args) {
//        Object - класс над всеми классами

        final int num = 6;

        Bus bus = new Bus("bus", 1299, 345, 43);
        System.out.println(bus);
//        bus.countPlaces;

        Car bus2 = new Bus("bus2", 1699, 375, 13);

        Bus miniBus = new MiniBus();
        Car miniBus2 = new MiniBus();

        //Создала новый объект
        Bus bmw = new Bus("BMW", 2020, 350, 20);


        SportCar sportCar = new SportCar("SportCar", 2026, 400);

//        Bus[] buses = new Bus[3];
//        buses[0] = bus;
//        buses[1] = bus2;
//        buses[2] = miniBus2;

        Car[] cars = new Car[4];
        cars[0] = bus2;
        cars[1] = bus;
        cars[2] = sportCar;
        cars[3] = bmw; //Добавила свой объект в существующий массив


        for (Car car : cars) {
            if (car != null) {
            }
        }

        //Вызываем метод поиска машин старше 1992
        oldCard(cars);

        //Проверяем метод для изменения стоимости машины
        changeCarPrice(cars);

        //Проверяем метод нахождения машины по модели
        carSearch(cars, "bus");
    }


}
