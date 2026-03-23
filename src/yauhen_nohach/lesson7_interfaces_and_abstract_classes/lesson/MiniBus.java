package yauhen_nohach.lesson7_interfaces_and_abstract_classes.lesson;

public class MiniBus extends Bus{

    public MiniBus() {
    }

    public MiniBus(String model, int year, int speed, int countPlaces) {
        super(model, year, speed, countPlaces);
    }

    @Override
    public void drive(){
        System.out.println("I drive Minibus");
    }
}
