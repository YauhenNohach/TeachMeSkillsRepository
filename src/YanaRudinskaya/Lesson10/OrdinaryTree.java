package YanaRudinskaya.Lesson10;

public class OrdinaryTree extends Tree {

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


    @Override
    public String toString() {
        return "OrdinaryTree{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", type=" + getTypeTree() +
                ", countLeaves=" + countLeaves +
                '}';
    }
}

