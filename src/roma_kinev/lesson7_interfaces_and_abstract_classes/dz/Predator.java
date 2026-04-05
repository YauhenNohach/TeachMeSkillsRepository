package roma_kinev.lesson7_interfaces_and_abstract_classes.dz;

public class Predator extends Animal{

    int dangerLevel;

    public Predator(String name, int age, double weight, int dangerLevel){
        super(name, age, weight);
        this.dangerLevel = dangerLevel;
    }

    @Override
    public void makeSound() {
        System.out.println(name + "Pppppp");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + "охотится и ест: " + food);
    }
}
