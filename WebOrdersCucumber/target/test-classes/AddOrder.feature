Feature: OneOrder
	I must make sure that adding an order results in a successful UI change

@mytag
Scenario: Add a new order to the Orders Application
	Given I have launched the Orders Application
	And I have logged in successfully using user name "Tester" and password "test"
	When I add a new order for "John Black" customer to the Orders list
	Then I should see the new order for "John Black" upon returning to the list
