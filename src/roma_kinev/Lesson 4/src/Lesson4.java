//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lesson4 {
    public static void main(String[] args) {
        int[][] array2Init = { {1, 3, 6, 7}, {4, 5, 7, 24}, {3, 5, 7, 11} };
        int max = array2Init[0][0];
        for (int i = 0; i < array2Init.length; i++){
            for (int j = 0; j < array2Init[i].length; j++){
                if (array2Init[i][j] > max) {
                    max = array2Init[i][j];
                }
            }
        }
        System.out.println(max);

        int[][] array2Init2 = { {1, 3, 6, 7}, {3, 5, 7, 2}, {4, 5, 7, 11}, {5, 2, 3, 4} };
        int sum = 0;
        for (int i = 0; i < array2Init2.length; i++){
           sum = sum + array2Init2[i][i];
        }
        System.out.println(sum);


        int sum2 = 0;
        for (int i = 0; i < array2Init2.length; i++) {
            int number = array2Init2.length -1 - i;
            sum2 = sum2 + array2Init2[i][number];
        }
        System.out.println("обратная диагональ " + sum2);


        for (int i = 0; i < array2Init.length; i++){
            int min = array2Init[i][0];
            for (int j = 0; j < array2Init[i].length; j++){
                if (array2Init[i][j] < min) {
                    min = array2Init[i][j];

                }
            }
            System.out.println(i + min);
        }


    }
}