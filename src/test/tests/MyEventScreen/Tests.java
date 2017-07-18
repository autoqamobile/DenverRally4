package test.tests.MyEventScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;

import java.util.ArrayList;

/**
 * Created by dell on 7/4/2017.
 */
public class Tests extends BrowserConfig {
    public String FileName = "MyEventScreen";

    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";

    public String MenuName = "My Events";
    public String Email =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"Login",4,1).toString();
    public String  Password=excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"Login",5,1).toString();
    public String AppVersion = excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"General",8,1).toString();


    @Test
    public void TC_103() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : User should get 'My Events' option on slider menu.");

        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);
        performAction.pause(5);

        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

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
    public void TC_114() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Event listing screen should open after clicking on ''My Events'.");

        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);
        performAction.pause(5);

        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);

        methods.log("Verify my event Screen option is display.");
        verify.elementIsDisplayed(FileName,"MyEventScreen",0);
        performAction.pause(2);


    }

    @Test
    public void TC_115() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : User should get 'Past' & 'Upcoming' tab on 'My Event' screen.");

        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);
        performAction.pause(5);
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);

        methods.log("Verify past tab is display.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","Past");
        performAction.pause(2);
        methods.log("Verify upcoming tab is display.");
        verify.verifyElementDisplayByText(FileName,"FileName","Upcoming");

        performAction.pause(2);

    }

    @Test
    public void TC_116() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : If 'Past' tab is empty' then 'No event avaiable' text should display.");

        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);
        performAction.pause(5);
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Past");

        performAction.pause(2);

        methods.log("Verify No past events available is display.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","No past events available");
        performAction.pause(2);


    }

    @Test
    public void TC_117() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Correct event name should display on listing screen and name text should proper aligned into screen.");

        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);
        performAction.pause(5);
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Past");
        performAction.pause(2);

        methods.log("Verify event name is display.");
        verify.verifyElementDisplayByIndex1(FileName,"ListOFMenu",3);

        performAction.pause(2);


    }

    //@Test
    public void TC_118() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Date format should display like : 'MMM DD, YYYY'");

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
    public void TC_119() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Only past events should display in the listing..");

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
    public void TC_120() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Currently past event should display on top and old events should move to down. ");

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
    public void TC_121() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Past event date should same as date in database.");

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
    public void TC_122() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : If 'Upcoming' tab is empty then 'No event avaiable' text should display.");

        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);
        performAction.pause(5);
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        //performAction.click(FileName,"PastTab");
        //performAction.pause(2);

        methods.log("Verify No upcoming events available is display.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","No upcoming events available");
        performAction.pause(2);


    }

    @Test
    public void TC_123() {
        ArrayList<String> eventName;
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Correct event name should display on listing screen and name text should proper aligned into screen.");

        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);
        performAction.pause(5);
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
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);

        methods.log("Verify upcoming events name is display.");
        eventName = performAction.getEveryElementtestIntoList(FileName, "ListOFMenu");
        verify.verifyNameDateTimeDisplay(eventName);

        performAction.pause(2);


    }

    @Test
    public void TC_124() {
        VerifyMyEvent verify = new VerifyMyEvent(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Correct venue name should display as per associated events.");

        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);
        performAction.pause(5);
       // String Email= "auto12345@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",3);

        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);

        methods.log("Verify venue name is display.");

        verify.verifyElementDisplayByIndex1(FileName,"ListOFMenu",0);

        performAction.pause(2);

    }
}
