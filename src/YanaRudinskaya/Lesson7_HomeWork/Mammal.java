package YanaRudinskaya.Lesson7_HomeWork;

public class Mammal extends Predator {

    public String furColor; //цвет шерсти

    public Mammal(String name, int age, double weight, double clawLength, String furColor) {
        super(name, age, weight, clawLength);
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", furColor='" + furColor+ '\'' +
                '}';
    }

}
