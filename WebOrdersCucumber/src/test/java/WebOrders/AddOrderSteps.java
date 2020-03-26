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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class AddOrderSteps {
    private WebOrdersAppModel orders;

    @Given("^I have launched the Orders Application$")
    public void i_have_launched_the_Orders_Application() throws Throwable {
        Driver driver = new LocalDriver();
        orders = new WebOrdersAppModel(driver.getApplications().runBrowser(BrowserType.IExplorer,
                "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"));
    }

    @Given("^I have logged in successfully using user name \"(.*?)\" and password \"(.*?)\"$")
    public void i_have_logged_in_successfully_using_user_name_and_password(String username, String password) throws Throwable {
        orders.getLoginPage().getUserNameEdit().setText(username);
        orders.getLoginPage().getPasswordEdit().setText(password);
        orders.getLoginPage().getLoginButton().click();

        Assert.assertTrue(orders.getOrdersPage().getOrdersTable().getVisible());
    }

    @When("^I add a new order for \"(.*?)\" customer to the Orders list$")
    public void i_add_a_new_order_for_customer_to_the_Orders_list(String customerName) throws Throwable {
        orders.getAddNewOrderLink().click();

        NewOrderPageModel new_order_page = orders.getNewOrderPage();
        new_order_page.getProductCombo().clickItem("ScreenSaver");
        new_order_page.getQuantityEdit().setText("4");
        new_order_page.getCustomerNameEdit().setText(customerName);
        new_order_page.getAddressEdit().setText("Light street");
        new_order_page.getCityEdit().setText("Rain city");
        new_order_page.getCountryEdit().setText("US");
        new_order_page.getZipEdit().setText("123456");
        new_order_page.getMasterCardRadio().click();
        new_order_page.getCardNumber().setText("1324354657");
        new_order_page.getDateEdit().setText(LocalDate.now().format(DateTimeFormatter.ofPattern("MM/yy")));
        new_order_page.getInsertLink().click();
        new_order_page.waitForLoadComplete();
    }

    @Then("^I should see the new order for \"(.*?)\" upon returning to the list$")
    public void i_should_see_the_new_order_for_upon_returning_to_the_list(String customerName) throws Throwable {
        orders.getViewAllOrdersLink().click();

        Assert.assertTrue(String.format("The order with the customer name '{0}' was not added.", customerName),
            orders.getOrdersPage().getOrdersTable().tryFind(WebCell.class, new WebCellElementPattern() {{
                ColumnIndex = 1;
                contentText = customerName;
            }}) != null);
    }

    @After
    public void cleanUp() throws Throwable {
        if (orders != null)
	        orders.close();
    }
}
