package anna_sidorova.lesson7.lessons;


public class Main {
    public static void main(String[] args) {

        SportCar turbocar = new SportCar("turbo", 2009, 250);
        SportCar turbocar2 = new SportCar("turbo", 1900, 150);
        SportCar turbocar3 = new SportCar("turbo-ultra", 1990, 200);

        SportCar[] sportcars = new SportCar[3];
        sportcars[0] = turbocar;
        sportcars[1] = turbocar2;
        sportcars[2] = turbocar3;

        findAutoTill1992(sportcars);
        findAutoOnModel(sportcars);

        Car turbocar4 = new Car("turbo", 2009, 250, 345.6);
        Car turbocar5 = new Car("turbo", 1900, 150, 2324.56);
        Car turbocar6 = new Car("turbo-ultra", 1990, 200, 456.65);

        Car[] fastSportcars = new Car[3];
        fastSportcars[0] = turbocar4;
        fastSportcars[1] = turbocar5;
        fastSportcars[2] = turbocar6;

        changePriceforFasrCars(fastSportcars);

    }

    public static void findAutoTill1992(SportCar[] sportcars) {
        for (SportCar turbo : sportcars) {
            if (turbo.year < 1992) {
                System.out.println(turbo);
            }
        }
    }

    public static void changePriceforFasrCars(Car [] fastSportcars) {
        for (Car fast : fastSportcars) {
            if(fast.speed > 100) {
                fast.carPrice += 150;
                System.out.println(fast);
            }
        }
    }
    public static void findAutoOnModel(SportCar[] sportcars) {
        for( SportCar turbo : sportcars) {
            if(turbo.model.equals("turbo-ultra")) {
                System.out.println(turbo);
            }
        }
    }
    }



