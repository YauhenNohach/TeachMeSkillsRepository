package veranika_slesarchyk.lesson10_string_processing.practice.model.type;

public abstract class Tree {
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

    public String getName() {
        return name;
    }

    public TypeTree getTypeTree() {
        return typeTree;
    }

    public void setName(String name) {
        this.name = name;
    }
}