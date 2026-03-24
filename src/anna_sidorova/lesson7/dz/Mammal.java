package anna_sidorova.lesson7.dz;

public class Mammal extends GrassAnimal {

    double amountOfMilk;

    public Mammal(String animalName, int animalAge, double animalWeight, double amountOfMilk) {
        super(animalName, animalAge, animalWeight);
        this.amountOfMilk = amountOfMilk;

    }

    public double getAmountOfMilk() {
        if (amountOfMilk < 0) {
            System.out.println("Неверная логика");
        }
        return amountOfMilk;
    }

    public void setAmountOfMilk(double amountOfMilk) {
        this.amountOfMilk = amountOfMilk;
    }
}
