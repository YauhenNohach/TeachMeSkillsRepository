package roma_kinev.lesson7_interfaces_and_abstract_classes.dz;

public class Bird extends GrassAnimal{

    double wingspan;

    public Bird(String name, int age, double weight, String favoritPlant, double wingspan){
        super(name, age, weight, favoritPlant);
        this.wingspan = wingspan;
    }
}
