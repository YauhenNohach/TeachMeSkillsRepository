package olga_konon.lesson7_interfaces_and_abstract_classes.Lesson;

public class Main {
    public static void main(String[] args) {

        //fill in object
        Car[] cars = new Car[3];

        cars[0] = new Car("Audi", 1997, 99, 100);
        cars[1] = new Car("BMW", 1991, 157, 23);
        cars[2] = new Car("Honda", 2016, 125, 45);

        System.out.println("Lesson 7, Task 2");
        Car.findCarsBefore1992(cars);

        System.out.println("\nLesson 7, Task 3");
        Car.changePrice(cars);

        System.out.println("\nLesson 7, Task 4");
        Car.findCarByModel(cars, "BMW");

    }
}