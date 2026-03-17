//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Kinev_DZ2 {
    public static void main(String[] args) {

        // Первое задание
        int god = 2032;
        if (((god / 4 > 0) && (god % 4 == 0)) || ((god / 400 > 0) && (god % 400 == 0))) {
            System.out.println(god + " Год високосный");
        }else {
            System.out.println(god + " Год не високосный");
        }
        System.out.println("");

        //Второе задание
        String dostavka = "standart";
        double massa = 3.5;
        switch (dostavka) {
            case "standart":
                if (massa <= 5){
                    System.out.println("Выбран тип доставки " + dostavka + " с весом " + massa +" Цена = 5 eur");
                } else if (massa <= 20) {
                    System.out.println("Выбран тип доставки " + dostavka + " с весом " + massa +"Цена = 10 eur");
                } else {
                    System.out.println("Выбран тип доставки " + dostavka + " с весом " + massa +"Цена = 20 eur");
                }break;
            case "express":
                if (massa <= 5){
                    System.out.println("Выбран тип доставки " + dostavka + " с весом " + massa +"Цена = 10 eur");
                } else if (massa <= 20){
                    System.out.println("Выбран тип доставки " + dostavka + " с весом " + massa +"Цена = 20 eur");
                } else {
                    System.out.println("Выбран тип доставки " + dostavka + " с весом " + massa +"Цена = 35 eur");
                }break;
            case "VIP":
                System.out.println("Выбран тип доставки " + dostavka + " с весом " + massa +"Цена = 50 eur");
                break;
            default:{
                System.out.println("Неизвестный тип доставки");
            }
        }
        System.out.println("");

        //Задание 3
        int number = 124;
        int countOddNumber = 0;
        int countEvenNumber = 0;
        int sum = 0;
        while (number > 0) {
            int number1 = number % 10;
            if (number1 % 2 == 0) {
                countEvenNumber++;
            } else {
                countOddNumber++;
            }
            number = number / 10;
            sum = sum + number1;
        }
        System.out.println("Четных = " + countEvenNumber);
        System.out.println("Нечетных = " + countOddNumber);
        System.out.println("Сумма = " + sum);

    }
}