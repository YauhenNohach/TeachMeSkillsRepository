package yanina_savich.lesson2_control_flow_operators;

public class Main {
    public static void main(String[] args) {
        System.out.println("----1----");
        int year = 2026;
        if (year % 400 == 0) {
            System.out.println("Високосный год");
        } else if (year % 100 == 0) {
            System.out.println("Не високосный год");
        } else if (year % 4 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
        System.out.println("----2----");
        String type = "express";
        double weight = 7;
        int price = 0;
        switch (type) {
            case "standard" -> {
                if (weight <= 5) {
                    price = 5;
                } else if (weight <= 20) {
                    price = 10;
                } else {
                    price = 20;
                }
            }
            case "express" -> {
                if (weight <= 5) {
                    price = 10;
                } else if (weight <= 20) {
                    price = 20;
                } else {
                    price = 35;
                }
            }
            case "vip" -> price = 50;
            default -> System.out.println("Неизвестный тип доставки");
        }
        System.out.println("Стоимость доставки: " + price + "€");
        System.out.println("----3----");
        int number = 12345;
        int even = 0;
        int odd = 0;
        int sumNumbers = 0;
        while (number != 0) {
            int digit = number % 10;
            sumNumbers = sumNumbers + digit;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number = number / 10;
        }
        System.out.println("Кол-во четных цифр: " + even);
        System.out.println("Кол-во нечетных цифр: " + odd);
        System.out.println("Сумма всех цифр: " + sumNumbers);
    }
}
