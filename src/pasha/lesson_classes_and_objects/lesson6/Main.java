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

        tree1.name = "Oak";
        tree2.name = "Pine";
        tree3.name = "Maple";
        tree4.name = "Birch";
        tree5.name = "Willow";
        tree6.name = "Baobab";

        tree1.returnTreeInfo(tree1.name, tree1.height);
        tree2.returnTreeInfo(tree2.name, tree2.height);
        tree3.returnTreeInfo(tree3.name, tree3.height);
        tree4.returnTreeInfo(tree4.name, tree4.height);
        tree5.returnTreeInfo(tree5.name, tree5.height);
        tree6.returnTreeInfo(tree6.name, tree6.height);



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