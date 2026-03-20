package olga_konon.lesson7_interfaces_and_abstract_classes.HW;

public class Bird extends GrassAnimal {

    boolean canFly;

    public Bird(String name, int age, double weight, String favoritePlant, boolean canFly) {

        super(name, age, weight, favoritePlant);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(String food) {

    }
}
