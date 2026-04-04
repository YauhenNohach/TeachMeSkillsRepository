package Pasha.dzFrom1To4;

public class PashaDz1 {
    public static void main(String[] arg) {
        // Task 1
        int a1 = 5;
        int b1 = 10;
        int c1 = 0;


        c1 = a1;
        a1 = b1;
        b1 = c1;
        System.out.println("\nTask 1:");
        System.out.println("a is - " + a1 +
                "\nb is - " + b1);
        System.out.println("a is now - " + a1 + "\n" +
                "b is now - " + b1);


        // Task 2
        int a2 = 6;
        int b2 = 7;
        int c2 = 9;
        System.out.println("\nTask 2");
        double averageValue = (a2 + b2 + c2);
        System.out.println("Average value is " + averageValue / 3);

        // Task 3
        int age = 18;
        int salary = 1000;

        boolean isAdult = age >= 18;
        boolean salaryHigherThan1000 = salary > 1000;
        System.out.println("\nTask 3");
        System.out.println("Is adult - " + isAdult + "\n"
                + "Salary higher than 1000 - " + salaryHigherThan1000);

        // Task 4
        int seconds = 3672;
        int inHours = (seconds / 60) / 60;
        int inMinutes = seconds / 60;
        int leftSeconds = 3672 % 60;
        System.out.println("\nTask 4");
        System.out.println("Minutes in given seconds - " + inMinutes +
                "\nHours in given seconds - " + inHours +
                "\nSeconds left - " + leftSeconds);

    }
}
