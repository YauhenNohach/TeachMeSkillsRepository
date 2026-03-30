package yauhen_nohach.lesson10_string_processing.dz.service;

import yauhen_nohach.lesson10_string_processing.dz.model.Tree;

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
