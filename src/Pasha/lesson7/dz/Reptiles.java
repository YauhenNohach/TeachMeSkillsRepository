package Pasha.lesson7.dz;

public class Reptiles extends Carnivores {
    int howManyEggs;
    protected Reptiles(String name, String species, int age, double weight, String food, int howManyEggs) {
        super(name, species, age, weight, food);
        this.howManyEggs = howManyEggs;
    }
    public static void main(String[] args) {}
}
