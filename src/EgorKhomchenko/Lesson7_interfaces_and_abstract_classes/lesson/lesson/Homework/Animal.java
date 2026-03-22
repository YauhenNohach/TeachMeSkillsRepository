package EgorKhomchenko.Lesson7_interfaces_and_abstract_classes.lesson.lesson.Homework;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void makeSound();
    public abstract void eat(String food);

    // Общий instance-метод
    public String getInfo() {
        return String.format("Имя: %s, Возраст: %d, Вес: %.1f", name, age, weight);
    }

    public String getName() {
        return name; }
    public int getAge() {
        return age; }
    public double getWeight() {
        return weight; }
    public void setWeight(double weight) {
        this.weight = weight; }
}








