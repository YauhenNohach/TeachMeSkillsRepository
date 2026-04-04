package viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.homework;

public abstract class Animal {
    String name;
    int age;
    double weight;
    boolean livesInEurope;

    public Animal(String name, int age, double weight, boolean livesInEurope) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.livesInEurope = livesInEurope;
    }

    public abstract void makeSound();

    public abstract void eat(String food);

    public String getInfo() {
        return ("Animal name: " + name + ", age: " + age + ", weight: " + weight);
    }

}
