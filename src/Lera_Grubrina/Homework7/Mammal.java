package Lera_Grubrina.Homework7;


public class Mammal extends GrassAnimal {
    private String furColor;
    private String sound;

    public Mammal(String name, int age, double weight, boolean isHorned, String furColor, String sound) {
        super(name, age, weight, isHorned);
        this.furColor = furColor;
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " издает звук: " + sound);
    }
}

