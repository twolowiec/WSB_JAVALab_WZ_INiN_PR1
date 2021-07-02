package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.name = "Szarik";

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

        me.setSalary(-1457.86);
        me.setSalary(0);
        me.setSalary(12000);
        me.getSalary();

    }
}
