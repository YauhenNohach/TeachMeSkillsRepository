package anna_lyasota.lesson10_string_processing.lesson10;

import anna_lyasota.lesson10_string_processing.lesson10.model.Tree;
import anna_lyasota.lesson10_string_processing.lesson10.service.TreeService;

import javax.swing.*;

import static anna_lyasota.lesson10_string_processing.lesson10.model.TreeType.CHRISTMAS_TREE;
import static anna_lyasota.lesson10_string_processing.lesson10.model.TreeType.ORDINARY_TREE;

public class Main {
    public static void main(String[] args) {

        String[] array = new String[3];

        array[0] = "lesson10_string_processing";
        array[1] = "string_processing";
        array[2] = "processing";

        int minLength = array[0].length();
        int maxLength = array[0].length();

        for (String str : array) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        System.out.println("Длина самой короткой строки: " + minLength);
        System.out.println("Длина самой длинной строки: " + maxLength);


        // Вывести на консоль те строки, длина которых
        //больше средней, а также длину.
        int sum = 0;
        for (String str : array) {
            sum += str.length();
        }

        double average = (double) sum / array.length;

        StringBuilder result = new StringBuilder();

        for (String str : array) {
            if (str.length() > average) {
                result.append(str)
                        .append(" (длина: ")
                        .append(str.length())
                        .append(")\n");
            }
        }

        System.out.println("Строки больше средней длины:");
        System.out.println(result.toString());

//        5) в main создать масссив деревьев длинной 10
//        применяя мметоды из TreeService, удалять, изменять и добавлять деревья в массив
        Tree[] trees = new Tree[10];
        trees[0] = new Tree(0, "sosna", CHRISTMAS_TREE);
        trees[1] = new Tree(1, "el", CHRISTMAS_TREE);
        trees[2] = new Tree(2, "bereza", ORDINARY_TREE);
        trees[3] = new Tree(3, "dub", ORDINARY_TREE);
        trees[4] = new Tree(4, "klen", ORDINARY_TREE);
        trees[5] = new Tree(5, "yasen", ORDINARY_TREE);
        trees[6] = new Tree(6, "topol", ORDINARY_TREE);
        trees[7] = new Tree(7, "yablonya", ORDINARY_TREE);
        trees[8] = new Tree(8, "vishnya", ORDINARY_TREE);
        trees[9] = new Tree(9, "lipa", ORDINARY_TREE);

        System.out.println("Все деревья:");
        TreeService treeService = new TreeService();
        treeService.printAll(trees);

//Найти дерево
        Tree found = treeService.find(trees, 3);
        System.out.println(found);

//Обновить
        treeService.update(trees, 3, "oak");
        treeService.printAll(trees);

//Удалить
        treeService.delete(trees, 2);
        treeService.printAll(trees);

//Добавить
        treeService.add(trees, new Tree(10, "cedr", ORDINARY_TREE));
        treeService.printAll(trees);

//        // создать обьекты
//        TreeService treeService = new TreeService();
//        try {
//            treeService.add();
//            treeService.find();
//            treeService.update()
//        } catch (TreeNotFoundException e){
//
//        } catch (Exception e){
        }

}






