package olga_konon.lesson6_classes_and_objects.lesson;

public class Main {
    public static void main(String[] args) {
        Tree[] trees = new Tree[2];

        trees[0] = new Tree();
        trees[0].name = "tree1";
        trees[0].height = 10.5;

        trees[1] = new Tree();
        trees[1].name = "tree2";
        trees[1].height = 8.2;

        Tree tallest = findHeighestTree(trees);
        tallest.printInfoAboutTree();
    }

    public static Tree findHeighestTree(Tree[] trees) {
        Tree max = trees[0];

        for (int i = 1; i < trees.length; i++) {
            if (trees[i].height > max.height) {
                max = trees[i];
            }
        }
        return max;
    }


}