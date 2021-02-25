package LabWork2;
import LabWork2.DifBetweenAbstractAndInterfaces.Example;
import LabWork2.StudentException.Students;
import LabWork2.StudentException.AgeStudentException;
import LabWork2.SimpleHierarchy.Student;

public class LabWork2 {
    public static void main(String[] args) {
        System.out.println("***Task 48***");
        Student stud = new Student("Ivan", 19, 201);
        System.out.println(stud.toString());
        int a=5;
        stud.scholarship(a);

        System.out.println("***Task 51***");
        Student.counting();

        System.out.println("***Task 42***");
        try {
            Students st = new Students("Ivan", 17);
            System.out.println(st.toString());
        }
        catch (AgeStudentException ageStudentException){
            System.out.println(ageStudentException.getMessage());
        }

        System.out.println("***Task 34***");
        MonthEnum month = MonthEnum.February;
        System.out.println("February: "+month.getValue());

        System.out.println("***Task 43***");
        Example ex = new Example();
        ex.show1();
        ex.show();
        ex.print1();
        ex.print();
    }

}
