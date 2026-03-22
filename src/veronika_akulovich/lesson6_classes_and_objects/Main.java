package veronika_akulovich.lesson6_classes_and_objects;

import yauhen_nohach.lesson6_classes_and_objects.lesson.Car;

public class Main {
    public static void main(String[] args) {




        Person Maria = new Person("Maria", "Ivanova", "female", 45, "RU");
        Person Petr = new Person("Petr", "Petrov", "male", 37, "KZ");



        double findAverageAge = averageAge(Maria, Petr);
        System.out.println("average age of persons " + findAverageAge);


        Tree bereza = new Tree();
        Tree dub = new Tree();
        bereza.height = 123.5;
        bereza.name = "bereza";
        dub.height = 45.8;
        dub.name = "dub";
        Tree[] trees = new Tree[2];
        trees[0] = bereza;
        trees[1] = dub;


        Tree maxHeightOfTreesVariable = maxHeightOfTrees(trees);
        maxHeightOfTreesVariable.printInfoAboutTree();
    }
    public static Tree maxHeightOfTrees (Tree[]trees){
        Tree maxHeight = trees[0];
        for (int i = 0; i < trees.length; i++) {
            if (trees[i].height > maxHeight.height) {
                maxHeight = trees[i];
            }
        }
        return maxHeight;
    }

    public static double averageAge(Person age, Person age1){
        double averageAgeOfPersons = (age.age + age1.age) / 2;
return averageAgeOfPersons;
    }
}
