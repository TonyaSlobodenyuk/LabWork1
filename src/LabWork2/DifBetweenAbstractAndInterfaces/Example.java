package LabWork2.DifBetweenAbstractAndInterfaces;

public class  Example extends MyAbstractClass implements MyInterface1, MyInterface2 {

    public Example() { }

    @Override
    public void print() {
        System.out.println("I am an abstract class!");
    }

    @Override
    public void show() {
        System.out.println("I am the interface!\n"+ MyInterface2.st);
    }

}
