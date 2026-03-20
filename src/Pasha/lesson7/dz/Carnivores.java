package Pasha.lesson7.dz;

//A carnivore is an animal that feeds primarily on meat.

public class Carnivores extends Animal {
    String food;
    protected Carnivores(String name, String species, int age, double weight, String food) {
        super(name, species, age, weight);
        this.food = food;
    }

    public static void main(String[] args){
    }

    protected void animalSound(String animal) {
        System.out.println(animal + "says: arrrrrr");
    }


    protected void animalFood(String food) {
        System.out.println("eats " + food);
    }
}
