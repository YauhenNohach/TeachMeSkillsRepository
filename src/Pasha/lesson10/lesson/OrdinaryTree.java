package Pasha.lesson10.lesson;

public class OrdinaryTree extends Tree {
    private int countLeaves;

    public OrdinaryTree(int id, String name, TypeTree typeTree) {
        super(id, name, typeTree);
    }

    public int getCountLeaves() {
        return countLeaves;
    }

    public void setCountLeaves(int countLeaves) {
        countLeaves++;
        this.countLeaves = countLeaves;
    }
}
