package com.sqli.isc.iut.courses.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BarSteps {
    @Given("Mr Pignon and Mr Leblanc go to the bar Le Juste")
    public void mrPignonAndMrLeblancGoToTheBarLeJuste() {
    }

    @And("there are only {int} seats in the bar")
    public void thereAreOnlySeatsInTheBar(int arg0) {
    }

    @Given("there are already {int} people in the bar")
    public void thereAreAlreadyPeopleInTheBar(int arg0) {
    }

    @When("Mr Pignon and Mr Leblanc arrive at the bar")
    public void mrPignonAndMrLeblancArriveAtTheBar() {
    }

    @Then("they are denied entry because the bar is full")
    public void theyAreDeniedEntryBecauseTheBarIsFull() {
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
