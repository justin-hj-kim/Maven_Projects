$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/WebApp.feature");
formatter.feature({
  "name": "WebApp",
  "description": "    \"## the usual demo flow of the web ecommerce store\"",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Mad"
    },
    {
      "name": "@Features"
    },
    {
      "name": "@Here"
    },
    {
      "name": "@web"
    },
    {
      "name": "@ecommerce"
    },
    {
      "name": "@demo"
    }
  ]
});
formatter.scenario({
  "name": "Ecommerce LogIn",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Mad"
    },
    {
      "name": "@Features"
    },
    {
      "name": "@Here"
    },
    {
      "name": "@web"
    },
    {
      "name": "@ecommerce"
    },
    {
      "name": "@demo"
    },
    {
      "name": "@LogIn"
    }
  ]
});
formatter.step({
  "name": "that the user has navigated over to the log in page of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "WebAppSteps.that_the_user_has_navigated_over_to_the_log_in_page_of_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user types in a registered email and a corresponding password",
  "keyword": "And "
});
formatter.match({
  "location": "WebAppSteps.the_user_types_in_a_registered_email_and_a_corresponding_password()"
});
formatter.result({
  "error_message": "com.smartbear.testleft.ObjectTreeNodeNotFoundException: The test object was not found by the specified properties and values:\r\nPattern: \r\n ObjectIdentifier: Username\r\nSearch depth: 3\r\nSearch timeout: 10000 ms\nThe search started from: Sys.Browser(\"iexplore\").Page(\"http://services.smartbear.com/samples/TestComplete12/smartstore/login?ReturnUrl\u003d%2Fsamples%2FTestComplete12%2Fsmartstore%2Flogin%3FReturnUrl%3D%252Fsamples%252FTestComplete12%252Fsmartstore%252F\")\r\n\tat com.smartbear.testleft._internal.DriverBase.createObjectNotFoundException(DriverBase.java:335)\r\n\tat com.smartbear.testleft._internal.DriverBase.internalGet(DriverBase.java:264)\r\n\tat com.smartbear.testleft.testobjects._internal.ObjectTreeNodeWrapper.find(ObjectTreeNodeWrapper.java:63)\r\n\tat com.justin.cucumber.LoginPageModel.getUserNameEdit(LoginModel.java:26)\r\n\tat com.justin.cucumber.WebAppSteps.the_user_types_in_a_registered_email_and_a_corresponding_password(WebAppSteps.java:40)\r\n\tat ✽.the user types in a registered email and a corresponding password(src/test/resources/WebApp.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user clicks the log in button",
  "keyword": "When "
});
formatter.match({
  "location": "WebAppSteps.the_user_clicks_the_log_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a new page of the ecommerce site should load with the username displayed in the top right",
  "keyword": "Then "
});
formatter.match({
  "location": "WebAppSteps.a_new_page_of_the_ecommerce_site_should_load_with_the_username_dispayed_in_the_top_right()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});