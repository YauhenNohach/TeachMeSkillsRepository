package roma_kinev.lesson6_classes_and_objects.lesson;

public class Main {
    public static void main(String[] args) {
        Tree derevo = new Tree();
        derevo.name = "el";
        derevo.height = 12.2;

        Tree derevo2 = new Tree();
        derevo2.name = "sosna";
        derevo2.height = 100.2;

        Tree[] trees = {derevo, derevo2};

        Tree treeWithMaxHeight = treeHeightmax(trees);
        treeWithMaxHeight.printInfoAboutTree();

    }

    public static Tree treeHeightmax (Tree[] trees){
        Tree maxHeight = trees[0];
        for (int i = 1; i < trees.length; i++){
            if (trees[i].height > maxHeight.height){
                maxHeight = trees[i];
            }
        }
       return maxHeight;
    }
}
