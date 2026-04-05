package EgorKhomchenko.Lesson10.Lesson;

public class Main {
    static void main(String[] args) {

        String[] arr = {"яблоко", "груша", "апельсин", "киви", "банан", "a", "I", "s", "m"};


        int min = arr[0].length();
        int max = arr[0].length();
        StringBuilder sbMin = new StringBuilder();
        StringBuilder sbMax = new StringBuilder();

        long totalLength = 0; // для вычисления средней

        for (String s : arr) {
            int len = s.length();
            totalLength += len;

            if (len < min) {
                min = len;
                sbMin.setLength(0);
                sbMin.append(s).append(" ");
            } else if (len == min) {
                sbMin.append(s).append(" ");
            }

            if (len > max) {
                max = len;
                sbMax.setLength(0);
                sbMax.append(s).append(" ");
            } else if (len == max) {
                sbMax.append(s).append(" ");
            }
        }

        System.out.println("Минимальная длина = " + min);
        System.out.println("Максимальная длина = " + max);
        System.out.println("Строки минимальной длины: " + sbMin.toString().trim());
        System.out.println("Строки максимальной длины: " + sbMax.toString().trim());



        for (String s : arr) {
            totalLength += s.length();
        }
        double average = (double) totalLength / arr.length;
        System.out.printf("Средняя длина = %.2f%n", average);

        // 2) выводим строки длиннее средней и их длину
        System.out.println("Строки с длиной больше средней (строка : длина):");
        for (String s : arr) {
            if (s.length() > average) {
                System.out.println(s + " : " + s.length());
                {
                }
            }
        }



    }

}