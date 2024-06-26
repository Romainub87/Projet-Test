package com.sqli.isc.iut.courses.cucumber;

public class Man {

    private String name;
    private int numberOfDrinks;
    private double bill;

    public Man(String name) {
        this.name = name;
        this.numberOfDrinks = 0;
        this.bill = 0.0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDrinks() {
        return numberOfDrinks;
    }

    public double getBill() {
        return bill;
    }

    public void addToBill(double amount) {
        bill += amount;
    }

    public void setBill(double amount) {
        bill = amount;
    }

    public void drink(int numberOfDrinks) {
        this.numberOfDrinks += numberOfDrinks;
    }

    public void orderCocktails(int numberOfCocktails, double pricePerCocktail) {
        bill += numberOfCocktails * pricePerCocktail;
    }

    public void payBill() {
        bill = 0.0;
    }

    public boolean isHappy(int numberOfDrinks) {
        return numberOfDrinks < 2;
    }
}
