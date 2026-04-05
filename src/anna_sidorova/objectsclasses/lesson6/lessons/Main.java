package anna_sidorova.objectsclasses.lesson6.lessons;

public class Main {
    public static void main(String[] args) {
        Tree firstTree = new Tree();
        firstTree.name = "el";
        firstTree.height = 23.4;

        Tree secondTree = new Tree();
        secondTree.name = "bereza";
        secondTree.height = 34.6;

        Tree[] trees = new Tree[2];
        trees[0] = firstTree;
        trees[1] = secondTree;
       Tree treeWithMaxHeight = findTreeWithMaxHeight(trees);
       firstTree.getTreeInfo();
       treeWithMaxHeight.getTreeInfo();


    }

    public static Tree findTreeWithMaxHeight(Tree[] trees) {
        Tree maxTree = trees[0];
        for (int i = 1; i < trees.length; i++) {
            if (trees[i].height > maxTree.height) {
                maxTree = trees[i];
            }
        }
        return maxTree;
    }
}