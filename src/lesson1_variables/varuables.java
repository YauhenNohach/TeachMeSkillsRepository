package lesson1_variables;

public class varuables {
    public static void main(String[] args) {


        //1) Даны две переменные: a=5, b=10. Напишите программу, которая меняет значением a и b местами (a должно стать 10, b - 5)
        System.out.println("ПЕРВАЯ ЗАДАЧА:");
        int a = 5;
        int b = 10;
        int temp = a;

        a = b;
        b = temp;


        System.out.printf("a=%d%nb=%d%n", a, b);
        System.out.println();


        //2) Найти среднее арифметическое и вывести результат для следующих значений:
        System.out.println("ВТОРАЯ ЗАДАЧА:");

        int q = 5;
        int w = 7;
        int e = 9;

        int arithmeticMean = (q + w + e) / 3;

        System.out.println("Среднее арифметическое: " + arithmeticMean);
        System.out.println();


        //3) Создайте логические переменные (boolean): Совершеннолетний ли человек? Зарплата больше 1000?  Пример: boolean c = age < 20
        System.out.println("ТРЕТЬЯ ЗАДАЧА:");

        int age = 17;
        boolean isAdult = age >= 18;
        System.out.println("Is person adult? " + isAdult);

        double salary = 100.22;
        boolean isLowSalary = salary < 1000;
        System.out.println("Is low salary? " + isLowSalary);

        System.out.println();


        //4*) Дана переменная: int seconds = 3672. Переведите : Переведите секунды в: часы , минуты, оставшиеся секунды .Использовать только деление / и остаток %. всё выводим на консоль

        System.out.println("ЧЕТВЁРТАЯ ЗАДАЧА:");

        int seconds = 3672;


        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        int hours = seconds / 3600;
        System.out.println("В 3672 секунд помещается: " + hours + " час, " + minutes + " минута, " + remainingSeconds + " секунд.");


    }
}
