package EgorKhomchenko.Lesson2_control_flow_operators;

public class Main {
    public static void main(String[] args) {


        //Task1

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
    }
}