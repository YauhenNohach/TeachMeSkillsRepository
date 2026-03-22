package veranika_slesarchyk.lesson7_interfaces_and_abstract_classes.HW;

public class Mammal extends GrassAnimal{
    private boolean hasFur;

    public Mammal(String name, int age, double weight, String favoritePlant, boolean hasFur) {
        super(name, age, weight, favoritePlant);
        this.hasFur = hasFur;
    }
}
