package anna_sidorova.lesson10.dz.model;

import anna_sidorova.lesson10.dz.type.TypeTree;

public abstract class Tree {
    private int id;
    private String name;
    private TypeTree typeTree;

    public Tree() {
    }

    public Tree(int id, String name, TypeTree typeTree) {
        this.id = id;
        this.name = name;
        this.typeTree = typeTree;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TypeTree getTypeTree() {
        return typeTree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeTree(TypeTree typeTree) {
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

    public void setId(int id) {
        this.id = id;
    }

}
