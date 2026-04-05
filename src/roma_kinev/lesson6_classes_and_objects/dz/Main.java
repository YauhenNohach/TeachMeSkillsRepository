package roma_kinev.lesson6_classes_and_objects.dz;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[14];

        for (int i = 0; i < students.length; i++){
            students[i] = new Student("st" + (i+1), "Group " + 1, Math.round((Math.random() * 4 + 6) * 100.0) / 100.0);
        }

        for (Student s : students){
            if (s.getAverageBall() >= 9 && s.getAverageBall() <=10) {
                s.printStudents();
            }

        }

        ////////////////////////////////
        Cat Mishel = new Cat("Mishel", 2, 97);
        System.out.println(isEat100(Mishel, 25));


    }
    public static boolean isEat100(Cat Mishel, double countEat){
      if (Mishel.eat100 <= countEat){
          return true;
      }  else {
          return false;
      }
    }

}
