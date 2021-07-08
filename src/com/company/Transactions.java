package com.company;

import com.company.creatures.Human;

import java.util.Date;

public class Transactions {

    public Human seller;
    public Human buyer;
    public Double price;
    public Date date = new Date();

    public Transactions(Human seller, Human buyer, Double price) {
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.date = new Date();
    }

    // koszmar że mi wyleciało to z głowy
    public String toString() {
        return this.seller + " " + this.buyer + " " + this.price + " " + this.date;
    }
}
