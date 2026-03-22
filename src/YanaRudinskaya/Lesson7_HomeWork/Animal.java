package YanaRudinskaya.Lesson7_HomeWork;

public abstract class Animal {
    public String name;
    public int age;
    public double weight;

    public abstract void makeSound();
    public abstract void eat(String food);

    public void getInfo() {
    }


    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " {name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight;
    }
}
