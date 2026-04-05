package yanina_savich.lesson10_string_processing.hm;

import yanina_savich.lesson10_string_processing.hm.model.ChristmasTree;
import yanina_savich.lesson10_string_processing.hm.model.OrdinaryTree;
import yanina_savich.lesson10_string_processing.hm.model.Tree;
import yanina_savich.lesson10_string_processing.hm.model.type.TreeType;
import yanina_savich.lesson10_string_processing.hm.service.TreeService;
import yanina_savich.lesson10_string_processing.hm.exception.TreeNotFoundException;

public class Main {
    public static void main(String[] args) {
//        1) создать абстрактный класс Tree (id, name, typeTree (enum))
//        2) 2 наследника OrdinaryTree (доп поле количетсво листьев countLeaves), ChristmasTree (countToyes)
//        3) ITree (add, update, delete)
//        4) создать класс TreeService должен реализовать интерфейс ITree :
//        - должна быть возможность добавить дерево в массив
//        - удалить
//        - изменить
//        5) в main создать масссив деревьев длинной 10
//        применяя мметоды из TreeService, удалять, изменять и добавлять деревья в массив

//        // создать обьекты
//        TreeService treeService = new TreeService();
//        try {
//            treeService.add();
//            treeService.find();
//            treeService.update()
//        } catch (TreeNotFoundException e){
//
//        } catch (Exception e){
        Tree[] trees = new Tree[10];

        TreeService treeService = new TreeService(trees);

        try {
            Tree tree1 = new OrdinaryTree(1, "Sosna", TreeType.ORDINARY_TREE, 100);
            Tree tree2 = new ChristmasTree(2, "Elka", TreeType.CHRISTMAS_TREE, 50);
            treeService.add(tree1);
            treeService.add(tree2);

            System.out.println("Все деревья в массиве: ");
            treeService.printAll();

            Tree found = treeService.find(1);
            System.out.println("Найдено: " + found.getName());

            Tree newTree = new OrdinaryTree(1, "Big Sosna", TreeType.ORDINARY_TREE, 200);
            treeService.update(1, newTree);

            System.out.println("После метода update:");
            treeService.printAll();

            treeService.delete(2);


        } catch (TreeNotFoundException e) {
            System.out.println("Не найдено дерево: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общая ошибка: " + e.getMessage());
        }
    }
}
