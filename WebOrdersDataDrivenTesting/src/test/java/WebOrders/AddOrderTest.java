package WebOrders;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/Destination", "json:report/cucumber.json"},
        features = {"src/test/resources/AddOrder.feature"})
public class AddOrderTest {
}
