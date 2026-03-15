package viktoriya_satsiuk.lesson3_one_dimensional_arrays;

import java.util.Arrays;

public class SatsyukViktoriyaHomework3 {
    public static void main(String[] args) {
//          3 занятие
//        1) Дан массив целых чисел.
//        Нужно:
//        a) Найти сумму элементов, которые:
//        больше 10 И чётные
//        б) Подсчитать количество элементов, которые:
//        отрицательные ИЛИ равны 0
//        Вывести оба результата.

        int[] arrayNumbers = new int[]{5, 25, 7, 12, -24, 10, 62, 0, -1, -200};
        int sumOfMoreThanTenAndEven = 0;
        int negativeOrZeroNumbers = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > 10 && arrayNumbers[i] % 2 == 0) {
                sumOfMoreThanTenAndEven += arrayNumbers[i];
            }
            if (arrayNumbers[i] <= 0) {
                negativeOrZeroNumbers++;
            }
        }

        System.out.println("Сумма чисел, которые > 10 и чётные: " + sumOfMoreThanTenAndEven);
        System.out.println("Количество чисел, которые <= 0: " + negativeOrZeroNumbers);

//        2) Есть массив чисел. Создать новый массив без отрицательных чисел. Похожего задания мы не делали,
//        но суть в том, что нам нужно создать новый массив, такой же длины, и складывать в него положительные
//        числа (или может у вас будет свой варинат решения)

//        int[] arrayNumbers = new int[]{5, 25, 7, 12, -24, 10, 62, 0, -1, -200};

        int[] arrayPositiveNumbers = new int[arrayNumbers.length];
        int arrayIndex = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] >= 0) {
                arrayPositiveNumbers[arrayIndex] = arrayNumbers[i];
                arrayIndex++;
            }
        }

        System.out.println("Новый массив без негативных чисел: " + Arrays.toString(arrayPositiveNumbers));


//        3*) Найти второй максимальный элемент в массиве

//        int [] arrayNumbers = new int[]{5, 25, 7, 12, -24, 10, 62, 0, -1, -200};

        int maxNumber = 0;
        int secondMaxNumber = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = arrayNumbers[i];
            } else if (arrayNumbers[i] > secondMaxNumber) {
                secondMaxNumber = arrayNumbers[i];
            }
        }
        System.out.println("Второе максимальное число: " + secondMaxNumber);
    }
}


