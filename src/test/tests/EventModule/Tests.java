package test.tests.EventModule;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;

import java.util.ArrayList;


public class Tests extends BrowserConfig {
    public String FileName = "EventList";


    public String MenuName = "Events";

    @Test
    public void TC_01() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify application launch.");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        verify.verifyElementDisplayByText1(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
    }

    @Test
    public void TC_02() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Activity screen should open and verified successfully.");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
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
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);

        methods.log("Verify event screen display.");
        verify.verifyListOfElementWithText(FileName, "EventPageHeader", MenuName);
    }

    @Test
    public void TC_04() {
        //String FileName = "EventList";
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Event date is display.");
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        String actual = performAction.getText(FileName,"EventDateTime");
        methods.log("Date Verify.");
        verify.dateContains(actual,"November 22");


    }

    @Test
    public void TC_06() {
        String FileName = "EventList";
        performAction.pause(7);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Available count of event list should display.");
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);

        performAction.getListOfElementCount(FileName, "ListOfEvent");


    }

    @Test
    public void TC_07() {

        ArrayList<String> eventName;
        VerifyEvents verify = new VerifyEvents(driver);
        String FileName = "EventList";
        performAction.pause(7);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify all Event name, day and month should get.");
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
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
        methods.log("Test Description : Verify The event which are on current date should display on top and future date events should move to down.");
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);

        performAction.pause(5);
        verify.verifyCurrentDayInListOfEvent(FileName, "ListOfEventDateTime");
    }

}
