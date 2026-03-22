package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Homework;

public class Mammal extends GrassAnimal {

    public Mammal(String name, int age, double weight, String favoritePlant, String furColor) {
        super(name, age, weight, favoritePlant);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мычит");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " ест: " + food);
    }
}
