package com.example.cucumber.test;

//cucumber libraries for the step generation
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.After;


//test left libraries for the test steps
import org.junit.Assert;
import com.smartbear.testleft.LocalDriver;
import com.smartbear.testleft.Driver;
import com.smartbear.testleft.testobjects.*;


/**
 * Created by Justin.Kim on 2/1/2020.
 * Created a class for the steps for the gherkin syntax in the feature file.
 * imported libraries above for the actionwords
 * now there are a number of method stubs below
 */
public class UndoFeatureSteps {
    //make the corresponding object notepadProcess visible for this method
    private TestProcess notepadProcess;
    // To implement the next test steps, you need to interact with the edit box.
    // Therefore, you need to make it visible for other methods.
    // Declare the corresponding variable at the beginning of the class
    private TextEdit edit;

    @Given("^I open Notepad$")
    public void i_open_Notepad() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Driver driver = new LocalDriver();
        notepadProcess = driver.getApplications().run("notepad.exe");

    }

    @And("^there is no text in Notepad$")
    public void there_is_no_text_in_Notepad() throws Exception {
         edit = (TextEdit) notepadProcess.find(TopLevelWindow.class, new WindowPattern(){{
            WndClass = "Notepad";
        }}).find(TextEdit.class, new WindowPattern(){{
            WndClass = "Edit";
        }});

        String wTextValue = edit.getwText();

        //verify that the edit box does not contain any text
        Assert.assertEquals("", wTextValue);
    }

    @When("^I type \"([^\"]*)\"$")
    public void i_type(String arg1) throws Exception {
        edit.keys(arg1);
    }

    @And("^I press \\[Ctrl \\+ z\\]$")
    public void i_press_Ctrl_z() throws Exception {
        edit.keys("^z");
    }

    @Then("^I should see no text in Notepad$")
    public void i_should_see_no_text_in_Notepad() throws Exception {
        Assert.assertEquals("", edit.getwText());
    }

    @After
    public void cleanUp() throws Exception {
        if (notepadProcess != null)
            notepadProcess.close();
    }
}