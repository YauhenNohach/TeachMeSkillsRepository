package veranika_slesarchyk.lesson10_string_processing.practice;

import veranika_slesarchyk.lesson10_string_processing.practice.exception.TreeNotFoundException;
import veranika_slesarchyk.lesson10_string_processing.practice.model.type.ChristmasTree;
import veranika_slesarchyk.lesson10_string_processing.practice.model.type.OrdinaryTree;
import veranika_slesarchyk.lesson10_string_processing.practice.model.type.Tree;
import veranika_slesarchyk.lesson10_string_processing.practice.service.TreeService;

public class Main {
    public static void main(String[] args) {

        TreeService treeService = new TreeService(10);

        try {
            Tree t1 = new OrdinaryTree(1, "Tree1", 1000);
            Tree t2 = new ChristmasTree(2, "Tree2", 50);

            treeService.add(t1);
            treeService.add(t2);

            // поиск
            Tree found = treeService.find(1);
            System.out.println("Найдено: " + found.getName());

            // обновление
            Tree newTree = new OrdinaryTree(1, "New Tree", 800);
            treeService.update(1, newTree);

            // удаление
            treeService.delete(2);

        } catch (TreeNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
