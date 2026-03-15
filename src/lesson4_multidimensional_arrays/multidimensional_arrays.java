package lesson4_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_arrays {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 0: ");
        System.out.println("Введите число, на которое будет увеличен каждый элемент массива ");

        Scanner input = new Scanner(System.in);

        while (!input.hasNextInt()) {
            System.out.println("Введите число больше нуля ");
            input.next();
        }

        int usersNumber = input.nextInt();

        if (usersNumber <= 0) {
            System.out.println("Неверное значение");
            return;
        }

        int[][][] firstArray = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                },
        };

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                for (int k = 0; k < firstArray[i][j].length; k++) {
                    firstArray[i][j][k] += usersNumber;

                }
            }
        }
        System.out.println(Arrays.deepToString(firstArray));


        System.out.println();
        System.out.println("ЗАДАЧА 1: ");

        String[][] secondArray = new String[8][8];

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        secondArray[i][j] = "B";
                    } else {
                        secondArray[i][j] = "W";
                    }
                } else {
                    if (j % 2 == 0) {
                        secondArray[i][j] = "W";
                    } else {
                        secondArray[i][j] = "B";
                    }
                }
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("ЗАДАЧА 2: ");

        int[][] thirdArray = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int[][] fourthArray = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0}
        };

        int[][] finalArray = new int[3][3];

        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = 0; j < fourthArray[0].length; j++) {
                for (int k = 0; k < fourthArray.length; k++) {
                    finalArray[i][j] += thirdArray[i][k] * fourthArray[k][j];
                }
            }
        }

        for (int i = 0; i < finalArray.length; i++) {
            for (int j = 0; j < finalArray[i].length; j++) {
                System.out.print(finalArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("ЗАДАЧА 3: ");

        int[][] fifthArray = {
                {2, 3, 11},
                {12, 15, 18},
                {0, 5, 1}
        };

        int sum = 0;
        for (int i = 0; i < fifthArray.length; i++) {
            for (int j = 0; j < fifthArray[i].length; j++) {
                sum+=fifthArray[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива = " + sum);

        System.out.println();
        System.out.println("ЗАДАЧА 4: ");

        int[][] sixthArray = {
                {11, 13, 22},
                {12, 99, 18},
                {22, 55, 11}
        };

        System.out.println("Первая диагональ: ");
        for (int i = 0; i < sixthArray.length; i++) {
            for (int j = 0; j < sixthArray[i].length; j++) {
                if (i==j){
                    System.out.println(sixthArray[i][i]);
                }
            }
        }
        System.out.println("Вторая диагональ: ");
        for (int i = 0; i < sixthArray.length; i++) {
            for (int j = 0; j < sixthArray[i].length; j++) {
                if (i==j){
                    System.out.println(sixthArray[i][sixthArray.length - 1 - i] );
                }
            }
        }

        System.out.println();
        System.out.println("ЗАДАЧА 5: ");

        int[][] eighthArray = {
                {6, 4, 2},
                {3, 7, 1},
                {4, 0, 0}
        };

        for (int i = 0; i < eighthArray.length; i++) {
            Arrays.sort(eighthArray[i]);
        }

        for (int i = 0; i < eighthArray.length; i++) {
            for (int j = 0; j < eighthArray[i].length; j++) {
                System.out.print(eighthArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
