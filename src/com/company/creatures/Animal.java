package com.company.creatures;

public class Animal {
    public final String species;
    private double weight;
    public String name;

    public Animal(String species) {
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

    void takeForAWalk() {
        if (this.weight > 0) {
            this.weight -= 0.5;
            System.out.println("Hurra, spacer!!! Schudłem: " + this.weight);
        } else System.out.println("Padłem i nie wstanę już...");
    }

    void printName() {
        System.out.println("Wabię się: " + this.name);
    }

    void printNameAndOwner(String owner) {
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

}
