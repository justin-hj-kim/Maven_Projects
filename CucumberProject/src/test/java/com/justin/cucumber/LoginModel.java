package com.justin.cucumber;

import com.smartbear.testleft.HttpException;
import com.smartbear.testleft.InvocationException;
import com.smartbear.testleft.Log;
import com.smartbear.testleft.ObjectTreeNodeNotFoundException;
import com.smartbear.testleft.testobjects.*;
import com.smartbear.testleft.testobjects.web.*;
import static org.junit.Assert.assertEquals;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import com.smartbear.testleft.Driver;


/**
 * Created by Justin.Kim on 10-Feb-20.
 */

class LoginPageModel {
    private WebPage page;

    public LoginPageModel(WebPage page) { this.page = page; }

    public TextEdit getUserNameEdit() throws ObjectTreeNodeNotFoundException, HttpException{
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectIdentifier = "Username";
        }}, 3);
    }



    public TextEdit getPasswordEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectIdentifier = "Password";
        }});
    }

    public Button getLoginButton() throws ObjectTreeNodeNotFoundException, HttpException{
        return page.find(Button.class, new WebElementPattern(){{
            ObjectIdentifier = "Log in";
        }});
    }

    String waitForLoadComplete() throws InvocationException, com.smartbear.testleft.HttpException
    {
        return page.waitForLoadComplete();
    }

}




class LoginModel {
    private WebBrowser browser;

    public LoginModel(WebBrowser browser) { this.browser = browser; }


    /**
     * *the log in page with the address http://services.smartbear.com/samples/TestComplete12/smartstore/login?ReturnUrl=%2Fsamples%2FTestComplete12%2Fsmartstore
     */

    public LoginPageModel getLoginPage() throws ObjectTreeNodeNotFoundException, HttpException {
        return new LoginPageModel((WebPage) browser.find(WebPage.class, new WebPagePattern() {{
            URL = "*TestComplete12/smartstore/login*";
        }}));
    }



    public void close() throws InvocationException, HttpException
    {
        browser.close();
    }


}
