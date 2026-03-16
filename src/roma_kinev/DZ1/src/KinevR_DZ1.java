
public class KinevR_DZ1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = a;

        a = b;
        b = c;
        System.out.println("a = " + a + " b = "  + b);
        System.out.println("");

        //////////////////////////

        int num1 = 5;
        int num2 = 7;
        int num3 = 9;
        int sum = (num1 + num2 + num3) / 3;
        System.out.println("Average = " + sum);
        System.out.println("");

        //////////////////////////

        int age = 20;
        int zp = 1000;
        boolean x1 = age > 18;
        boolean x2 = zp > 1000;

        System.out.println("Совершеннолетний ли человек? = " + x1 + " Зарплата больше 1000? = " + x2);
        System.out.println("");

        ///////////////////////////

        int second = 3672;
        int hours = second / 3600;
        int min = (second % 3600) / 60;
        int otherSecond = second % 60;

        System.out.println(second + " секунд это : ");
        System.out.println("Часов - " + hours);
        System.out.println("Минут - " + min);
        System.out.println("Остаток секунд - " + otherSecond);

    }
}