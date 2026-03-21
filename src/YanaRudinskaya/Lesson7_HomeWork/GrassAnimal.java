package YanaRudinskaya.Lesson7_HomeWork;

public  class GrassAnimal extends Animal{

public String favoritePlant; //любимое растение


    @Override
    public void makeSound() {

    }

    @Override
    public void eat(String  food) {

    }

    public GrassAnimal(String name, int age, double weight, String favoritePlant) {
        super(name, age, weight);
        this.favoritePlant = favoritePlant;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", favoritePlant='" + favoritePlant;
    }
}
