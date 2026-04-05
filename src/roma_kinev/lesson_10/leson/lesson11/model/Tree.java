package roma_kinev.lesson_10.leson.lesson11.model;


import roma_kinev.lesson_10.leson.lesson11.model.type.TreeType;

//                     String       Long
public abstract class Tree {//<T, E extends Number> implements BaseModel<Integer> {

    private Integer id;
    private String name;
    private TreeType typeTree;

    public Tree() {
    }

    public Tree(int id, String name, TreeType typeTree) {
        this.id = id;
        this.name = name;
        this.typeTree = typeTree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeType getTypeTree() {
        return typeTree;
    }

    public void setTypeTree(TreeType typeTree) {
        this.typeTree = typeTree;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeTree=" + typeTree +
                '}';
    }
}
