package viktoriya_satsiuk.lesson2_control_flow_operators;

public class SatsyukViktoriyaHomework2 {
    public static void main(String[] args) {


//            Задание 1. Определение високосного года

        int year = 2026;

        if (year % 400 == 0) {
            System.out.println("Год високосный: " + year);
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный: " + year);
        } else if (year % 4 == 0) {
            System.out.println("Год високосный: " + year);
        } else {
            System.out.println("Год не високосный: " + year);
        }


//          2) Задание 2. Калькулятор тарифов доставки

        int packageWeight = 60;
        String deliveryType = "Standard";
        String answerTemplate = "Стоимость доставки составит";


        switch (deliveryType) {
            case "Standard" -> {
                if (packageWeight <= 5) {
                    System.out.println(answerTemplate + " 5 €");
                } else if (packageWeight <= 20) {
                    System.out.println(answerTemplate + " 10 €");
                } else {
                    System.out.println(answerTemplate + " 20 €");
                }
            }
            case "Express" -> {
                if (packageWeight <= 5) {
                    System.out.println(answerTemplate + " 10 €");
                } else if (packageWeight <= 20) {
                    System.out.println(answerTemplate + " 20 €");
                } else {
                    System.out.println(answerTemplate + " 35 €");
                }
            }
            case "VIP" -> {
                System.out.println(answerTemplate + " 50 €");
            }
            default -> {
                System.out.println("Неизвестный тип доставки");
            }
        }


//            Задание 3.

        int number = 37294327;
        int oddNumbersAmount = 0;
        int evenNumbersAmount = 0;
        int sum = 0;

        while (number > 0) {
            int temporaryNumber = number % 10;
            if (temporaryNumber % 2 == 0) {
                evenNumbersAmount++;
            } else {
                oddNumbersAmount++;
            }
            number = number / 10;
            sum += temporaryNumber;
        }
        System.out.println("Количество чётных чисел: " + evenNumbersAmount);
        System.out.println("Количество нечётных чисел: " + oddNumbersAmount);
        System.out.println("Сумма всех чисел: " + sum);

    }
}