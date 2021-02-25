package LabWork2.StudentException;

public class Students {
    String name;
    int age;
    public Students(String name, int age) throws AgeStudentException {
        if(age<18)
            throw new AgeStudentException("Age must be over 18!");
            this.name=name;
            this.age=age;
    }

    @Override
    public String toString() {
        return "Name:"+name+"  Age:"+ age;
    }
}
