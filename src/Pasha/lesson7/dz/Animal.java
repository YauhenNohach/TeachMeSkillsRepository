package Pasha.lesson7.dz;

public abstract class Animal {
    String name;
    String species;
    int age;
    double weight;


    protected Animal(String name, String species, int age, double weight) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.species = species;
    }

    //mentioned in the dz but no use.
    protected abstract void animalSound(String animal);
    //mentioned in the dz but no use.
    protected abstract void animalFood(String food);

    protected void getInfo(){
        System.out.println("Animal: " + name);
        System.out.println("\tSpecies: " + species);
        System.out.println("\tAge: " + age);
        System.out.println("\tWeight: " + weight);
    }
}
