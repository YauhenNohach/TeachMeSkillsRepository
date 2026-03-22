package veranika_slesarchyk.lesson7_interfaces_and_abstract_classes.HW;

public class Bird extends Predator{
    private boolean leaveForwintering;

    public Bird(String name, int age, double weight, int attackSpeed, boolean leaveForwintering) {
        super(name, age, weight, attackSpeed);
        this.leaveForwintering = leaveForwintering;
    }
}
