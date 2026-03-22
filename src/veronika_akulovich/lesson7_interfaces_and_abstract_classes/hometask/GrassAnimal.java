package veronika_akulovich.lesson7_interfaces_and_abstract_classes.hometask;

public abstract class GrassAnimal extends Animal {
    int intestineLength;

    public GrassAnimal() {
    }

    public GrassAnimal(int intestineLength) {
        this.intestineLength = intestineLength;
    }

    public GrassAnimal(String animalName, int animalAge, double animalWeight, int intestineLength) {
        super(animalName, animalAge, animalWeight);
        this.intestineLength = intestineLength;
    }

    @Override
    public void eat(String food) {
        System.out.println("Травоядные едят: " + food);
    }
}
