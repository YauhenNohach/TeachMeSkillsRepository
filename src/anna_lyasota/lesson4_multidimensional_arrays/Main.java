package anna_lyasota.lesson4_multidimensional_arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    static void task1() {

        int[][][] a = {{{1, 1}, {3, 3}}, {{2, 2}, {4, 4}}};

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                for (int g = 0; g < a[i][j].length; g++)
                    System.out.println("Новый массив " + (a[i][j][g] + n) + " ");
        System.out.println("---------------------");
    }


    static void task2() {

        String[][] board = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if ((i + j) % 2 == 0)
                    board[i][j] = "W";
                else
                    board[i][j] = "B";

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}


