package yauhen_nohach.lesson2_control_flow_operators;

public class Main {
    public static void main(String[] args) {
        int year = 1900; // переменная для года

        if (year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " не високосный год");
        } else if (year % 4 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }

//        2) 🧠 Задача: Калькулятор тарифов доставки
//
//        Есть:
//        тип доставки:
//        "standard"
//        "express"
//        "vip"
//        вес посылки (в кг)
//
//        Правила:
//📦 Standard
//        до 5 кг → 5 €
//        до 20 кг → 10 €
//        больше → 20 €
//🚀 Express
//        до 5 кг → 10 €
//        до 20 кг → 20 €
//        больше → 35 €
//👑 VIP
//        любой вес → 50 €
//        Если введён неизвестный тип — вывести "Неизвестный тип доставки".


        double deliveryWeight = 112; // вес посылки
        double deliveryPrice = 0; // цена посылки
        var deliveryType = "vip"; // типа доставки

        if (deliveryWeight < 5 && deliveryType == "standard") {
            deliveryPrice = 5;
            System.out.println("Это посылка с типом доставки standard стоимостью евро " + deliveryPrice);
        } else if (deliveryWeight < 20 && deliveryType == "standard") {
            deliveryPrice = 10;
            System.out.println("Это посылка с типом доставки standard стоимостью евро " + deliveryPrice);
        } else if (deliveryWeight > 20 && deliveryType == "standard") {
            deliveryPrice = 20;
            System.out.println("Это посылка с типом доставки standard стоимостью евро " + deliveryPrice);
        } else if (deliveryWeight < 5 && deliveryType == "express") {
            deliveryPrice = 10;
            System.out.println("Это посылка с типом доставки express стоимостью евро " + deliveryPrice);
        } else if (deliveryWeight < 20 && deliveryPrice == 20) {
            deliveryPrice = 20;
            System.out.println("Это посылка с типом доставки express стоимостью евро " + deliveryPrice);
        } else if (deliveryWeight > 20 && deliveryType == "express") {
            deliveryPrice = 35;
            System.out.println("Это посылка с типом доставки express стоимостью евро " + deliveryPrice);
        } else if (deliveryWeight > 1 && deliveryType == "vip") {
            deliveryPrice = 50;
            System.out.println("Это посылка с типом доставки vip стоимостью евро " + deliveryPrice);
        } else {
            System.out.println("Неизвестный тип доставки");
        }
        //3) 🧠 Задача
//    Дано число.
//    Нужно:
//    Определить, сколько в нём чётных цифр
//    Определить, сколько нечётных цифр
//    Найти сумму всех цифр
//    Использовать:
//            while
//            if
        int number = 34235; //начальное значение
        int temp = number; // рабочая копия
        int even = 0; //четные числа
        int odd = 0; //нечетне числа
        int sum = 0; //сумма чисел

        if (temp == 0) {
            even = 1;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                if (digit % 2 == 0) even++;
                else odd++;
                temp /= 10;
            }
        }

        System.out.println("  Чётные: " + even);
        System.out.println("  Нечётные: " + odd);
        System.out.println("  Сумма: " + sum);

        //  1) Дан массив целых чисел.
//        Нужно:
//        a) Найти сумму элементов, которые:
//        больше 10 И чётные
//        б) Подсчитать количество элементов, которые:
//        отрицательные ИЛИ равны 0
//        Вывести оба результата.

        int[] arr = {2, 24, 8, 29, 12, 0, -1, -3}; // изначальный массив
        int summa = 0; // изначальная сумма
        int count = 0; // счетчик элементов
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10 && arr[i] % 2 == 0) {
                summa += arr[i];
            }
        }
        System.out.println("Сумма элементов " + summa);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Количество элементов " + count);

//        2) Есть массив чисел. Создать новый массив без отрицательных чисел.
//
        int[] arr2 = {2, 24, 8, 29, 12, 0, -1, -3, -45}; // изначальный массив
        int index = 0;  // счетчик для негативных чисел
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 0) {
                index++;
            }
        }
        System.out.println("negative numbers index " + index);

        int[] arr3 = new int[arr2.length - index];
        int j = 0; //счетчик для перебора
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] >= 0) {
                arr3[j] = arr2[i];
                j++;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

//        3*) Найти второй максимальный элемент
//        (когда-то такую задачу я решал на собесе, она не сложная, но при этом не очевидная, особенно, когда ты видишь
//        циклы и массивы во второй раз, здесь не столь важно её решить, сколько посмотреть как вы размышляете)

        int[] arr5 = {2, 24, 8, 29, 12, 0, -1, -3};

        for (int i = 0; i < arr5.length - 1; i++) {

            for (int h = 0; h < arr5.length - 1 - i; h++) {

                if (arr5[h] < arr5[h + 1]) {

                    int tem = arr5[h];
                    arr5[h] = arr5[h + 1];
                    arr5[h + 1] = tem;
                }
            }
        }
        System.out.print(arr5[1]);
    }
}
