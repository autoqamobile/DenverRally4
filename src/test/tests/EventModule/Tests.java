package test.tests.EventModule;

import org.testng.annotations.Test;
import test.config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {
    public String FileName = "EventList";


    @Test
    public void TC_01() {
        VerifyEvents verify = new VerifyEvents(driver);

        performAction.pause(7);

        verify.elementIsDisplayed(FileName, "LogoImage", 1);

        performAction.pause(2);
    }

    @Test
    public void TC_02() {
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        performAction.waitForElement(FileName, "LogoImage");

        verify.elementIsDisplayed(FileName, "LogoImage", 1);

        performAction.pause(2);
    }

    @Test
    public void TC_03() {
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        verify.verifyListOfElementWithText(FileName, "EventPageHeader", "Events");

        performAction.pause(2);
    }

    @Test
    public void TC_04() {
        String FileName = "EventList";
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(5);
    }

    @Test
    public void TC_07() {
        String FileName = "EventList";
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.getListOfElementCount(FileName, "ListOfEvent");

        performAction.pause(5);
    }

    @Test
    public void TC_06() {
        String FileName = "EventList";
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Past");


        performAction.getListOfElementCount(FileName, "ListOfEvent");

        performAction.pause(5);
    }

    @Test
    public void TC_08() {

        VerifyEvents verify = new VerifyEvents(driver);
        String FileName = "EventList";
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(5);
        performAction.getEveryElementtestIntoList(FileName, "ListOFMenu");
        verify.verifyNameDateTimeDisplay(FileName, "ListOFMenu");
        performAction.pause(5);
    }

    @Test
    public void TC_05() {

        VerifyEvents verify = new VerifyEvents(driver);
        String FileName = "EventList";
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(5);
        verify.verifyCurrentDayInListOfEvent(FileName, "ListOfEventDateTime");

        performAction.pause(5);
    }


}
