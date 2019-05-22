@sort

Feature: user should be able to sort products from high to low and verify product should be from high to low
  Scenario:user should sort product from high to low
    Given user is on homepage
    When user select notebook in Computers
     And click on sort by price:high to low
        Then user should  see  product price from high to low





