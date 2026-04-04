package Pasha.lesson10.lesson;

public class TreeService {

    protected void findTree(int id, Tree[] treeArray) {
        for (Tree tree : treeArray) {
            if (tree == null) {
                System.out.println("Tree with ID " + id + " was not found.");
                break;
            }
            if (tree.getId() == id) {
                System.out.println("TREE DETAILS");
                System.out.println("\tID    : " + tree.getId());
                System.out.println("\tName  : " + tree.getName());
                System.out.println("\tType  : " + tree.getTypeTree());
            }
        }
    }


    protected void addTreeToArray(Tree tree, Tree[] treeArray) {
        for (int i = 0; i < treeArray.length; i++) {
            if (treeArray[i] == null) {
                treeArray[i] = tree;
                return;
            }
        }
    }

    public void removeTreeFromArray(int id, Tree[] treeArray) {
        for (int i = 0; i < treeArray.length; i++) {
            if (treeArray[i] != null && treeArray[i].getId() == id) {
                treeArray[i] = null;
                System.out.println("Tree with ID " + id + " has been removed.");
                return;
            }
        }
        System.out.println("Could not remove: Tree with ID " + id + " was not found.");
    }


    protected void changeTree(Tree[] treeArray, String name, String newName) {
        for (Tree tree : treeArray) {
            if (tree.getName().equals(name)) {
                tree.setName(newName);
            }
        }
    }
}