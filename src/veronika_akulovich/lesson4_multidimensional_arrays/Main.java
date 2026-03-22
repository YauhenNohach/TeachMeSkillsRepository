package veronika_akulovich.lesson4_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // МНОГОМЕРНЫЕ МАССИВЫ
// Задание 1
        int [][] arrayInit = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите ваше число ");
        int newNumber = scanner.nextInt();

        for (int i = 0; i < arrayInit.length; i++) {
            for (int j = 0; j <arrayInit.length; j++) {
                arrayInit[i][j] +=newNumber;
            }
        }
        System.out.println(Arrays.deepToString(arrayInit));

        // Задание 2

        String [][] arrayDesc = new String[8][8];

        for (int i = 0; i < arrayDesc.length; i++) {
            for (int j = 0; j < arrayDesc.length; j++) {
                if ( (i + j) % 2 == 0) {
                    arrayDesc[i][j] = "W";
                }
                else {
                    arrayDesc[i][j] = "B";
                }

            }

        }
        System.out.println(Arrays.deepToString(arrayDesc));

        // Задание 3
        int [][] arrayMatrix = {
                {1, 2, 4},
                {4, 5, 6},
                {7, 8, 9}
        };
        int arraySum = 0;
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix.length; j++) {
                arraySum += arrayMatrix[i][j];

            }

        }
        System.out.println(arraySum);
    }
}
