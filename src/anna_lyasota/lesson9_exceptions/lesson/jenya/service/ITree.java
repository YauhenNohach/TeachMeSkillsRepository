package anna_lyasota.lesson9_exceptions.lesson.jenya.service;

import anna_lyasota.lesson9_exceptions.lesson.jenya.model.Tree;

public interface ITree {

    void add(Tree tree);

    Tree find(int id);

    Tree update(int id, Tree newTree);

//    Tree tree = find(1);
//    if(newTree.getName() != null){
//        tree.setName(newTree.getName())
//    }

    void delete(int id);
}
