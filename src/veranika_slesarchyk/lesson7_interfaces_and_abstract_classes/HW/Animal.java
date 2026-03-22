package veranika_slesarchyk.lesson7_interfaces_and_abstract_classes.HW;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    //    Методы:
//    абстрактный makeSound() — выводит звук, который издаёт животное (например, "Some sound")
//    абстрактный eat(food) — принимает название еды и выводит, что животное ест
//    общий getInfo() — возвращает строку с информацией о животном

    public abstract void makeSound();

    public abstract void eat(String food);

    public String getInfo() {
        return "name: " + name + ", age: " + age + ", weight: " + weight;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
