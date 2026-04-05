package anna_sidorova.lesson7.lessons;
public class Car {

    String model;
    public int year;
    int speed;
    double carPrice;

    public Car() {
    }

    public Car(String model, int year, int speed, double carPrice) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.carPrice = carPrice;
    }

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public void drive(){
        System.out.println("I drive car");
    }

  //  public abstract void race();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    // много
}
