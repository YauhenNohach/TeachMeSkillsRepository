package anna_sidorova.lesson10.dz.model;

import anna_sidorova.lesson10.dz.type.TypeTree;

public class OrdinaryTree extends Tree {
    private int countLeaves;

    public OrdinaryTree(int id, String name, TypeTree typeTree, int countLeaves) {
        super(id, name, typeTree);
        this.countLeaves = countLeaves;
    }
}
