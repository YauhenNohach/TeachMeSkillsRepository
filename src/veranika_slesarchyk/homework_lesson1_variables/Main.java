package veranika_slesarchyk.homework_lesson1_variables;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
//  1) Даны две переменные: a=5, b=10. Напишите программу, которая меняет значением a и b местами (a должно стать 10, b - 5)
        int a = 5;
        int b = 10;
        int c = a;
        a = b;
        b = c;
        System.out.println("New a = " + a);
        System.out.println("New b = " + b);
    }

    public static void task2() {
//        2) Найти среднее арифметическое и вывести результат для следующих значений:
        int a = 5;
        int b = 7;
        int c = 9;
        double average = (a + b + c) / 3.0;
        System.out.println("Среднее арифметическое: " + average);
    }

    public static void task3() {
//        3) Создайте логические переменные (boolean): Совершеннолетний ли человек? Зарплата больше 1000?
//                Пример: boolean c = age < 20

        int age = 19;
        int salary = 1000;
        boolean isAdult = age >= 18;
        boolean isSalaryHigh = salary > 1000;
        System.out.println("Совершеннолетний: " + isAdult);
        System.out.println("Зарплата больше 1000: " + isSalaryHigh);
    }

    public static void task4() {
//        4*) Дана переменная: int seconds = 3672. Переведите :
//        Переведите секунды в:
//        часы
//        минуты
//        оставшиеся секунды
//        Использовать только деление / и остаток %.
//        всё выводим на консоль

        int seconds = 3672;
        int hours = seconds / 3600;
        int remainder = seconds % 3600;
        int minutes = remainder / 60;
        int remainderSeconds = remainder % 60;
        System.out.println("Часы: " + hours);
        System.out.println("Минуты: " + minutes);
        System.out.println("Секунды: " + remainderSeconds);

    }
}

