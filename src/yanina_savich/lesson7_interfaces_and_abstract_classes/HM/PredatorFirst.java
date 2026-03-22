package yanina_savich.lesson7_interfaces_and_abstract_classes.HM;

public class PredatorFirst extends Animal{
    int numberOfTeeth;

    public PredatorFirst(String animalName, int age, double weight) {
        super(animalName, age, weight);
    }


    @Override
    public void makeSound(){
        System.out.println("Rrrrrr");
    }

    @Override
    public void eat(String food) {
        System.out.println(animalName + " eats some food" + food);
    }
}
