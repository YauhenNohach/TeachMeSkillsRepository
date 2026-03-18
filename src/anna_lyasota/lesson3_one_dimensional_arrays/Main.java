package anna_lyasota.lesson3_one_dimensional_arrays;

public class Main {public static void main(String[] args) {
    //task_1
    int sizeArray = 4;
    int[] array = new int[sizeArray];
    array[0] = 45;
    array[1] = 5;
    array[2] = 44;
    array[3] = 2;

    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] > 10 && array[i] % 2 == 0) {
            sum = sum + array[i];
        }
    }
    System.out.println("Сумма чётных элементов и элементов, которые больше 10: " + sum);

    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] < 0 || array[i] == 0) {
            count++;
        }
    }
    System.out.println("Количество отрицательных элементов или элементов равных 0: " + count);

    //task_2
    int sizeArrayTwo = 4;
    int[] arrayTwo = new int[sizeArrayTwo];
    arrayTwo[0] = 45;
    arrayTwo[1] = -5;
    arrayTwo[2] = -44;
    arrayTwo[3] = 2;

    int[] arrayNew = new int[arrayTwo.length];

    for (int i = 0; i < arrayTwo.length; i++) {
        if (arrayTwo[i] >= 0) {
            arrayNew[i] = arrayTwo[i];
        }
    }
    System.out.println("Новый массив без отрицательных чисел: ");
    for (int i = 0; i < arrayNew.length; i++) {
        System.out.print(arrayNew[i] + " ");
    }

//task_3
    //Найти второй максимальный элемент (когда-то такую задачу я решал на собесе,
    // она не сложная, но при этом не очевидная, особенно, когда ты видишь циклы
    // и массивы во второй раз, здесь не столь важно её решить, сколько посмотреть как вы размышляете)
    int[] arrayNumber = {1, 56, 70, 32, 8};

    int max = arrayNumber[0];
    int maxTwo = arrayNumber[0];

    for (int i = 0; i < arrayNumber.length; i++) {
        if (arrayNumber[i] > max) {
            maxTwo = max;
            max = arrayNumber[i];
        }
    }
    System.out.println("max first element: " + max);
    System.out.println("max second element: " + maxTwo);


}
}
