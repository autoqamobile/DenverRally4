package test.tests.LiveStreamScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.VideoScreen.VerifyVideoScreen;


public class Tests extends BrowserConfig {
    public String FileName = "VideoScreen";

    //Video Playlist//
    //@Test
    public void TC_427() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "VideoScreenVerify");
        methods.log("Verify playlist display.");
        verify.verifyElementDisplay(FileName, "VideoScreenVerify");
    }

}
