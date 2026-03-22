package veronika_akulovich.lesson6_classes_and_objects.hometask;

import veronika_akulovich.lesson7_interfaces_and_abstract_classes.hometask.Animal;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Group veronika = new Group("veronika", "QA34-onl", 10);
        Group alex = new Group("alex", "QA34-onl", 9);
        Group olga = new Group("olga", "QA34-onl", 10);
        Group ivan = new Group("ivan", "QA34-onl", 6);
        Group natalia = new Group("alex", "QA36-onl", 10);
        Group masha = new Group("masha", "QA36-onl", 9);
        Group jenya = new Group("jenya", "QA36-onl", 9);
        Group andrey = new Group("andrey", "QA36-onl", 6);
        Group anna = new Group("anna", "QA36-onl", 8);
        Group sasha = new Group("sasha", "QA34-onl", 9);

        Group[] group = new Group[10];
        group[0] = veronika;
        group[1] = alex;
        group[2] = olga;
        group[3] = ivan;
        group[4] = natalia;
        group[5] = masha;
        group[6] = jenya;
        group[7] = andrey;
        group[8] = anna;
        group[9] = sasha;

        Cats siamese = new Cats("marta", 3, 0.300);


        Group showStudentOnGroupNumber = findStudentOnTheSameGroupNumber(group, "QA34-onl");
        System.out.println("Мы нашли первого студента в определенной группе: " + showStudentOnGroupNumber);

        setUpSameGroupNumberForStudents(group, "QA34-onl");
        System.out.println("Мы поменяли всем студентам номер группы:" + Arrays.toString(group));

        Group[] allStudentsWithHighGrade = findAllStudentsWithDiplomaGradeMoreThan9(group);
        for (Group student : allStudentsWithHighGrade) {
            if (student != null) {
                System.out.println(student.printStudentInfo());
            }
        }

        System.out.println("Достаточно ли корма для животного " + ifCatHaveEnoughtEat(siamese, 0.2));


    }

    public static Group findStudentOnTheSameGroupNumber(Group[] group, String groupNumber) {
        for (int i = 0; i < group.length; i++) {
            if (group[i].groupNumber.equals(groupNumber)) {
                return group[i];
            }
        }
        return null;
    }

    public static void setUpSameGroupNumberForStudents(Group[] group, String groupNumber) {
        Random random = new Random();
        for (int i = 0; i < group.length; i++) {
            group[i].groupNumber = groupNumber;
            group[i].diplomaGrade = random.nextInt(10) + 1;
        }
    }

    public static Group[] findAllStudentsWithDiplomaGradeMoreThan9(Group[] group) {
        Group[] arrayStudentsWithHighDiplomaGrade = new Group[group.length];
        int indexOfGroup = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i].diplomaGrade >= 9) {
                arrayStudentsWithHighDiplomaGrade[indexOfGroup] = group[i];
                indexOfGroup++;
            }
        }
        return arrayStudentsWithHighDiplomaGrade;
    }

    public static boolean ifCatHaveEnoughtEat(Cats siamese, double countOfFood) {
        if (siamese.amountOfFeed <= countOfFood) {
            return true;
        } else {
            return false;
        }
    }
}
