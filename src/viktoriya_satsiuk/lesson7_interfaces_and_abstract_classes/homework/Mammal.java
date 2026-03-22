package viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.homework;

public class Mammal extends Predator {
    int sleepingHours;


    public Mammal(String name, int age, double weight, boolean isNightHunter, boolean livesInEurope, int sleepingHours) {
        super(name, age, weight, isNightHunter, livesInEurope);
        this.sleepingHours = sleepingHours;
    }
}

