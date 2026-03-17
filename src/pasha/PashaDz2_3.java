import java.util.Arrays;

public class PashaDz2_3 {
    public static void main(String[] args) {
        dz2Task1();
        dz2Task2();
        dz2Task3();
        dz3Task1();
        dz3Task2();
        dz3Task3();
        dz3Task3_1();
    }

    public static void dz2Task1() {
        /*
         * Task 1, dz 2
         * Check if chosen year is a leap one.
         */

        int year = 2020;
        boolean ifLeap = year % 4 == 0 ? year % 100 == 0 ? year % 400 == 0 : true : false;
        System.out.println("\nTask 1, dz 2 \n" + "Is " + year + " a leap year? - " + ifLeap + "\n");
    }

    public static void dz2Task2() {
        //Task 2, dz 2
        // Delivery Fee Calculator
        // Inputs: Delivery type ("standard", "express", "vip") and weight in kg.
        // Rules:
        // - Standard: <= 5kg (5€), <= 20kg (10€), > 20kg (20€)
        // - Express:  <= 5kg (10€), <= 20kg (20€), > 20kg (35€)
        // - VIP:      Flat rate 50€ for any weight.
        // - Unknown:  Return "Unknown delivery type".
        String deliveryType = "VIP";
        double packageWeight = 0.1;

        System.out.println("Task 2, dz 2");
        if (packageWeight <= 0) {
            System.out.println("Incorrect weight. Closing the program.");
            System.exit(0);
        }

        switch (deliveryType.toLowerCase()) {
            case "standard" -> {
                if (packageWeight <= 5) {
                    System.out.println("For " + deliveryType + " delivery, fee is 5€.");
                } else if (packageWeight > 5 && packageWeight <= 20) {
                    System.out.println("For " + deliveryType + " delivery, fee is 10€.");
                } else {
                    System.out.println("For " + deliveryType + " delivery, fee is 20€.");
                }
            }
            case "express" -> {
                if (packageWeight <= 5) {
                    System.out.println("For " + deliveryType + " delivery, fee is 10€.");
                } else if (packageWeight > 5 && packageWeight <= 20) {
                    System.out.println("For " + deliveryType + " delivery, fee is 20€.");
                } else {
                    System.out.println("For " + deliveryType + " delivery, fee is 35€.");
                }
            }
            case "vip" -> {
                System.out.println("For " + deliveryType + " delivery, fee is 50€.");
            }
            default -> {
                System.out.println("Unknown package type.");
            }
        }
    }

    public static void dz2Task3() {
        // Task 3, dz 2
        // Number Digit Analyzer
        // Requirements:
        // 1. Count the number of even digits.
        // 2. Count the number of odd digits.
        // 3. Calculate the sum of all digits.
        // Constraints: Must use `while` loop and `if` statements.
        int number = 123456;
        int oddNumbersInNumber = 0;
        int evenNumbersInNumber = 0;
        int sum = 0;

        while (number > 0) {
            int newNumber = number % 10;
            if (newNumber % 2 == 0) {
                evenNumbersInNumber++;
            } else {
                oddNumbersInNumber++;
            }
            sum += newNumber;
            number /= 10;
        }

        System.out.println("\nTask 3, dz 2 " + "\nSum is " + sum + "\n" + "Odd numbers in number - " + oddNumbersInNumber + "\n" + "Even numbers in number - " + evenNumbersInNumber);
    }

    public static void dz3Task1() {
        // Task 1, dz 3
        // Array Filtering & Math
        // a) Calculate the sum of elements that are both > 10 AND even.
        // b) Count the number of elements that are <= 0 (negative or zero).
        int[] arrayForTask1 = {12, -5, 0, 15, 8, 20, -10, 7};
        int sum = 0;
        int negativeNumberCounter1 = 0;

        for (int number : arrayForTask1) {
            sum = number > 10 && number % 2 == 0 ? sum += number : sum;
            negativeNumberCounter1 = number <= 0 ? ++negativeNumberCounter1 : negativeNumberCounter1;

        }
        System.out.println("\nTask 1, dz 3" + "\nSum of numbers which are even and bigger than 10: " + sum + "\nCount of numbers less or equal to 0: " + negativeNumberCounter1);

    }

    public static void dz3Task2() {
        // Task 2, dz 3
        // Filter Negatives
        // - Create a new array containing only the non-negative numbers from the original array.
        int[] arrayForTask2 = {5, -3, 9, -1, 0, -8, 4, 12};
        int negativeNumberCounter2 = 0;

        for (int number : arrayForTask2) {
            negativeNumberCounter2 = number >= 0 ? ++negativeNumberCounter2 : negativeNumberCounter2;
        }
        int[] newArray = new int[negativeNumberCounter2];
        int counterForNewArray = 0;
        for (int number : arrayForTask2) {
            if (number >= 0) {
                newArray[counterForNewArray] = number;
                counterForNewArray++;
            }
        }
        System.out.println("\nTask 2, dz 3" + "\nOriginal array - " + Arrays.toString(arrayForTask2) + "\nNew array with only positive numbers - " + Arrays.toString(newArray));
    }


    public static void dz3Task3() {
        // Task 3, dz 3
        // Second Maximum
        // - Find the second-largest element in the array.
        int[] arrayForTask3 = {12, 32, 1, 10, 54, 1, 35, -5, 22, 34, 18, 60, 100};

        int biggestNumber = arrayForTask3[0];
        int secondBiggestNumber = arrayForTask3[0];

        for (int i = 1; i < arrayForTask3.length; i++) {
            int num = arrayForTask3[i];
            if (num > biggestNumber) {
                secondBiggestNumber = biggestNumber;
                biggestNumber = num;
            } else if (num < biggestNumber && (num > secondBiggestNumber || biggestNumber == secondBiggestNumber)) {
                secondBiggestNumber = num;
            }
        }

        System.out.println("\nTask 3, dz 3");
        System.out.println("Array is " + Arrays.toString(arrayForTask3));
        System.out.println("First biggest number is " + biggestNumber);
        System.out.println("Second biggest number is " + secondBiggestNumber);
    }

    public static void dz3Task3_1() {
        // Task 3_1, dz 3
        // Second Maximum
        // - Find the second-largest element in the array.
        int[] arrayForTask3 = {55, 12, 32, 1, 10, 54, 1, 35, -5, 22, 34, 18};
        int biggestNumber = -2147483648;
        int secondBiggestNumber = -2147483648;

        for (int num : arrayForTask3) {
            if (num > biggestNumber) {
                secondBiggestNumber = biggestNumber;
                biggestNumber = num;
            } else if (num > secondBiggestNumber && num != biggestNumber) {
                secondBiggestNumber = num;
            }
        }
        System.out.println("\nTask 3_1, dz 3 " + "\nArray is " + Arrays.toString(arrayForTask3) + "\nFirst biggest number is " + biggestNumber + "\nSecond biggest number is " + secondBiggestNumber);
    }
}
