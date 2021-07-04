package com.company.devices;

public class Car extends Device {
//    public final String producer;
//    public final String model;
    public Double millage;
    public String fuel;
    public Double ecv;
    public Double value;


    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
    }

    public Car(String producer, String model, Integer yearOfProduction, Double millage, String fuel, Double ecv, Double value) {
        super(producer,model,yearOfProduction);
        this.millage = millage;
        this.fuel = fuel;
        this.ecv = ecv;
        this.value = value;
    }

    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car car = (Car) o;
            if (car.producer.equals(this.producer)
                    && car.model.equals(this.model)
                    && car.value.equals(this.value))
                return true;
            else return false;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.value;
    }

    @Override
    public void turnOn() {
        System.out.println();
        System.out.println("Otwórz CZ");
        System.out.println("Wsiądź do auta");
        System.out.println("Uruchom silnik ze stacyjki");
        System.out.println("Wruuuum!!! Samochód uruchomiony.");
    }

}
