package YanaRudinskaya.Lesson7.lesson;

public abstract class Car {

    private String model;
    private int year;
    private int speed;
    public int price;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
        }
        this.price = price;
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
