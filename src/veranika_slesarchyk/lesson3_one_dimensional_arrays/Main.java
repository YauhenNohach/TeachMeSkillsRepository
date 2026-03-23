package veranika_slesarchyk.lesson3_one_dimensional_arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int[] numbers = {1, 2, 36, 10};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10 && numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
            if (numbers[i] < 0 || numbers[i] == 0) {
                count++;
            }
        }
        System.out.println("Сумма элементов, которые больше 10 И чётные: " + sum);
        System.out.println("Сумма элементов, которые отрицательные ИЛИ равны 0: " + count);
    }

    public static void task2() {
//2) Есть массив чисел. Создать новый массив без отрицательных чисел.
        int[] array = {1, 2, 3, -3, -2, -1};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] >= 0) {
                newArray[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    //3*) Найти второй максимальный элемент
    public static void task3() {
        int[] array = {1, 3, 6, 8, 28};
        int max = array[0];
        int secondMax = array[1];
        if (secondMax > max) {     //поменять местами, если второй больше первого
            int a = max;
            max = secondMax;
            secondMax = a;
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        System.out.println("Второй максимальный элемент: " + secondMax);
    }
}
