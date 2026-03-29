package anna_lyasota.lesson7_interfaces_and_abstract_classes.dz;

public class GrassAnimal extends Animal{

    int height;

    public GrassAnimal(String name, int age, double weight) {
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
