package LabWork2.SimpleHierarchy;

public class Person {
    String name;
    int age;
    public Person(){}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
            return "Name:"+name+"  Age:"+ age;
        }
}
