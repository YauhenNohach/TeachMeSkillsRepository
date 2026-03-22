package veranika_slesarchyk.lesson7_interfaces_and_abstract_classes.HW;

public class Reptile extends Predator{
    private double speedRunning;

    public Reptile(String name, int age, double weight, int attackSpeed, double speedRunning) {
        super(name, age, weight, attackSpeed);
        this.speedRunning = speedRunning;
    }
}
