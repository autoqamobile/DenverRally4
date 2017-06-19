package test.tests.LiveStreamScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.General.PerformAction;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.VideoScreen.VerifyVideoScreen;


public class Tests extends BrowserConfig {
    public String FileName = "LiveStreamScreen";

    @Test
    public void TC_294() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify live stream screen.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "VerifyLiveScreen");
        methods.log("Verify live stream screen is display.");
        verify.verifyText(FileName, "VerifyLiveScreen", "Live");
    }

    //@Test
    public void TC_296() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify  live video in schedule time.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "VerifyLiveScreen");
        methods.log("Verify live video in schedule time.");

    }

    @Test
    public void TC_298() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify the Video time is displayed.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstLiverVideo");
        performAction.click(FileName, "FirstLiverVideo");
        performAction.pause(2);
        methods.log("Verify the Video time.");

    }


    //@Test
    public void TC_300() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify  share video  functionality.");
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

    }

    //@Test
    public void TC_301() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify  live video in schedule time.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
        performAction.pause(7);
        performAction.waitForElement(FileName, "VerifyLiveScreen");
        methods.log("Verify live video in schedule time.");

    }


    @Test
    public void TC_302() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify broadcast date is displayed.");
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
