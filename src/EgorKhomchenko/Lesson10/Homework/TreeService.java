package EgorKhomchenko.Lesson10.Homework;

import java.util.Arrays;

public class TreeService implements ITree {

    private static final int EXPAND_BY = 5;
    private Tree[] trees;
    private int capacity; // фактическая длина массива

    public TreeService() {
        this.capacity = 5;
        this.trees = new Tree[capacity];
    }

    @Override
    public void add(Tree tree) {
        if (tree == null) throw new IllegalArgumentException("tree is null");

        // опционально: запретить дублирование id
        for (Tree t : trees) {
            if (t != null && t.getId() == tree.getId()) {
                throw new IllegalArgumentException("Tree with id " + tree.getId() + " already exists");
            }
        }

        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = tree;
                return; // важно: выйти после успешной вставки
            }
        }

        // если нет места — расширяем массив и помещаем в первую новую ячейку
        int oldLen = trees.length;
        trees = Arrays.copyOf(trees, oldLen + EXPAND_BY);
        trees[oldLen] = tree; // записываем в первую новую позицию
        capacity = trees.length;
    }

    @Override
    public Tree find(int id) {
        for (Tree tree : trees) {
            if (tree != null && tree.getId() == id) { // защита от NPE
                return tree;
            }
        }
        throw new TreeNotFoundExceptions("Tree with id " + id + " not found");
    }

    @Override
    public Tree update(int id, Tree newTree) {
        Tree existing = find(id); // бросит TreeNotFoundException, если не найден

        // обновляем общие поля, если задано
        if (newTree.getName() != null && !newTree.getName().isEmpty()) {
            existing.setName(newTree.getName());
        }
        if (newTree.getTypeTree() != null) {
            existing.setTypeTree(newTree.getTypeTree());
        }

        // обновляем поля наследников при совпадении типов
        if (existing instanceof OrdinaryTree && newTree instanceof OrdinaryTree) {
            ((OrdinaryTree) existing).setCountLeaves(((OrdinaryTree) newTree).getCountLeaves());
        } else if (existing instanceof ChristmasTree && newTree instanceof ChristmasTree) {
            ((ChristmasTree) existing).setCountToys(((ChristmasTree) newTree).getCountToys());
        }

        return existing;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null && trees[i].getId() == id) {
                trees[i] = null;
                return; // важно: вернуть после успешного удаления
            }
        }
        throw new TreeNotFoundExceptions("Tree with id " + id + " not found");
    }

    // вспомогательный метод для вывода текущего содержимого (удобно для main)
    public void printAll() {
        for (int i = 0; i < trees.length; i++) {
            System.out.printf("[%d]: %s%n", i, trees[i]);
        }
    }
}