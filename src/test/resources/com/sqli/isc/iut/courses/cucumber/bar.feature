Feature: Visit to the bar Le Juste

  Background:
    Given there are only 10 seats in the bar
    And Mr Pignon and Mr Leblanc go to the bar Le Juste


  Scenario: Denied entry because the bar is full
    Given there are already 9 people in the bar
    When Mr Pignon and Mr Leblanc go to the bar Le Juste
    Then they are denied
    And the bar display "Complete"

  Scenario: Ordering cocktails and checking the bill
    Given there are already 8 people in the bar
    When Mr Pignon and Mr Leblanc go to the bar Le Juste
    Then the person behind them cannot enter because the bar is full
    And they each order a cocktail of the month for €10
    And Mr Leblanc pays for all the cocktails
    When they finish their drinks
    Then the bill is checked
    And Mr Leblanc pays the bill
    And Mr Pignon is happy because they only had one drink

 Scenario: Ordering their own cocktails and checking the bill
    Given there are already 3 people in the bar
    When  Mr Pignon and Mr Leblanc arrive at the bar
    Then they each order a cocktail of the month for €10
    When they finish their drinks
    And the bill is checked
    Then Mr Pignon pays 
    When Mr Leblanc insists for another cocktail of month
    Then Mr Leblanc order 2 cocktails for him own bill
    And Mr Leblanc checked his bill 
    And Mr Leblanc pays 
    And Mr Pignon is sad because he had more than one drink