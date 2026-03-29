package Pasha.lesson7.dz;

//A graminivore is a herbivorous animal that feeds primarily on grass.

public class Graminivore extends Animal {
    String food;
    protected Graminivore(String name, double weight, int age, String species, String food) {
        super(name, species, age, weight);
        this.food = food;
    }

    protected void animalSound(String animal) {

    }

    protected void animalFood(String food) {

    }
}
