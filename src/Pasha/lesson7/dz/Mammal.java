package Pasha.lesson7.dz;

class Mammal extends Carnivore {
    double howManyMonthBreastfeeding;

    protected Mammal(String name, String species, int age, double weight, String food, double howManyMonthBreastfeeding) {
        super(name, species, age, weight, food);
        this.howManyMonthBreastfeeding = howManyMonthBreastfeeding;
    }

    public static void main(String[] args) {}
}

