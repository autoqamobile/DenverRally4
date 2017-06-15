package test.tests.AudioScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.EventDetailsScreen.VerifyEvents;


public class Tests extends BrowserConfig {
    public String FileName = "AudioScreen";

    //Audio Playlist//
    @Test
    public void TC_406() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.waitForElement(FileName, "AudioScreenVerify");
        methods.log("Verify playlist display.");
        verify.verifyElementDisplay(FileName, "AudioScreenVerify");
    }

    @Test
    public void TC_407() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        methods.log("Verify playlist display.");
        performAction.waitForElement(FileName, "FirstAudio");
        verify.verifyElementDisplay(FileName, "FirstAudio");
    }

    @Test
    public void TC_408() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        methods.log("Verify playlist display.");
        performAction.waitForElement(FileName, "FirstAudio");
        verify.verifyElementDisplay(FileName, "FirstAudio");
    }

    //Audio Tracks Screen//
    @Test
    public void TC_413() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Audio track detail screen should display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        methods.log("Verify audio track detail display.");
        performAction.waitForElement(FileName, "FirstAudio");
        verify.verifyElementDisplay(FileName, "FirstAudio");
    }

    @Test
    public void TC_414() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        methods.log("Verify playlist display.");
        performAction.waitForElement(FileName, "FirstAudio");
        /*verify.verifyElementDisplay(FileName,"FirstAudio");*/
    }

    @Test
    public void TC_416() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");
        methods.log("Verify playlist display.");
        performAction.waitForElement(FileName, "FirstAudio");
        verify.verifyElementDisplay(FileName, "TotalTimeDuration");
    }

    @Test
    public void TC_417() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify share icon.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");
        methods.log("Verify share icon.");
        performAction.waitForElement(FileName, "FirstAudio");
        verify.verifyElementDisplay(FileName, "ShareIcon");
    }

    @Test
    public void TC_419() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Audio player should display after clicking on audio file.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");
        methods.log("Verify audio player.");
        performAction.waitForElement(FileName, "TotalTimeDuration");
        verify.verifyElementDisplay(FileName, "TotalTimeDuration");
    }

    //Audio Player Screen//
    @Test
    public void TC_420() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify system should support audio files.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");
        methods.log("Verify system should support audio files.");
        performAction.waitForElement(FileName, "PlayButton");
        verify.verifyElementDisplay(FileName, "PlayButton");
        performAction.click(FileName, "PlayButton");
        performAction.pause(2);
    }

    @Test
    public void TC_421() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify All buttons should work fine.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");
        methods.log("Verify Play.");
        performAction.waitForElement(FileName, "PlayButton");
        verify.verifyElementDisplay(FileName, "PlayButton");
        performAction.click(FileName, "PlayButton");
        performAction.pause(2);
        methods.log("Verify Pause.");
        performAction.waitForElement(FileName, "PauseButton");
        verify.verifyElementDisplay(FileName, "PauseButton");
        performAction.click(FileName, "PauseButton");
        performAction.pause(2);
        methods.log("Verify Next.");
        performAction.waitForElement(FileName, "NextSongButton");
        verify.verifyElementDisplay(FileName, "NextSongButton");
        performAction.click(FileName, "NextSongButton");
        performAction.pause(2);
        methods.log("Verify Previous.");
        performAction.waitForElement(FileName, "PreviousSongButton");
        verify.verifyElementDisplay(FileName, "PreviousSongButton");
        performAction.click(FileName, "PreviousSongButton");
        performAction.pause(2);
    }

    @Test
    public void TC_422() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify audio playlist should display correct after clicking on back and forword button..");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");

        performAction.waitForElement(FileName, "PlayButton");
        performAction.click(FileName, "PlayButton");
        performAction.pause(2);

        performAction.waitForElement(FileName, "NextSongButton");
        performAction.click(FileName, "NextSongButton");
        performAction.pause(2);

        performAction.waitForElement(FileName, "PreviousSongButton");
        performAction.click(FileName, "PreviousSongButton");
        performAction.pause(2);

        performAction.waitForElement(FileName, "BackButton");
        performAction.click(FileName, "BackButton");
        performAction.pause(2);

        methods.log("Verify Verify audio playlist should display correct.");
        verify.verifyElementDisplay(FileName, "FirstAudio");
        performAction.pause(2);
    }

}
