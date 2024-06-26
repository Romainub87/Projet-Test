package com.sqli.isc.iut.courses.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BarSteps {

    private Bar bar;
    private Man Pignon;
    private Man Leblanc;

    @Given("there are only {int} seats in the bar")
    public void thereAreOnlySeatsInTheBar(int arg0) {
        this.bar = new Bar("Le Juste", arg0);
    }

    @And("Mr Pignon and Mr Leblanc go to the bar Le Juste")
    public void mrPignonAndMrLeblancGoToTheBarLeJuste() {
        this.Pignon = new Man("Pignon");
        this.Leblanc = new Man("Leblanc");
        this.bar.enter(2);
    }

    @Given("there are already {int} people in the bar")
    public void thereAreAlreadyPeopleInTheBar(int arg0) {
        this.bar.setCurrentPeople(arg0);
    }

    @Then("they are denied")
    public void theyAreDenied() {
        assert (this.bar.getCurrentPeople() >= this.bar.getCapacity());
    }

    @And("the bar display {string}")
    public void theBarDisplay(String arg0) {
        assert (this.bar.isComplete().equals(arg0));
    }

    @Then("the person behind them cannot enter because the bar is full")
    public void thePersonBehindThemCannotEnterBecauseTheBarIsFull() {
        assert (this.bar.getCurrentPeople() == this.bar.getCapacity());
        this.bar.enter(1);
        assert (this.bar.isComplete().equals("Complete"));
        assert (this.bar.getCurrentPeople() >= this.bar.getCapacity());
        this.bar.suppressPeople(1);
        assert (this.bar.getCurrentPeople() == this.bar.getCapacity());
    }

    @And("they each order a cocktail of the month for €{int}")
    public void theyEachOrderACocktailOfTheMonthFor(int arg0) {
        this.Pignon.orderCocktails(1, arg0);
        this.Leblanc.orderCocktails(1, arg0);
    }

    @And("Mr Leblanc pays for all the cocktails")
    public void mrLeblancPaysForAllTheCocktails() {
        this.Leblanc.addToBill(this.Pignon.getBill());
        this.Pignon.setBill(0.0);
        this.bar.addToBill(this.Leblanc, (int) this.Leblanc.getBill());
    }

    @When("they finish their drinks")
    public void theyFinishTheirDrinks() {
        this.Pignon.drink(1);
        this.Leblanc.drink(1);
    }

    @Then("the bill is checked")
    public void theBillIsChecked() {
        assert (this.bar.getBillForOneMan(this.Leblanc) == this.Leblanc.getBill());
    }

    @And("Mr Leblanc pays the bill")
    public void mrLeblancPaysTheBill() {
        this.Leblanc.payBill();
    }

    @And("Mr Pignon is happy because they only had one drink")
    public void mrPignonIsHappyBecauseTheyOnlyHadOneDrink() {
        assert (this.Pignon.isHappy(this.Pignon.getNumberOfDrinks()));
    }


    @When("Mr Pignon and Mr Leblanc arrive at the bar")
    public void mrPignonAndMrLeblancArriveAtTheBar() {
    }

    @Then("Mr Pignon pays")
    public void mrPignonPays() {
    }

    @When("Mr Leblanc insists for another cocktail of month")
    public void mrLeblancInsistsForAnotherCocktailOfMonth() {
    }

    @Then("Mr Leblanc order {int} cocktails for him own bill")
    public void mrLeblancOrderCocktailsForHimOwnBill(int arg0) {
    }

    @And("Mr Leblanc checked his bill")
    public void mrLeblancCheckedHisBill() {
    }

    @And("Mr Leblanc pays")
    public void mrLeblancPays() {
    }

    @And("Mr Pignon is sad because he had more than one drink")
    public void mrPignonIsSadBecauseHeHadMoreThanOneDrink() {
    }
}
