package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.dz;

public class Predator extends Animal{
// доп. свойства
    String mainPrey; // основная добыча

// конструкторы
    public Predator(){ // конструктор 1

    }

    public Predator(String name, int age, double weight, String mainPrey) { // конструктор 2
        super(name, age, weight);
        this.mainPrey = mainPrey;
    }

    // импортнули методы из основного класса
    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public String eat() {
        return null;
    }
}
