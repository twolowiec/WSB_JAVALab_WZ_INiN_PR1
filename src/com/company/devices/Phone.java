package com.company.devices;

import com.company.Selleable;
import com.company.creatures.Human;

import java.net.URL;

public class Phone extends Device implements Selleable {
    //    String producer;
//    String model;
    public Double screenSize;
    public String os;

    public String appName;
    static final String serverAdress = "216.58.209.14";
    static final String protocol = "";
    static final String appVersion = "";

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
        System.out.println("Instaluje aplikację "+appName+" w wersji "+appVersion);
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
}
