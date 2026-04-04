package YanaRudinskaya.Lesson7_HomeWork;

public class Reptile extends Predator{

    boolean isVenomous; // ядовитое

    public Reptile(String name, int age, double weight, double clawLength, boolean isVenomous) {
        super(name, age, weight, clawLength);
        this.isVenomous = isVenomous;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", isVenomous=" + isVenomous+ '\'' +
                '}';
    }

}
