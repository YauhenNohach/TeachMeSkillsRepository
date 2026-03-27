package veronika_akulovich.lesson6_classes_and_objects;

public class Person {
    String firstName;
    String secondName;
    String sex;
    int age;
    String nationality;

    public Person() {
    }

    public Person(String firstName, String secondName, String sex, int age, String nationality) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
    }

    public void printInfoAboutPersons () {
        System.out.println(" name " + this.firstName + " secondName " + this.secondName + " sex " + sex + " age " + age + " nationality " + nationality);
    }
}
