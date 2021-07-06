package com.company.devices;

public class LPG extends Car {
    public LPG(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Tanukje skroplony gaz.");
    }
}
