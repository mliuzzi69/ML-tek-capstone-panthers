Feature: Retail Home Page

  Background: 
    Given User is on retail website

  @ShopByDepartmentSidebarTest
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics |
      | Computers   |
      | SmartHome   |
      | Sports      |
      | Automotive  |

  @DepartmentSidebarOptionTest
  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                    | optionTwo                |
      | 'Electronics' | 'TV&Video'                   | 'VideoGames'             |
      | 'Computers'   | 'Accesories'                 | 'Networking'             |
      | 'SmartHome'   | 'SmartHomeLightning'         | 'PlugsandOulets'         |
      | 'Sports'      | 'AthleticClothing'           | 'Exercise&Fitness'       |
      | 'Automotive'  | 'AutomotiveParts&Accesories' | 'MotorCycle&Powersports' |

  @UserCanAddItemToCartTest
  Scenario: Verify User can add an item to cart
    When User click on Sign in option
    And User enter email 'liuzzi@hotmail.com' and password 'Ciclon22!'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa Outdoor Smart Plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should be change to '2'

  @UserCanPlaceOrderWithoutShippingAddressAndPaymentMethodOnFileTest
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'liuzzi@hotmail.com' and password 'Ciclon22!'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa Outdoor Smart Plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should be change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName    | phoneNumber | streetAddress  | apt | city    | state    | zipCode |
      | United States | Carlos Vera |  3018680066 | 7144 Valley Dr | 103 | Fairfax | Virginia |   22031 |
    And User click Add Your Address button
    And User click Add a credit card or Debit card for Payment method
    And User fill debit or credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 1111222233335555 | Bert Fleming |               9 |           2027 |          830 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'

  @UserCanPlaceOrderWithShippingAddressAndPaymentMethodOnFileTest
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'liuzzi@hotmail.com' and password 'Ciclon22!'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should be change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'
