package yanina_savich.lesson6_classes_and_objects.lesson;

public class Main {
    public static Tree main(String[] args) {
        Tree bereza = new Tree();
        bereza.name = "bereza";
        bereza.height = 123.6;

        Tree dub = new Tree();
        dub.name = "dub";
        dub.height = 303.1;

        Tree[] trees = {bereza, dub};
        Tree tallestTree = Tree.maxHeightTree(trees);
        Tree.printInfoAboutTree(tallestTree);
        return bereza;
    }
}


