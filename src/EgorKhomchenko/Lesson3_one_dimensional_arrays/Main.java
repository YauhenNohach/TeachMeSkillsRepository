package EgorKhomchenko.Lesson3_one_dimensional_arrays;

public class Main {
    public static void main(String[] args) {

        //Homework 2
        //Task1
        System.out.println("Homework 2");
        System.out.println("Task1");

        int yearNum = 2003;

        if (yearNum % 4 == 0) {
            System.out.println("leap year");
        } else if (yearNum % 100 == 0) {
            System.out.println("not a leap year");
        } else if (yearNum % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }


        //Task2

        System.out.println("Task2");

        String deliveryType = "express";
        double packageWeight = 12.0;

        switch (deliveryType) {
            case "standard":
                if (packageWeight <= 5.0) {
                    System.out.println("For " + deliveryType + " delivery, tax is 5€.");
                } else if (packageWeight > 5.0 && packageWeight <= 20.0) {
                    System.out.println("For " + deliveryType + " delivery, tax is 10€.");
                } else {
                    System.out.println("For " + deliveryType + " delivery, tax is 20€.");
                }
                break;

            case "express":
                if (packageWeight <= 5.0) {
                    System.out.println("For " + deliveryType + " delivery, tax is 10€.");
                } else if (packageWeight > 5.0 && packageWeight <= 20.0) {
                    System.out.println("For " + deliveryType + " delivery, tax is 20€.");
                } else {
                    System.out.println("For " + deliveryType + " delivery, tax is 35€.");
                }
                break;

            case "vip":
                System.out.println("For " + deliveryType + " delivery, tax is 50€.");
                break;

            default:
                System.out.println("Unknown delivery type.");
        }


        //Task3

        System.out.println("Task3");

        int number = 1234567890;
        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;

        if (number == 0) {
            evenCount = 1;
        } else {
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                sum += digit;
                number /= 10;
            }
        }
        System.out.println("even " + evenCount);
        System.out.println("odd " + oddCount);
        System.out.println("sum " + sum);

        //Homework 3
        System.out.println("Homework 3");

        // Task1
        System.out.println("Task 1");

        int[] arrayNumbers = {-1, 0, 12, -5, 15};
        int sum1 = 0;
        int sum2 = 0;
        for (int x : arrayNumbers) {
            if (x > 10 && x % 2 == 0) {
                sum1 += x;
            }
            if (x <= 0) {
                sum2 += x;
            }

        }
        System.out.println("Согласно условию 1: " + sum1);
        System.out.println("Согласно условию 2: " + sum2);


        //Task2
        System.out.println("Task 2");

        int[] arrayNumfirst = {-1, 0, 12, -5, 15};
        int[] arrayNumsecond = new int[arrayNumfirst.length];
        for (int i = 0; i < arrayNumfirst.length; i++) {
            arrayNumsecond[i] = arrayNumfirst[i] < 0 ? -arrayNumfirst[i] : arrayNumfirst[i];
            System.out.println(arrayNumsecond[i]);
        }


        //Task3
        System.out.println("Task 3");

        int arr[] = {100, 22, 31, 47, 103, 110};
        int maxOne = arr[0];
        int maxTwo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxOne) {
                maxTwo = maxOne;
                maxOne = arr[i];
            } else if (arr[i] > maxTwo) {
                maxTwo = arr[i];
            }
        }
        System.out.println("Второе максимальное число: " + maxTwo);

    }
}
