package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.name = "Szarik";

        Human me = new Human();
        me.pet = dog;
        me.firstName = "Tomasz";
        me.lastName = "Wołowiec";

        me.setSalary(12000);
        me.getSalary();

        Car passeratti = new Car("Volkswagen", "Passat", 2001);
        passeratti.value = 8000.00;
        me.setPersonal(passeratti);
        me.getPersonal();

        passeratti.turnOn();

        Car passat = new Car("Volkswagen", "Passat", 2001);
        passat.value = 18000.00;
// porównanie dwóch samochodów o tych samych wartościach pól
        System.out.println();
        System.out.println(passeratti == passat);
        System.out.println(passeratti);
        System.out.println(passat);
        System.out.println(passeratti.equals(passat));
        System.out.println();

//        System.out.println(me.pet.species);
        System.out.println(dog);


    }
}
