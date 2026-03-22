package veranika_slesarchyk.lesson7_interfaces_and_abstract_classes.Practice;
//1) создать новый обьект, любой на выбор
//2) создать метод, который найдёт автомобили до 1992 и выведет их все на экран
//3) добавить новое поле в класс Car "стоимость авто".   создать метод, который изменит стоимость тех автомобилей, которые разгоняются более 100 на 150 рублей
//4) написать метод, который найдёт автомобиль по его модели

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car(1990, "BMW", 1000, 150);
        cars[1] = new Car(2000, "Audi", 2000, 120);
        cars[2] = new Car(1995, "Ford", 1500, 90);

        printCarsBefore1992(cars);
        changePrice(cars);
        Car found = findByModel(cars, "Audi");

        System.out.println("\nПосле изменения цены:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nНайденный автомобиль:");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Автомобиль не найден");
        }
    }

    public static void printCarsBefore1992(Car[] cars) {
        System.out.println("Автомобили до 1992 года:");
        for (Car car : cars) {
            if (car.year < 1992) {
                System.out.println(car);
            }

        }
    }

    public static void changePrice(Car[] cars) {
        //тип элемента, переменная, массив
        for (Car car : cars) {
            if (car.speed > 100) {
                car.price += 150;
            }
        }
    }

    public static Car findByModel(Car[] cars, String model) {
        for (Car car : cars) {
            if (car.model.equalsIgnoreCase(model)) {
                return car;
            }
        }
        return null;
    }
}


