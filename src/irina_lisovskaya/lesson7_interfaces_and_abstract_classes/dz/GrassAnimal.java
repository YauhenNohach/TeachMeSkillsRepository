package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.dz;

import irina_lisovskaya.lesson7_interfaces_and_abstract_classes.lesson.Car;

public class GrassAnimal extends Animal {
// доп.свойства
    String favoritePlant; // любимое растение (еда)

//    конструкторы
    public GrassAnimal(){ // конструктор 1
    }

    public GrassAnimal(String name, int age, double weight, String favoritePlant) { // конструктор 2
        super(name, age, weight);
        this.favoritePlant = favoritePlant;
    }

    //  импортнули методы из основного класса
    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public String eat() {
        return null;
    }
}


