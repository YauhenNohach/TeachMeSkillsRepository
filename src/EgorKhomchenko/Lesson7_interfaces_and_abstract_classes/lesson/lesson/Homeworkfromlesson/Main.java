package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Homeworkfromlesson;

public class Main {
    public static void main(String[] args) {
                CarOne[] cars = new CarOne[]{
                new CarOne("BMW E30", 1990, 110, 5000),
                new CarOne("Audi 80", 1988, 95, 3000),
                new CarOne("Lada 2109", 1993, 105, 2000)
        };

        System.out.println("Авто до 1992:");
        findOldCars(cars);

        System.out.println("\nОбновление цен...");
        updateFastCarsPrice(cars);

        System.out.println("\nПоиск 'Audi 80':");
        findByName(cars, "Audi 80");
    }

    // 1) Метод поиска до 1992
    public static void findOldCars(CarOne[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year < 1992) {
                cars[i].info();
            }
        }
    }

    // 3) Метод изменения цены (если скорость > 100, прибавить 150)
    public static void updateFastCarsPrice(CarOne[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].speed > 100) {
                cars[i].price += 150;
                System.out.print("Цена изменена: ");
                cars[i].info();
            }
        }
    }

    // 4) Метод поиска по модели
    public static void findByName(CarOne[] cars, String model) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].model.equals(model)) {
                cars[i].info();
                return;
            }
        }
        System.out.println("Не найдено.");
    }
}
