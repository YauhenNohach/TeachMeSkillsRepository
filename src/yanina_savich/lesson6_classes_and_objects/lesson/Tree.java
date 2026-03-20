package yanina_savich.lesson6_classes_and_objects.lesson;

public class Tree {
    public String name;
    double height;

    public static Tree maxHeightTree (Tree[] trees){
        Tree maxTree = trees[0];
        for (int i = 0; i < trees.length; i++) {
            if (trees[i].height > maxTree.height) {
                maxTree = trees[i];
            }
        }
        return maxTree;
    }
    public static void printInfoAboutTree(Tree tallestTree){
        System.out.println("name: " + tallestTree.name + ", height: " + tallestTree.height);
    }

}
