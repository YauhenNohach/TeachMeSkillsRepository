package yauhen_nohach.lesson10_string_processing.dz.service;

import yauhen_nohach.lesson10_string_processing.dz.exception.TreeNotFoundException;
import yauhen_nohach.lesson10_string_processing.dz.model.Tree;

import java.util.Arrays;

public class TreeService implements ITree {

    private int lenghtArray = 5;
    public Tree[] trees = new Tree[lenghtArray];

    @Override
    public void add(Tree tree) { // FIXME use try catch and raise length array + 5
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = tree;
            }
//            Tree[] trees1 = Arrays.copyOf(trees, lenghtArray);
//            lenghtArray = lenghtArray + 5;
        }
    }

    @Override
    public Tree find(int id) { // FIXME
        for (Tree tree : trees) {
            if (tree.getId() == id) {
                return tree;
            }
        }
        throw new TreeNotFoundException("Tree with id " + id + " not found");
    }

    @Override
    public Tree update(int id, Tree newTree) {
        Tree tree = find(id);
//        for (int i = 0; i < trees.length; i++) {
//            if (trees[i].getId() == id) {
        if (newTree.getName() != null && newTree.getName() != "") {
            tree.setName(newTree.getName());
        }
        if (newTree.getTypeTree() != null) {
            tree.setTypeTree(newTree.getTypeTree());
        }
//            }
//        }
        return tree;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null && trees[i].getId() == id ) {
                trees[i] = null;
            }
        }
       throw new TreeNotFoundException("Tree with id " + id + " not found");
    }
}
