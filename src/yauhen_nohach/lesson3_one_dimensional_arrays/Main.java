package yauhen_nohach.lesson3_one_dimensional_arrays;

public class Main {
    public static void main(String[] args) {
        //1) Дан массив целых чисел.
//        Нужно:
//        a) Найти сумму элементов, которые:
//        больше 10 И чётные
//        б) Подсчитать количество элементов, которые:
//        отрицательные ИЛИ равны 0
//        Вывести оба результата.

        int[] arr = {2, 24, 8, 29, 12, 0, -1, -3}; // изначальный массив
        int summa = 0; // изначальная сумма
        int count = 0; // счетчик элементов
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10 && arr[i] % 2 == 0) {
                summa += arr[i];
            }
        }
        System.out.println("Сумма элементов " + summa);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Количество элементов " + count);

//        2) Есть массив чисел. Создать новый массив без отрицательных чисел.
//
        int[] arr2 = {2, 24, 8, 29, 12, 0, -1, -3, -45}; // изначальный массив
        int index = 0;  // счетчик для негативных чисел
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 0) {
                index++;
            }
        }
        System.out.println("negative numbers index " + index);

        int[] arr3 = new int[arr2.length - index];
        int j = 0; //счетчик для перебора
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] >= 0) {
                arr3[j] = arr2[i];
                j++;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

//        3*) Найти второй максимальный элемент
//        (когда-то такую задачу я решал на собесе, она не сложная, но при этом не очевидная, особенно, когда ты видишь
//        циклы и массивы во второй раз, здесь не столь важно её решить, сколько посмотреть как вы размышляете)

        int[] arr5 = {2, 24, 8, 29, 12, 0, -1, -3};

        for (int i = 0; i < arr5.length - 1; i++) {

            for (int h = 0; h < arr5.length - 1 - i; h++) {

                if (arr5[h] < arr5[h + 1]) {

                    int temp = arr5[h];
                    arr5[h] = arr5[h + 1];
                    arr5[h + 1] = temp;
                }
            }
        }
        System.out.print(arr5[1]);
    }
}
