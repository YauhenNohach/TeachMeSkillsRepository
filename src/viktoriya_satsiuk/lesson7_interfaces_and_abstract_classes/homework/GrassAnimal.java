package viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.homework;

public class GrassAnimal extends Animal {
    int height;

    public GrassAnimal(String name, int age, double weight, int height, boolean livesInEurope) {
        super(name, age, weight, livesInEurope);
        this.height = height;
    }

    //переписала метод для звуков травоядных
    @Override
    public void makeSound() {
        System.out.println(this.name + " makes grass animal sounds");
    }

    //переписала метод для еды для травоядных
    @Override
    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
    }
}
