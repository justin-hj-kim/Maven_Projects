Feature: OneOrder
    Make sure that adding a new order causes appropriate changes in UI

Scenario Outline: Add a new order
    Given I have launched the Orders application
    And I have logged in using the name "Tester" and password "test"
    When I add a new order with parameters: <name>, <product>, <quantity>, <street>, <city>, <zip>, <cardName>, <cardNumber>, <cardDate>
    Then I should see the new order '<name>' in the list of orders

    Examples:
        | name         | product        | quantity | street           | city         | zip     | cardName          | cardNumber   | cardDate |
        | "John Black" | "ScreenSaver"  | 4        |  "Light street"  | "Rain city"  | 123456  | "Visa"            | 1324354657   | 08/20    |
        | "John White" | "MyMoney"      | 5        |  "Dark street"   | "Sun city"   | 654321  | "MasterCard"      | 9807546142   | 09/21    |
        | "John Green" | "FamilyAlbum"  | 6        |  "Yellow street" | "Cloud city" | 162534  | "AmericanExpress" | 4779089734   | 10/22    |