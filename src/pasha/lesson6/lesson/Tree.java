package pasha.lesson6.lesson;

public class Tree {
    //            topol
    public String name;
//           345.7
    double height;

    public Tree() {
    }

    public Tree(String name) {
        this.name = name;
    }

    //               topol           345.7
    public Tree(String name, double height) {
        this.name = name;
        this.height = height;
    }

    //
//    String season;

    // поведение в виде методов

    // метод - обособленный участок кода, который вполняет какую-то логику
    // private - только в этом классе
    // public - везде в коде
    // protected - в пакетах наследниках и классах наследниках
    // this - текущий обьект

    public void printInfoAboutTree(){
        System.out.println("name: " + this.name + ", height: " + this.height);
    }

}
