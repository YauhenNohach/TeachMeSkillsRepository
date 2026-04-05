package yanina_savich.lesson11_collections_part1.editedFromLesson.model;

import yanina_savich.lesson11_collections_part1.editedFromLesson.model.type.TreeType;

public class OrdinaryTree extends Tree {

    private int countLeaves;

    public OrdinaryTree(int countLeaves) {
        this.countLeaves = countLeaves;
    }

    public OrdinaryTree(int id, String name, TreeType typeTree, int countLeaves) {
        super(id, name, typeTree);
        this.countLeaves = countLeaves;
    }

    public int getCountLeaves() {
        return countLeaves;
    }

    public void setCountLeaves(int countLeaves) {
        this.countLeaves = countLeaves;
    }
}
