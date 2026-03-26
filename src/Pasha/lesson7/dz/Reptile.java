package Pasha.lesson7.dz;

public class Reptile extends Carnivore {
    int howManyEggs;
    protected Reptile(String name, String species, int age, double weight, String food, int howManyEggs) {
        super(name, species, age, weight, food);
        this.howManyEggs = howManyEggs;
    }
}
