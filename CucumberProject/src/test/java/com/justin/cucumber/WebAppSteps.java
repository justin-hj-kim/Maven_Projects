package com.justin.cucumber;

import com.smartbear.testleft.BrowserType;
import com.smartbear.testleft.Driver;
import com.smartbear.testleft.LocalDriver;
import com.smartbear.testleft.testobjects.WebCellElementPattern;
import com.smartbear.testleft.testobjects.web.WebCell;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * Created by Justin.Kim on 2/1/2020.
 * Created a class for the steps for the gherkin syntax in the feature file.
 * imported libraries above for the actionwords
 * now there are a number of method stubs below
 */


public class WebAppSteps {
    private LoginModel login;


    @Given("^that the user has navigated over to the log in page of the website$")
    public void that_the_user_has_navigated_over_to_the_log_in_page_of_the_website() throws Throwable{
        Driver driver = new LocalDriver();
        login = new LoginModel(driver.getApplications().runBrowser(BrowserType.IExplorer,
                "http://services.smartbear.com/samples/TestComplete12/smartstore/login?ReturnUrl=%2Fsamples%2FTestComplete12%2Fsmartstore%2Flogin%3FReturnUrl%3D%252Fsamples%252FTestComplete12%252Fsmartstore%252F"));
    }

    @And("^the user types in a registered email and a corresponding password$")
    public void the_user_types_in_a_registered_email_and_a_corresponding_password() throws Throwable{
        login.getLoginPage().getUserNameEdit().setText("hkim5");
        login.getLoginPage().getPasswordEdit().setText("Smartbear1408!");



    }

    @When("^the user clicks the log in button$")
    public void the_user_clicks_the_log_in_button() throws Throwable{
        login.getLoginPage().getLoginButton().clickButton();
    }

    @Then("^a new page of the ecommerce site should load with the username displayed in the top right$")
    public boolean a_new_page_of_the_ecommerce_site_should_load_with_the_username_dispayed_in_the_top_right() throws Exception{
        return true;
    }

    @After
    public void cleanUp() throws Throwable {
        if (login != null)
            login.close();
    }
}
