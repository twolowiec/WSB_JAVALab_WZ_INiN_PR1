package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        //        Animal cat = new Animal();
        //        Animal mouse = new Animal();
        dog.name = "Szarik";
// Zmiana na pole private - niedostępne
//        dog.weight = 12.0;
// Pole final - brak możliwości nadpisania
//        dog.species = "Canis lupus familiaris";

        System.out.println(dog.name);
        System.out.println(dog.species);

        dog.printName();
        dog.printNameAndOwner("Tomasz");

        String text = dog.getNameAndOwner("Tomasz");
        System.out.println(text);

        Human me = new Human();
        me.pet = dog;
        me.firstName = "Tomasz";
        me.lastName = "Wołowiec";

        Car passeratti = new Car("Volkswagen", "Passat");
        me.personal = passeratti;

        System.out.println(me.pet.species);
        System.out.println(me.personal.model);
        System.out.println(me.personal.producer);

//        dog.feed();
//	    dog.feed();
//	    dog.takeForAWalk();
//    	dog.takeForAWalk();
//	    dog.feed();
//    	dog.takeForAWalk();
//	    dog.takeForAWalk();
//    	dog.feed();
//	    dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//        dog.takeForAWalk();
//	    dog.feed();
//        dog.takeForAWalk();


    }
}
