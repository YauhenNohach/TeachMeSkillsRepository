package olga_konon.lesson2_control_flow_operators;

public class Main {
    public static void main(String[] args) {

        // Lesson 2, Task 1
        System.out.println("L2: Task 1");

        int year = 2143;

        if (year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }

        // Lesson 2, Task 2
        System.out.println("\nL2: Task 2");

        String type = "express"; //  "standard","express","vip"
        int weight = 4; // less than 5, less than 20, more than 20;
        int deliveryPrice = 0;

        switch (type) {
            case "standard":
                if (weight < 5) {
                    deliveryPrice = 5;
                } else if (weight < 20) {
                    deliveryPrice = 10;
                } else deliveryPrice = 20;
                break;

            case "express":
                if (weight < 5) {
                    deliveryPrice = 10;
                } else if (weight < 20) {
                    deliveryPrice = 20;
                } else deliveryPrice = 35;
                break;

            case "vip":
                deliveryPrice = 50;
                break;

            default:
                System.out.println("Unknown delivery type");
        }

        System.out.println("Delivery type is: " + type +
                "\nWeight is: " + weight + " kg" +
                "\nPrice is: " + deliveryPrice + " €");

        // Lesson 2, Task 3
        System.out.println("\nL2:Task 3");

        int number = 55556;
        int temp = number;
        int even = 0; //2==0
        int odd = 0; //2!=0
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // last digit of number
            if (digit % 2 == 0) {
                even++;

            } else if (digit % 2 != 0) {
                odd++;
            }
            sum = sum + digit; // sum of current + previous digit
            number = number / 10; // deleting current digit
        }

        System.out.println("The number " + temp + " has:"
                + "\nEven digits: " + even
                + "\nOdd digits: " + odd
                + "\nSum of all digits: " + sum);
    }
}
