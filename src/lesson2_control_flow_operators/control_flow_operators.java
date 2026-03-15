package lesson2_control_flow_operators;

import java.util.Scanner;

public class control_flow_operators {
    public static void main(String[] args) {


//    1) Определение високосного года
//    Год високосный если:
//    делится на 4
//    НО
//    если делится на 100 — не високосный
//    НО
//    если делится на 400 — снова високосный
        System.out.println("ПЕРВАЯ ЗАДАЧА:");

        int year = 2026;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");
        }


//        2) Задача: Калькулятор тарифов доставки
//
//        Есть:
//        тип доставки:
//        "standard"
//        "express"
//        "vip"
//        вес посылки (в кг)
//        Правила:
//  Standard
//        до 5 кг → 5 €
//        до 20 кг → 10 €
//        больше → 20 €
//  Express
//        до 5 кг → 10 €
//        до 20 кг → 20 €
//        больше → 35 €
//  VIP
//        любой вес → 50 €
//        Если введён неизвестный тип — вывести "Неизвестный тип доставки".


        System.out.println();
        System.out.println("ВТОРАЯ ЗАДАЧА:");

        String deliveryType = "Express";
        int weight = 6;

        int price = switch (deliveryType) {
            case "Standard" -> {
                if (weight <= 5) {
                    yield 5;
                } else if (weight > 20) {
                    yield 20;
                } else {
                    yield 10;
                }
            }
            case "Express" -> {
                if (weight <= 5) {
                    yield 10;
                } else if (weight > 20) {
                    yield 35;
                } else {
                    yield 30;
                }
            }
            case "VIP" -> 50;
            default -> -1;

        };
        if (price == -1) {
            System.out.println("Неизвестный тип доставки");
        } else {
            System.out.println("Итоговая цена составит " + price + " €");
        }


//        3)  Задача
//        Дано число.
//        Нужно:
//        Определить, сколько в нём чётных цифр
//        Определить, сколько нечётных цифр
//        Найти сумму всех цифр
//        Использовать:
//        while
//        if

        System.out.println();
        System.out.println("ТРЕТЬЯ ЗАДАЧА:");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");

        while (!input.hasNextInt()) {
            System.out.println("Wrong value. Try again");
            input.next();
        }

        int number = input.nextInt();
        number = Math.abs(number);

        int remainderAfterDivisionByTen = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        while (number > 0) {

            remainderAfterDivisionByTen = number % 10;

            if (remainderAfterDivisionByTen % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += remainderAfterDivisionByTen;
            number = (number - remainderAfterDivisionByTen) / 10;
        }

        System.out.println("Количество чётных = " + even);
        System.out.println("Количество нечётных = " + odd);
        System.out.println("Сумма всех цифр = " + sum);
    }

}
