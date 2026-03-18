package yanina_savich.lesson1_variables;

public class Main {
    public static void main(String[] args) {
        System.out.println("----1----");
        int a = 5;
        int b = 10;
        int changed = a;
        a = b;
        b = changed;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("----2----");
        a = 5;
        b = 7;
        int c = 9;
        int average = (a + b + c) / 3;
        System.out.println("Среднее арифметическое = " + average);
        System.out.println("----3----");
        int age = 18;
        boolean isAdult = age >= 18;
        System.out.println("Совершеннолетний? -> " + isAdult);
        int salary = 1100;
        boolean isSalaryHigh = salary > 1000;
        System.out.println("Зарплата больше 1000? -> " + isSalaryHigh);
        System.out.println("----4----");
        int seconds = 3672;
        // часы
        int hours = seconds / 3600;
        int remainSeconds = seconds % 3600;
        int minutes = remainSeconds / 60;
        int leftSeconds = remainSeconds % 60;
        System.out.println(seconds + " seconds = " + hours + " h " + minutes + " min " + leftSeconds + " sec");
    }
}
