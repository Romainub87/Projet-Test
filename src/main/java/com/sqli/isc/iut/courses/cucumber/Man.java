package com.sqli.isc.iut.courses.cucumber;

public class Man {

    private String name;
    private int numberOfDrinks;
    private int bill;

    public Man(String name) {
        this.name = name;
        this.numberOfDrinks = 0;
        this.bill = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDrinks() {
        return numberOfDrinks;
    }

    public int getBill() {
        return bill;
    }

    public void addToBill(int amount) {
        bill += amount;
    }

    public void setBill(int amount) {
        bill = amount;
    }

    public void drink(int numberOfDrinks) {
        this.numberOfDrinks += numberOfDrinks;
    }

    public void orderCocktails(int numberOfCocktails, int pricePerCocktail) {
        bill += numberOfCocktails * pricePerCocktail;
    }

    public void payBill() {
        bill = 0;
    }

    public boolean isHappy(int numberOfDrinks) {
        return numberOfDrinks < 2;
    }
}
