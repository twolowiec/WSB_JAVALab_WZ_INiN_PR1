package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car personal;
    private double salary;

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

    public void setPersonal(Car personal) {
        if (personal.value < this.salary) {
            System.out.println("Brawo! Kupiłeś samochód za gotówkę.");
        } else if ((personal.value/12) < this.salary) {
            System.out.println("Musiałeś finansować zakup za pożyczkę.");
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
        }
    }
}
