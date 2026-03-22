package Lera_Grubrina.Lesson2And3;

import java.util.Arrays;
import java.util.Scanner;

public class LeraHomeWork2And3 {

    public static void main(String[] args) {
        task1();
        System.out.println("--------------------------------------------------");
        task2();
        System.out.println("--------------------------------------------------");
        task3();
        System.out.println("--------------------------------------------------");
        task4();
        System.out.println("--------------------------------------------------");
        task5();
        System.out.println("--------------------------------------------------");
        task6();
    }

    /**
     * 1) Определение високосного года
     * 🧠 Задание
     * <p>
     * Год високосный если:
     * делится на 4
     * НО
     * если делится на 100 — не високосный
     * НО
     * если делится на 400 — снова високосный
     */
    private static void task1() {
        System.out.print("Введите год: ");
        long year = new Scanner(System.in).nextLong();

        boolean leapYear = false;
        if (year % 4 == 0) leapYear = true;
        if (year % 100 == 0) leapYear = false;
        if (year % 400 == 0) leapYear = true;

        if (leapYear) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    /**
     * 2) 🧠 Задача: Калькулятор тарифов доставки
     * <p>
     * Есть:
     * тип доставки:
     * "standard"
     * "express"
     * "vip"
     * вес посылки (в кг)
     * <p>
     * Правила:
     * 📦 Standard
     * до 5 кг → 5 €
     * до 20 кг → 10 €
     * больше → 20 €
     * 🚀 Express
     * до 5 кг → 10 €
     * до 20 кг → 20 €
     * больше → 35 €
     * 👑 VIP
     * любой вес → 50 €
     * Если введён неизвестный тип — вывести "Неизвестный тип доставки".
     */
    private static void task2() {
        Scanner reader = new Scanner(System.in); // Эксемпляр класса сканер сохраняется в переменную типа ритер

        final String standardDeliveryType = "standard"; // Кконстанта типа стринг где standardDeliveryType = "standard"
        final String expressDeliveryType = "express"; // Константа типа стринг где expressDeliveryType = "express"
        final String vipDeliveryType = "vip"; // Константа типа стринг где vipDeliveryType = "vip"

        System.out.print("Введите тип доставки: "); // Вывод текста
        String deliveryType = reader.nextLine(); // Читаем следующую строку

        if (deliveryType.equals(standardDeliveryType) || deliveryType.equals(expressDeliveryType) || deliveryType.equals(vipDeliveryType)) { // Если deliveryType = standardDeliveryType или deliveryType = expressDeliveryType или deliveryType = vipDeliveryType
            System.out.print("Введите вес посылки (в кг): ");  // Команда позволяющая вывести текст на консоль "Введите вес посылки (в кг): "
            long parcelWeight = reader.nextLong(); // Эта строка читает следующую строку

            int shippingCost; // создается переменная shippingCost типа int
            switch (deliveryType) {
                case standardDeliveryType -> { // Сравнение переменных deliveryType и standardDeliveryType
                    if (parcelWeight < 5) shippingCost = 5; // Если переменная parcelWeight меньше 5, то цена за доставку 5
                    else if (parcelWeight < 20) shippingCost = 10; // Если переменная parcelWeight меньше 20, то цена за доставку 10
                    else shippingCost = 20; // Иначе стоимость доставки 20
                }
                case expressDeliveryType -> { // Сравнение переменных deliveryType и expressDeliveryType
                    if (parcelWeight < 5) shippingCost = 10; // Если переменная parcelWeight меньше 5, то цена за доставку 10
                    else if (parcelWeight < 20) shippingCost = 20; // Если переменная parcelWeight меньше 20, то цена за доставку 20
                    else shippingCost = 35; // Иначе стоимость доставки 35
                }
                case vipDeliveryType -> shippingCost = 50; // Если вип доставка, то цена 50
                default -> shippingCost = 999999999; // Блок не выполняется, но нужен чтобы программа не ругалась
            }

            System.out.println("Стоимость доставки: " + shippingCost + " €"); // Выводим на консоль текст стоимость доставки €
        } else {
            System.out.println("Неизвестный тип доставки"); // Выводим на консоль текст Неизвестный тип доставки
        }
    }

    /**
     * 3) 🧠 Задача
     * Дано число.
     * Нужно:
     * Определить, сколько в нём чётных цифр
     * Определить, сколько нечётных цифр
     * Найти сумму всех цифр
     * Использовать:
     * while
     * if
     */
    private static void task3() {
        System.out.print("Введите число: ");
        long number = new Scanner(System.in).nextLong();

        String numberAsString = String.valueOf(number);
        char[] digitsAsChars = numberAsString.toCharArray();
        int[] digits = new int[digitsAsChars.length];
        for (int index = 0; index < digits.length; index++) {
            digits[index] = digitsAsChars[index] - '0';
        }

        int numberOfEvenDigits = 0;
        int numberOfOddDigits = 0;
        int sumOfDigits = 0;

        int index = 0;
        while (index < digits.length) {
            int digit = digits[index];

            if (digit % 2 == 0) numberOfEvenDigits++;
            else numberOfOddDigits++;

            sumOfDigits = sumOfDigits + digit;

            index++;
        }

        System.out.println("Количество четных цифр: " + numberOfEvenDigits);
        System.out.println("Количество нечетных цифр: " + numberOfOddDigits);
        System.out.println("Сумма всех цифр: " + sumOfDigits);
    }

    /**
     * 4) Дан массив целых чисел.
     * Нужно:
     * a) Найти сумму элементов, которые:
     * больше 10 И чётные
     * б) Подсчитать количество элементов, которые:
     * отрицательные ИЛИ равны 0
     * Вывести оба результата.
     */
    private static void task4() {
        long[] elements = {123, 12, 56, 88, 0, -100, -200}; // Пусть будут такие элементы, без разницы.

        long sumOfElements = 0;
        int numberOfNegativeElements = 0;
        for (long element : elements) {
            if (element > 10 && element % 2 == 0) sumOfElements = sumOfElements + element;
            if (element <= 0) numberOfNegativeElements++;
        }

        System.out.println("Оригинальный массив: " + Arrays.toString(elements));
        System.out.println("Сумма элементов, которые больше 10 и четные: " + sumOfElements);
        System.out.println("Количество элементов, которые отрицательные или равны 0: " + numberOfNegativeElements);
    }

    /**
     * 5) Есть массив чисел. Создать новый массив без отрицательных чисел. Похожего задания мы не делали, но суть в том,
     * что нам нужно создать новый массив, такой же длины, и складывать в него положительные числа
     * (или может у вас будет свой варинат решения)
     */
    private static void task5() {
        long[] elements = {123, -1, 2, -3, 555}; // Пусть будут такие элементы, без разницы.
        Long[] positiveElements = new Long[elements.length];

        for (int index = 0; index < elements.length; index++) {
            long element = elements[index];

            if (element >= 0) positiveElements[index] = element;
        }

        System.out.println("Оригинальный массив: " + Arrays.toString(elements));
        System.out.println("Массив без отрицательных чисел: " + Arrays.toString(positiveElements));
    }

    /**
     * 6*) Найти второй максимальный элемент (когда-то такую задачу я решал на собесе, она не сложная,
     * но при этом не очевидная, особенно, когда ты видишь циклы и массивы во второй раз,
     * здесь не столь важно её решить, сколько посмотреть как вы размышляете)
     */
    private static void task6() {
        long[] elements = {123, 1, 2, 3, 555}; // Пусть будут такие элементы, без разницы.
        System.out.println("Элементы: " + Arrays.toString(elements));
        Arrays.sort(elements);
        System.out.println("Второй максимальный элемент: " + elements[elements.length - 2]);
    }

}



