package Pasha.dzFrom1To4;

import java.util.Arrays;

public class PashaDz3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task3_1();

    }

    public static void task1() {
        // Task 1: Array Filtering & Math
        // a) Calculate the sum of elements that are both > 10 AND even.
        // b) Count the number of elements that are <= 0 (negative or zero).
        int[] arrayForTask1 = {12, -5, 0, 15, 8, 20, -10, 7};
        int sum = 0;
        int negativeNumberCounter1 = 0;
        for (int number : arrayForTask1) {
            sum = number > 10 && number % 2 == 0 ? sum += number : sum;
            negativeNumberCounter1 = number <= 0 ? ++negativeNumberCounter1 : negativeNumberCounter1;

        }
        System.out.println("\nTask 1 " + "\nSum of numbers which are even and bigger than 10: " + sum + "\nCount of numbers less or equal to 0: " + negativeNumberCounter1);

    }

    public static void task2() {
        // Task 2: Filter Negatives
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
        System.out.println("\nTask 2" + "\nOriginal array - " + Arrays.toString(arrayForTask2) + "\nNew array with only positive numbers - " + Arrays.toString(newArray));
    }


    public static void task3() {
        // Task 3 (Bonus): Second Maximum
        // - Find the second-largest element in the array.
        int[] arrayForTask3 = {12, 32, 1, 10, 54, 1, 35, -5, 22, 34, 18};
        int biggestNumber = arrayForTask3[0];
        int biggestNumberPosition = 0;
        for (int i = 0; i < arrayForTask3.length; i++) {
            int num = arrayForTask3[i];
            if (num > biggestNumber) {
                biggestNumber = num;
                biggestNumberPosition = i;
            }
        }
        int secondBiggestNumber = arrayForTask3[0];
        for (int num : arrayForTask3) {
            if (num == arrayForTask3[biggestNumberPosition]) {
            } else if (num > secondBiggestNumber) {
                secondBiggestNumber = num;
            }
        }
        System.out.println("\nTask 3 " + "\nArray is " + Arrays.toString(arrayForTask3) + "\nFirst biggest number is " + biggestNumber + "\nSecond biggest number is " + secondBiggestNumber);
    }

    public static void task3_1() {
        // Task 3_1: Second Maximum
        // - Find the second-largest element in the array.
        int[] arrayForTask3 = {12, 32, 1, 10, 54, 1, 35, -5, 22, 34, 18, -2147483648};
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
        System.out.println("\nTask 3_1 " + "\nArray is " + Arrays.toString(arrayForTask3) + "\nFirst biggest number is " + biggestNumber + "\nSecond biggest number is " + secondBiggestNumber);
    }
}


