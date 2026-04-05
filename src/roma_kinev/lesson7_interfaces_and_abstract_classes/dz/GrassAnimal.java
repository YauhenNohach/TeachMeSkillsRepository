package roma_kinev.lesson7_interfaces_and_abstract_classes.dz;

public class GrassAnimal extends Animal{

    String favoritePlant;

    public GrassAnimal(String name, int age, double weight, String favoritePlant){
        super(name, age, weight);
        this.favoritePlant = favoritePlant;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " издаёт спокойный звук.");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " жуёт растение: " + food);
    }
}
