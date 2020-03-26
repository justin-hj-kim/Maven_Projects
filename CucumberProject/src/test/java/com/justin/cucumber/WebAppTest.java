package com.justin.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by Justin.Kim on 2/1/2020.
 * more comments to follow
 */

//The RunWith annotation commands to run the specified class instead of the created JUnit class.
@RunWith(Cucumber.class)

//The CucumberOptions annotation specifies different options for the Cucumber test
@CucumberOptions(
        format = {"pretty", "html:target/Destination"},
        features={"src/test/resources/WebApp.feature"}
)
public class WebAppTest {
}
