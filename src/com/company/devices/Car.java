package com.company.devices;

import com.company.Selleable;
import com.company.Transactions;
import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public abstract class Car extends Device implements Selleable, Comparator<Car> {
    //    public final String producer;
//    public final String model;
    public Double millage;
    public String fuel;
    public Double ecv;
//    public Double value;

    ArrayList<Human> owners = new ArrayList<Human>();
    ArrayList<Transactions> listOfTransactions = new ArrayList<>();
//

    Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public Car(String producer, String model, Integer yearOfProduction, Double millage, String fuel, Double ecv, Double value) {
        super(producer, model, yearOfProduction);
        this.millage = millage;
        this.fuel = fuel;
        this.ecv = ecv;
        this.value = value;
    }

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
        return this.producer + " " + this.model + " " + this.yearOfProduction + " " + this.value;
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
        Integer buyerVoidPlace = null;
        Integer sellerCarPlace = null;

        for (int i = 0; i < seller.garage.length; i++) {
            if (seller.garage[i] == this) {
                sellerCarPlace = i;
                break;
            }
        }

        for (int i = 0; i < buyer.garage.length; i++) {
            if (seller.garage[i] == null) {
                buyerVoidPlace = i;
                break;
            }
        }

        if (!this.equals(seller.garage[sellerCarPlace])) {
            throw new Exception(seller.firstName + " nie posiada tego pojazdu w garażu");
        }
        if (buyer.cash < price) {
            throw new Exception("Nie stać Cię na zakup tego auta od " + seller.firstName);
        }
        if (buyerVoidPlace == null) {
            throw new Exception(buyer.firstName + " nie ma wolnych miejsc w garazu.");
        }

        System.out.println("Gratuluje zakupu!");
        buyer.insertCar(this, buyerVoidPlace);
        seller.removeCar(sellerCarPlace);
        buyer.cash -= price;
        seller.cash += price;
        this.setNewOwner(buyer);
        addTransaction(seller,buyer,price);
    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.yearOfProduction - o2.yearOfProduction;
    }

    public abstract void refuel();

    public void setNewOwner(Human owner) {
        this.owners.add(owner);
    }

    public boolean wasHeOwner(Human owner) {
        if (this.owners.contains(owner))
            return true;
        else
            return false;
    }

    public boolean isOwner() {
        if (this.owners.isEmpty())
            return false;
        else
            return true;
    }

    public void checkChangeOwnership(Human seller, Human buyer) {
        for (int i = 0; i < this.owners.size()-1; i++) {
            if (this.owners.get(i) == seller && this.owners.get(i + 1) == buyer) {
                System.out.println(buyer + " nabył pojazd od " + seller);
                break;
            } else
                System.out.println("Nie posiadamy zapisu takiej transakcji.");
        }

    }

    public Integer countTransactionsByCar() {
        return this.owners.size();
    }

    public void addTransaction (Human seller, Human buyer, Double price) {
        Transactions transactions = new Transactions(seller,buyer,price);
        listOfTransactions.add(transactions);
    }

    public void getTransactions () {
        for(Transactions transaction : listOfTransactions) {
            System.out.println(transaction);
        }
    }
}
