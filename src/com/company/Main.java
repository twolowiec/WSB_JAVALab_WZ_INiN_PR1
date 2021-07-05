package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal dog = new Animal("dog");
        dog.name = "Szarik";

        Animal kon = new Animal("horse");
        kon.name = "Rafał";

        Human me = new Human("Wołowiec");
        me.pet = dog;
        me.firstName = "Tomasz";

        Human daugther = new Human("Wołowiec");
        daugther.firstName = "Oliwia";
        System.out.println(daugther.toString());
        daugther.pet = kon;
        Human janusz = new Human("Janusz Handlarz");
        janusz.cash = 1000.00;

        me.setSalary(12000);
        me.getSalary();

        Car passeratti = new Car("Volkswagen", "Passat", 2001);
        passeratti.value = 8000.00;
        me.setPersonal(passeratti);

        Car passat = new Car("Volkswagen", "Passat", 2001);
        passat.value = 8000.00;
// porównanie dwóch samochodów o tych samych wartościach pól
        System.out.println();
        System.out.println(passeratti == passat);
        System.out.println(passeratti);
        System.out.println(passat);
        System.out.println(passeratti.equals(passat));
        System.out.println();

        System.out.println(me.species);

        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Object);

        passeratti.turnOn();

        Phone phone = new Phone("Huaweii", "MARLib-Xv1", 2019);
        me.phone = phone;
        phone.sell(me,janusz,1200.00);
        kon.sell(daugther,janusz,10000.50);
    }

}
