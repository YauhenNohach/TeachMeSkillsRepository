package yauhen_nohach.lesson10_string_processing.lesson;

public class Main {
    public static void main(String[] args) {
        int num = 5;
//        num = 7;
//        System.out.println(num);
        String nameVariable = new String();
//        nameVariable.valueOf("ddfgdfg");

        // concat
        String name = "jenya";
        name = name + " is my name";
        name.concat(" is my name");

//        valueOf
        String value = String.valueOf(num);
        System.out.println(value);

        // join
        String join = String.join(" ", "g", "dfgdfg", "sdfsdf");
        System.out.println(join);

        String nameAlesya = "Alesya";

        // compareTo
        int compareValue = nameAlesya.compareTo("jenya");

        if (compareValue > 0) {
            System.out.println("nameAlesya = " + nameAlesya);
        } else {
            System.out.println("nameAlesya = " + nameAlesya);
        }

        // charAt
        System.out.println(nameAlesya.charAt(1));

        // getChars()

//        nameAlesya.getChars()

//        equals()

        String cost1 = "name1 ".trim();
        String cost2 = "NAme1";
        System.out.println("===================== : " + (cost1 == cost2)); // String pool
        System.out.println("equals: " + cost1.equals(cost2));

        // equalsIgnoreCase()
        System.out.println("equals igmore case: " + cost1.equalsIgnoreCase(cost2));
        System.out.println(cost2.toLowerCase());


        // indexOf()
        System.out.println("index of: " + cost2.indexOf("me")); // 2

        // replace

        String replace = cost2.replace("me", "sdgsdfgsdfg");
        System.out.println("replace = " + replace);

        System.out.println(name);

        String name2 = new String("jenya");

        StringBuffer sBuffer = new StringBuffer("sdgdsglksdnf"); // - для дианмической работы со строками( потокобезопасный)
//        sBuffer.

        StringBuilder sBuild = new StringBuilder("vasya"); // для дианмической работы со строками
        sBuild.append(" is your name");
        System.out.println(sBuild);

        System.out.println(name.charAt(1));
    }
}
