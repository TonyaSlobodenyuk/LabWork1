package LabWork3;


import LabWork3.Animals.Animals;

public class Kostoris {
    public static void calculateFoodExpenses(int date, Animals animal){
        int result =  date * animal.getCost();
        System.out.println("You need for " + animal.getName()+" "+ result + "$");
    }
}
