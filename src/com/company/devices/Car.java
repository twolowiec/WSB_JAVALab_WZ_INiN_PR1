package com.company.devices;

public class Car {
    public final String producer;
    public final String model;
    public Double millage;
    public String fuel;
    public Double ecv;
    public Double value;


    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Car(String producer, String model, Double millage, String fuel, Double ecv, Double value) {
        this.producer = producer;
        this.model = model;
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

}
