package test.tests.EventDetailsScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {
    public String FileName = "EventDetailScreen";

    @Test
    public void TC_10() {
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");

        verify.verifyListOfElementWithText(FileName, "EventPageHeader", "Automation Event Free");
    }

    @Test
    public void TC_11() {
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");

        verify.verifyListOfElementWithText(FileName, "EventPageHeader", "Automation Event Free");
    }

    @Test
    public void TC_12() {
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(3);
        verify.verifyBannerImageDisplay(FileName, "EventBennerImage");
        performAction.pause(3);
    }

    @Test
    public void TC_13() {
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(3);
        //attach image not display so verefication not compluted.
    }

    @Test
    public void TC_14() {
        VerifyEvents verify = new VerifyEvents(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(3);
        //attach image not display so verefication not compluted.
    }

    @Test
    public void TC_15() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(3);
        String BannerDateTime = performAction.getText(FileName, "DateAndTimeAtBenner");
        String EventDate = performAction.getText(FileName, "EventDate");
        String EventTime = performAction.getText(FileName, "EventTime");

        methods.log("Verify Event Date.");
        verify.verifyEventTimeDate(BannerDateTime, EventDate);
        methods.log("Verify Event Time.");
        verify.verifyEventTimeDate(BannerDateTime, EventTime);
    }

    @Test
    public void TC_16() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(3);

        methods.log("Verify Description is display.");
        verify.verifyDescriptionDisplay(FileName, "EventDescription");
        performAction.getText(FileName, "EventDescription");
    }

    @Test
    public void TC_17() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);

        performAction.androidScrollToElement(200);

        methods.log("Verify Event Location is display.");
        verify.verifyDescriptionDisplay(FileName, "EventLocation");
        performAction.getText(FileName, "EventLocation");
    }

    @Test
    public void TC_18() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);

        performAction.androidScrollToElement(200);

        String EventName = performAction.getText(FileName, "EventName");
        String EventLocation = performAction.getText(FileName, "EventLocation");

        methods.log("Verify event location pin is display.");
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        verify.verifyEventPinDisplay(EventName, EventLocation);
    }

    @Test
    public void TC_19() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(100);
        methods.log("Verify event register button is display.");
        performAction.androidScrollToElement(100);
        performAction.pause(2);
        verify.verifyDescriptionDisplay(FileName, "FreeEventRegister");
    }

    @Test
    public void TC_20() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.click(FileName,"FreeEventRegister");
        methods.log("Verify event purchase ticket screen is display.");
        performAction.pause(2);
        String screenName = performAction.getText(FileName,"PurchaseTicketScreenName");
        verify.verifyPurchaseTicketScreenName(screenName, "Free Registration");
    }

    @Test
    public void TC_21() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.click(FileName,"FreeEventRegister");
        methods.log("Verify free event ticket cost.");
        performAction.pause(2);
        String screenName = performAction.getText(FileName,"FreeTicketTotalCost");
        verify.verifyPurchaseTicketScreenName(screenName,"$0");
    }

    @Test
    public void TC_22() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        String EventDate = performAction.getText(FileName, "EventDate");
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.click(FileName,"FreeEventRegister");
        methods.log("Verify event Date.");
        performAction.pause(2);
        String FreePurchaseTicketScreenDate = performAction.getText(FileName,"FreePurchaseTicketScreenDate");
        verify.verifyEventTimeDate(FreePurchaseTicketScreenDate, EventDate);
    }

    @Test
    public void TC_23() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        String EventDate = performAction.getText(FileName, "EventDate");

    }



}
