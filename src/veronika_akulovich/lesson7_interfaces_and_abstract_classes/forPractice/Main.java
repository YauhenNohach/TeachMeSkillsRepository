package veronika_akulovich.lesson7_interfaces_and_abstract_classes.forPractice;

import veronika_akulovich.lesson6_classes_and_objects.hometask.Group;
import veronika_akulovich.lesson7_interfaces_and_abstract_classes.hometask.Animal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product dress = new Dresses(100.4, true, "L", "red");
        Product miniDress = new Dresses(150.4, true, "M", "blue");
        Product miniDress1 = new Dresses(140.7, false, "M", "black");
        Product miniDress2 = new Dresses(180.7, false, "S", "black");
        Product nike = new Sneekers(100.6, true, "46", 32.0);
        Product adidas = new Sneekers(150.6, true, "46", 32.0);
        Product puma = new Sneekers(130.6, true, "43", 30.5);
        Product hat1 = new Hats (130.4, true, "M", "female");
        Product hat2 = new Hats (100.4, false, "M", "male");

        Product [] products = new Product[9];
        products[0] = dress;
        products[1] = miniDress;
        products[2] = miniDress1;
        products[3] = miniDress2;
        products[4] = hat1;
        products[5] = nike;
        products[6] = adidas;
        products[7] = puma;
        products[8] = hat2;

        System.out.println("Мы нашли следующие товары на складе: " + Arrays.toString(findAllProductOnTheStorage(products)));

        System.out.println("Мы нашли следующие товары со стоимостью больше 100: " + Arrays.toString(findAllProductWithPriceMoreThan100(products)));


        System.out.println("Мы нашли следующие красные платья: " + Arrays.toString(findAllRedDresses(products)));
        Product [] allRedDresses = findAllRedDresses(products);
//        for (Product redDress: allRedDresses) {
//            if (redDress != null) {
//                System.out.println(redDress.printInfoAboutDress());     почему тут не подтягивает??
//            }
//        }

        System.out.println("Вот что мы нашли: " + findAllSneekersWithCpecificSize(products, 32.0));

        changePriceForHat(hat2, 99.5);

    }
    public static Product[] findAllProductOnTheStorage (Product [] products) {
        Product[] arrayProductOnTheStorage = new Product[products.length];
        int indexOfProducts = 0;
        for (int i = 0; i < products.length; i++) {
           if (products[i].isOnTheStorage) {
               arrayProductOnTheStorage[indexOfProducts] = products[i];
               indexOfProducts++;
           }
           }
        return arrayProductOnTheStorage;
        }

    public static Product[] findAllProductWithPriceMoreThan100 (Product [] products) {
        Product[] arrayProductWithSpecificPrice = new Product[products.length];
        int indexOfProducts = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].price >= 100.0) {
                arrayProductWithSpecificPrice[indexOfProducts] = products[i];
                indexOfProducts++;
            }
        }
        return arrayProductWithSpecificPrice;
    }
    public static Product [] findAllRedDresses (Product [] products) {
        Product [] arrayDressesWithRedColor = new Product[products.length];
        int indexOfProducts = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Dresses dress && dress.color.equals("red")) {
                //           приведение типа    добавили переменную
                arrayDressesWithRedColor[indexOfProducts] = products[i];
                indexOfProducts++;
            }

        }
        return arrayDressesWithRedColor;
    }

    public static Product  findAllSneekersWithCpecificSize (Product [] products, double sneekersSize) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Sneekers sneekers && sneekers.lengthInsole < sneekersSize) {
      return products[i];
            }
        }
        return null;
    }

    public static void changePriceForHat (Product product, double newPrice) {
        product.price = newPrice;
    }
}
