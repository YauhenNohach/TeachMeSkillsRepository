package irina_lisovskaya.lesson7_interfaces_and_abstract_classes.dz;

public class Reptile extends Predator{
    // доп. свойства
    boolean isLimbless; //безногий или нет

    // конструкторы
    public Reptile(){// конструктор 1

    }

    public Reptile(String name, int age, double weight, String mainPrey, boolean isLimbless) { // конструктор 2
        super(name, age, weight, mainPrey);
        this.isLimbless = isLimbless;
    }
}
