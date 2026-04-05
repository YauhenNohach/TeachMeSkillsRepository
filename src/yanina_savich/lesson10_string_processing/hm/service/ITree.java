package yanina_savich.lesson10_string_processing.hm.service;

import yanina_savich.lesson10_string_processing.hm.model.Tree;

public interface ITree {
    void add (Tree tree);

    Tree find(int id);

    Tree update(int id, Tree newTree);

//    Tree tree = find(1);
//    if(newTree.getName() != null){
//        tree.setName(newTree.getName())
//    }

    Tree delete(int id);
}



