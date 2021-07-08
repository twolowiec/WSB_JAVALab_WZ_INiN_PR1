package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Human extends Animal {
    private static final String HUMAN_SPECIES = "Homo Sapiens";

    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    public Car[] garage;
    private Double salary;
    public Double cash;


    public Human(String lastName, Integer garageSize) {
        super(HUMAN_SPECIES);
        this.lastName = lastName;
        this.garage = new Car[garageSize];
    }

    public Double getSalary() {
        System.out.println("Wysokośc wypłaty: " + salary);
        System.out.println("Dane z dnia: " + new Date());
        return salary;
    }

    public void setSalary(double amount) {
        if (amount < 0) {
            System.out.println("Nie możesz dopłacac do swojej pracy na etacie!");
        } else if (amount == 0) {
            System.out.println("Jesteś bezrobotny! Zgłoś się do UP po kuroniówkę.");
        } else {
            this.salary = amount;
            System.out.println("Nowa kwota " + amount + " została przekazana do systemu księgowego");
            System.out.println("Twój aneks do umowy jest gotowy do odbioru u Pani Hani w kadrach.");
            System.out.println("ZUS i US otrzymały informacje o zmianie dochodu - jego ukrywanie nie ma sensu!");
        }
    }

    public Car getPersonal(int position) {
        return this.garage[position];
    }

    public void setPersonal(Car car, int position) {
        if (car.value < this.salary) {
            System.out.println("Brawo! Kupiłeś samochód za gotówkę.");
            insertCar(car, position);
            car.setNewOwner(this);
        } else if ((car.value / 12) < this.salary) {
            System.out.println("Musiałeś finansować zakup za pożyczkę.");
            insertCar(car, position);
            car.setNewOwner(this);
        } else System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
    }

    public Car insertCar(Car car, int position) {
        return this.garage[position] = car;
    }

    public Car removeCar(int position) {
        return this.garage[position] = null;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public void getGarageValue() {
        double valueSum = 0;
        for (Car car : garage) {
            if (car != null) {
                valueSum += car.value;
            }
        }
        System.out.println("Wartość aut w garażu to: " + valueSum);
    }

    public void getGarageItems() {
        for (Car car : garage)
            if (car == null) System.out.println("Wolne miejsce");
            else System.out.println(car.toString());
    }

    public void sortByAge() {
        Arrays.sort(garage, Comparator.nullsFirst(Comparator.comparing(Car::getYearOfProduction)).reversed());
        for (Car car : garage) {
            System.out.println(car);
        }

    }



}
