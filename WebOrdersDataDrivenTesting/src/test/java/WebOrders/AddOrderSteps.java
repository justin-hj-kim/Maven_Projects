package WebOrders;

import com.smartbear.testleft.BrowserType;
import com.smartbear.testleft.Driver;
import com.smartbear.testleft.LocalDriver;
import com.smartbear.testleft.testobjects.WebCellElementPattern;
import com.smartbear.testleft.testobjects.web.WebCell;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddOrderSteps {
    private WebOrdersAppModel orders;

    @Given("^I have launched the Orders application$")
    public void i_have_launched_the_Orders_Application() throws Throwable {
        Driver driver = new LocalDriver();
        orders = new WebOrdersAppModel(driver.getApplications().runBrowser(BrowserType.IExplorer,
                "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"));
    }

    @Given("^I have logged in using the name \"(.*?)\" and password \"(.*?)\"$")
    public void i_have_logged_in_successfully_using_user_name_and_password(String username, String password) throws Throwable {
        orders.getLoginPage().getUserNameEdit().setText(username);
        orders.getLoginPage().getPasswordEdit().setText(password);
        orders.getLoginPage().getLoginButton().click();

        Assert.assertTrue(orders.getOrdersPage().getOrdersTable().getVisible());
    }

    @When("^I add a new order with parameters: \"(.*?)\", \"(.*?)\", (.*?), \"(.*?)\", \"(.*?)\", (.*?), \"(.*?)\", (.*?), (.*?)$")
    public void i_add_a_new_order_for_customer_to_the_Orders_list(String name, String product, String quantity,
                                                                  String street, String city, String zip,
                                                                  String cardName, String cardNumber,
                                                                  String cardDate) throws Throwable {
        orders.getAddNewOrderLink().click();

        NewOrderPageModel new_order_page = orders.getNewOrderPage();
        new_order_page.getProductCombo().clickItem(product);
        new_order_page.getQuantityEdit().setText(quantity);
        new_order_page.getCustomerNameEdit().setText(name);
        new_order_page.getAddressEdit().setText(street);
        new_order_page.getCityEdit().setText(city);
        new_order_page.getZipEdit().setText(zip);

        if (cardName.equals("Visa")) {
            new_order_page.getVisaCardButton().click();
        } else if (cardName.equals("MasterCard")) {
            new_order_page.getMasterCardRadio().click();
        } else if (cardName.equals("AmericanExpress")) {
            new_order_page.getAmericanExpressCardRadio().click();
        } else {
            throw new IllegalArgumentException("Unknown card name [" + cardName + "]");
        }

        new_order_page.getCardNumber().setText(cardNumber);
        new_order_page.getDateEdit().setText(cardDate);
        new_order_page.getInsertLink().click();
        new_order_page.waitForLoadComplete();

        orders.getViewAllOrdersLink().click();
        new_order_page.waitForLoadComplete();
    }

    @Then("^I should see the new order '\"(.*?)\"' in the list of orders$")
    public void i_should_see_the_new_order_for_upon_returning_to_the_list(String name) throws Throwable {
        Assert.assertTrue(String.format("The order with the customer name '{0}' was not added.", name),
                orders.getOrdersPage().getOrdersTable().tryFind(WebCell.class, new WebCellElementPattern() {{
                    ColumnIndex = 1;
                    contentText = name;
                }}) != null);
    }

    @After
    public void cleanUp() throws Throwable {
        if (orders != null)
            orders.close();
    }
}
