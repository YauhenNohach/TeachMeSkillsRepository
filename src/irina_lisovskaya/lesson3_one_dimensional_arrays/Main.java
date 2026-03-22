package irina_lisovskaya.lesson3_one_dimensional_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//    1) Дан массив целых чисел. Нужно:
//    a) Найти сумму элементов, которые: больше 10 И чётные
//    б) Подсчитать количество элементов, которые: отрицательные ИЛИ равны 0
//    Вывести оба результата.
        System.out.println();
        System.out.println("Home work 3, task 1:");
        int[] arrayNum = new int[]{-16, -1, 0, 4, 20, 89};
        int sumFirstCount = 0;
        int sumSecondCount = 0;
        // иницилизация счётчика; условия с размером массива; изменение счётчика
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > 10 && arrayNum[i] % 2 == 0) {
                sumFirstCount += arrayNum[i];
            }
            if (arrayNum[i] <= 0) {
                sumSecondCount++;
            }
        }
        System.out.println("Сумма элементов, которые больше 10 и чётные: " + sumFirstCount);
        System.out.println("Количество элементов, которые отрицательные или равны 0: " + sumSecondCount);


//2) Есть массив чисел. Создать новый массив без отрицательных чисел.
// Похожего задания мы не делали, но суть в том, что нам нужно создать новый массив, такой же длины, и складывать в него положительные числа
// (или может у вас будет свой варинат решения)
        System.out.println();
        System.out.println("Home work 3, task 2:");
//      int[] arrayNum = new int[]{-16, -1, 0, 4, 20, 89}; // массив чисел из предыдущего задания
        int[] arrayPlusNum = new int[arrayNum.length];
        int arrayIndex = 0; // указывает, в какую ячейку нового массива мы положим следующее число. Пока мы в самом начале (индекс 0).

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] >= 0) {
                arrayPlusNum[arrayIndex] = arrayNum[i];
                arrayIndex++;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(arrayPlusNum));

//3*) Найти второй максимальный элемент
        System.out.println();
        System.out.println("Home work 3, task 3:");
//      int[] arrayNum = new int[]{-16, -1, 0, 4, 20, 89}; // массив чисел из предыдущего задания
        int maxNum = 0;
        int secondMaxNum = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > maxNum) {
                secondMaxNum = maxNum;
                maxNum = arrayNum[i];
            } else if (arrayNum[i] > secondMaxNum) {
                secondMaxNum = arrayNum[i];
            }
        }
        System.out.println("Второй максимальный элемент: " + secondMaxNum);

    }
}
