package test.tests.EventDetailsScreen;

import org.testng.annotations.Test;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.EventModule.VerifyEvents;


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


}
