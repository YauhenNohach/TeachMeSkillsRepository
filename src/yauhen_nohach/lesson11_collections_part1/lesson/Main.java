package yauhen_nohach.lesson11_collections_part1.lesson;

import yauhen_nohach.lesson6_classes_and_objects.lesson.Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); // списки
        numbers.add(1); // 2
        numbers.add(2); // 2   // o(n)
        numbers.add(3); // 3
        // get -                                                      0(1) - константное
        //  for (Integer i : numbers) {} -                         // O(n)
        // for (int i = 0; i < numbers.size(); i++) {
        //            for (int j = i + 1; j < numbers.size(); {}}  // O(n2)
        // деревья                                                // oLog(n)

        numbers.set(0, 2);
        numbers.add(0, 4);


        // null
//        numbers.add(4, 4);

        Integer num = numbers.get(0); // numbers[0]
        System.out.println(num);

        System.out.println(numbers.size());

//        numbers[0] = 1;
        for (Integer i : numbers) {}

        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }


        System.out.println(numbers);


        Set<Integer> set = new HashSet<>();

        List<String> names = new ArrayList<>();


        List<Tree> trees = new ArrayList<>();



            // stack - примитивные типы данных (int, double, float, byte, short, long и др) , ссылки на обьекты и вызов методов
        // heap - хранит сам обьект
//        int = Integer //
        int num2 = 6;
//        double = Double
//        char = Character
//        num2.
//        Long
//        Double


//        Integer num = 130;
        Integer num3 = 130;

        Integer numberInteger = num2;

        String name = "jenya";
        String name2 = null;

//        System.out.println(name2.equals(name));


//        String name2 = "jenya";

        System.out.println(name==name2);

        System.out.println(num==num3); // -127 до 128

//        Tree tree = new Tree();
//        num.compareTo(6);
    }
}
