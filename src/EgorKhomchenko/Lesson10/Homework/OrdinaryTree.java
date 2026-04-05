package EgorKhomchenko.Lesson10.Homework;

public class OrdinaryTree extends Tree {
    private int countLeaves;

    public OrdinaryTree() { }

    public OrdinaryTree(int id, String name, int countLeaves) {
        super(id, name, TreeType.ORDINARY);
        this.countLeaves = countLeaves;
    }

    public int getCountLeaves() {
        return countLeaves; }
    public void setCountLeaves(int countLeaves) {
        this.countLeaves = countLeaves; }

    @Override
    public String toString() {
        return "OrdinaryTree{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", countLeaves=" + countLeaves +
                '}';
    }
}