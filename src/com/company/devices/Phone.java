package com.company.devices;

public class Phone extends Device {
//    String producer;
//    String model;
    Double screenSize;
    String os;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.screenSize + " " + this.os;
    }

    @Override
    public void turnOn() {
        System.out.println();
        System.out.println("Wciśnij i przytrzymaj przycisk zasilania.");
        System.out.println("Ładowanie Systemu Operacyjnego...");
        System.out.println("Urządzenie uruchomione");
    }
}
