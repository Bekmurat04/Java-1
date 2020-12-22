package com.company;

public class Animal {

    private int weight;
    private Shelter shelter;

    public Animal( int weight, Shelter shelter){

        this.weight = weight;
        this.shelter = shelter;
    }
    public int getWeight() {
        return weight;
    }

    public Shelter getShelter() {
        return shelter;
    }
public String getInfo(){
        return "вес:"   + weight + "  приют:" + shelter.getName()+" "+shelter.getAddress()+" ";
}
}
