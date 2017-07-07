package test.tests.MyEventScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;

import java.util.ArrayList;

/**
 * Created by dell on 7/4/2017.
 */
public class Tests extends BrowserConfig {
    public String FileName = "MyEventScreen";

    @Test
    public void TC_054() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(10);
        methods.log("Verify my event option is display.");
        verify.elementIsDisplayed(FileName,"MyEvent",0);
        performAction.pause(2);


    }

    @Test
    public void TC_055() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);

        methods.log("Verify my event Screen option is display.");
        verify.elementIsDisplayed(FileName,"MyEventScreen",0);
        performAction.pause(2);


    }

    @Test
    public void TC_058() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);

        methods.log("Verify past tab is display.");
        verify.elementIsDisplayed(FileName,"PastTab",0);
        performAction.pause(2);
        methods.log("Verify upcoming tab is display.");
        verify.elementIsDisplayed(FileName,"UpComingTab",0);
        performAction.pause(2);

    }

    @Test
    public void TC_059() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);
        performAction.click(FileName,"PastTab");
        performAction.pause(2);

        methods.log("Verify No past events available is display.");
        verify.verifyText(FileName,"PactEmptyText","No past events available");
        performAction.pause(2);


    }

    @Test
    public void TC_060() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);
        performAction.click(FileName,"PastTab");
        performAction.pause(2);

        methods.log("Verify event name is display.");
        verify.verifyElementDisplay(FileName,"PastEventName");
        performAction.getText(FileName,"PastEventName");
        performAction.pause(2);


    }

    //@Test
    public void TC_061() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);

        methods.log("Verify Date format is display.");
        //verify.elementIsDisplayed(FileName,"DateFormat",0);
        performAction.pause(2);


    }

    //@Test
    public void TC_062() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);
        performAction.click(FileName,"PastTab");
        performAction.pause(2);

        // methods.log("Verify No past events available is display.");
        //verify.verifyText(FileName,"PactEmptyText","No past events available");
        // performAction.pause(2);


    }

    //@Test
    public void TC_064() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);
        performAction.click(FileName,"PastTab");
        performAction.pause(2);

        // methods.log("Verify No past events available is display.");
        //verify.verifyText(FileName,"PactEmptyText","No past events available");
        // performAction.pause(2);


    }

    //@Test
    public void TC_068() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);
        performAction.click(FileName,"PastTab");
        performAction.pause(2);

        // methods.log("Verify No past events available is display.");
        //verify.verifyText(FileName,"PactEmptyText","No past events available");
        // performAction.pause(2);


    }

    @Test
    public void TC_069() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto96311@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);
        //performAction.click(FileName,"PastTab");
        //performAction.pause(2);

        methods.log("Verify No upcoming events available is display.");
        verify.verifyText(FileName,"PactEmptyText","No upcoming events available");
        performAction.pause(2);


    }

    @Test
    public void TC_070() {
        ArrayList<String> eventName;
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);

        methods.log("Verify upcoming events name is display.");
        eventName = performAction.getEveryElementtestIntoList1(FileName, "ListOFMenu");
        verify.verifyNameDateTimeDisplay(eventName);

        performAction.pause(2);


    }

    @Test
    public void TC_075() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"MyEvent");
        performAction.pause(5);
        performAction.click(FileName,"Event");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);

        methods.log("Verify venue name is display.");
        verify.verifyElementDisplay(FileName,"EventLocation");
        performAction.pause(2);
        performAction.getText(FileName,"EventLocation");

        performAction.pause(2);

    }
}
