package yauhen_nohach.lesson1_variables;

public class Main {
    public static void main(String[] args) {
        System.out.println("ready home work");

// Задание 1
        int a = 5;
        int b = 10;
        int c = a;
        a=b;
        b=c;
        System.out.println( "a" + a + " " + "b" + b);

// Задание 2
        int a1 = 5;
        int b1 = 7;
        int c1 = 9;
        int d1 = 3;
        int countAll = (a1 + b1 + c1) / d1;
        System.out.println( countAll);
// Или
        int a2 = 5;
        int b2 = 7;
        int c2 = 9;

        double countAll1 = (a2 + b2 + c2) / 3;
        System.out.println( countAll);
        // Задание 3

        int age = 25;
        int salary = 1500;
        boolean isAdultAge = age >= 18;
        boolean isSalaryMore = salary >= 1000;
        System.out.println("Возраст больше или равен 18ти лет " + isAdultAge);
        System.out.println("Зарплата больше или равна 1000 " + isSalaryMore);

        // Задание 4
        int seconds = 3672;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) /60;
        int remainSeconds = seconds % 60;
        System.out.println("Время в часах " + hours);
        System.out.println("Время в минутах " + minutes);
        System.out.println("Остаток времени в секундах " + remainSeconds);
        System.out.println("Итого: hh:mm:ss " + hours + ":" + minutes + ":" + remainSeconds);
    }
}
