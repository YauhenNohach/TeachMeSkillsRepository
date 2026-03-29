package olga_konon.lesson7_interfaces_and_abstract_classes.HW;

public class Mammal extends GrassAnimal {

    boolean isDomestic;

    public Mammal(String name, int age, double weight, String favoritePlant, boolean isDomestic) {
        super(name, age, weight, favoritePlant);
        this.isDomestic = isDomestic;

    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(String food) {

    }
}
