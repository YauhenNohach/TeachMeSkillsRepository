package viktoriya_satsiuk.lesson6_classes_and_objects.lesson;

public class Main {
    public static void main(String[] args) {

        Tree bereza = new Tree();
        bereza.treeName = "bereza";
        bereza.treeHeight = 100;

        Tree dub = new Tree();
        dub.treeName = "dub";
        dub.treeHeight = 200;

        Tree [] trees = new Tree[2];
        trees[0] = bereza;
        trees[1] = dub;

        Tree tallestTree = Tree.maxHeightTree(trees);
        Tree.treeInfo(tallestTree);
    }
}
