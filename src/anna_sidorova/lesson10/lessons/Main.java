package anna_sidorova.lesson10.lessons;

public class Main {
    public static void main(String[] args) {

        String name1 = "Jenna";
        String name2 = "assembler";
        String longest;
        if (name1.length() > name2.length()) {
            longest = name1;
        } else {
            longest = name2;
        }

        System.out.println("Самая длинная строка: " + longest);

        String[] names = {"Jenna", "assembler", "Java", "programming"};

        String longest2 = names[0];

        for (String name : names) {
            if (name.length() > longest2.length()) {
                longest2 = name;
            }
        }
        System.out.println("Самая длинная строка: " + longest2);


        String[] allnames = {"Jenna", "assembler", "Java", "programming"};
        int sum = 0;
        for (String na : allnames) {
            sum += na.length();
        }
        double average = sum / allnames.length;
        for (String na : allnames) {
            if (na.length() > average) {
                System.out.println(na + " и длина этой строки == " + na.length());
            }
        }
    }
}
