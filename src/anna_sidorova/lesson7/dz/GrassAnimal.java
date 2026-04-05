package anna_sidorova.lesson7.dz;

public class GrassAnimal extends Animal{

    double amountofEatenGrass;

    public GrassAnimal(String animalName, int animalAge, double animalWeight, double amountofEatenGrass) {
        super(animalName, animalAge, animalWeight);
        this.amountofEatenGrass = amountofEatenGrass;
    }

    public GrassAnimal(String animalName, int animalAge, double animalWeight) {
    }

    @Override
    void makeSound() {

    }

    @Override
    void eat() {

    }
}
