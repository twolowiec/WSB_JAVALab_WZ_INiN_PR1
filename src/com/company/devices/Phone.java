package com.company.devices;

public class Phone {
    String producer;
    String model;
    Double screenSize;
    String os;


    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.screenSize + " " + this.os;
    }
}
