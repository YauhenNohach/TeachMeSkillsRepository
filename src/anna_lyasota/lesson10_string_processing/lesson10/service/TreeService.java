package anna_lyasota.lesson10_string_processing.lesson10.service;

import anna_lyasota.lesson10_string_processing.lesson10.exception.TreeArrayFullException;
import anna_lyasota.lesson10_string_processing.lesson10.model.Tree;

public class TreeService implements ITree {

    public void add(Tree[] trees, Tree tree) throws TreeArrayFullException {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = tree;
                return;
            }
        }
        throw new TreeArrayFullException("Массив деревьев заполнен, добавить нельзя");
    }

    public void update(Tree[] trees, int id, String newName) {
        Tree tree = find(trees, id);

        if (tree == null) {
            System.out.println("Дерево не найдено");
            return;
        }

        if (newName != null && !newName.isEmpty()) {
            tree.setName(newName);
        }
    }


    public void printAll(anna_lyasota.lesson10_string_processing.lesson10.model.Tree[] trees) {
    }

    public anna_lyasota.lesson10_string_processing.lesson10.model.Tree find(anna_lyasota.lesson10_string_processing.lesson10.model.Tree[] trees, int i) {
        return null;
    }

    public void delete(Tree[] trees, int id) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null && trees[i].getId() == id) {
                trees[i] = null;
                return;
            }
        }
        System.out.println("Дерево с id " + id + " не найдено.");
    }

    @Override
    public void delete(int id) {

    }
}
