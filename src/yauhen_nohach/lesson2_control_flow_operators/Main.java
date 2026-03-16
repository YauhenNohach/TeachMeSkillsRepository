package yauhen_nohach.lesson2_control_flow_operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ready home work");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш год: ");
        int years = scanner.nextInt();
        if (years % 4 == 0) {
            System.out.println("Год високосный");
        } else if (years % 400 == 0) {
            System.out.println("Год високосный");
        } else if (years % 100 == 0) {
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год не високосный");
        }

        // Задание 2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите тип посылки (Standart, Express, VIP): ");
        String packageType = scanner2.nextLine();
        if (packageType.equals("Standart")) {
            System.out.println("Введите вес посылки: ");
            int standartWeight = scanner2.nextInt();
            if (standartWeight <= 5) {
                System.out.println("Стоимость посылки 5 евро");
            } else if (standartWeight <= 20) {
                System.out.println("Стоимость посылки 10 евро");
            } else {
                System.out.println("Стоимость посылки 20 евро");
            }
        } else if (packageType.equals("Express")) {
            System.out.println("Введите вес посылки: ");
            int expressWeight = scanner2.nextInt();
            if (expressWeight <= 5) {
                System.out.println("Стоимость посылки 10 евро");
            } else if (expressWeight <= 20) {
                System.out.println("Стоимость посылки 20 евро");
            } else {
                System.out.println("Стоимость посылки 30 евро");
            }
        } else if (packageType.equals("VIP")) {
            System.out.println("Введите вес посылки: ");
            int vipWeight = scanner2.nextInt();
            System.out.println("Стоимость посылки 50 евро");
        } else {
            System.out.println("Неизвестный тип доставки");
        }
        // Задание 3
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите вашу цифру (Обязательно целое число) ");
        int initialNumber = scanner3.nextInt();
        int evenNumber = 0;
        int oddNumber = 0;
        int sumCountOfNumber = 0;

        while(initialNumber >0){
            int secondNumber = initialNumber % 10;
            sumCountOfNumber = sumCountOfNumber + secondNumber;
            if (secondNumber % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
            initialNumber = initialNumber / 10;
        }
        System.out.println("Количество чертных чисел: "+evenNumber +" Количество нечерных чисел: "+oddNumber +" Сумма всех чисел: "+sumCountOfNumber);

    }
}
