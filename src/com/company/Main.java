package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.name = "Szarik";

//        System.out.println(dog.name);
//        System.out.println(dog.species);
//
//        dog.printName();
//        dog.printNameAndOwner("Tomasz");
//
//        String text = dog.getNameAndOwner("Tomasz");
//        System.out.println(text);

        Human me = new Human();
        me.pet = dog;
        me.firstName = "Tomasz";
        me.lastName = "Wołowiec";

//        me.setSalary(-1457.86);
//        me.setSalary(0);
        me.setSalary(12000);
        me.getSalary();

        Car passeratti = new Car("Volkswagen", "Passat");
        passeratti.value = 8000;
        me.setPersonal(passeratti);
        me.getPersonal();

        Car passat = new Car("Volkswagen", "Passat");
        passat.value = 8000;

//        System.out.println(me.pet.species);



    }
}
