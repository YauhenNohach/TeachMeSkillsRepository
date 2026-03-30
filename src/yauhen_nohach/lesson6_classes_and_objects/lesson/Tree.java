package yauhen_nohach.lesson6_classes_and_objects.lesson;

import java.time.LocalDate;

public class Tree {
    //            topol
    private String name;
    //           345.7
    private double height;

    private LocalDate age;

    public String[] names;

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

    public void printInfoAboutTree() {
        System.out.println("name: " + this.name + ", height: " + this.height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

//    public void setHeight(double height) {
//        if (height > 0) {
//            this.height = height;
//        } else {
//            System.err.println("error height can't be less than 0");
//        }
//    }


    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        if (names.length > 0){
            this.names = names;
        } else {
            System.out.println("array is empty");
        }

    }

    public void setHeight(double height) {
        this.height = height;
    }

//    public int getAge() {
//        return LocalDate.now().getYear() - age;
//    }

//    public void setAge(int age) {
//        if (age < 0) {
//            System.out.println("sdgdfgg");
//        } else {
//            this.age = age;
//        }
//    }
}
