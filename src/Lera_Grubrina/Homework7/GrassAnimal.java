package Lera_Grubrina.Homework7;

public abstract class GrassAnimal extends Animal {
    private boolean isHorned;

    public GrassAnimal(String name, int age, double weight, boolean isHorned) {
        super(name, age, weight);
        this.isHorned = isHorned;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " жует: " + food);
    }
}


