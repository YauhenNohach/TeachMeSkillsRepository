package yanina_savich.lesson10_string_processing.lesson;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Anna", "Yana", "Alina"};
        String shortest = array[0];
        String longest = array[0];
        for (String s : array) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
            if (s.length() > longest.length()){
                longest = s;
            }
        }
        System.out.println("Shortest name: " + shortest + " with length: " + shortest.length());
        System.out.println("Longest name: " + longest + " with length: "  + longest.length());

    }
}
