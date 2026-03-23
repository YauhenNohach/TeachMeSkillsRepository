package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.dz;

public abstract class Animal {
    // свойства
    String name; // имя животного
    int age; // возраст
    double weight; // вес

    // конструкторы
    public Animal() { // конструктор 1
    }

    public Animal(String name, int age, double weight) { // конструктор 2
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // методы
    public abstract String makeSound(); // выводит звук, который издаёт животное (например, "Some sound")

    public abstract String eat(); //  принимает название еды и выводит, что животное ест

    public void getInfo() {
        System.out.printf("Name: %s \tAge: %d\nWeight: %.1f\n", name, age, weight); //возвращает строку с информацией о животном
    }

    //  методы для выполнения заданий

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    public int getAge () {
        return age;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Ошибка: Вес должен быть больше нуля!");
        }
    }




}
