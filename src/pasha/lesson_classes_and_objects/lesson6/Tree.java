package pasha.lesson_classes_and_objects.lesson6;

public class Tree {

    String name;

    double height;

    public static void returnTreeInfo(String name, double height) {
        System.out.println("Type: " + name + "\n" +
                "Height: " + height);
        System.out.println();
    }
}
