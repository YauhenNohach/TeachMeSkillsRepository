package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.dz;

public class Mammal extends GrassAnimal{
    // доп. свойства
    double bodyTemperature; // температура тела

    // конструкторы
    public Mammal(){ // конструктор 1

    }

    public Mammal(String name, int age, double weight, String favoritePlant, double bodyTemperature) { // конструктор 2
        super(name, age, weight, favoritePlant);
        this.bodyTemperature = bodyTemperature;
    }
}
