package LabWork3.Animals;

public class Animals {
    static int counter;
    int idTypes;
    String name;
    Integer cost;

    public Animals(int idTypes, String name, Integer cost) {
        this.idTypes = idTypes;
        this.name = name;
        this.cost = cost;
    }


    public int getIdTypes() {
        return idTypes;
    }

    public String getName() {
        return name;
    }


    public Integer getCost() {
        return cost;
    }

    public static int getCounter() {
        return counter;
    }


    @Override
    public boolean equals(Object o) {
        if(o == null) { return false; }
        if(!(o instanceof Animals)) { return false; }

        Animals animals = (Animals) o;
        return this.name.equals(animals.getName()) ;
    }
    @Override
    public String toString() {
        return "Name:"+name+" Type:";
    }
}
