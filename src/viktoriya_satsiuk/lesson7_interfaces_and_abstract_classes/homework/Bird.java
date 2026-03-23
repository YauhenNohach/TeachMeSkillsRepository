package viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.homework;

public class Bird extends GrassAnimal {
    int lifespan;


    public Bird(String name, int age, double weight, int height, boolean livesInEurope, int lifespan) {
        super(name, age, weight, height, livesInEurope);
        this.lifespan = lifespan;
    }
}
