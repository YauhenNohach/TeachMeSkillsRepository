package olga_konon.lesson7_interfaces_and_abstract_classes.HW;

public abstract class Predator extends Animal {
    int fangLength;

    public Predator(String name, int age, double weight, int fangLength) {
        super(name, age, weight);
        this.fangLength = fangLength;
    }


}
