package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Homework;

public class Bird extends Predator {

    public Bird(String name, int age, double weight, boolean wingSpan, boolean hasClaws) {
        super(name, age, weight, hasClaws);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " кричит");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " клюет: " + food);
    }


}