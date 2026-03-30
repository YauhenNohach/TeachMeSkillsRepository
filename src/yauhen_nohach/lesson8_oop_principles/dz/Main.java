package yauhen_nohach.lesson8_oop_principles.dz;

import yauhen_nohach.lesson6_classes_and_objects.lesson.Tree;
import yauhen_nohach.lesson8_oop_principles.lesson.exception.CurrencyMismatchException;

public class Main {
    public static void main(String[] args) throws CurrencyMismatchException{
        int sum2 = sum2(1, 2);
        sum2 += 5;

        int a = 6;
        int b = 7;

        if (a > b){
            throw new CurrencyMismatchException("errors");
        }
    }

    public static void sum(int num1, int num2) {
        int sum = num1 + num2;
    }

    public static int sum2(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

//    public void save(Tree tree){
//        treeRepository.save(tree);
//    }


}
