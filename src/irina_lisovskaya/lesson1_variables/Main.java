package irina_lisovskaya.lesson1_variables;

public class Main {
    public static void main(String[] args) {
// 1.Даны две переменные: a=5, b=10. Напишите программу, которая меняет значением a и b местами (a должно стать 10, b - 5)
        int a = 5;
        int b = 10;
        int newValueA = b;
        int newValueB = a;
        System.out.println("Homework #1. " + "Replacing values: " + "a = " + newValueA + " and b = " + newValueB);

// 2. Найти среднее арифметическое и вывести результат для следующих значений: int a = 5; int b = 7; int c = 9;
        int a1 = 5;
        int b1 = 7;
        int c1 = 9;
        int divider = 3;
        int arifMean = (a1 + b1 + c1) / divider; // эту переменную можно убрать и формулу перенести в println - логичнее здеь было бы использовать double
        System.out.println("Homework #2. " + arifMean);

//3. Создайте логические переменные (boolean): Совершеннолетний ли человек?  Пример: boolean c = age < 20

        int age = 17;
        boolean underage = age < 18;
        boolean adult = age >= 18;
        System.out.println("Homework #3. " + "The user is of legal age: " + adult);

// Зарплата больше 1000?
        int salaryUser = 1010;
        boolean lessValueSalary = salaryUser < 1000;
        boolean moreValueSalary = salaryUser >= 1000;
        System.out.println("Homework #3. " + "The user's salary is above 1000: " + moreValueSalary);

// 4. Дана переменная: int seconds = 3672. Переведите секунды в: часы, минуты, оставшиеся секунды. Использовать только деление / и остаток %.

        int seconds = 3672;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainder = seconds % 60;
        System.out.println("Homework #3. " + "This value contains: " + hours + " hours " + minutes + " minutes " + remainder + " seconds");

    }

}
