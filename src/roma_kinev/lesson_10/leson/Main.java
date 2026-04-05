package roma_kinev.lesson_10.leson;

public class Main {
    public static void main(String[] args) {
        String[] str = {"Строка1", "Строка123456", "Ст"};
        String st1 = "123456";
        String st2 = "123";

        if (st1.length() > st2.length()){
            System.out.println("Строка st1 длиннее и имеет символов " + st1.length());
        }else {
            System.out.println("Строка st2 длиннее и имеет символов " + st2.length());
        }

        int count = 0;
        for (String s : str) {
            count += str.length;
            double avg3 = count / str.length;
            if (s.length() > avg3 ){
                System.out.println("Массивы которые длиннее средней длинны " + s + " " + s.length());
            }
        }
    }
}
