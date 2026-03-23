package Pasha;

public class PashaDz2 {
    public static void main(String[] args) {
        //Task 1
        // Check if chosen year is a leap one.
        int year = 2020;
        boolean ifLeap = year % 4 == 0 ? year % 100 == 0 ? year % 400 == 0 : true : false;
        System.out.println("\nTask 1 \n" + "Is " + year + " a leap year? - " + ifLeap + "\n");


        //Task 2
        // Delivery Fee Calculator
        // Inputs: Delivery type ("standard", "express", "vip") and weight in kg.
        // Rules:
        // - Standard: <= 5kg (5€), <= 20kg (10€), > 20kg (20€)
        // - Express:  <= 5kg (10€), <= 20kg (20€), > 20kg (35€)
        // - VIP:      Flat rate 50€ for any weight.
        // - Unknown:  Return "Unknown delivery type".
        String deliveryType = "VIP";
        double packageWeight = 0.1;

        System.out.println("Task 2");
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
}
