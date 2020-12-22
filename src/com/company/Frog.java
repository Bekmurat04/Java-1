package com.company;

public final class Frog extends Reptile {
    private String breed;

    public Frog(int weight, Shelter shelter, String name, Colour colour, int age, String breed) {
        super(weight, shelter, name, colour, age);
        this.breed = breed;
    }


    public String getBreed() {
        return breed;

    }public String getInfo() {
        return super.getInfo() + "   порода:" + breed;
    }


}
