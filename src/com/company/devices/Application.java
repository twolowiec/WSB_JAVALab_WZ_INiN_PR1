package com.company.devices;

public class Application {
    String name;
    String version;
    Double price;

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name=" + name + ", version=" + version + ", price=" + price;
    }

    String getName() {
        return name;
    }

    Double getPrice() {
        return price;
    }
}
