package Lera_Grubrina.Homework7;

public abstract class Predator extends Animal {
    private double fangLength;

    public Predator(String name, int age, double weight, double fangLength) {
        super(name, age, weight);
        this.fangLength = fangLength;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " ест мясо: " + food);
    }
}




