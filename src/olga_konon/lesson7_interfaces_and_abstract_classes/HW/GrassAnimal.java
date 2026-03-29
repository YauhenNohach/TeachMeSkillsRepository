package olga_konon.lesson7_interfaces_and_abstract_classes.HW;

public abstract class GrassAnimal extends Animal {

    String favoritePlant;

    public GrassAnimal(String name, int age, double weight, String favoritePlant) {
        super(name, age, weight);
        this.favoritePlant = favoritePlant;
    }
}
