package veronika_akulovich.lesson7_interfaces_and_abstract_classes.hometask;

public class Mammal extends Predator{
String typeOfMammal;

    public Mammal() {
    }

    public Mammal(String typeOfMammal) {
        this.typeOfMammal = typeOfMammal;
    }

    public Mammal(int countOfTeeth, String typeOfMammal) {
        super(countOfTeeth);
        this.typeOfMammal = typeOfMammal;
    }

    public Mammal(String animalName, int animalAge, double animalWeight, int countOfTeeth, String typeOfMammal) {
        super(animalName, animalAge, animalWeight, countOfTeeth);
        this.typeOfMammal = typeOfMammal;
    }

    @Override
    public void makeSound() {
        System.out.println("Make sound: mooing");
    }
}
