package veranika_slesarchyk.lesson10_string_processing.practice.model.type;

public class OrdinaryTree extends Tree {
    private int countLeaves;

    public OrdinaryTree(int id, String name, int countLeaves) {
        super(id, name, TypeTree.ORDINARY);
        this.countLeaves = countLeaves;
    }

    public int getCountLeaves() {
        return countLeaves;
    }

    public void setCountLeaves(int countLeaves) {
        this.countLeaves = countLeaves;
    }
}