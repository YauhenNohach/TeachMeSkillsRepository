package anna_sidorova.lesson7.dz;

public class Bird extends Predator{

    int eggNumber;

    public Bird(String animalName, int animalAge, double animalWeight, int eggNumber) {
        super(animalName, animalAge, animalWeight);
        this.eggNumber = eggNumber;

    }
}
