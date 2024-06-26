package com.sqli.isc.iut.courses.cucumber;

import java.util.HashMap;
import java.util.Map;

 

public class Bar {
    private String name;
    private int capacity;
    private int currentPeople;
    private Map<Man, Integer> billTab;
   

    public Bar(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.currentPeople = 0;
        this.billTab = new HashMap<>();
        this.billTab = new HashMap<>();
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

    public void enter(int peopleCount) {
        this.currentPeople += peopleCount;
    }

    public void suppressPeople(int peopleCount) {
        this.currentPeople -= peopleCount;
    }
 

    public String isComplete() {
        if (this.currentPeople <= this.capacity) {
            return "Not complete";
        } else {
            return "Complete";
        }
    }

    public double getBillForOneMan(Man man) {
        return billTab.get(man);
    }

    public void addToBill(Man man, int amount) {
        if (billTab.containsKey(man)) {
            int currentAmount = amount + this.billTab.get(man);
            this.billTab.put(man, currentAmount);
        } else {
            this.billTab.put(man, amount);
        }
    }
}

