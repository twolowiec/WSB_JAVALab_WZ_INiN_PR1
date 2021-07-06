package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet dog = new Pet("dog");
        dog.name = "Szarik";

        Pet kon = new Pet("horse");
        kon.name = "Rafał";

        Human me = new Human("Wołowiec");
        me.pet = dog;
        me.firstName = "Tomasz";

        Human daugther = new Human("Wołowiec");
        daugther.firstName = "Oliwia";
        System.out.println(daugther.toString());
        daugther.pet = kon;
        Human janusz = new Human("Handlarz");
        janusz.firstName = "Janusz";
        me.cash = 0.00;
        janusz.cash = 20000.00;
        janusz.setSalary(5000.00);
        daugther.cash = 0.00;
        me.setSalary(12000);
        me.getSalary();

        LPG passeratti = new LPG("Volkswagen", "Passat", 2001);
        passeratti.value = 8000.00;
        me.setPersonal(passeratti);
        System.out.println(me.getPersonal().toString());
        System.out.println(me.getPersonal());
        Diesel passat = new Diesel("Volkswagen", "Passat", 2001);
        passat.value = 8000.00;
// porównanie dwóch samochodów o tych samych wartościach pól
//        System.out.println();
//        System.out.println(passeratti == passat);
//        System.out.println(passeratti);
//        System.out.println(passat);
//        System.out.println(passeratti.equals(passat));
//        System.out.println();

        System.out.println(me.species);

//        System.out.println(me instanceof Animal);
//        System.out.println(me instanceof Human);
//        System.out.println(me instanceof Object);

        passeratti.turnOn();

        Phone smartphone = new Phone("Huaweii", "MARLib-Xv1", 2019);
        me.phone = smartphone;
        System.out.println("Kasa Tomka przed transackją: " + me.cash);
        smartphone.sell(me, janusz, 1200.00);
        System.out.println("Kasa Janusza po transackji: " + janusz.cash);
        System.out.println("Kasa Tomka po transackji: " + me.cash);
        passeratti.sell(me, janusz, 8000.00);
        System.out.println("Kasa Janusza po transackji: " + janusz.cash);
        System.out.println("Kasa Tomka po transackji: " + me.cash);
        kon.sell(daugther, janusz, 10000.50);
        System.out.println("Kasa Janusza po transackji: " + janusz.cash);

        String[] apps = {"YouTube", "Firebase", "Revolut", "MojaWSB", "Play24", "GooglePay"};
        smartphone.installAnnApp("Apka");
        smartphone.installAnnApp("Apka", "1.05");
        smartphone.installAnnApp("Apka", "1.01", "play.google.com");
        smartphone.installAnnApp(apps);

    }

}
