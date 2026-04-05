package veranika_slesarchyk.lesson10_string_processing.practice.service;

import veranika_slesarchyk.lesson10_string_processing.practice.model.type.Tree;

public interface ITree {
    void add(Tree tree) throws Exception;
    void delete(int id) throws Exception;
    void update(int id, Tree newTree) throws Exception;
    Tree find(int id) throws Exception;
}
