package veronika_akulovich.lesson7_interfaces_and_abstract_classes.hometask;

public abstract class Predator extends Animal {

    int countOfTeeth;

    public Predator() {
    }

    public Predator(int countOfTeeth) {
        this.countOfTeeth = countOfTeeth;
    }

    public Predator(String animalName, int animalAge, double animalWeight, int countOfTeeth) {
        super(animalName, animalAge, animalWeight);
        this.countOfTeeth = countOfTeeth;
    }

    @Override
    public void eat(String food) {
        System.out.println("Хищники едят: " + food);
    }
}
