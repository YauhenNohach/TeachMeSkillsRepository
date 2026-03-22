package Lera_Grubrina.Homework7;

public class Bird extends Predator {
    private int flightAltitude;
    private String sound;

    public Bird(String name, int age, double weight, double fangLength, int flightAltitude, String sound) {
        super(name, age, weight, fangLength);
        this.flightAltitude = flightAltitude;
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " издает крик с высоты " + flightAltitude + " метров: " + sound);
    }
}



