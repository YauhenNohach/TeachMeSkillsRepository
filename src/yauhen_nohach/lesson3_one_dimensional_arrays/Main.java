package yauhen_nohach.lesson3_one_dimensional_arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("ready home work");

        //Задача 1
        int[] arr = new int[]{-6, 10, 20, 45, -8, 18};
        int evenSum = 0;
        int negativeCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= 10) {
                evenSum = evenSum + arr[i];

            }
            if (arr[i] < 0) {
                negativeCount++;

            }
        }
        System.out.println("Cумма всех четных цифр, которые больше 10: " + evenSum);
        System.out.println("Количество всех отрицательных цифр: " + negativeCount);

// Задача 2
        int[] arr2 = new int[]{-6, 10, 20, 45, -8, 18};
        int[] arr3 = new int[arr2.length];
        int temporaryValue = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 0) {
                arr3[temporaryValue] = arr2[i];
                temporaryValue++;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Массив только положительных чисел " + arr3[i]);
        }

        //Задача 3
        int[] arr4 = new int[]{6, 10, 20, 45, 8, 11};
        int maxValue = 0;
        int secondMaxValue = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > maxValue) {
                maxValue = arr4[i];

            }
//            else if (arr4[i] > secondMaxValue && arr4[i] != maxValue) {
//                secondMaxValue = arr4[i];
//            }    Почему это условие не сработало????? :(
        }
        for (int i = 0; i < arr4.length; i++)
            if (arr4[i] > secondMaxValue && arr4[i] != maxValue) {
                secondMaxValue = arr4[i];
            }
        System.out.println("Самое большое число " + maxValue);
        System.out.println("Второе по величине число " + secondMaxValue);

    }
}
