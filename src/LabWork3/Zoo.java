package LabWork3;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Place> places=new ArrayList<>();

    public Zoo(){
        places = new ArrayList<>();
    }

    public ArrayList<Place> getPlaces() {
        return places;
    }

    public void setPlaces(ArrayList<Place> places) {
        this.places = places;
    }

    public boolean addPlace(Place place){
        return places.add(place);
    }
    public static Types fromIdToAnimalBehavior(int id){
        Types types = null;
        switch (id){
            case 1:{
                types = Types.Grassy;
                break;
            }
            case 2:{
                types = Types.Predator;
                break;
            }
            default:
                break;
        }
        return types;
    }

    int calculateAllAnimalsFoodExpenses() {
        int result = 0;
        for (var place : places) {
            for (var animal : place.animals) {
                result += animal.getCost();
            }
        }
        return result;
    }
}
