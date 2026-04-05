package veranika_slesarchyk.lesson10_string_processing.practice.service;

import veranika_slesarchyk.lesson10_string_processing.practice.exception.TreeNotFoundException;
import veranika_slesarchyk.lesson10_string_processing.practice.model.type.Tree;

public class TreeService implements ITree {

    private Tree[] trees;
    private int size = 0;

    public TreeService(int capacity) {
        trees = new Tree[capacity];
    }

    @Override
    public void add(Tree tree) throws Exception {
        if (size >= trees.length) {
            throw new Exception("Массив заполнен");
        }
        trees[size++] = tree;
    }

    @Override
    public void delete(int id) throws TreeNotFoundException {
        for (int i = 0; i < size; i++) {
            if (trees[i].getId() == id) {
                // сдвиг массива
                for (int j = i; j < size - 1; j++) {
                    trees[j] = trees[j + 1];
                }
                trees[size - 1] = null;
                size--;
                return;
            }
        }
        throw new TreeNotFoundException("Дерево не найдено");
    }

    @Override
    public void update(int id, Tree newTree) throws TreeNotFoundException {
        for (int i = 0; i < size; i++) {
            if (trees[i].getId() == id) {
                trees[i] = newTree;
                return;
            }
        }
        throw new TreeNotFoundException("Дерево не найдено");
    }

    @Override
    public Tree find(int id) throws TreeNotFoundException {
        for (int i = 0; i < size; i++) {
            if (trees[i].getId() == id) {
                return trees[i];
            }
        }
        throw new TreeNotFoundException("Дерево не найдено");
    }
}
