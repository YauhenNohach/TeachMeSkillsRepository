package veranika_slesarchyk.lesson7_interfaces_and_abstract_classes.HW;

public class GrassAnimal extends Animal {
    private String favoritePlant;

    public GrassAnimal(String name, int age, double weight, String favoritePlant) {
        super(name, age, weight);
        this.favoritePlant = favoritePlant;
    }

    @Override
    public void makeSound() {
        System.out.println("Grass animal sound");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eats plants: " + food);
    }
}

