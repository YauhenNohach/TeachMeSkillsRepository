package veronika_akulovich.lesson7_interfaces_and_abstract_classes.lesson;

public abstract class Car {

    String model;
    int year;
    int speed;
    double costOfAuto;

    public Car() {
    }

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
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
                '}';
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



    public int setYear(int year) {
        if (year > 1960) {
            return year;
        } else {
            System.err.println("Вашей машине пора на выставку: ");
        }
        return 0;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCostOfAuto() {
        return costOfAuto;
    }

    public void setCostOfAuto(double costOfAuto) {
        this.costOfAuto = costOfAuto;
    }

    // много
}
