package roma_kinev.lesson7_interfaces_and_abstract_classes.dz;

public abstract class Animal {
    String name;
    int age;
    double weight;

    public abstract void makeSound();

    public abstract void eat (String food);

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getInfo(){
        return ("Name = " + this.name + ", age = " + this.age + ", weignt = " + this.weight);
    }
}
