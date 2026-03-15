package veranika_slesarchyk.homework_lesson2_control_flow_operators;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int year = 2026;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Год високосный");
                } else {
                    System.out.println("Год не високосный");
                }
            } else {
                System.out.println("Год високосный");
            }
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void task2() {

        String type = "standart";
        double weight = 4;
        switch (type) {
            case "standard":
                if (weight <= 5) {
                    System.out.println("Тариф доставки = 5 € ");
                } else if (weight <= 20) {
                    System.out.println("Тариф доставки = 10 € ");
                } else if (weight > 20) {
                    System.out.println("Тариф доставки = 20 € ");
                }
                break;
            case "express":
                if (weight <= 5) {
                    System.out.println("Тариф доставки = 10 € ");
                } else if (weight <= 20) {
                    System.out.println("Тариф доставки = 20 € ");
                } else if (weight > 20) {
                    System.out.println("Тариф доставки = 35 € ");
                }
                break;
            case "vip":
                System.out.println("Тариф доставки = 50 €");
                break;
            default:
                System.out.println("Неизвестный тип доставки");
        }
    }

    public static void task3() {

        int number = 123;
        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; //3
            sum += digit;   //3
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number = number / 10;
        }
        System.out.println("Количество чётных цифр: " + evenCount);
        System.out.println("Количество нечётных цифр: " + oddCount);
        System.out.println("Сумма цифр: " + sum);
    }
}

