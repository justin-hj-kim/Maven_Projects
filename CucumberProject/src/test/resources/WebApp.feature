@Mad @Features @Here @web @ecommerce @demo
Feature: WebApp
    "## the usual demo flow of the web ecommerce store"

  @LogIn
  Scenario: Ecommerce LogIn
    Given that the user has navigated over to the log in page of the website
    And the user types in a registered email and a corresponding password
    When the user clicks the log in button
    Then a new page of the ecommerce site should load with the username displayed in the top right
