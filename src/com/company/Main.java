package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("приют", "токтогула");
        Reptile reptile = new Reptile(1, new Shelter("", ""), "рептилоид", Colour.GREEN, 20);
        System.out.println(reptile.getInfo());
        reptile.getColour(Colour.BLACK);
        reptile.makeVoice(2, "ква");


        Frog frog1 = new Frog(1, new Shelter("приют", "боконбаева"), "лягушка", Colour.GREEN, 20, "хлоднокровная");
        System.out.println(frog1.getInfo());
        frog1.getColour(Colour.BROWN);
        frog1.makeVoice("ква", 1);

        Frog frog2 = new Frog(1, new Shelter("приют", "аламедин"), "лягушка", Colour.GREEN, 21, "теплокровная");
        System.out.println(frog2.getInfo());
        frog2.getColour(Colour.GREEN);


    }
}
