package Pasha.lesson7.dz;

public class Bird extends Graminivore {
    boolean singsBeautifully;
    protected Bird(String name, double weight, int age, String species, boolean singsBeautifully, String food) {
        super(name, weight, age, species, food);
        this.singsBeautifully = singsBeautifully;
    }

    public static void main(String[] args){
    }
}
