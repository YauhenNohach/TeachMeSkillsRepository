package anna_sidorova.lesson7.dz;

public class Mammal extends GrassAnimal{

    double amountOfMilk;

    public Mammal(String animalName, int animalAge, double animalWeight, double amountOfMilk) {
        super(animalName, animalAge, animalWeight);
        this.amountOfMilk = amountOfMilk;

    }
}
