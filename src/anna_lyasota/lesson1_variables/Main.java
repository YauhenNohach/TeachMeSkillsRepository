package anna_lyasota.lesson1_variables;

public class Main {public static void main(String[] args) {
    //task 1
    int a=5;
    int b=10;

    int replaced = a;
    a = b;
    b = replaced;

    System.out.println("a = " + a + ";" + " b = " + b);



    //task 2
    int a2 = 5;
    int b2 = 7;
    int c2 = 9;

    double mean = (a2+b2+c2)/3.0;

    System.out.println("Arithmetic mean = " + mean);



    //task 3
    int age = 30;
    int salary = 2500;

    boolean isMajor = age >= 18;
    boolean isHighSalary = salary > 1000;

    System.out.println("Major: " + isMajor);
    System.out.println("Salary is more than 1000: " + isHighSalary);



    //task 4
    int seconds = 3672;
    int hours = seconds/3600;
    int remainingMinutes = seconds%3600;
    int minutes = remainingMinutes/60;
    int remainingSeconds = remainingMinutes%60;

    System.out.println("Time: " + hours + ":" + minutes + ":" + remainingSeconds);
}
}
