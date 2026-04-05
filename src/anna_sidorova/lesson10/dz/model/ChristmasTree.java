package anna_sidorova.lesson10.dz.model;

import anna_sidorova.lesson10.dz.type.TypeTree;

public class ChristmasTree extends Tree {
    private int countToys;

    public ChristmasTree(int id, String name, TypeTree typeTree, int countToys) {
        super(id, name, typeTree);
        this.countToys = countToys;
    }
}
