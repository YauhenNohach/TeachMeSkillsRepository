package viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.homework;

public class Reptile extends Predator {
    String environment;


    public Reptile(String name, int age, double weight, boolean isNightHunter, boolean livesInEurope, String environment) {
        super(name, age, weight, isNightHunter, livesInEurope);
        this.environment = environment;
    }
}
