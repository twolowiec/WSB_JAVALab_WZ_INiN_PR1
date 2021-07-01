package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Szarik";
        dog.weight = 12.0;
        dog.species = "Canis lupus familiaris";

        System.out.println(dog.name);
        System.out.println(dog.species);

        dog.printName();
        dog.printNameAndOwner("Tomasz");

        String text = dog.getNameAndOwner("Tomasz");
        System.out.println(text);

//        Animal cat = new Animal();
//        Animal mouse = new Animal();
    }
}
