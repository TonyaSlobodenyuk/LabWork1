package LabWork2.DifBetweenAbstractAndInterfaces;

interface MyInterface1 {
    String st = "Hi!";

    void show();

    default void show1() {
        System.out.println(st);
    }
}

interface MyInterface2 extends MyInterface1{
    String st = "Have a nice day!";
}
