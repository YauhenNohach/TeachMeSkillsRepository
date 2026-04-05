package yanina_savich.lesson10_string_processing.hm.service;

import yanina_savich.lesson10_string_processing.hm.exception.TreeNotFoundException;
import yanina_savich.lesson10_string_processing.hm.model.Tree;

import java.util.Arrays;

public class TreeService implements ITree {
    // private int lenghtArray = 5; - можно не указывать длину, маленький массив
    private Tree[] trees;
    private int size = 0;

    public TreeService(Tree[] trees) {
        this.trees = trees;
    }

    @Override
    public void add(Tree tree){ // fix using try catch если длина массива будет заполнена, то увеличить длинну массива на 5, реализовать с помощью исключения
        if (size >= trees.length){
                trees = Arrays.copyOf(trees, trees.length + 5);
            }
//            Tree[] trees1 = Arrays.copyOf(trees, lenghtArray);
//            lenghtArray = lenghtArray + 5;
        trees[size] = tree;
        size++;
    }

    @Override
    public Tree find(int id) { // добавить исключение, когда дерево не найдено
        for (int i = 0; i < size; i++) {
            if (trees[i] != null && trees[i].getId() == id) {
                return trees[i];
            }
        }
        throw new TreeNotFoundException("Tree with id " + id + "not found");
    }
    @Override
    public Tree update(int id, Tree newTree){
        Tree tree = find(id);
//        for (int i = 0; i < trees.length; i++) {
//            if(trees[i].getId() == id){
                if(newTree.getName() != null && newTree.getName() != "") {
                    tree.setName(newTree.getName());
                }
                if (newTree.getTypeTree() != null){
                    tree.setTypeTree(newTree.getTypeTree());
                }
//            }
//        }
                return tree;
    }

    @Override
    public Tree delete(int id) {
        for (int i = 0; i < size; i++) {
            if (trees[i] != null && trees[i].getId() == id){
                Tree removed = trees[i];
                // для сдвига влево
                for (int j = 0; j < size - 1; j++) {
                    trees[j] = trees[j+1];
                }
                trees[size - 1] = null;
                size--;
                return removed;
            }
        }
        throw new TreeNotFoundException("Tree with id " + id + " not found");
    }
    public void printAll(){
        for (int i = 0; i < size; i++) {
            System.out.println(trees[i]);
        }
    }
}
