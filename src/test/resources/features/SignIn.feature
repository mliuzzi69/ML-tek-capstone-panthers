Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signInTest
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'liuzzi@hotmail.com' and password 'Ciclon22!'
    And User click on login button
    Then User should be logged in into Account

  @signUpTest
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email          | password | confirmPassword |
      | Koalaz | Kit1100@it.com | Kit@2022 | Kit@2022        |
    And User click on SignUp button
    Then User should be logged into account page
