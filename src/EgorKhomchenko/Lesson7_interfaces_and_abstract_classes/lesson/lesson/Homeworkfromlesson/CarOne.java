package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Homeworkfromlesson;

public class CarOne {
    String model;
    int year;
    double speed;
    double price;

    public CarOne(String model, int year, double speed, double price) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.price = price;
    }

    public void info() {
        System.out.println(model + " [" + year + "г.] Скорость: " + speed + ", Цена: " + price);
    }
}


