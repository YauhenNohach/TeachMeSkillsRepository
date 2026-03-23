package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.dz;

public class Bird extends GrassAnimal{
    // доп. свойства
    double wingSpan; // размах крыльев

    // конструкторы
    public Bird(){ // конструктор 1

    }

    public Bird(String name, int age, double weight, String favoritePlant, double wingSpan) { // конструктор 2
        super(name, age, weight, favoritePlant);
        this.wingSpan = wingSpan;
    }
}
