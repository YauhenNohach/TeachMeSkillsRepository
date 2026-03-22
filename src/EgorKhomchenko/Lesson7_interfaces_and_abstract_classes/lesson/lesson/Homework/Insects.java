package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Homework;

public class Insects extends GrassAnimal {

    public Insects(String name, int age, double weight, String favoritePlant, String color) {
        super(name, age, weight, favoritePlant);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " шебуршит");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " ест: " + food);
    }
}
