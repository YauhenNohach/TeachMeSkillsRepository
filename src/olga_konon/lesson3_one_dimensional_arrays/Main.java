package olga_konon.lesson3_one_dimensional_arrays;

public class Main {
    public static void main(String[] args) {

        // LESSON 3,  Task 1
        System.out.println("\nL3: Task 1");

        int[] numbers = {10, 31, 32, 40, -1, 0, 33, -10};
        int sum2 = 0; // task a
        int amount = 0; // task b

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > 10) {
                sum2 = sum2 + numbers[i];
            }
            if (numbers[i] <= 0) {
                amount++;
            }
        }
        // short hand if else and for-each" loop
       /* for (int number : numbers) {
            sum = number % 2 == 0 && number > 10 ? sum = +number : sum;
            amount = number <= 0 ? ++amount : amount;
        }*/
        System.out.println("Sum of EVEN and higher than 10 numbers is: " + sum2);
        System.out.println("Amount of non-positive numbers is: " + amount);

        // LESSON 3,  Task 2
        System.out.println("\nL3: Task 2");

        //  int[] numbers = {10, 31, 32, 40, -1, 0, 33, -10};
        // identifying length of array --> amount of non-negative values
        int arrayLength = 0;
        for (int array2 : numbers) {
            if (array2 >= 0) {
                arrayLength++;
            }
        }
        // creating array with length above
        int[] positives = new int[arrayLength];

        // filling in array
        System.out.println("Amount of elements of non negative array: " + arrayLength);
        int j = 0;
        for (int number3 : numbers) {
            if (number3 >= 0) {
                positives[j] = number3;
                System.out.println("Value with index " + j + ": " + positives[j]);
                j++;
            }
        }

        // Lesson 3, Task 3
        System.out.println("\nL3: Task 3");

        // int[] numbers = {10, 31, 32, 40, -1, 0, 33, -10};
        int firstMax = numbers[0];
        int secondMax = numbers[1];

        for (int number2 : numbers) {
            if (number2 > firstMax) {
                secondMax = firstMax;
                firstMax = number2;
            } else if (number2 < firstMax && number2 >= secondMax) {
                secondMax = number2;
            }
        }
        System.out.println("First max value of array: " + firstMax);
        System.out.println("Second max value of array: " + secondMax);
    }
}
