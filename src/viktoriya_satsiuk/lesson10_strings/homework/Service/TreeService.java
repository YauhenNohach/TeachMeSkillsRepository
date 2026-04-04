package viktoriya_satsiuk.lesson10_strings.homework.Service;


import viktoriya_satsiuk.lesson10_strings.homework.Exception.*;
import viktoriya_satsiuk.lesson10_strings.homework.Model.Tree;


public class TreeService {
    //Добавление дерева в массив
    public static Tree [] addTree(Tree[] trees, Tree newTree) {
        //Проверка не пустое имя
        if (newTree == null) {
            throw new IllegalArgumentException("Tree cannot be null");
        }
        if (newTree.getName() == null || newTree.getName().isBlank()) {
            throw new InvalidTreeNameException("Tree name is invalid");
        }
        //Проверка на дубликаты
        for (Tree a : trees) {
            if (a != null && a.getId() == newTree.getId()) {
                throw new DuplicatedTreeException("Tree with ID " + newTree.getId() + " already exists!");
            }
        }
        //Ищём пустую ячейку
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = newTree;
                return trees;
            }
        }
        //Если массив переполнен - создаём новый
        System.out.println("Array is full. Creating new array");
        Tree[] newLargerArray = java.util.Arrays.copyOf(trees, trees.length + 5);
        newLargerArray[trees.length] = newTree;

        return newLargerArray;
    }

    //Поиск дерева
    public static Tree findTree(Tree[] trees, int id) {
        for (Tree tree : trees) {
            if (tree != null && tree.getId() == id) {
                return tree;
            }
        }
        //Кидаем ошибку если дерево не найдено
        throw new TreeNotFoundException("Tree with id " + id + " not found!");
    }

    //Изменение дерева
    public static void updateTree(Tree[] trees, int id, String newName) {
        if (newName == null || newName.isBlank()) {
            throw new InvalidTreeNameException("Tree name is invalid");
        }
        Tree foundTree = findTree(trees, id);
        foundTree.setName(newName);
    }

    //удаление дерева
    public static void deleteTree(Tree[] trees, int id) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null && trees[i].getId() == id) {
                trees[i] = null;
                return;
            }
        }
        throw new TreeNotFoundException("Tree with id " + id + " not found!");
    }

}
