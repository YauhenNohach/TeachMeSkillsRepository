package veronika_akulovich.lesson7_interfaces_and_abstract_classes.hometask;

public class Bird extends GrassAnimal{
boolean canFly;

    public Bird(boolean canFly) {
        this.canFly = canFly;
    }

    public Bird(int intestineLength, boolean canFly) {
        super(intestineLength);
        this.canFly = canFly;
    }

    public Bird(String animalName, int animalAge, double animalWeight, int intestineLength, boolean canFly) {
        super(animalName, animalAge, animalWeight, intestineLength);
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "canFly=" + canFly +
                ", intestineLength=" + intestineLength +
                ", animalName='" + animalName + '\'' +
                ", animalAge=" + animalAge +
                ", animalWeight=" + animalWeight +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Make sound: chirping" );
    }
}
