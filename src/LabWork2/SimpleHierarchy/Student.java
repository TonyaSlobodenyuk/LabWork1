package LabWork2.SimpleHierarchy;

public class Student extends Person{
    int group;
    static int count =0;
    public Student(String name,int age, int group)
    {
        super(name,age);
        this.group=group;
        count++;
    }
    public void scholarship(){
        System.out.println("No student receives a scholarship.");
    }
    public void scholarship(int a){
        System.out.println(a+" students receive a scholarship.");
    }
public static void counting(){
    System.out.println(count+" times a Student class object has been created");
}
 @Override
    public String toString() {
        return super.toString() +"  Group:" +group;
    }
}
