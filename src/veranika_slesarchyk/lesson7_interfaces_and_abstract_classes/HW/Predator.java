package veranika_slesarchyk.lesson7_interfaces_and_abstract_classes.HW;

public class Predator extends Animal{
    private int attackSpeed;

    public Predator(String name, int age, double weight, int attackSpeed) {
        super(name, age, weight);
        this.attackSpeed = attackSpeed;
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
