package Pasha.lesson7.dz;

class Mammals extends Carnivores {
    double howManyMonthBreastfeeding;

    protected Mammals(String name, String species, int age, double weight, String food, double howManyMonthBreastfeeding) {
        super(name, species, age, weight, food);
        this.howManyMonthBreastfeeding = howManyMonthBreastfeeding;
    }

    public static void main(String[] args) {}
}

