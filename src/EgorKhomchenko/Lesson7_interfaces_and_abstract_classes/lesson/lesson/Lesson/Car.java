package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Lesson;

public abstract class Car {

    String model;
    int year;
    int speed;


    public Car() {
    }

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public void drive(){ System.out.println("I drive car");
    }

    public abstract void race();



    // много
}
