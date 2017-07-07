package test.tests.VideoScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {
    public String FileName = "VideoScreen";

    //Video Playlist//
    @Test
    public void TC_427() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "VideoScreenVerify");
        methods.log("Verify playlist display.");
        verify.verifyElementDisplay(FileName, "VideoScreenVerify");
    }

    @Test
    public void TC_428() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify individual video alignment.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideoPlayList");
        methods.log("Verify video alignment.");
        verify.verifyElementDisplay(FileName, "FirstVideoPlayList");
    }

    @Test
    public void TC_429() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify The video which are labeled as active in database, Only those active video should display in video list screen.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideoPlayList");
        methods.log("Verify video list.");
        verify.verifyElementDisplay(FileName, "FirstVideoPlayList");
        verify.printText(FileName, "VideoPlayListNames");


    }

    //Video Tracks Screen//
    @Test
    public void TC_434() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Video track detail screen should display.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "VideoPlayList3Text");
        String playListName = performAction.getText(FileName,"VideoPlayList3Text");
        performAction.click(FileName, "FirstVideoPlayList");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideo");
        methods.log("Verify Video track detail screen should display.");
        verify.verifyText(FileName,"VideoListScreenHeader",playListName);
        verify.verifyText(FileName,"Videos","Videos");
        verify.verifyElementDisplay(FileName, "VideoListScreenTracks");

    }

    @Test
    public void TC_435() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Correct video list should display.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideoPlayList");
        performAction.click(FileName, "FirstVideoPlayList");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideo");
        methods.log("Verify Correct video list should display.");
        verify.verifyElementDisplay(FileName, "FirstVideo");
        verify.printText(FileName,"VideosName");
    }

    @Test
    public void TC_437() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify The actual period of video file should display");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideoPlayList");
        performAction.click(FileName, "FirstVideoPlayList");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideo");
        performAction.click(FileName, "FirstVideo");
        performAction.pause(7);
        methods.log("Verify actual period of video is display.");
        performAction.waitForElement(FileName, "VideoTime");
        verify.verifyElementDisplay(FileName, "VideoTime");
    }

    @Test
    public void TC_438() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify share icon should display");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideoPlayList");
        performAction.click(FileName, "FirstVideoPlayList");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideo");
        performAction.click(FileName, "FirstVideo");
        performAction.pause(7);
        methods.log("Verify share icon is display.");
        performAction.waitForElement(FileName, "ShareButton");
        verify.verifyElementDisplay(FileName, "ShareButton");
    }

    @Test
    public void TC_440() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Video player should display after clicking on video file");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideoPlayList");
        performAction.click(FileName, "FirstVideoPlayList");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideo");
        performAction.click(FileName, "FirstVideo");
        performAction.pause(7);
        methods.log("Verify Video player is display.");
        performAction.waitForElement(FileName, "ShareButton");
        verify.verifyElementDisplay(FileName, "ShareButton");
    }

    //Video Player Screen//
    @Test
    public void TC_441() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify System should support video files.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideoPlayList");
        performAction.click(FileName, "FirstVideoPlayList");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideo");
        performAction.click(FileName, "FirstVideo");
        performAction.pause(7);
        performAction.waitForElement(FileName, "PlayButton");
        performAction.click(FileName, "PlayButton");
        performAction.pause(4);
        methods.log("Verify System is support video files.");
        performAction.waitForElement(FileName, "PauseButton");
        verify.verifyElementDisplay(FileName, "PauseButton");
    }

    @Test
    public void TC_442() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Check Play, Pause, Stop, Next, Previous, Close button should display.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideoPlayList");
        performAction.click(FileName, "FirstVideoPlayList");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideo");
        performAction.click(FileName, "FirstVideo");
        performAction.pause(7);
        performAction.waitForElement(FileName, "PlayButton");
        methods.log("Verify play button.");
        verify.verifyElementDisplay(FileName, "PlayButton");
        performAction.click(FileName, "PlayButton");
        performAction.pause(4);
        methods.log("Verify pause button.");
        performAction.waitForElement(FileName, "PauseButton");
        verify.verifyElementDisplay(FileName, "PauseButton");
        performAction.click(FileName, "PauseButton");
        performAction.pause(4);
        methods.log("Verify next button.");
        performAction.waitForElement(FileName, "NextButton");
        verify.verifyElementDisplay(FileName, "NextButton");
        performAction.click(FileName, "NextButton");
        performAction.pause(4);
        methods.log("Verify Previous button.");
        performAction.waitForElement(FileName, "PreviousButton");
        verify.verifyElementDisplay(FileName, "PreviousButton");
        performAction.click(FileName, "PreviousButton");
        performAction.pause(4);
    }

    @Test
    public void TC_445() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify video playlist should display correct after clicking on back and forword button..");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Video");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideoPlayList");
        performAction.click(FileName, "FirstVideoPlayList");
        performAction.pause(7);
        performAction.waitForElement(FileName, "FirstVideo");
        performAction.click(FileName, "FirstVideo");
        performAction.pause(7);

        performAction.waitForElement(FileName, "NextButton");
        verify.verifyElementDisplay(FileName, "NextButton");
        performAction.click(FileName, "NextButton");
        performAction.pause(4);

        performAction.waitForElement(FileName, "PreviousButton");
        verify.verifyElementDisplay(FileName, "PreviousButton");
        performAction.click(FileName, "PreviousButton");
        performAction.pause(4);

        performAction.waitForElement(FileName, "BackButton");
        performAction.click(FileName, "BackButton");
        performAction.pause(4);
        performAction.waitForElement(FileName, "FirstVideo");
        methods.log("Verify video playlist is display correct.");
        verify.elementIsDisplayed(FileName, "FirstVideo");
    }

}
