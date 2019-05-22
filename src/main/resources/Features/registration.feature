@register
  Feature: user should be able to register sucessfully so that he can use all feature from our website

    Scenario: User  navigate on registration  form after click on Register
      Given   User is on homepage
      When   user clicks on register
      Then user navigate to registration form
