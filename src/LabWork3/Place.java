package LabWork3;

import LabWork3.Animals.Animals;

import java.util.ArrayList;
import java.util.List;


public class Place {
    public int sizePlace;
    public  int id ;
    public  String name ;
    public  List<Animals> animals;
    public  List<Types> types ;

    public Place(int sizePlace, int id, String name,  List<Types> types) {
        this.sizePlace = sizePlace;
        this.id = id;
        this.name = name;
        this.types = types;
        animals = new ArrayList<>();
    }

    public boolean chekSize(Animals animal) {
        if (animal.getCounter() < sizePlace) {
            return true;
        }
        else
            System.out.println("Check the size of the cage");
        return false;
    }

    public boolean chekType(Animals animal) {
        for (var item : types) {
            if (item.equals(Zoo.fromIdToAnimalBehavior(animal.getIdTypes()))) {
                System.out.println("Successful");
                return true;
            }
        }
        return false;
    }

    public void addNewAnimals(Animals animal) {
        if(chekSize(animal) ==true)
        if(chekType(animal)==true)
        {
            animals.add(animal);
            System.out.println("Add animal");
        }
    }

    public void showAllAnimal(){
        for (var item : animals) {
            System.out.println(item.toString());
        }
    }

}
