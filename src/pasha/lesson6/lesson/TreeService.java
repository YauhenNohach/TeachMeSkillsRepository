package pasha.lesson6.lesson;

public class TreeService {

    //                                  Tree[] trees1 = {bereza, dub};
    public Tree findTreeWithMaxHeight(Tree[] trees){
        Tree maxTree = trees[0];
        for (int i = 1; i < trees.length; i++) {
            //  bereza
            if (trees[i].height > maxTree.height){
                maxTree = trees[i];
            }
        }
        return maxTree;
    }
}
