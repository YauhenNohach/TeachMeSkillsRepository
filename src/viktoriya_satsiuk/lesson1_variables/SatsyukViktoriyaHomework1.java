package viktoriya_satsiuk.lesson1_variables;

public class SatsyukViktoriyaHomework1 {
    public static void main(String[] args) {

//        1) Даны две переменные: a=5, b=10. Напишите программу, которая меняет значением a и b местами (a должно стать 10, b - 5)
        int a = 5;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Task 1. a = " + a + " and b = " + b);

//        2) Найти среднее арифметическое и вывести результат для следующих значений

        int c = 5;
        int d = 7;
        int e = 9;
        double numbersAverage = (c + d + e) / 3.0;
        System.out.println("Task 2. The arithmetic mean is equal to " + numbersAverage);

//        3) Создайте логические переменные (boolean): Совершеннолетний ли человек? Зарплата больше 1000?

        int age = 20;
        int ageOfMajority = 18;
        boolean isAdult = age >= ageOfMajority;
        System.out.println("Task 3.1. A person is adult: " + isAdult);

        double personSalary = 500;
        int comparedSalary = 1000;
        boolean isSalaryMoreThan1000 = personSalary > comparedSalary;
        System.out.println("Task 3.2. A person is making more than 1000: " + isSalaryMoreThan1000);


//        4*) Дана переменная: int seconds = 3672. Переведите :
//        Переведите секунды в:
//        часы
//        минуты
//        оставшиеся секунды
//        Использовать только деление / и остаток %.
//        всё выводим на консоль

        int seconds = 3672;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondsLeft = seconds % 60;
        System.out.println("Task 4. In " + seconds + " second(s): " + hours + " hour(s), " + minutes + " minute(s), " + secondsLeft + " second(s) left");

    }
}
