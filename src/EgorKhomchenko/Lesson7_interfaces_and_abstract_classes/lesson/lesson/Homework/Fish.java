package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Homework;

public class Fish extends Predator {

    public Fish(String name, int age, double weight, boolean hasTeeth) {
        super(name, age, weight, false);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " буль-буль");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " ест: " + food);
    }


}
