package olga_konon.lesson1_variables;

public class Main {
    public static void main(String[] args) {

        // Lesson 1, Task 1
        int a = 5;
        int b = 10;
        int temp = a;

        a = b;
        b = temp;

        System.out.println("Task 1");
        System.out.println("New value a: " + a);
        System.out.println("New value b: " + b);

        // Task 2
        int a2 = 5;
        int b2 = 7;
        int c2 = 9;

        int sum = a2 + b2 + c2;
        int avg = sum / 3;

        System.out.println("\nTask 2");
        System.out.println("Average of a2, b2, c2: " + avg);


        // Task 3
        int age = 17;
        int salary = 1500;

        boolean isAdult = age >= 18;
        boolean isSalaryHigherThan1000 = salary > 1000;

        System.out.println("\nTask 3");
        System.out.println("Is the person of age " + age + " adult?: " + isAdult);
        System.out.println("Is salary " + salary + " more than 1000?: " + isSalaryHigherThan1000);


        // Task 4
        int seconds = 3672; // all seconds
        int hours = seconds / 3600; // hours
        int remainderOfHours = seconds % 3600; // reminder of hours in seconds
        int minutes = remainderOfHours / 60; // minutes
        int secs = remainderOfHours % 60; // seconds

        System.out.println("\nTask 4");
        System.out.println(seconds + " Second(s)" + " are: "
                + hours + " Hour(s), "
                + minutes + " Minute(s), "
                + secs + " Seconds");

    }
}
