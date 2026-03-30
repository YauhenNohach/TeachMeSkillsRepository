package veranika_slesarchyk.lesson6_classes_and_objects.lesson;

public class Main {
    public static void main(String[] args) {
        Tree bereza = new Tree();
        bereza.height = 25;
        bereza.name = "Bereza";

        Tree dub = new Tree();
        Tree[] trees = new Tree[2];
        dub.height = 32;
        dub.name = "Dub";

        trees[0] = bereza;
        trees[1] = dub;
       Tree treeWithMaxHeight= findTreeWithMaxHeight(trees);
    }

    public static Tree findTreeWithMaxHeight(Tree[] trees) {
        Tree maxHeight = trees[0];
        for (int i = 1; i < trees.length; i++) {
            if (trees[i].height > maxHeight.height) {
                maxHeight = trees[i];
            }
        }
        return maxHeight;
    }

}
