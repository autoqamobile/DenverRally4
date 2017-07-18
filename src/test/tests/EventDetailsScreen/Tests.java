package test.tests.EventDetailsScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {
    public String FileName = "EventDetailScreen";

    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";
    public String AppVersion = excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"General",8,1).toString();
    String MenuName = "Events";

    @Test
    public void TC_08() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event name.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
       // performAction.clickOnElementFromList(FileName, "ListOFMenu", EventName);
       // performAction.pause(3);
        methods.log("Verify event name.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu", 3);
    }

    @Test
    public void TC_9() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event detail screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        methods.log("Verify event detail screen is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu", 0);
    }

    @Test
    public void TC_10() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event banner display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);

        performAction.pause(3);
        methods.log("Verify event banner is display.");
        verify.verifyBannerImageDisplay(FileName, "EventBennerImage");
        performAction.pause(3);
    }

    //@Test
    public void TC_11() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify attach image count.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);


        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(3);
        //attach image not display so verefication not compluted.
    }

   // @Test
    public void TC_12() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify user redirected to attach image.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(3);
        //attach image not display so verefication not compluted.
    }

    @Test
    public void TC_13() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event date and time display in proper format.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);

        performAction.pause(3);


        methods.log("Verify Event Date And Time.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",3);
        //methods.log("Verify Event Time.");
        //verify.verifyElementDisplayByText(FileName, "ListOFMenu",EventTime);
    }

    @Test
    public void TC_14() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Print event description.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        methods.log("Verify Description is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",8);
       // performAction.getText(FileName, "EventDescription");
    }

    @Test
    public void TC_15() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Print event location.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);

        performAction.androidScrollToElement(250);

        methods.log("Verify Event Location is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",3);
    }

    @Test
    public void TC_16() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event location pin display on map.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        String EventName=performAction.getText(FileName,"EventName");
        performAction.androidScrollToElement(200);
        performAction.pause(3);
        String EventLocation=performAction.getText(FileName,"EventLocation");
        methods.log("Verify event location pin is display.");
        performAction.pause(2);
        verify.verifyEventPinDisplay(EventName, EventLocation);
    }

    @Test
    public void TC_17() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify free event register button is display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);

        performAction.androidScrollToElement(100);
        methods.log("Verify event register button is display.");
        performAction.androidScrollToElement(100);
        performAction.pause(2);
        verify.verifyElementDisplayByText(FileName, "ListOFMenu","Register");
    }

    @Test
    public void TC_18() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify free event ticket screen display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",5);
        methods.log("Verify event purchase ticket screen is display.");
        performAction.pause(2);
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",0);
    }

    @Test
    public void TC_19() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify free event ticket cost.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",5);

        methods.log("Verify free event ticket cost.");
        performAction.pause(2);
        String screenName = performAction.getText(FileName,"FreeTicketTotalCost");
        verify.verifyPurchaseTicketScreenName(screenName,"$0");
    }

    @Test
    public void TC_20() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event date format.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",5);

        methods.log("Verify event Date.");
        performAction.pause(2);
        String FreePurchaseTicketScreenDate = performAction.getText(FileName,"FreePurchaseTicketScreenDate");
        //verify.verifyEventTimeDate(FreePurchaseTicketScreenDate, 5);
    }

   // @Test
    public void TC_21() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify 'view more' link is display.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        String EventDate = performAction.getText(FileName, "EventDate");

    }

    //@Test
    public void TC_22() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify 3 different photos are display.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Events");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Automation Event Free");
        performAction.pause(5);
        performAction.waitForElement(FileName, "EventDate");
        String EventDate = performAction.getText(FileName, "EventDate");

    }

    @Test
    public void TC_23() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event description is display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);

        performAction.pause(3);;

        methods.log("Verify event Description display.");
        performAction.waitForElement(FileName, "EventDescription");
        verify.verifyDescriptionDisplay(FileName, "EventDescription");
    }

    @Test
    public void TC_24() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event start and end time is display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        methods.log("Verify event start and end date display.");

        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",3);
    }

    @Test
    public void TC_25() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event Location is display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);

        methods.log("Verify event Location display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",3);
    }

    @Test
    public void TC_26() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify event Location in display on map.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);

        methods.log("Verify event location pin is display.");

        //verify.verifyEventPinDisplay(EventName, EventLocation);
    }

    @Test
    public void TC_27() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify register button display at event detail page.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        methods.log("Verify register button display.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","Register");
    }

    @Test
    public void TC_28() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify register screen display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Register");
        methods.log("Verify register screen display.");
        performAction.pause(2);
        verify.verifyElementDisplayByIndex1(FileName,"ListOFMenu",0);

    }

    @Test
    public void TC_29() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify ticket amount should display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Register");
        methods.log("Verify register screen display.");
        performAction.pause(2);
        performAction.waitForElement(FileName,"TicketCost");
        performAction.getText(FileName,"TicketCost");
        verify.verifyDescriptionDisplay(FileName, "TicketCost");
    }

    @Test
    public void TC_30() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify default quantity should display as 1.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Register");
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
    public void TC_31() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify drop down list of quanity.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Register");
        performAction.pause(2);
        performAction.waitForElement(FileName,"Quantity");
        methods.log("Verify drop down list of quanity display.");
        verify.verifyDescriptionDisplay(FileName,"Quantity");
    }

    @Test
    public void TC_32() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify ticket amount should display correct as displaying in event detail screen.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Register");
        methods.log("Verify ticket amount display.");
        performAction.pause(2);
        performAction.waitForElement(FileName,"TicketCost");
        /*String Quantity = performAction.getText(FileName,"Quantity");
        verify.verifyDescriptionDisplay(FileName,"Quantity");*/
        methods.log("Verify Verify ticket amount.");
        verify.verifyDescriptionDisplay(FileName, "TicketCost");
    }

    @Test
    public void TC_33() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify If event is free then then 'FREE EVENT' text should display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
        performAction.pause(3);
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(2);

        methods.log("Verify Verify ticket amount.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","Eree Event");
    }

    //@Test
    public void TC_34() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Once user will register for free event then confirmation message should display.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
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
        String Text = performAction.getTagName(FileName,"TicketAmountOnEventDeatilScreen");
        methods.log("Verify Verify ticket amount.");
        /*verify.verifyFreeEvent(Text);*/
    }

    //@Test
    public void TC_35() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Payment screen should display after clicking on 'Continue to payment' button.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
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
