package anna_lyasota.lesson7_interfaces_and_abstract_classes.dz;

public class Predator extends Animal {

    int pawSize;

    public Predator(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Some mammal sound");
    }

    @Override
    public void eat() {
        System.out.println("Some mammal sound");
    }

    @Override
    public void getInfo() {
        System.out.println("Some mammal sound");
    }

}
