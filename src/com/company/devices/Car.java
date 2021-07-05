package com.company.devices;

import com.company.Selleable;
import com.company.creatures.Human;

public class Car extends Device implements Selleable{
//    public final String producer;
//    public final String model;
    public Double millage;
    public String fuel;
    public Double ecv;
    public Double value;


    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
    }

//    public Car(String producer, String model, Integer yearOfProduction, Double millage, String fuel, Double ecv, Double value) {
//        super(producer,model,yearOfProduction);
//        this.millage = millage;
//        this.fuel = fuel;
//        this.ecv = ecv;
//        this.value = value;
//    }

    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car car = (Car) o;
            return car.producer.equals(this.producer)
                    && car.model.equals(this.model)
                    && car.yearOfProduction.equals(this.yearOfProduction);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.value + " " + this.yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println();
        System.out.println("Otwórz CZ");
        System.out.println("Wsiądź do auta");
        System.out.println("Uruchom silnik ze stacyjki");
        System.out.println("Wruuuum!!! Samochód uruchomiony. Zapnij pasy!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getPersonal() != this) {
            throw new Exception(seller.firstName + " nie posiada " + seller.getPersonal());
        } else if (buyer.cash < price) {
            throw new Exception("Nie stać Cię na zakup " + seller.getPersonal() + " od " + seller.firstName);
        } else {
            System.out.println("Gratuluje zakupu "+seller.getPersonal()+ "!");
            buyer.buyCar(seller.getPersonal());
            seller.sellCar();
            buyer.cash -= price;
            seller.cash += price;
        }
    }

}
