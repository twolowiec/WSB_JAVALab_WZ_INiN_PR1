package com.company.devices;

import com.company.Selleable;
import com.company.creatures.Human;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

public class Phone extends Device implements Selleable {
    //    String producer;
//    String model;
    public Double screenSize;
    public String os;

    public String appName;
    static final String serverAdress = "216.58.209.14";
    static final String protocol = "https://";
    static final String appVersion = "1.01";

    ArrayList<Application> appsList = new ArrayList<>();

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println();
        System.out.println("Wciśnij i przytrzymaj przycisk zasilania.");
        System.out.println("Ładowanie Systemu Operacyjnego...");
        System.out.println("Urządzenie uruchomione");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != null && buyer.cash > price) {
            buyer.phone = seller.phone;
            seller.phone = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Brawo! " + buyer.firstName + " kupiłeś " + buyer.phone.toString() + " od " + seller.firstName);
        } else if (seller.phone != this) {
            System.out.println("Uważaj! " + seller.firstName + " chyba chce Ci sprzedać cegłę. Nie posiada " + seller.phone.toString());
        } else if (buyer.cash < price) {
            System.out.println("Z czym do ludzi?! Nie stac się na zakup " + seller.phone.toString() + "!");
        }
    }

    public void installAnnApp(String appName) {
        System.out.println("Instaluje aplikację: " + appName);
    }

    public void installAnnApp(String appName, String appVersion) {
        System.out.println("Instaluje aplikację " + appName + " w wersji " + appVersion);
    }

    public void installAnnApp(String appName, String appVersion, String serverAdress) {
        System.out.println("Instaluje aplikację " + appName + " w wersji " + appVersion + " z serwera " + serverAdress);
    }

    public void installAnnApp(String[] apps) {
        for (String app : apps) {
            System.out.println(app + " oczekuje na instalacje");
        }
    }

    public void installAnnApp(URL adress) {
        System.out.println("Aplikacja zainstalowana z: " + adress);
    }

    public void appInstaler(Human owner, Application app) {
        if (owner.cash >= app.price) {
            appsList.add(app);
            owner.cash -= app.price;
            System.out.println("Zainstalowano: " + app.name);
        } else System.out.println("Przykro mi nie posiadasz wystarczająco dużo pieniędzy.");
    }

    public Boolean isInstaled(Application app) {
        return this.appsList.contains(app);
    }

    public Boolean isInstaledByName(String appName) {
        return this.appsList.toString().contains(appName);
    }

    public void getFreeApps() {
        for (Application app : appsList) {
            if (app.price == 0.0)
                System.out.println(app);
        }
    }

    public Double installedAppsValue() {
        double sum = 0;
        for (Application app : appsList) {
            sum += app.price;
        }
        return sum;
    }

    public void sortAppsByName() {
        appsList.sort(Comparator.comparing(Application::getName));
        for (Application app : appsList) {
            System.out.println(app.name);
        }
    }

    public void sortAppsByPrice() {
        appsList.sort(Comparator.comparing(Application::getPrice));
        for (Application app : appsList) {
            System.out.println(app.name);
        }
    }
}
