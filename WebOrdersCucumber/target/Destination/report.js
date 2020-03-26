$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddOrder.feature");
formatter.feature({
  "name": "OneOrder",
  "description": "\tI must make sure that adding an order results in a successful UI change",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a new order to the Orders Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mytag"
    }
  ]
});
formatter.step({
  "name": "I have launched the Orders Application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddOrderSteps.i_have_launched_the_Orders_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have logged in successfully using user name \"Tester\" and password \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddOrderSteps.i_have_logged_in_successfully_using_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a new order for \"John Black\" customer to the Orders list",
  "keyword": "When "
});
formatter.match({
  "location": "AddOrderSteps.i_add_a_new_order_for_customer_to_the_Orders_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the new order for \"John Black\" upon returning to the list",
  "keyword": "Then "
});
formatter.match({
  "location": "AddOrderSteps.i_should_see_the_new_order_for_upon_returning_to_the_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});