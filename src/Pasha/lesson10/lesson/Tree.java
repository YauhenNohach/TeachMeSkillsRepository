package Pasha.lesson10.lesson;

abstract class Tree {
    private int id;
    private String name;
    private TypeTree typeTree;


    public Tree(int id, String name, TypeTree typeTree) {
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

    public TypeTree getTypeTree() {
        return typeTree;
    }

    public void setTypeTree(TypeTree typeTree) {
        this.typeTree = typeTree;
    }
}
