package com.sqli.isc.iut.courses.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BarSteps {

    private Bar bar;

    @Given("there are only {int} seats in the bar")
    public void thereAreOnlySeatsInTheBar(int arg0) {
        this.bar = new Bar("Le Juste", arg0);
    }

    @And("Mr Pignon and Mr Leblanc go to the bar Le Juste")
    public void mrPignonAndMrLeblancGoToTheBarLeJuste() {
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

    }

    @And("they each order a cocktail of the month for €{int}")
    public void theyEachOrderACocktailOfTheMonthFor€(int arg0) {
    }

    @And("Mr Leblanc pays for all the cocktails")
    public void mrLeblancPaysForAllTheCocktails() {
    }

    @When("they finish their drinks")
    public void theyFinishTheirDrinks() {
    }

    @Then("the bill is checked")
    public void theBillIsChecked() {
    }

    @And("Mr Leblanc pays the bill")
    public void mrLeblancPaysTheBill() {
    }

    @And("Mr Pignon is happy because they only had one drink")
    public void mrPignonIsHappyBecauseTheyOnlyHadOneDrink() {
    }


}
