package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Homework;

public class Reptile extends Predator {

    public Reptile(String name, int age, double weight, boolean hasScales, boolean hasClaws) {
        super(name, age, weight, hasClaws);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " шипит");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " поглощает: " + food);
    }


}
