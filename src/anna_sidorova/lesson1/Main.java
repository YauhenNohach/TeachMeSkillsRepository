package anna_sidorova.lesson1;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        a = 10;
        b = 5;
        System.out.println(a);
        System.out.println(b);
        a = 5;
        b = 7;
        int c = 9;
        int count = 3;
        System.out.println((a + b + c) / count);

        int age = 19;
        boolean isOverAge = age > 18;
        System.out.println(isOverAge);
        int salary = 500;
        boolean isMoreThousand = salary > 1000;
        System.out.println(isMoreThousand);

        double seconds = 3672.0;
        double hours =  seconds / 3600;
        double minutes =  seconds / 60;
        double remainingSeconds = seconds  % 60;
        System.out.println("В " + seconds + " cек. " + minutes + " мин.");
        System.out.println("В " + seconds + " сек. " + hours + " час.");
        System.out.println("В " + seconds + " сек. " + remainingSeconds+ " оставшихся секунд");



        int[] arr4 =  {2, 24, 8, 29, 12, 0, -1, -3};
        int max = arr4[0]; // first element
        int secondMax = arr4[1]; // second element
        if (secondMax > max) {
            int temp = max;
            max = secondMax;
            secondMax = temp;
        }
        for (int i = 2; i < arr4.length; i++) {
            if (arr4[i] > max) {
                secondMax = max;
                max = arr4[i];
            } else if (arr4[i] > secondMax) {
                secondMax = arr4[i];
            }
        }
        System.out.println("Максимальное второе число: " + secondMax);


        ;
    }
}
