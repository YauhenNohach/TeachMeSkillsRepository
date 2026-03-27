package veronika_akulovich.lesson7_interfaces_and_abstract_classes.hometask;

public abstract class Animal {
    String animalName;
    int animalAge;
    double animalWeight;

    public Animal() {
    }

    public Animal(String animalName, int animalAge, double animalWeight) {
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalAge=" + animalAge +
                ", animalWeight=" + animalWeight +
                '}';
    }

    public abstract void makeSound();

    public abstract void eat(String food);

    public String getInfo() {
        return "animalName: " + animalName + " animalAge: " + animalAge + " animalWeight: " + animalWeight;
    }
}
