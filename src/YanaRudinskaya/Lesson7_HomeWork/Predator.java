package YanaRudinskaya.Lesson7_HomeWork;

public class Predator extends Animal {

    public double clawLength; //длина когтей

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(String  food) {

    }

    public Predator(String name, int age, double weight, double clawLength) {
        super(name, age, weight);
        this.clawLength = clawLength;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", clawLength=" + clawLength;
    }

}
