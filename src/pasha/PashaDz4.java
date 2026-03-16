import java.util.Arrays;
import java.util.Scanner;

public class PashaDz4 {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task0() {
        System.out.println("\nTask 0" +
                "\nAdd input number to every number in each array.");
        int[][][] array = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number by which shall each number be updated: ");
        int number = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void task1() {
        System.out.println("\nTask 1 " +
                "\nCreate a chess board using loops");

        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j + i) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
            for (String c : array[i]) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void task2() {
        System.out.println("\nTask 2" +
                "\nMultiply 2 matrix between each other.");
        int[][] array1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        //test asdf
        int[][] array2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        int[][] result = new int[3][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[i].length; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print(" ");
        }
    }


    public static void task3() {
        System.out.println();
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("\nTask 3" +
                "\nFind sum of all numbers in 2D array.");
        System.out.println(sum);
    }


    public static void task4() {
        System.out.println("\nTask 4" +
                "\nPrint primary and secondary diagonals.");

        int[][] array = {
                {1, 3, 6, 7},
                {1, 5, 7, 9},
                {1, 5, 7, 9},
                {1, 6, 7, 9}
        };
        System.out.println("Primary diagonal is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println("\nSecondary diagonal is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array[i].length - 1 - i] + " ");
        }
    }

    public static void task5() {
        int[][] array = {
                {5, 1, 2, 7},
                {7, 2, 10, 9},
                {8, 1, 4, 2},
                {1, 11, 5, 9}
        };

        System.out.println("\n");
        System.out.println("Task 5" +
                "\nSort elements in 2d array");
        //test
        // Easy solution
        //        for (int[] ints : array) {
        //            Arrays.sort(ints);
        //        }
        //        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = j + 1; k < array[i].length; k++) {
                    if (array[i][j] > array[i][k]) {
                        int number = array[i][j]; // 5
                        array[i][j] = array[i][k]; // 5 -> 1
                        array[i][k] = number; // 1 -> 5
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
