package irina_lisovskaya.lesson6_classes_and_objects.dz;

public class Student {
    String name; // имя студента
    String group; // группа
    double diplomAssessment; //  оценка за диплом

    // Конструктор
    public Student(String name, String group, double diplomAssessment) {
        this.name = name;
        this.group = "Группа Б";
        this.diplomAssessment = diplomAssessment;
    }
}
