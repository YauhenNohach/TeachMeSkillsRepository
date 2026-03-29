package Lera_Grubrina.Lesson1;

public class LeraHomeWork {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    private static void task1() {
        // 1. Даны две переменные: a=5, b=10. Напишите программу, которая меняет значением a и b местами (a должно стать 10, b - 5)
        int a = 5;
        int b = 10;
        System.out.println("a = " + a + ", " + "b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", " + "b = " + b);
    }

    private static void task2() {
        // 2. Найти среднее арифметическое и вывести результат для следующих значений:
        int a1 = 5;
        int a2 = 7;
        int a3 = 9;
        double foldAll = (a1 + a2 + a3) / 3.0;
        System.out.println(foldAll);
    }

    private static void task3() {
        //Создайте логические переменные (boolean): Совершеннолетний ли человек? Зарплата больше 1000? Пример: boolean c = age < 20
        int age = 18;
        int salary = 1200;
        boolean isAdult = age >= 18;
        boolean isHighSalary = salary > 1000;
        System.out.println("Совершеннолетний: " + isAdult);
        System.out.println("Зарплата больше 1000: " + isHighSalary);
    }

    private static void task4() {
        //Дана переменная: int seconds = 3672. Переведите :
        //Переведите секунды в:
        //часы
        //минуты
        //оставшиеся секунды
        //Использовать только деление / и остаток %.
        int seconds = 3672;
        int hours = seconds / 3600;
        int minutes = seconds % 3600 /60;
        int secondsLeft = seconds % 60;
        System.out.println("Часы " + hours);
        System.out.println("Минуты " + minutes);
        System.out.println ("Оставшиеся секунды " + secondsLeft);
    }
}
