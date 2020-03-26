$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddOrder.feature");
formatter.feature({
  "name": "OneOrder",
  "description": "    Make sure that adding a new order causes appropriate changes in UI",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add a new order",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have launched the Orders application",
  "keyword": "Given "
});
formatter.step({
  "name": "I have logged in using the name \"Tester\" and password \"test\"",
  "keyword": "And "
});
formatter.step({
  "name": "I add a new order with parameters: \u003cname\u003e, \u003cproduct\u003e, \u003cquantity\u003e, \u003cstreet\u003e, \u003ccity\u003e, \u003czip\u003e, \u003ccardName\u003e, \u003ccardNumber\u003e, \u003ccardDate\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the new order \u0027\u003cname\u003e\u0027 in the list of orders",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "product",
        "quantity",
        "street",
        "city",
        "zip",
        "cardName",
        "cardNumber",
        "cardDate"
      ]
    },
    {
      "cells": [
        "\"John Black\"",
        "\"ScreenSaver\"",
        "4",
        "\"Light street\"",
        "\"Rain city\"",
        "123456",
        "\"Visa\"",
        "1324354657",
        "08/20"
      ]
    },
    {
      "cells": [
        "\"John White\"",
        "\"MyMoney\"",
        "5",
        "\"Dark street\"",
        "\"Sun city\"",
        "654321",
        "\"MasterCard\"",
        "9807546142",
        "09/21"
      ]
    },
    {
      "cells": [
        "\"John Green\"",
        "\"FamilyAlbum\"",
        "6",
        "\"Yellow street\"",
        "\"Cloud city\"",
        "162534",
        "\"AmericanExpress\"",
        "4779089734",
        "10/22"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add a new order",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have launched the Orders application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddOrderSteps.i_have_launched_the_Orders_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have logged in using the name \"Tester\" and password \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddOrderSteps.i_have_logged_in_successfully_using_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a new order with parameters: \"John Black\", \"ScreenSaver\", 4, \"Light street\", \"Rain city\", 123456, \"Visa\", 1324354657, 08/20",
  "keyword": "When "
});
formatter.match({
  "location": "AddOrderSteps.i_add_a_new_order_for_customer_to_the_Orders_list(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the new order \u0027\"John Black\"\u0027 in the list of orders",
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
formatter.scenario({
  "name": "Add a new order",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have launched the Orders application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddOrderSteps.i_have_launched_the_Orders_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have logged in using the name \"Tester\" and password \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddOrderSteps.i_have_logged_in_successfully_using_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a new order with parameters: \"John White\", \"MyMoney\", 5, \"Dark street\", \"Sun city\", 654321, \"MasterCard\", 9807546142, 09/21",
  "keyword": "When "
});
formatter.match({
  "location": "AddOrderSteps.i_add_a_new_order_for_customer_to_the_Orders_list(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the new order \u0027\"John White\"\u0027 in the list of orders",
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
formatter.scenario({
  "name": "Add a new order",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have launched the Orders application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddOrderSteps.i_have_launched_the_Orders_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have logged in using the name \"Tester\" and password \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddOrderSteps.i_have_logged_in_successfully_using_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a new order with parameters: \"John Green\", \"FamilyAlbum\", 6, \"Yellow street\", \"Cloud city\", 162534, \"AmericanExpress\", 4779089734, 10/22",
  "keyword": "When "
});
formatter.match({
  "location": "AddOrderSteps.i_add_a_new_order_for_customer_to_the_Orders_list(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the new order \u0027\"John Green\"\u0027 in the list of orders",
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