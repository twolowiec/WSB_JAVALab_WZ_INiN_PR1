package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet dog = new Pet("dog");
        dog.name = "Szarik";

        Pet kon = new Pet("horse");
        kon.name = "Rafał";

        Human me = new Human("Wołowiec", 5);
        System.out.println(me.garage.length + "\n");
//        me.pet = dog;
        me.firstName = "Tomasz";

        Human daugther = new Human("Wołowiec", 0);
        daugther.firstName = "Oliwia";
//        System.out.println(daugther.toString());
        daugther.pet = kon;
        Human janusz = new Human("Handlarz", 3);
        janusz.firstName = "Janusz";
//        System.out.println(janusz.garage.length);

        me.cash = 0.00;
        janusz.cash = 20000.00;
        janusz.setSalary(5000.00);
        System.out.println(" ");
        daugther.cash = 0.00;
        me.setSalary(12000);
        System.out.println(" ");
//        me.getSalary();

        LPG passeratti = new LPG("Volkswagen", "Passat", 2001);
        passeratti.value = 8000.00;
        me.setPersonal(passeratti, 0);
//        me.getPersonal(0);
        System.out.println(me.getPersonal(0).toString());
        System.out.println(me.getPersonal(0));
        Diesel passat = new Diesel("Volkswagen", "Passat", 2006);
        passat.value = 11000.00;
        System.out.println(" ");
        System.out.println("Czy " + passat + " ma własciciela: " + passat.isOwner());
        me.setPersonal(passat, 1);
        System.out.println("Czy " + passat + " ma własciciela: " + passat.isOwner());
// porównanie dwóch samochodów o tych samych wartościach pól
//        System.out.println();
//        System.out.println(passeratti == passat);
//        System.out.println(passeratti);
//        System.out.println(passat);
//        System.out.println(passeratti.equals(passat));
//        System.out.println();

//        System.out.println(me.species);
        System.out.println(" ");
        me.getGarageItems();
        System.out.println(" ");
        janusz.getGarageItems();
        System.out.println(" ");
        me.getGarageValue();
        System.out.println(" ");
        me.sortByAge();
        System.out.println(" ");
//        System.out.println(me instanceof Animal);
//        System.out.println(me instanceof Human);
//        System.out.println(me instanceof Object);

//        passeratti.turnOn();

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

        passeratti.checkChangeOwnership(me, janusz);
//        me.getGarageItems();
//        me.getGarageValue();

//        janusz.getGarageItems();
//        janusz.getGarageValue();

        System.out.println(" ");
        System.out.println("Ilość transakcji dla " + passeratti + ": " + passeratti.countTransactionsByCar());
//        String[] apps = {"YouTube", "Firebase", "Revolut", "MojaWSB", "Play24", "GooglePay"};
//        smartphone.installAnnApp("Apka");
//        smartphone.installAnnApp("Apka", "1.05");
//        smartphone.installAnnApp("Apka", "1.01", "play.google.com");
//        smartphone.installAnnApp(apps);

        System.out.println();
        System.out.println("Czy " + me + " był włascicielem " + passeratti + ": " + passeratti.wasHeOwner(me));
        System.out.println();
        passeratti.getTransactions();


        /////////////////////////////////

        Application civRev2 = new Application("CivRev2", "1.4.4", 54.00);
        Application iamRich = new Application("IamRich", "1.0", 999.00);
        Application kidSafeBrowse = new Application("KidSafeBrowse", "1.705", 35.00);
        Application mojaWSB = new Application("Moja WSB", "21.12.0", 0.00);
        Application msOutlook = new Application("MS Outlook", "4.2124.1", 29.90);
        Application revolut = new Application("Revolut", "8.10", 0.00);
        Application starTracker = new Application("Star Tracker", "1.6.85", 12.99);
        Application teams = new Application("MS Teams", "1416.0", 0.00);
        Application tidal = new Application("Tidal", "2.43.0", 19.99);
        Application tinder = new Application("Tinder", "12.11.0", 69.16);

        smartphone.appInstaler(me, civRev2);
        smartphone.appInstaler(me, iamRich);
        smartphone.appInstaler(me, kidSafeBrowse);
        smartphone.appInstaler(me, mojaWSB);
        smartphone.appInstaler(me, msOutlook);
        smartphone.appInstaler(me, revolut);
        smartphone.appInstaler(me, starTracker);
        smartphone.appInstaler(me, teams);
        smartphone.appInstaler(me, tidal);
        smartphone.appInstaler(me, tinder);

        System.out.println();
        System.out.println(smartphone.isInstaled(tidal));
        System.out.println();
        System.out.println(smartphone.isInstaledByName("IamRich"));
        System.out.println();
        smartphone.getFreeApps();
        System.out.println();
        System.out.println("Wartość zainstalowanych aplikacji: " + smartphone.installedAppsValue());

        System.out.println("\nSortowanie po nazwie \n");
        smartphone.sortAppsByName();
        System.out.println("\nSortowanie po cenie \n");
        smartphone.sortAppsByPrice();
    }

}
