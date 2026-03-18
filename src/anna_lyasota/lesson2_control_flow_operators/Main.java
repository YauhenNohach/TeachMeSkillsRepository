package anna_lyasota.lesson2_control_flow_operators;

public class Main {public static void main(String[] args) {
//task 1
    int year = 1999;

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        System.out.println("Високосный год");
    } else {
        System.out.println("Не високосный год");
    }


    {
//task 2
        String deliveryType = "vip";
        int parcelWeight = 5; //kg


        switch (deliveryType) {

            case "standard" -> {
                if (parcelWeight <= 5) {
                    System.out.println("Delivery cost €5");
                } else if (parcelWeight <= 20) {
                    System.out.println("Delivery cost €10");
                } else {
                    System.out.println("Delivery cost €20");
                }
            }

            case "express" -> {
                if (parcelWeight <= 5) {
                    System.out.println("Delivery cost €10");
                } else if (parcelWeight <= 20) {
                    System.out.println("Delivery cost €20");
                } else {
                    System.out.println("Delivery cost €35");
                }
            }

            case "vip" -> System.out.println("Delivery cost €50");

            default -> System.out.println("Unknown delivery type");
        }

    }

    {
//task 3

        int number3 = 546723;

        int evenNumber = 0;
        int oddNumber = 0;
        int sum3 = 0;

        int temp = number3;

        while (temp != 0) {
            int tempTwo = temp % 10;
            sum3 += tempTwo;

            if (tempTwo % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }

            temp /= 10;
        }

        System.out.println("Четные: " + evenNumber);
        System.out.println("Нечетные: " + oddNumber);
        System.out.println("Сумма: " + sum3);

    }


}
}
