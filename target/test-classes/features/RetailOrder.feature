Feature: Retail Order Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'liuzzi@hotmail.com' and password 'Ciclon22!'
    And User click on login button
    Then User should be logged in into Account
    When User click on Account option
    And User click on Orders section
    And User click on first order in list

  @VerifyUserCanCancelOrderTest
  Scenario: Verify User can cancel the order
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And user click on Cancel Order button
    Then a message should be displayed 'Your Order Has Been Cancelled'

  @UserCanReturnOrderTest
  Scenario: Verify User can Return the order
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then a message should be displayed 'Return was successful'

  @UserCanWriteReviewOnOrderPlaceTest
  Scenario: Verify User can write a review on order place
    And User click on Review button
    And User write Review headline 'I would buy this product again.' and 'I love this product and recommend it 100%.'
    And User click Add your Review button
    Then a message should be displayed 'Your review was added successfully'
