package com.company.devices;

public abstract class Device {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public Double value;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Integer getYearOfProduction() {
        return this.yearOfProduction;
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }

    public abstract void turnOn();
}
