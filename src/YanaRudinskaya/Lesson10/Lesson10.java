package YanaRudinskaya.Lesson10;

public class Lesson10 {
    public static void main(String[] args) {
        //1) найти самую короткую и самую длинную строки. Вывести длины этих строк
        String first = "123456789";
        String second = "12345";
        String third = "123";


        String min = first;
        if (second.length() < min.length()) {
            min = second;
        }
        if (third.length() < min.length()) {
            min = third;
        }

        String max = first;
        if (second.length() > max.length()) {
            max = second;
        }
        if (third.length() > max.length()) {
            max = third;
        }

        System.out.println("ЗАДАЧА 1");
        System.out.println("Самая короткая длина: " + min.length());
        System.out.println("Самая длинная длина: " + max.length());

//        2) Вывести на консоль те строки, длина которых
//        больше средней, а также длину.
//        ● для вывода результат используйте StringBuilder

        double average = (first.length() + second.length() + third.length()) / 3.0;

        StringBuilder sb = new StringBuilder();

        if (first.length() > average) {
            sb.append(first)
                    .append(" — длина: ")
                    .append(first.length());
        }

        if (second.length() > average) {
            sb.append(second)
                    .append(" — длина: ")
                    .append(second.length());
        }

        if (third.length() > average) {
            sb.append(third)
                    .append(" — длина: ")
                    .append(third.length());
        }

        System.out.println("\n ЗАДАЧА 2");
        System.out.println("Средняя длина (" + average + "):");
        System.out.println("строки, длина которых больше средней, а также длина: "+sb);


    }
}
