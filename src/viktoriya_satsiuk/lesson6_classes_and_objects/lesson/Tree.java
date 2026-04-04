package viktoriya_satsiuk.lesson6_classes_and_objects.lesson;

public class Tree {

    String treeName;
    int treeHeight;

    public static Tree maxHeightTree(Tree[] trees) {
        Tree max = trees[0];
        for (int i = 0; i < trees.length; i++) {
            if (trees[i].treeHeight > max.treeHeight) {
                max = trees[i];
            }
        }
        return max;
    }

    public static void treeInfo(Tree tree) {
        System.out.println("tree name: " + tree.treeName + ", tree height: " + tree.treeHeight);
    }

}
