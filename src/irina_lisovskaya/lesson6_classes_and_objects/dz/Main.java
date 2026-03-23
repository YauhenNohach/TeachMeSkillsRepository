package irina_lisovskaya.lesson6_classes_and_objects.dz;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

//ЗАДАНИЯ под объекты класса Student
// Задание 1. В цикле создать массив из 14 студентов.
        System.out.println("\nHomework 6, task 1:");
        Student[] students = new Student[14];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Студент " + (i + 1), "Группа А", 4.5);
            System.out.println("Создан: " + students[i].name + " , " + students[i].group + " , " + students[i].diplomAssessment);
        }
//  Задание 2. Создать конструктор класса студент и использовать его в цикле. В конструкторе задать всем студентам одинаковую группу. И установить для каждого студента различную оценку по 10-ти бальной системе с помощью класса Random.
        System.out.println("\nHomework 6, task 2:");
        Random assessment = new Random();
        for (int i = 0; i < students.length; i++) {
            double randomMark = assessment.nextDouble() * 9 + 1;
            double roundedMark = Math.round(randomMark * 10) / 10.0;
            students[i].diplomAssessment = roundedMark;
            System.out.println("Студент " + students[i].name + " из " + students[i].group + " имеет оценку: " + students[i].diplomAssessment);
        }
// Задание 3. Вывести информацию о всех отличниках (9-10 баллов за диплом) в консоль.
        System.out.println("\nHomework 6, task 3:");
        for (Student s : students) {
            if (s.diplomAssessment >= 9.0) {
                System.out.println("Отличник: " + s.name + ", Оценка: " + s.diplomAssessment);
            }
        }

//   ЗАДАНИЯ под объекты класса Cat:
//  Создать метод "кормёжка". Входным параметром укажите количество корма. Возвращаемое значение true - кот наелся, false - кот не наелся
        System.out.println("\nHomework 6, task 4:");

        Cat cat1 = new Cat("Myr", 2, 1);
        System.out.println("Кот сыт?: " + cat1.feeding(9));

    }
}
