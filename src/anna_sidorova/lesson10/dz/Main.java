package anna_sidorova.lesson10.dz;

import anna_sidorova.lesson10.dz.exception.SmallArrayException;
import anna_sidorova.lesson10.dz.model.ChristmasTree;
import anna_sidorova.lesson10.dz.model.Tree;
import anna_sidorova.lesson10.dz.service.TreeService;

import static anna_sidorova.lesson10.dz.type.TypeTree.CHRISTMAS_TREE;

public class Main {
    public static void main(String[] args) {
        TreeService treeService = new TreeService();
        Tree tree = new ChristmasTree(2, "sosna", CHRISTMAS_TREE, 33);
        Tree[] trees = new Tree[5];

        try {
            treeService.add(tree);
        } catch (SmallArrayException e) {
            Tree[] newTrees = new Tree[treeService.trees.length + 5];
            System.arraycopy(treeService.trees, 0, newTrees, 0, treeService.trees.length);
            treeService.add(tree);
        }

    }
}
