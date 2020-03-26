package com.example.selenium.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Justin.Kim on 10-Feb-20.
 */

@RunWith(Cucumber.class)


@CucumberOptions(
        format = {"pretty", "html:target/Destination"},
        features={"src/test/resources/google.feature"}
)

public class SeleniumTest {
}
