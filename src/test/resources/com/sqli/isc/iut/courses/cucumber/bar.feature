Feature: Visit to the bar Le Juste

  Background:
    Given Mr Pignon and Mr Leblanc go to the bar Le Juste
    And there are only 10 seats in the bar

  Scenario: Denied entry because the bar is full
    Given there are already 9 people in the bar
    When Mr Pignon and Mr Leblanc arrive at the bar
    Then they are denied entry because the bar is full

  Scenario: Ordering cocktails and checking the bill
    Given there are already 8 people in the bar
    When Mr Pignon and Mr Leblanc arrive at the bar
    Then the person behind them cannot enter because the bar is full
    And they each order a cocktail of the month for €10
    And Mr Leblanc pays for all the cocktails
    When they finish their drinks
    Then the bill is checked
    And Mr Leblanc pays the bill
    And Mr Pignon is happy because they only had one drink
