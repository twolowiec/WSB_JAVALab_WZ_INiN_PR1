package com.company.creatures;

import com.company.Selleable;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human extends Animal {
    private static final String HUMAN_SPECIES = "Homo Sapiens";

    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car personal;
    private Double salary;
    public Double cash;

    public Human(String lastName) {
        super(HUMAN_SPECIES);
        this.lastName = lastName;
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

    public Car getPersonal() {
        return personal;
    }

    public void setPersonal(Car car) {
        if (car.value < this.salary) {
            System.out.println("Brawo! Kupiłeś samochód za gotówkę.");
            buyCar(car);
        } else if ((car.value/12) < this.salary) {
            System.out.println("Musiałeś finansować zakup za pożyczkę.");
            buyCar(car);
        } else System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
    }

    public Car buyCar(Car car) {
        return this.personal=car;
    }
    public Car sellCar() {
        return this.personal = null;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.salary;
    }


}
