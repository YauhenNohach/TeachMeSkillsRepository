package anna_sidorova.lesson7.dz;

public abstract class Animal {
    String animalName;
    int animalAge;
    double animalWeight;

    public Animal(String animalName, int animalAge, double animalWeight) {
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }

    public Animal() {
    }

    abstract void makeSound();
    abstract void eat();

    void getInfo() {
        System.out.println("Информация о животном - имя " + animalName + ", возраст " + animalAge + ", вес " + animalWeight + "!");
    }
    @Override
    public String toString() {
        return "Животное: " + animalName +
                ", возраст: " + animalAge +
                ", вес: " + animalWeight;
    }

}
