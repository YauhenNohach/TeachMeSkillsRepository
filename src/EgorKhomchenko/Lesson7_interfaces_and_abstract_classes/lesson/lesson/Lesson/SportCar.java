package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Lesson;

public class SportCar extends Car {

    double max0To100;

     public SportCar(String model, int year, int speed) {
        super(model, year, speed);
    }

    @Override
    public void race() {
        System.out.println("sport car race");
    }

    public SportCar() {
    }
}
