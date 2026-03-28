package anna_sidorova.lesson7.dz;

public class Predator extends Animal {

    double amountofEatenMeat;

    public Predator(String animalName, int animalAge, double animalWeight, double amountofEatenGMeat) {
        super(animalName, animalAge, animalWeight);
        this.amountofEatenMeat = amountofEatenGMeat;
    }


    public Predator() {
    }

    public Predator(String animalName, int animalAge, double animalWeight) {
    }

    @Override
    void makeSound() {

    }

    @Override
    void eat() {

    }
}
