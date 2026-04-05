package roma_kinev.lesson7_interfaces_and_abstract_classes.dz;

public class Reptile extends Predator{

    double bodyTemperature;

    public Reptile(String name, int age, double weight, int dangerLevel, double bodyTemperature){
        super(name, age, weight, dangerLevel);
        this.bodyTemperature = bodyTemperature;
    }
}
