@currency
Feature: user should able to change currency  from drop down box and verify price should be updated in selected currency
  Scenario: user should able to change currency  from drop down box
    Given user is on homepage
    When user click on dropdown box
    And select option
    Then user should be able to  change currency
    And user should able to see prices of product in selected currency