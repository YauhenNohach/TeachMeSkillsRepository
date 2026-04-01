package anna_lyasota.lesson9_exceptions.lesson.jenya.model;

import anna_lyasota.lesson9_exceptions.lesson.jenya.model.type.TreeType;

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
