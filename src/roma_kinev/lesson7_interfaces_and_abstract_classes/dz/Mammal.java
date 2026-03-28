package roma_kinev.lesson7_interfaces_and_abstract_classes.dz;

public class Mammal extends Predator{

    double furLength;

    public Mammal(String name, int age, double weight, double furLength, int dangerLevel){
        super(name, age, weight, dangerLevel);
        this.furLength = furLength;
    }
}
