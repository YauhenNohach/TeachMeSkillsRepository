package anna_sidorova.lesson10.dz.service;

import anna_sidorova.lesson10.dz.model.Tree;

public interface ITree {
    public void add(Tree tree);

    Tree find(int id);

    Tree update(int id, Tree newtree);

    void delete(int id);
}
