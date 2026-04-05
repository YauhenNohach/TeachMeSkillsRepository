package EgorKhomchenko.Lesson10.Homework;

public interface ITree {
    void add(Tree tree);           // добавить дерево
    Tree find(int id);             // найти по id
    Tree update(int id, Tree newTree); // обновить поля дерева (частично)
    void delete(int id);           // удалить по id
}
