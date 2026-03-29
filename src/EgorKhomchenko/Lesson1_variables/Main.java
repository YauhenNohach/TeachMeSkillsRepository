package EgorKhomchenko.Lesson1_variables;

public class Main {
    public static void main(String[] args) {


// Задание №1

        int a = 5;
        int b = 10;
        int tmp;  // введение временной переменной

        tmp = a;
        a = b;
        b = tmp;

        System.out.println(a);
        System.out.println(b);

// Задание №2

        int c = 5;
        int d = 7;
        int e = 9;

        int f = (c + d + e) / 3;

        System.out.println("Среднее арифметическое " + f);

        //Задание №3

        int ageOld = 18;
        int ageYoung = 16;

        boolean ageNotAdult = ageYoung < 18;
        boolean ageAdult = ageOld >= 18;

        System.out.println(ageNotAdult);
        System.out.println(ageAdult);

        int salary=500;
        boolean isHighSalary = salary>1000;
        System.out.println("Зарплата выше? "+ isHighSalary);

        //Задание №4

        int seconds = 3672;

        int hour = seconds / 3600;

        int minutes = seconds / 60;

        int remainingSeconds = seconds % 60;
        System.out.println("Hour " + hour);
        System.out.println("Minutes " + minutes);
        System.out.println("Seconds remaining " + remainingSeconds);




    }
}
