Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'liuzzi@hotmail.com' and password 'Ciclon22!'
    And User click on login button
    Then User should be logged in into Account
    When User click on Account option

  @UpdateProfileTest
  Scenario: Verify User can update Profile Information
    And User update Name 'My New NameZ' and Phone '2143084850'
    And User click on Update button
    Then User profile information should be updated

  @UpdatePasswordTest
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Ciclon22!        | Ciclon2022! | Ciclon2022!     |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @AddPaymentMethodTest
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill debit or credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 5563880568275577 | Carlos Salas |              10 |           2025 |          777 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @EditDebitOrCreditCardTest
  Scenario: Verify User can edit Debit or Credit Card
    When User click on Account option
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 4863880568278877 | Carlos Vera |               6 |           2026 |          444 |
    And User click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @RemoveDebitOrCreditCardTest
  Scenario: Verify User can remove Debit or Credit Card
    And User click on remove option of card section
    Then payment details should be removed

  @UserCanAddAddressTest
  Scenario: Verify User can add Address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country       | fullName   | phoneNumber | streetAddress  | apt | city    | state    | zipCode |
      | United States | Rock Roger |  3018680006 | 8217 Valley Dr | 102 | Fairfax | Virginia |   22031 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @UserCanEditAddressAddedOnAccount
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address button
    And User fill new address form with below information
      | country       | fullName  | phoneNumber | streetAddress | apt | city    | state    | zipCode |
      | United States | Rock Hall |  2405523899 | 7179 Ferry Rd | 100 | Clinton | Maryland |   20735 |
    And User click update Your Address option
    Then a message should be displayed 'Address Updated Successfully'

  @UserCanRemoveAddressFromAccountTest
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
