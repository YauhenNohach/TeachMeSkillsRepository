package irina_lisovskaya.lesson6_classes_and_objects.dz;

public class Cat {
    // свойства
    String name; // имя
    int age; // возраст
    int fullness; //  насыщение кота (количество корма)

    // конструктор
    public Cat(String name, int age, int fullness){
        this.name = name;
        this.age = age;
        this.fullness = fullness;
    }

    // метод
    public boolean feeding (int foodAmount){
        this.fullness += foodAmount;
        if (this.fullness >= 10) {
            return true; // кот наелся
        } else {
            return false; // кот голоден
        }
    }

}
