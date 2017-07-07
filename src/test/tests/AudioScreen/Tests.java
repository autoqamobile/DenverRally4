package test.tests.AudioScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.EventDetailsScreen.VerifyEvents;


public class Tests extends BrowserConfig {
    public String FileName = "AudioScreen";

    //Audio Playlist//
    @Test
    public void TC_42() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);

        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(5);
        performAction.waitForElement(FileName, "FirstPlayList");
        methods.log("Verify playlist display.");
        verify.verifyElementDisplay(FileName, "FirstPlayList");
        performAction.getText(FileName, "FirstPlayList");
    }

    @Test
    public void TC_43() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
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
    public void TC_44() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
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
    public void TC_45() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Audio track detail screen should display.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
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
    public void TC_46() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
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
        verify.printAudioName(FileName, "PlayListAudioName");
    }

    @Test
    public void TC_47() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");
        methods.log("Verify playlist display.");
        performAction.waitForElement(FileName, "TotalTimeDuration");
        verify.verifyElementDisplay(FileName, "TotalTimeDuration");
    }

    @Test
    public void TC_48() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify share icon.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");
        methods.log("Verify share icon.");
        performAction.waitForElement(FileName, "ShareIcon");
        verify.verifyElementDisplay(FileName, "ShareIcon");
    }

    @Test
    public void TC_49() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Audio player should display after clicking on audio file.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");
        methods.log("Verify audio player.");
        performAction.waitForElement(FileName, "ShareIcon");
        verify.verifyElementDisplay(FileName, "ShareIcon");
    }

    //Audio Player Screen//
    @Test
    public void TC_50() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify system should support audio files.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
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
    public void TC_41() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify All buttons should work fine.");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");
        methods.log("Verify Play is dispaly.");
        performAction.waitForElement(FileName, "PlayButton");
        verify.verifyElementDisplay(FileName, "PlayButton");
        performAction.click(FileName, "PlayButton");
        performAction.pause(2);
        methods.log("Verify Pause is display.");
        performAction.waitForElement(FileName, "PauseButton");
        verify.verifyElementDisplay(FileName, "PauseButton");
        //performAction.click(FileName, "PauseButton");
        performAction.pause(2);
        methods.log("Verify Next is display.");
        performAction.waitForElement(FileName, "NextSongButton");
        verify.verifyElementDisplay(FileName, "NextSongButton");
        performAction.pause(2);
        methods.log("Verify Previous is display.");
        performAction.waitForElement(FileName, "PreviousSongButton");
        verify.verifyElementDisplay(FileName, "PreviousSongButton");
        performAction.pause(2);
    }

    @Test
    public void TC_52() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify audio playlist should display correct after clicking on back and forword button..");
        performAction.pause(7);
        performAction.waitForElement(FileName,"MenuButton");
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Audio");
        performAction.pause(7);
        performAction.click(FileName, "FirstPlayList");
        performAction.pause(7);
        performAction.click(FileName, "FirstAudio");

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
