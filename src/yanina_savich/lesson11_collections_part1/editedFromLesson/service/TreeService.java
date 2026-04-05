package yanina_savich.lesson11_collections_part1.editedFromLesson.service;
import yanina_savich.lesson11_collections_part1.editedFromLesson.exception.TreeNotFoundException;
import yanina_savich.lesson11_collections_part1.editedFromLesson.model.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeService implements ITree {
    // private int lenghtArray = 5; - можно не указывать длину, маленький массив
    public List<Tree> trees = new ArrayList<>();

    public TreeService(Tree[] trees) {
    }

    @Override
    public void add(Tree tree){ // fix using try catch если длина массива будет заполнена, то увеличить длинну массива на 5, реализовать с помощью исключения
        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i) == null){
                trees.set(i, tree);
            }
//            Tree[] trees1 = Arrays.copyOf(trees, lenghtArray);
//            lenghtArray = lenghtArray + 5;
        }
    }

    @Override
    public Tree find(int id) { // добавить исключение, когда дерево не найдено
        for (Tree tree : trees) {
            if (tree.getId() == id) {
                return tree;
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
        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i) != null && trees.get(i).getId() == id){
                Tree removed = trees.get(i);
                trees.remove(i);
                return removed;
            }
        }
        throw new TreeNotFoundException("Tree with id " + id + " not found");
    }
}
