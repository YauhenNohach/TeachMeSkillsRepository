package pasha.lesson_classes_and_objects.lesson6;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        Tree tree3 = new Tree();
        Tree tree4 = new Tree();
        Tree tree5 = new Tree();
        Tree tree6 = new Tree();

        tree1.height = 38.5;
        tree2.height = 18.3;
        tree3.height = 36.9;
        tree4.height = 25.4;
        tree5.height = 47.1;
        tree6.height = 12.8;


        Tree[] trees = {tree1, tree2, tree3, tree4, tree5, tree6};


        double highestTree = findHighestTree(trees);

        System.out.println("Top height is: " + highestTree);
    }

    public static double findHighestTree(Tree[] trees) {
        double topHeightTree = trees[0].height;
        for (Tree tree : trees) {
            if (tree.height > topHeightTree) {
                topHeightTree = tree.height;
            }
        }
        return topHeightTree;
    }
}