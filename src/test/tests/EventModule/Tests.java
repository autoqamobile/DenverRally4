package test.tests.EventModule;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;

import java.util.ArrayList;


public class Tests extends BrowserConfig {
    public String FileName = "EventList";


    @Test
    public void TC_01() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify application launch.");

        performAction.pause(7);
        verify.elementIsDisplayed(FileName, "LogoImage", 1);
        performAction.pause(7);
    }

    @Test
    public void TC_02() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Activity screen should open and verified successfully.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.waitForElement(FileName, "LogoImage");
        methods.log("Verify activity screen display.");
        verify.elementIsDisplayed(FileName, "LogoImage", 1);
    }

    @Test
    public void TC_03() {
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify event screen display.");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        methods.log("Verify event screen display.");
        verify.verifyListOfElementWithText(FileName, "EventPageHeader", "Events");
    }

    @Test
    public void TC_04() {
        String FileName = "EventList";
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Event date is display.");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        String actual = performAction.getText(FileName,"EventDateTime");
        methods.log("Date Verify.");
        verify.dateContains(actual,"November 22");


    }

    @Test
    public void TC_07() {
        String FileName = "EventList";
        performAction.pause(7);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Available count of event list should display.");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.getListOfElementCount(FileName, "ListOfEvent");


    }

    //@Test
   /* public void TC_06() {
        String FileName = "EventList";
        performAction.pause(7);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify past date events should not display..");
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Past");


        performAction.getListOfElementCount(FileName, "ListOfEvent");

    }*/

    @Test
    public void TC_06() {

        ArrayList<String> eventName;
        VerifyEvents verify = new VerifyEvents(driver);
        String FileName = "EventList";
        performAction.pause(7);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify all Event name, day and month should get.");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        eventName = performAction.getEveryElementtestIntoList1(FileName, "ListOFMenu");
        verify.verifyNameDateTimeDisplay(eventName);

    }

    //@Test
    public void TC_05() {

        VerifyEvents verify = new VerifyEvents(driver);
        String FileName = "EventList";
        performAction.pause(7);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Activity screen should open and verified successfully.");
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(5);
        verify.verifyCurrentDayInListOfEvent(FileName, "ListOfEventDateTime");
    }

}
