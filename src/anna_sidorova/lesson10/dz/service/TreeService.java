package anna_sidorova.lesson10.dz.service;

import anna_sidorova.lesson10.dz.exception.SmallArrayException;
import anna_sidorova.lesson10.dz.exception.TreeNotFoundException;
import anna_sidorova.lesson10.dz.model.Tree;

public class TreeService implements ITree {

    public Tree[] trees = new Tree[5];

    @Override
    public void add(Tree tree) throws SmallArrayException { // как добавить исключение, если станет больше 5 - увеличить массив на 5
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = tree;
            }
        }
        throw new SmallArrayException("Массив заполнен, нужно увеличить");
    }

    @Override
    public Tree find(int id) throws TreeNotFoundException {
        if (trees == null) {
            throw new TreeNotFoundException("Список деревьев пуст");
        }
        for (int i = 0; i < trees.length; i++) {
            if (trees[i].getId() == id) {
                return trees[i];
            }
        }
        throw new TreeNotFoundException("Не нашли этого id " + id);
    }

    @Override
    public Tree update(int id, Tree tree) {
        Tree tree1 = find(id);
        if (tree.getName() != null) {
            tree.setName(tree.getName());
        }
        if (tree.getTypeTree() != null) {
            tree.setTypeTree(tree.getTypeTree());
        }
        return tree;
    }

    @Override
    public void delete(int id) throws TreeNotFoundException {
        if (id == 0) {
            throw new TreeNotFoundException("Не нашли этого id " + id);
        }
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null) {
                trees[i] = null;
            }
        }
        throw new TreeNotFoundException("Этого дерева нет" + id);
    }

}
