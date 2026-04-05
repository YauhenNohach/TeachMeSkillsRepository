package roma_kinev.lesson6_classes_and_objects.dz;

public class Student {
    String name;
    String gruppa;
    double ball;

    public Student(String name, String gruppa, double ball) {
        this.name = name;
        this.gruppa = gruppa;
        this.ball = ball;
    }
    public void printStudents(){
        System.out.println("Name = " + this.name + " gruppa = " + this.gruppa + " ball = " + this.ball);
    }

    public double getAverageBall() {
        return ball;
    }
}
