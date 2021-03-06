package com.company.creatures;

import com.company.Selleable;

public abstract class Animal implements Selleable, Feedable {
    public final String species;
    private double weight;
    public String name;

    Animal(String species) {
        this.species = species;
        switch (this.species) {
            case "dog":
                this.weight = 22.0;
                break;
            case "cat":
                this.weight = 5.0;
                break;
            case "horse":
                this.weight = 190.0;
                break;
            default:
                this.weight = 1.0;
        }
    }

    public void feed() {
        if (this.weight > 0 && this.weight < 100) {
            this.weight *= 1.1;
            System.out.println("Mniam! Przytyłem: " + this.weight);
        } else if (this.weight > 100) {
            this.weight *= 1.05;
            System.out.println("Mniam! Przytyłem: " + this.weight);
        } else {
            System.out.println(this.name+" już nie żyje!");
        }
    }

    public void feed(Double foodWeight) {
        if (this.weight > 0 ) {
            this.weight += foodWeight;
            System.out.println("Mniam! Przytyłem: " + this.weight);
        } else {
            System.out.println(this.name+" już nie żyje!");
        }
    }

    public void takeForAWalk() {
        if (this.weight > 0) {
            this.weight -= 0.5;
            System.out.println("Hurra, spacer!!! Schudłem: " + this.weight);
        } else System.out.println("Padłem i nie wstanę już...");
    }

    public void printName() {
        System.out.println("Wabię się: " + this.name);
    }

    public void printNameAndOwner(String owner) {
        System.out.println(owner + " jest właścicielem " + this.name);
    }

    Double getWeight() {
        return this.weight;
    }

    String getNameAndOwner(String owner) {
        return owner + " posiada " + this.name;
    }

    @Override
    public String toString() {
        return this.species + " " + this.name + " " + this.weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("I już dzwonimy do płokułatuły!");
        }
        if (seller.pet != this) {
            throw new Exception("Nie posiadasz tego zwierzęcia!");
        }
        if (buyer.cash < price) {
            throw new Exception("No i co?! Gdzie forsa?!");
        }
        buyer.pet = this;
        seller.pet = null;
        buyer.cash -= price;
        seller.cash += price;
        System.out.println("A taki fajny był, amerykański");
    }

}
