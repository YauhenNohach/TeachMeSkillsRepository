package viktoriya_satsiuk.lesson7_interfaces_and_abstract_classes.homework;

public class Predator extends Animal {
    boolean isNightHunter;

    public Predator(String name, int age, double weight, boolean isNightHunter, boolean livesInEurope) {
        super(name, age, weight, livesInEurope);
        this.isNightHunter = isNightHunter;
    }

    //переписала метод для звуков хищников
    @Override
    public void makeSound() {
        System.out.println(this.name + " makes predator animal sounds");
    }

    //переписала метод для еды хищников
    @Override
    public void eat(String food) {
        System.out.println(this.name + " hunts " + food);
    }

}

