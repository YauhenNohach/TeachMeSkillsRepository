package YanaRudinskaya.Lesson7_HomeWork;

public class Bird extends GrassAnimal{

    public double wingSpan; // размах крыльев

    public Bird(String name, int age, double weight, String favoritePlant, double wingSpan) {
        super(name, age, weight, favoritePlant);
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wingSpan=" + wingSpan+ '\'' +
                '}';
    }
}
