package test.tests.EventDetailsScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {
    public String FileName = "EventDetailScreen";

    @Test
    public void TC_10() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify event name.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");

        verify.verifyListOfElementWithText(FileName, "EventPageHeader", "Automation Event Free");
    }

    @Test
    public void TC_11() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify event detail screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");

        verify.verifyListOfElementWithText(FileName, "EventPageHeader", "Automation Event Free");
    }

    @Test
    public void TC_12() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify event banner display.");
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
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify attach image count.");
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
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify user redirected to attach image.");
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
        methods.log("Test Description : Verify event date and time display in proper format.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
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
        methods.log("Test Description : Print event description.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
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
        methods.log("Test Description : Print event location.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);

        performAction.androidScrollToElement(200);

        methods.log("Verify Event Location is display.");
        verify.verifyDescriptionDisplay(FileName, "EventLocation");
        performAction.waitForElement(FileName, "EventLocation");
        performAction.getText(FileName, "EventLocation");
    }

    @Test
    public void TC_18() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify event location pin display on map.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
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
        methods.log("Test Description : Verify free event register button is display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(100);
        methods.log("Verify event register button is display.");
        performAction.androidScrollToElement(100);
        performAction.pause(2);
        performAction.waitForElement(FileName, "FreeEventRegister");
        verify.verifyDescriptionDisplay(FileName, "FreeEventRegister");
    }

    @Test
    public void TC_20() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify free event ticket screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.click(FileName,"FreeEventRegister");
        methods.log("Verify event purchase ticket screen is display.");
        performAction.pause(2);
        performAction.waitForElement(FileName,"PurchaseTicketScreenName");
        String screenName = performAction.getText(FileName,"PurchaseTicketScreenName");
        verify.verifyPurchaseTicketScreenName(screenName, "Free Registration");
    }

    @Test
    public void TC_21() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify free event ticket cost.");
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
        methods.log("Test Description : Verify event date format.");
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
        methods.log("Test Description : Verify 'view more' link is display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        String EventDate = performAction.getText(FileName, "EventDate");

    }

    @Test
    public void TC_24() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify 3 different photos are display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.waitForElement(FileName, "EventDate");
        String EventDate = performAction.getText(FileName, "EventDate");

    }

    @Test
    public void TC_26() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify event description is display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        methods.log("Verify event Description display.");
        performAction.waitForElement(FileName, "EventDescription");
        verify.verifyDescriptionDisplay(FileName, "EventDescription");
    }

    @Test
    public void TC_28() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify event start and end time is display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        methods.log("Verify event start and end date display.");
        performAction.waitForElement(FileName, "EventTime");
        verify.verifyDescriptionDisplay(FileName, "EventTime");
    }

    @Test
    public void TC_31() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify event Location is display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(200);
        performAction.waitForElement(FileName, "EventLocation");
        performAction.getText(FileName, "EventLocation");
        methods.log("Verify event Location display.");
        verify.verifyDescriptionDisplay(FileName, "EventLocation");
    }

    @Test
    public void TC_32() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify event Location in display on map.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(200);

        String EventName = performAction.getText(FileName, "EventName");
        performAction.waitForElement(FileName, "EventLocation");
        String EventLocation = performAction.getText(FileName, "EventLocation");

        methods.log("Verify event location pin is display.");
        performAction.androidScrollToElement(200);
        performAction.pause(3);
        verify.verifyEventPinDisplay(EventName, EventLocation);
    }

    @Test
    public void TC_35() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify register button display at event detail page.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.waitForElement(FileName,"RegisterButtonAtEventDetailScreen");
        methods.log("Verify register button display.");
        verify.verifyDescriptionDisplay(FileName,"RegisterButtonAtEventDetailScreen");
    }

    @Test
    public void TC_37() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify register screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.waitForElement(FileName,"RegisterButtonAtEventDetailScreen");
        methods.log("Verify register screen display.");
        performAction.pause(2);
        performAction.waitForElement(FileName,"PurchaseTicketScreenName");
        String screenName = performAction.getText(FileName,"PurchaseTicketScreenName");
        verify.verifyPurchaseTicketScreenName(screenName, "Free Registration");
    }

    @Test
    public void TC_38() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify ticket amount should display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.waitForElement(FileName,"RegisterButtonAtEventDetailScreen");
        methods.log("Verify register screen display.");
        performAction.pause(2);
        performAction.waitForElement(FileName,"TicketCost");
        performAction.getText(FileName,"TicketCost");
        verify.verifyDescriptionDisplay(FileName, "TicketCost");
    }

    @Test
    public void TC_56() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify default quantity should display as 1.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.waitForElement(FileName,"RegisterButtonAtEventDetailScreen");
        methods.log("Verify default quantity should display.");
        performAction.pause(2);
        performAction.waitForElement(FileName,"Quantity");
        String Quantity = performAction.getText(FileName,"Quantity");
        verify.verifyDescriptionDisplay(FileName,"Quantity");
        methods.log("Verify default quantity should display as 1.");
        performAction.pause(2);
        verify.verifyPurchaseTicketScreenName(Quantity,"1");
    }

    @Test
    public void TC_57() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify drop down list of quanity.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.waitForElement(FileName,"RegisterButtonAtEventDetailScreen");
        methods.log("Verify default quantity should display.");
        performAction.pause(2);
        performAction.waitForElement(FileName,"Quantity");
        /*String Quantity = performAction.getText(FileName,"Quantity");
        verify.verifyDescriptionDisplay(FileName,"Quantity");*/
        methods.log("Verify drop down list of quanity display.");
        //verification.
    }

    @Test
    public void TC_60() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify ticket amount should display correct as displaying in event detail screen.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"FreeEventRegister");
        performAction.waitForElement(FileName,"RegisterButtonAtEventDetailScreen");
        methods.log("Verify ticket amount display.");
        performAction.pause(2);
        performAction.waitForElement(FileName,"TicketCost");
        /*String Quantity = performAction.getText(FileName,"Quantity");
        verify.verifyDescriptionDisplay(FileName,"Quantity");*/
        methods.log("Verify Verify ticket amount.");
        verify.verifyDescriptionDisplay(FileName, "TicketCost");
    }

    @Test
    public void TC_61() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify If event is free then then 'FREE EVENT' text should display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"FreeEventRegister");
        performAction.pause(4);
        performAction.waitForElement(FileName,"TicketAmountOnEventDeatilScreen");
        String Text = performAction.getTagName(FileName,"TicketAmountOnEventDeatilScreen");
        methods.log("Verify Verify ticket amount.");
        verify.verifyFreeEvent(Text);
    }

    @Test
    public void TC_62() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Once user will register for free event then confirmation message should display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"FreeEventRegister");
        performAction.pause(4);
        performAction.waitForElement(FileName,"TicketAmountOnEventDeatilScreen");
        String Text = performAction.getTagName(FileName,"TicketAmountOnEventDeatilScreen");
        methods.log("Verify Verify ticket amount.");
        /*verify.verifyFreeEvent(Text);*/
    }

    @Test
    public void TC_63() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Once user will register for free event then confirmation message should display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"FreeEventRegister");
        performAction.pause(4);
        performAction.waitForElement(FileName,"TicketAmountOnEventDeatilScreen");
        String Text = performAction.getTagName(FileName,"TicketAmountOnEventDeatilScreen");
        methods.log("Verify Verify ticket amount.");
        /*verify.verifyFreeEvent(Text);*/
    }


}
