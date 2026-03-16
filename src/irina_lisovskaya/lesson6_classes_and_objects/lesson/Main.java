package irina_lisovskaya.lesson6_classes_and_objects.lesson;

public class Main {
    public static void main(String[] args) {

        Tree bereza = new Tree();
        bereza.name = "Bereza";
        bereza.height = 2.3;
        bereza.printInfoAboutTree();

        Tree dub = new Tree();
        dub.name = "Dub";
        dub.height = 5.8;

        Tree lipa = new Tree();
        lipa.name = "Lipa";
        lipa.height = 8;

        Tree[] trees = {bereza, dub, lipa};

        Tree maxTreeHeigh = findMaxTreeHeight(trees);

        System.out.println("Самое высокое дерево: " + maxTreeHeigh.height);

    }
    public static Tree findMaxTreeHeight(Tree[] trees) {
        Tree maxTreeHeigh = trees[0];
        for (int i = 0; i < trees.length; i++) {
            if (trees[i].height > maxTreeHeigh.height) {
                maxTreeHeigh = trees[i];
            }
        }
        return maxTreeHeigh;
    }

}
