package Pasha.lesson6.lesson;

public class Main {
    public static void main(String[] args) {
        Tree sosna = new Tree("sosna");
        sosna.height = 123.54;
        sosna.printInfoAboutTree();
        String nameTopol = "topol";
        Tree topol = new Tree(nameTopol, 345.7);
        topol.printInfoAboutTree();

        Tree bereza = new Tree(); // экземпляр класса / создание нового обьекта
        bereza.name = "bereza";
        bereza.height = 123.6;
//        bereza.season = "summer";


        System.out.println(bereza.height);
//
//        int[] numbers = new int[2];
//        numbers[0] = 123;
//        numbers[1] = 456;
//
//        int[] numbers2 = {1, 2};

        Tree dub = new Tree();
        dub.name = "dub";

        Tree[] trees = new Tree[2];
        trees[0] = bereza;
        trees[1] = dub;

        Tree[] trees1 = {bereza, dub};

        double sumTree = sumTreesHeights(bereza, dub);

        Tree el = new Tree();
        el.name = "el";

        double height = 123.9;
        String name = "jenya";

        int numbers1 = 6;
        int numbers2 = 7;

        sumNumbers1(numbers1, numbers2);
        //            13
        int sum = sumNumbers2(numbers1, numbers2);

        int b = 12 + sum;

        Tree treeWithMaxHeight = findTreeWithMaxHeight(trees1);
        treeWithMaxHeight.printInfoAboutTree();

        TreeService treeService = new TreeService();
        treeService.findTreeWithMaxHeight(trees1);
    }

    // метод - обособленный участок кода, который вполняет какую-то логику
    // методы вызываются по названию
    // void - ничего не возвращает
    public static void sumNumbers1(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum numbers for first method: " + sum);
    }

    public static int sumNumbers2(int num1, int num2) {
        int sum = num1 + num2;
//        System.out.println("sum numbers for second method: " +  sum);
        return sum;
    }

    public static double sumTreesHeights(Tree tree1, Tree tree2) {
        double sum = tree1.height + tree2.height;
        return sum;
    }

    //                                  Tree[] trees1 = {bereza, dub};
    public static Tree findTreeWithMaxHeight(Tree[] trees){
        Tree maxTree = trees[0];
        for (int i = 1; i < trees.length; i++) {
            //  bereza
            if (trees[i].height > maxTree.height){
                maxTree = trees[i];
            }
        }
        return maxTree;
    }
}
