package com.sqli.isc.iut.courses.cucumber;

public class Bar {
    private String name;
    private int capacity;
    private int currentPeople;
    private double bill;

    public Bar(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.currentPeople = 0;
        this.bill = 0.0;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentPeople() {
        return currentPeople;
    }

    public void setCurrentPeople(int currentPeople) {
        this.currentPeople = currentPeople;
    }

    public double getBill() {
        return bill;
    }

    public void enter(int peopleCount) {
        this.currentPeople += peopleCount;
    }

    public String isComplete() {
        if (this.currentPeople <= this.capacity) {
            return "Not complete";
        } else {
            return "Complete";
        }
    }

    public void orderCocktails(int numberOfCocktails, double pricePerCocktail) {
        bill += numberOfCocktails * pricePerCocktail;
    }

    public void payBill() {
        bill = 0.0;
    }
}

