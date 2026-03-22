package YanaRudinskaya.Lesson7.lesson;

public abstract class Car {

    public String model;
    public int year;
    public int speed;
    public int price;

    public Car() {
    }

    public Car(String model, int year, int speed, int price) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.price = price;
    }


    public void drive(){
        System.out.println("I drive car");
    }

    public abstract void race();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    // много
}
