package anna_sidorova.lesson7.dz;

public class Reptile extends Predator{

    boolean isToxic;
    public Reptile(String animalName, int animalAge, double animalWeight, boolean isToxi) {
        super(animalName, animalAge, animalWeight);
        this.isToxic = isToxic;

    }
}
