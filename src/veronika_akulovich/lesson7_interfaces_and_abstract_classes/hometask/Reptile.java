package veronika_akulovich.lesson7_interfaces_and_abstract_classes.hometask;

public class Reptile extends Predator{
    boolean venomous;

    public Reptile() {
    }

    public Reptile(boolean venomous) {
        this.venomous = venomous;
    }

    public Reptile(int countOfTeeth, boolean venomous) {
        super(countOfTeeth);
        this.venomous = venomous;
    }

    public Reptile(String animalName, int animalAge, double animalWeight, int countOfTeeth, boolean venomous) {
        super(animalName, animalAge, animalWeight, countOfTeeth);
        this.venomous = venomous;
    }

    @Override
    public void makeSound() {
        System.out.println("Make sound: hissing");
    }
}
