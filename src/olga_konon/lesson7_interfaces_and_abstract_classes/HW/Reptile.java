package olga_konon.lesson7_interfaces_and_abstract_classes.HW;

public class Reptile extends Predator {

    double bodyTemperature;

    public Reptile(String name, int age, double weight, int fangLength, double bodyTemperature) {
        super(name, age, weight, fangLength);
        this.bodyTemperature = bodyTemperature;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(String food) {

    }
}
