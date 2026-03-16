package viktoriya_satsiuk.lesson4_multidimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SatsyukViktoriyaHomework4 {
    public static void main(String[] args) {
        // Первое задание. Создать трёхмерный массив целых чисел. С помощью цикла увеличить каждый элемент массива на число,
        // указанное из консоли
        int[][][] firstTaskArray =
                {{{7, 2, -23},
                        {162, 245, 62},
                        {0, -164, 3}}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Первое задание");
        System.out.println("Введите число для увеличения значений массива: ");
        int num = sc.nextInt();
        System.out.println("Массив до изменения: " + Arrays.deepToString(firstTaskArray));

        for (int i = 0; i < firstTaskArray.length; i++) {
            for (int j = 0; j < firstTaskArray[i].length; j++) {
                for (int k = 0; k < firstTaskArray[i][j].length; k++) {
                    firstTaskArray[i][j][k] += num;
                }
            }
        }
        System.out.println("Массив после изменения: " + Arrays.deepToString(firstTaskArray));

        // Второе задание. Шахматная доска

        String[][] secondTaskArray = new String[8][8];
        System.out.println("Второе задание");

        for (int i = 0; i < secondTaskArray.length; i++) {
            for (int j = 0; j < secondTaskArray[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    secondTaskArray[i][j] = "W";
                } else {
                    secondTaskArray[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < secondTaskArray.length; i++) {
            for (int j = 0; j < secondTaskArray[i].length; j++) {
                System.out.print(secondTaskArray[i][j] + "\t");
            }
            System.out.println();
        }

        // Третье задание. Умножение двух матриц

        System.out.println("Третье задание");
        int[][] firstArray = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};
        int[][] secondArray = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        int[][] resultArray = new int[3][3];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < secondArray.length; k++) {
                    sum += firstArray[i][k] * secondArray[k][j];
                    resultArray[i][j] = sum;
                }
            }
        }
        System.out.println("Сумма умножения массивов" + Arrays.deepToString(resultArray));

        // Четвертое задание. Сумма всех элементов массива

        System.out.println("Четвертое задание");
        int[][] fourthTaskArray = {
                {1, 44, -24, 35},
                {73, 62, 7, 0}
        };
        int sum = 0;

        //Сделала через обычный for
        for (int i = 0; i < fourthTaskArray.length; i++) {
            for (int j = 0; j < fourthTaskArray[i].length; j++) {
                sum += fourthTaskArray[i][j];
            }
        }
        System.out.println("Через обычный for: " + sum);

        // Попробовала for each
        sum = 0;
        for (int[] row : fourthTaskArray) {
            for (int number : row) {
                sum += number;
            }
        }
        System.out.println("Через for each: " + sum);

        // Пятое задание. Диагонали массива

        System.out.println("Пятое задание");
        int[][] fifthTaskArray = {
                {2, 3, 6, 8},
                {3, 5, 7, 9},
                {4, 5, 7, 9},
                {5, 6, 7, 9}
        };

        sum = 0;

        for (int i = 0; i < fifthTaskArray.length; i++) {
            sum += fifthTaskArray[i][i];
        }

        System.out.println("Сумма элементов основной диагонали: " + sum);

        sum = 0;
        for (int i = 0; i < fifthTaskArray.length; i++) {
            sum += fifthTaskArray[i][(fifthTaskArray.length - 1) - i];
        }
        System.out.println("Сумма элементов побочной диагонали: " + sum);

        // Шестое задание. Сортировка массива
        int[][] sixthTaskArray = {
                {52, 0, -13, 135},
                {6, -112, 26, 62}
        };

        System.out.println("Шестое задание");

        System.out.println("Исходный массив" + Arrays.deepToString(sixthTaskArray));

        int[] flatArray = Arrays.stream(sixthTaskArray)
                .flatMapToInt(Arrays::stream)
                .toArray();

        Arrays.sort(flatArray);

        int index = 0;
        for (int i = 0; i < sixthTaskArray.length; i++) {
            for (int j = 0; j < sixthTaskArray[i].length; j++) {
                sixthTaskArray[i][j] = flatArray[index++];
            }
        }
        System.out.println("Массив после сортировки: " + Arrays.deepToString(sixthTaskArray));
    }
}


