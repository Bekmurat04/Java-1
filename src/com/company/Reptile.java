package com.company;

import java.util.Random;

public class Reptile extends Animal {
    private int age = generateDefaultAge();
    private String name;
    private Colour colour;






    public Reptile(int weight, Shelter shelter, String name, Colour colour, int age) {
        super(weight, shelter);
        this.name = name;
        this.colour = colour;
        this.age = age;




    }

    public String getName() {
        return name;
    }

    public Colour getColour(com.company.Colour black) {
        return colour;
    }

    public int getAge() {
        return age;
    }
    private int generateDefaultAge() {
        return new Random().nextInt(18)+1;
    }








    public void makeVoice(int num, String voice){
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }
    public final void makeVoice(String voice, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }





    public String getInfo(){
        return super.getInfo() + "имя:" + name + "  цвет:" + colour +"   возраст:" + age+" ";
    }

}

