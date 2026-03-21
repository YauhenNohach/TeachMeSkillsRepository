package YanaRudinskaya.Lesson7.lesson;

public class SportCar extends Car {

    double max0To100;



    public SportCar(String model, int year, int speed, int price, double max0To100) {
        super(model, year, speed, price);
        this.max0To100 = max0To100;
    }


    @Override
    public void race() {
        System.out.println("sport car race");
    }


}
