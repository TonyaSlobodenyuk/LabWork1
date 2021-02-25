package LabWork2.SimpleHierarchy;

public class Teacher extends Person{
    String position;
    public Teacher(String name,int age, String position)
    {
        super(name,age);
        this.position=position;
    }

    @Override
    public String toString() {
        return super.toString() +"  Position:" +position;
    }
}
