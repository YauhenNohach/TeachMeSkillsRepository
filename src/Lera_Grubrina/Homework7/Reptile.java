package Lera_Grubrina.Homework7;

public class Reptile extends Predator {
    private boolean isPoisonous;
    private String sound;

    public Reptile(String name, int age, double weight, double fangLength, boolean isPoisonous, String sound) {
        super(name, age, weight, fangLength);
        this.isPoisonous = isPoisonous;
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " зловеще шипит: " + sound);
    }
}


