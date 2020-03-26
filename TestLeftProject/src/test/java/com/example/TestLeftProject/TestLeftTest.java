package com.example.TestLeftProject;
import com.smartbear.testleft.LocalDriver;
import org.junit.Test;
import com.smartbear.testleft.Driver;
import com.smartbear.testleft.LocalDriver;
import com.smartbear.testleft.Log;
import com.smartbear.testleft.testobjects.TestProcess;
import com.smartbear.testleft.testobjects.TopLevelWindow;
import com.smartbear.testleft.testobjects.TextEdit;
import com.smartbear.testleft.testobjects.WindowPattern;
import static org.junit.Assert.assertEquals;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;

/**
 * Created by Justin.Kim on 2/1/2020.
 The TestLeft library, reference to which we have added to our project, declares classes that provide support
 for various testing actions and application technologies.
 We need to make those classes available in our test package. Import the following classes to your package
 */

//add a JUnit test class and a test method to our project. The test method will run our TestLeft test code
//create an object of the com.smartbear.testleft.Driver class. The object will provide access to the TestLeft engine
public class TestLeftTest {

    public Driver driver;

    @Test
    public void SampleTest() throws Exception{

        driver = new LocalDriver();

        //we will work with the Notepad application. Let’s create code that will run Notepad at the beginning of the test
        TestProcess process = driver.getApplications().run("notepad.exe");

        //Create code that will access Notepad window and simulate text input to it
        TextEdit edit = (TextEdit) process.find(TopLevelWindow.class, new WindowPattern(){{
            WndClass = "Notepad";
        }}).find(TextEdit.class, new WindowPattern(){{
            WndClass = "Edit";
        }});
        edit.click();
        String inputText = "test";
        edit.setwText(inputText);

        //checking object state: compares object properties against the expected values
        assertEquals(edit.getwText(), inputText);

        //post a screenshot of Notepad’s edit box and a custom warning message to the TestLeft test log
        driver.getLog().screenshot(edit, "Notepad edit box screenshot");
        driver.getLog().warning("A warning message");


        /**TestLeft stores its log to a temporary folder and deletes it after the test run is over.
         You can command TestLeft to export test results to an external file (MHT or HTML)
         to view and analyze it after the test run.
         Add code that will create a folder and store the test log to that folder
         */
        String logPath = System.getProperty("user.dir") + "\\" + new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        new File(logPath).mkdir();
        driver.getLog().save(logPath, Log.Format.Html);

    }
}



