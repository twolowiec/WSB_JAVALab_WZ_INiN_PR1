package com.company;

public class Animal {
    String species;
    Double weight;
    String name;

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


}
