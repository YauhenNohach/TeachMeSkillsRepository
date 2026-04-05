package yanina_savich.lesson7_interfaces_and_abstract_classes.HM;

public class GrassAnimalFirst extends Animal{
    String lovePlant;

    public GrassAnimalFirst(String animalName, int age, double weight) {
        super(animalName, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("sooouuunnnddd");
    }

    @Override
    public void eat(String food) {
        System.out.println(animalName + "eats some food" + food);
    }
}
