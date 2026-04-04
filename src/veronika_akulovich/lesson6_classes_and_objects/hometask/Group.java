package veronika_akulovich.lesson6_classes_and_objects.hometask;

public class Group {
    String name;
    String groupNumber;
    int diplomaGrade;

    public Group() {
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", diplomaGrade=" + diplomaGrade +
                '}';
    }


    public Group(String name, String groupNumber, int diplomaGrade) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.diplomaGrade = diplomaGrade;


    }
    public String printStudentInfo() {
        return "Name: " + name + ", Group Number: " + groupNumber + " Diploma Grade: " + diplomaGrade;
    }
}
