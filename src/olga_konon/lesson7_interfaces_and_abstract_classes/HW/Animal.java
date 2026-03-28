package olga_konon.lesson7_interfaces_and_abstract_classes.HW;

import java.util.Objects;

public abstract class Animal {

    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        }

    // абстрактный makeSound() — выводит звук, который издаёт животное (например, "Some sound")
    public abstract void makeSound();

    // абстрактный eat(food) — принимает название еды и выводит, что животное ест
    public abstract void eat(String food);

    // общий getInfo() — возвращает строку с информацией о животном
    public String getInfo() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight + '}';
    }

    // to return not memory, but strings
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight + '}';
    }


}











