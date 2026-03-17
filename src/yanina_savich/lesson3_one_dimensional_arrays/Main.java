package yanina_savich.lesson3_one_dimensional_arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("----1a----");
        int[] array = new int[]{2, 4, 5, 11, 14, 20, -1, 0};
        int sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10 && array[i] % 2 == 0) {
                sumEven += array[i];
            }
        }
        System.out.println("Сумма элементов: " + sumEven);
        System.out.println("----1b----");
        // int[] array = new int[]{2, 4, 5, 11, 14, 20, -1, 0};
        int negativeZeroElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] == 0) {
                negativeZeroElements++;
            }
        }
        System.out.println("Кол-во отрицательных или равных 0 эл-тов: " + negativeZeroElements);
        System.out.println("----2----");
        // int[] array = new int[]{2, 4, 5, 11, 14, 20, -1, 0};
        int[] newArray = new int[array.length];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= 0) {
                newArray[index] = array[i];
                index++;
            }
        }
        System.out.println("Новый массив без отрицательных: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println("\n----3----");
        // int[] array = new int[]{2, 4, 5, 11, 14, 20, -1, 0};
        int max1 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max1 = array[i];
            }
        }
        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max2 && array[i] < max1) {
                max2 = array[i];
            }
        }
        System.out.println("Второе максимальное значение: " + max2);
    }
}
