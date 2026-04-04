package viktoriya_satsiuk.lesson10_strings.homework;

import viktoriya_satsiuk.lesson10_strings.homework.Exception.*;
import viktoriya_satsiuk.lesson10_strings.homework.Model.*;
import viktoriya_satsiuk.lesson10_strings.homework.Service.TreeService;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //1) найти самую короткую и самую длинную строки. Вывести длины этих строк

        String one = "tlkwywrggy";
        String two = "wltwfdlrjtko";
        String three = "kflw";
        String four = "f";
        String five = "rkghwtywgkfgw";
        String six = "flregjkge";

        String[] strings = {one, two, three, four, five, six};

        String longest = strings[0];
        String shortest = strings[0];


        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > longest.length()) {
                longest = strings[i];
            }

            if (strings[i].length() < shortest.length()) {
                shortest = strings[i];
            }
        }

        System.out.println("Самая длинная и короткая строки: ");
        System.out.println("Line " + longest + " is the longest. Length: " + longest.length());
        System.out.println("Line " + shortest + " is the shortest. Length: " + shortest.length());
        System.out.println();

        //2) Выводим те строки, длина которых больше средней

        int totalLength = 0;

        //Находим общее количество символов
        for (String a : strings) {
            totalLength += a.length();
        }

        //Находим среднее
        int averageLength = totalLength / strings.length;

        StringBuilder strBuilder = new StringBuilder();

        //Ищем строки больше средней и выводим
        for (String a : strings) {
            if (a.length() > averageLength) {
                strBuilder.append("String ")
                        .append(a)
                        .append(" has length ")
                        .append(a.length())
                        .append("\n");
            }
        }

        System.out.println("Строки длиннее средней длины: ");
        System.out.println(strBuilder);

//Деревья

        ChristmasTree christmasTree = new ChristmasTree(1, "Christmas tree", TypeTree.CHRISTMAS, 30);
        ChristmasTree pine = new ChristmasTree(2, "Pine", TypeTree.CHRISTMAS, 40);
        ChristmasTree artificialChristmasTree = new ChristmasTree(3, "Artificial Christmas Tree", TypeTree.CHRISTMAS, 25);
        OrdinaryTree oak = new OrdinaryTree(4, "Oak", TypeTree.ORDINARY, 400000);
        OrdinaryTree birch = new OrdinaryTree(5, "Birch", TypeTree.ORDINARY, 200000);
        OrdinaryTree maple = new OrdinaryTree(6, "Maple", TypeTree.ORDINARY, 100000);
        ChristmasTree blueSpruce = new ChristmasTree(7, "Blue Spruce", TypeTree.CHRISTMAS, 0);
        ChristmasTree nordmannFir = new ChristmasTree(8, "Nordmann Fir", TypeTree.CHRISTMAS, 30);
        OrdinaryTree baobab = new OrdinaryTree(9, "Baobab", TypeTree.ORDINARY, 15000);
        OrdinaryTree chestnut = new OrdinaryTree(10, "Chestnut", TypeTree.ORDINARY, 50000);
        OrdinaryTree sequoia = new OrdinaryTree(11, "Sequoia", TypeTree.ORDINARY, 5000000);

        Tree[] trees = new Tree[10];

        System.out.println("Добавляем в массив 11 деревьев");
        try {
            trees = TreeService.addTree(trees, christmasTree);
            trees = TreeService.addTree(trees, pine);
            trees = TreeService.addTree(trees, artificialChristmasTree);
            trees = TreeService.addTree(trees, oak);
            trees = TreeService.addTree(trees, birch);
            trees = TreeService.addTree(trees, maple);
            trees = TreeService.addTree(trees, blueSpruce);
            trees = TreeService.addTree(trees, nordmannFir);
            trees = TreeService.addTree(trees, baobab);
            trees = TreeService.addTree(trees, chestnut);
            trees = TreeService.addTree(trees, sequoia);

            System.out.println(Arrays.toString(trees));
            System.out.println("Array length:" + trees.length);
            System.out.println();

            System.out.println("Обновляем дерево");
            TreeService.updateTree(trees, 9, "Olive tree");
            Tree updatedTree = TreeService.findTree(trees, 9);
            System.out.println("Updated tree: " + updatedTree);
            System.out.println();

            System.out.println("Удаляем дерево");
            TreeService.deleteTree(trees, 2);
            //Так как я добавила валидацию на null ниже упадёт исключение при поиске значения
//            Tree deletedTree = TreeService.findTree(trees, 2);
//            System.out.println("Deleted tree: " + deletedTree);
            System.out.println();


            System.out.println("Добавляем уже существующее дерево");
            trees = TreeService.addTree(trees, christmasTree);
            System.out.println();


        } catch (DuplicatedTreeException | TreeNotFoundException | IllegalArgumentException | InvalidTreeNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
