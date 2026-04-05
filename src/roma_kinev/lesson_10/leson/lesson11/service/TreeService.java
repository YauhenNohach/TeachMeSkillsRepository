package roma_kinev.lesson_10.leson.lesson11.service;

import roma_kinev.lesson_10.leson.lesson11.exception.TreeNotFoundException;
import roma_kinev.lesson_10.leson.lesson11.model.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeService implements ITree {

    private int lenghtArray = 5;
    List<Integer> trees = new ArrayList<>();

    @Override
    public void add(Tree tree) {

    }

    @Override
    public Tree find(int id) {
        return null;
    }

    @Override
    public Tree update(int id, Tree newTree) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

//    @Override
//    public void add(List tree) { // FIXME use try catch and raise length array + 5
//        for (int i = 0; i < trees.size(); i++) {
//            if (trees.get(i) == null) {
//                trees.get(i) = tree;
//            }
//            Tree[] trees1 = Arrays.copyOf(trees, lenghtArray);
//            lenghtArray = lenghtArray + 5;
//        }
//    }

//    @Override
//    public Tree find(int id) { // FIXME
//        for (List tree : trees) {
//            if (tree.getId() == id) {
//                return tree;
//            }
//        }
//        throw new TreeNotFoundException("Tree with id " + id + " not found");
//    }

//    @Override
//    public Tree update(int id, Tree newTree) {
//        Tree tree = find(id);
////        for (int i = 0; i < trees.length; i++) {
////            if (trees[i].getId() == id) {
//        if (newTree.getName() != null && newTree.getName() != "") {
//            tree.setName(newTree.getName());
//        }
//        if (newTree.getTypeTree() != null) {
//            tree.setTypeTree(newTree.getTypeTree());
//        }
////            }
////        }
//        return tree;
//    }
//
//    @Override
//    public void delete(int id) {
//        for (int i = 0; i < trees.length; i++) {
//            if (trees[i] != null && trees[i].getId() == id ) {
//                trees[i] = null;
//            }
//        }
//       throw new TreeNotFoundException("Tree with id " + id + " not found");
//    }
}
