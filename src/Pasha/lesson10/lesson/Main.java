package Pasha.lesson10.lesson;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TreeService treeService = new TreeService();
        Tree[] forest = new Tree[11];
        forest[0] = new OrdinaryTree(1, "Common Oak", TypeTree.Oak);
        forest[1] = new ChristmasTree(2, "Festive Pine", TypeTree.Pine);
        forest[2] = new OrdinaryTree(3, "Silver Birch", TypeTree.Birch);
        forest[3] = new ChristmasTree(4, "Scots Pine", TypeTree.Pine);
        forest[4] = new OrdinaryTree(5, "Red Oak", TypeTree.Oak);
        forest[5] = new OrdinaryTree(6, "Paper Birch", TypeTree.Birch);
        forest[6] = new ChristmasTree(7, "Blue Pine", TypeTree.Pine);
        forest[7] = new OrdinaryTree(8, "White Oak", TypeTree.Oak);
        forest[8] = new OrdinaryTree(9, "River Birch", TypeTree.Birch);
        forest[9] = new ChristmasTree(10, "Winter Pine", TypeTree.Pine);
        OrdinaryTree tree = new OrdinaryTree(11, "Super Pine", TypeTree.Pine);

        treeService.findTree(11, forest);
        System.out.println("Adding tree...");
        treeService.addTreeToArray(tree, forest);
        treeService.findTree(11, forest);
        treeService.changeTree(forest, "Super Pine", "Very Super Pine");
        treeService.findTree(11, forest);
        treeService.removeTreeFromArray(11, forest);

    }

    public static void lessonLearning() {
        String x = "Reflection";
        String y = "State";
        String z = "Country";
        String a = "Bed";
        StringBuilder sBX = new StringBuilder(x);
        StringBuilder sBY = new StringBuilder(x);
        StringBuilder sBZ = new StringBuilder(z);
        StringBuilder sBA = new StringBuilder(a);
        StringBuilder[] arrayOfStrings = {sBX, sBY, sBZ, sBA};
        int len = 0;
        for (StringBuilder str : arrayOfStrings) {
            len += str.length();
        }
        int averageStringLength = len / arrayOfStrings.length;
        for (StringBuilder str : arrayOfStrings) {
            if (averageStringLength >= str.length()) {
                System.out.println("This strings' lenght is longer than average: " + str);
            }
        }
    }
}
