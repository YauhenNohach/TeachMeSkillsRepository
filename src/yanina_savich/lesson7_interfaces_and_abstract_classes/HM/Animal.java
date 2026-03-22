package yanina_savich.lesson7_interfaces_and_abstract_classes.HM;

public abstract class Animal {

    String animalName;
    int age;
    double weight;

    public Animal(String animalName, int age, double weight) {
        this.animalName = animalName;
        this.age = age;
        this.weight = weight;
    }

    public abstract void makeSound();

    public abstract void eat(String food);

    public String getInfo(){
        return "Animal name: " + animalName + ", Age: " + age + " Weight: " + weight;
    }

    public static void changeWeight(Animal animal, double newWeight){
        animal.weight = newWeight;
    }
    public static int sumAge(Animal [] animals){
        int sumAge = 0;
        for (int i = 0; i < animals.length; i++) {
            sumAge += animals[i].age;
        }
        return sumAge;
    }
    public static Animal searchName(Animal[] animals, String animalName) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].animalName.equals(animalName)) {
                return animals[i];
            }
        }
        return null;
    }
    public static void moreWeight(Animal a1, Animal a2){
        if (a1.weight > a2.weight){
            System.out.println(a1.animalName + " is bigger");
        } else if (a2.weight > a1.weight) {
            System.out.println(a2.animalName + " is bigger");
        } else {
            System.out.println("They weight are equal");
        }
    }
    public static double averageWeight(Animal[] animals) {
        double averageW = 0;
        for (int i = 0; i < animals.length; i++) {
            averageW += animals[i].weight;
        }
        return averageW / animals.length;
    }
    public static int countAnimalsMoreAverageWeight(Animal[] animals){
        int count = 0;
        double averageW = averageWeight(animals);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].weight > averageW){
                count++;
            }
        }
        return count;
    }
    public static void oldAnimals(Animal[] animals){
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].age > 6){
                System.out.println(animals[i].getInfo());
            }
        }
    }
    public static void heaviestAnimal(Animal[] animals){
        Animal heaviest = animals[0];
        for (int i = 1; i < animals.length; i++) {
            if (animals[1].weight > heaviest.weight){
                heaviest = animals[i];
            }
        }
        System.out.println("The heaviest animal is -> " + heaviest.getInfo());
    }
    public static void firstAnimalIsMoreThan6(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].weight >= 6) {
                System.out.println("The first animal is more 6kg -> " + animals[i].getInfo());
                break;
            }
        }
    }
    public static boolean isOldAnimals(Animal[] animals){
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].age > 6){
                return true;
            }
        }
        return false;
    }
}
