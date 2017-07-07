package test.tests.LiveStreamScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.General.PerformAction;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.VideoScreen.VerifyVideoScreen;


public class Tests extends BrowserConfig {
    public String FileName = "LiveStreamScreen";

    @Test
    public void TC_64() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify live stream screen.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "VerifyLiveScreen");
        methods.log("Verify live stream screen is display.");
        verify.verifyText(FileName, "VerifyLiveScreen", "Automation Live Stream");
    }

    //@Test
    public void TC_65() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify  live video in schedule time.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "VerifyLiveScreen");
        methods.log("Verify live video in schedule time.");

    }

    @Test
    public void TC_66() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify the Video time is displayed.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstLiverVideo");
        performAction.click(FileName, "FirstLiverVideo");
        performAction.pause(2);
        methods.log("Verify the Video Date.");
        performAction.getText(FileName,"Broadcasted");
       // System.out.println(methods.findElement(propertyFileName, elementName).getText().toString());


    }


    @Test
    public void TC_67() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify  share video  functionality.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstLiverVideo");
        performAction.click(FileName, "FirstLiverVideo");
        performAction.pause(2);
        performAction.waitForElement(FileName, "ShareButton");
        performAction.click(FileName, "ShareButton");

        methods.log("Verify share video.");
        verify.verifyElementDisplay(FileName, "SharePenal");
    }

    //@Test
    public void TC_68() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify  live video in schedule time.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "VerifyLiveScreen");
        methods.log("Verify live video in schedule time.");

    }


    @Test
    public void TC_69() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify broadcast date is displayed.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstLiverVideo");
        performAction.click(FileName, "FirstLiverVideo");
        performAction.pause(2);
        methods.log("Verify broadcast date.");
        verify.verifyElementDisplay(FileName, "Broadcasted");
    }


}
