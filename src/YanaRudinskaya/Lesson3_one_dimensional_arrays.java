package YanaRudinskaya;

public class Lesson3_one_dimensional_arrays {
    public static void main(String[] args) {

//        1) Дан массив целых чисел.
//        Нужно:
//        a) Найти сумму элементов, которые: больше 10 И чётные
//        б) Подсчитать количество элементов, которые: отрицательные ИЛИ равны 0
        System.out.println("ПЕРВАЯ ЗАДАЧА:");

        int[] numbers = {22, -555, 1, 0, 19, 34, -77, -9, 0};
        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            if (number > 10 && number % 2 == 0) {
                sum += number;
            }
            if (number <= 0) {
                count++;
            }
        }
        System.out.printf(
                "Сумма элементов (>10 и чётные): %d%n" +
                        "Количество элементов (<=0): %d%n",
                sum, count
        );

//        2) Есть массив чисел. Создать новый массив без отрицательных чисел.
//        Похожего задания мы не делали, но суть в том, что нам нужно создать новый массив,
//        такой же длины, и складывать в него положительные числа (или может у вас будет свой вариант решения)
        System.out.println();
        System.out.println("ВТОРАЯ ЗАДАЧА:");

        int[] newNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                newNumbers[i] = numbers[i];
            }
        }

        //Второй вариант решения, так как не до конца понятна идея задачи. Было бы хорошо давать пример исходного массива и вариант итогового вывода в консоли, чтобы чётко понимать условие задачи.
        int[] newNumbers2 = new int[numbers.length];

        int newIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                newNumbers2[newIndex] = numbers[i];
                newIndex++;
            }
        }

        System.out.printf("%-30s %s%n", "Старый массив:", java.util.Arrays.toString(numbers));
        System.out.printf("%-30s %s%n", "Новый массив:", java.util.Arrays.toString(newNumbers));
        System.out.printf("%-30s %s%n", "Новый массив(второй вариант):", java.util.Arrays.toString(newNumbers2));

        //3*) Найти второй максимальный элемент
        // (когда-то такую задачу я решал на собесе, она не сложная, но при этом не очевидная,
        // особенно, когда ты видишь циклы и массивы во второй раз, здесь не столь важно её решить,
        // сколько посмотреть как вы размышляете)
        //int[] numbers = {22, -555, 1, 0, 19, 34, -77, -9, 0};
        System.out.println();
        System.out.println("ТРЕТЬЯ ЗАДАЧА:");

        //1 вариант
        int max = numbers[0];
        int newIndex2 = 0;

        int[] numbers3 = new int[numbers.length];
        int secondMax = numbers3[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != max) {
                numbers3[newIndex2] = numbers[i];
                newIndex2++;
            }
        }
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] > secondMax) {
                secondMax = numbers3[i];
            }
        }
        System.out.printf("%-50s %s%n", "Первоначальный массив:", java.util.Arrays.toString(numbers));
        System.out.printf("%-50s %s%n", "Промежуточный массив:", java.util.Arrays.toString(numbers3));
        System.out.printf("%-50s %s%n", "Первый максимальный элемент: ", max);
        System.out.printf("%-50s %s%n", "Второй максимальный элемент: ", secondMax);
        System.out.println();

        //2 вариант
        //int[] numbers = {22, -555, 1, 0, 19, 34, -77, -9, 0};
        int max2 = numbers[0];
        int secondMax2 = numbers[0];

        for (int number : numbers) {
            if (number > max2) {
                secondMax2 = max2;
                max2 = number;
            } else if (number < max2 && number > secondMax2) {
                secondMax2 = number;
            }
        }
        System.out.printf("%-50s %s%n", "Первый максимальный элемент (2й вариант решения): ", max2);
        System.out.printf("%-50s %s%n", "Второй максимальный элемент(2й вариант решения): ", secondMax2);

    }
}
