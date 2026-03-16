package irina_lisovskaya.lesson2_control_flow_operators;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// 1) Определение високосного года.
// Год високосный если: делится на 4, НО если делится на 100 — не високосный, НО если делится на 400 — снова високосный.
        System.out.println();
        System.out.println("Home work 2, task 1:");
        int year = 1900;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }


// 2) Калькулятор тарифов доставки.
// Standard: до 5 кг → 5 €, до 20 кг → 10 €, больше → 20 €
// Express:  до 5 кг → 10 €,  до 20 кг → 20 €, больше → 35 €
// VIP: любой вес → 50 €
        System.out.println();
        System.out.println("Home work 2, task 2:");
        int weightPack = 1;
        String deleveryType = "Express"; // Standard, Express, VIP
        String currency = "€";
        int standardMin = 5;
        int standartMedium = 10;
        int standartMax = 20;
        int expressdMin = 10;
        int expressMedium = 20;
        int expressMax = 35;
        int vipMin = 50;
        switch (deleveryType) {
            case "Standard" -> {
                if (weightPack <= 5) {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + standardMin + currency);
                } else if (weightPack <= 20) {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + standartMedium + currency);
                } else {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + standartMax + currency);
                }
            }
            case "Express" -> {
                if (weightPack <= 5) {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + expressdMin + currency);
                } else if (weightPack <= 20) {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + expressMedium + currency);
                } else {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + expressMax + currency);
                }
            }
            case "vipMin" -> System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + vipMin + currency);
            default -> System.out.println("Неизвестный тип доставки");
        }


// 3) Задача: Дано число. Нужно:
// Определить, сколько в нём чётных цифр.
// Определить, сколько нечётных цифр.
// Найти сумму всех цифр.
// Использовать: while     if
        System.out.println();
        System.out.println("Home work 2, task 3:");
        int someNum = 145; // не получилось сделать условия под вариант, когда число отрицательное
        int evenNum = 0;
        int oddNum = 0;
        int sumNum = 0;

        if (someNum == 0) {
            System.out.println("Количество чётных чисел: " + (evenNum = 1));
            System.out.println("Количество нечётных чисел: " + (oddNum = 0));
            System.out.println("Сумма всех чисел: " + sumNum);
        } else {
            while (someNum > 0) {
                int variable = someNum % 10;
                if (variable % 2 == 0) {
                    evenNum++;
                } else {
                    oddNum++;
                }
                someNum /= 10;
                sumNum += variable;
            }
        }
        System.out.println("Количество чётных чисел: " + evenNum);
        System.out.println("Количество нечётных чисел: " + oddNum);
        System.out.println("Сумма всех чисел: " + sumNum);


    }
}