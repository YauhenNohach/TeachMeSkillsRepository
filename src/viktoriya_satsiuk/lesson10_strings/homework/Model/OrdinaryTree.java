package viktoriya_satsiuk.lesson10_strings.homework.Model;

public class OrdinaryTree extends Tree{
private int countLeaves;

    public OrdinaryTree(int id, String name, TypeTree typeTree, int countLeaves) {
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
