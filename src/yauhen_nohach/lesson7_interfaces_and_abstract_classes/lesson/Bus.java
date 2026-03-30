package yauhen_nohach.lesson7_interfaces_and_abstract_classes.lesson;

public class Bus extends Car {

    public static int countPeople = 0;

    int countPlaces;

    public Bus() {
        countPeople += 60;
    }

    public static void infoAboutBus(){
        System.out.println("Bus info about bus");
    }

    @Override
    public void race() {
        System.out.println("bus is top 1");
    }

    @Override
    public void drive(){
        System.out.println("I drive bus");
    }

//    public Tree(String name, double height) {
//        this.name = name;
//        this.height = height;
//    }

    public Bus(String model, int year, int speed, int countPlaces) {
        super(model, year, speed);
        this.countPlaces = countPlaces;
    }

    @Override
    public void car(int speed) {

    }

    @Override
    public int move() {
        if(speed > 4){
            return speed;
        }
        return speed;
    }
}
