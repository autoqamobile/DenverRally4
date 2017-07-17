package test.tests.AudioScreen;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.EventDetailsScreen.VerifyEvents;


public class Tests extends BrowserConfig {

    public String FileName = "AudioScreen";


    public String MenuName = "Media";
    public String MenuTabName = "Audio";

    //Audio Playlist//
    @Test
    public void TC_42() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(7);
        // performAction.waitForElement(FileName, "FirstPlayList");
        methods.log("Verify playlist display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",4);
        //performAction.getText(FileName, "FirstPlayList");
    }

    @Test
    public void TC_43() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
      /*  performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",AudioPlayList);*/
        performAction.pause(3);
        methods.log("Verify playlist display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",4);
    }

    @Test
    public void TC_44() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(3);
       performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",4);
        performAction.pause(3);
        methods.log("Verify playlist display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",3);
    }

    //Audio Tracks Screen//
    @Test
    public void TC_45() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Audio track detail screen should display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",4);
        performAction.pause(3);
        methods.log("Verify audio track detail display.");
        verify.verifyElementDisplayByIndex2(FileName, "ListOFMenu",0);
    }

    @Test
    public void TC_46() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify playlist screen display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",4);
        performAction.pause(3);
        methods.log("Verify playlist display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",3);

    }

    @Test
    public void TC_47() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : The actual period of audio file should display in time.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",4);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",3);;
        performAction.pause(3);
        methods.log("Verify The actual period of audio file should display in time.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",4);

    }

    @Test
    public void TC_48() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify share icon.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",4);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",3);
        performAction.pause(3);
        methods.log("Verify share icon.");
        verify.verifyElementDisplayByText1(FileName, "ListOFMenu","share");
    }

    @Test
    public void TC_49() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify Audio player should display after clicking on audio file.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",4);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",3);
        performAction.pause(3);
        methods.log("Verify audio player.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",0);

    }

    //Audio Player Screen//
    @Test
    public void TC_50() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify system should support audio files.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",4);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",3);
        performAction.pause(15);
        methods.log("Verify system should support audio files.");

        verify.verifyElementDisplayByIndex(FileName, "ListOFMenu",8);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu",8);
        performAction.pause(2);
    }

    @Test
    public void TC_51() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify All buttons should work fine.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",4);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",3);
        performAction.pause(3);
        methods.log("Verify Play is dispaly.");
        verify.verifyElementDisplayByIndex(FileName, "ListOFMenu",8);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu",8);
        performAction.pause(2);
        methods.log("Verify Pause is display.");
        verify.verifyElementDisplayByIndex(FileName, "ListOFMenu",8);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu",8);
        //performAction.click(FileName, "PauseButton");
        performAction.pause(2);
        methods.log("Verify Next is display.");
        verify.verifyElementDisplayByIndex(FileName, "ListOFMenu",9);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu",9);
        performAction.pause(2);
        methods.log("Verify Previous is display.");
        verify.verifyElementDisplayByIndex(FileName, "ListOFMenu",7);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu",8);
        performAction.pause(2);
    }

    @Test
    public void TC_52() {
        VerifyAudioScreen verify = new VerifyAudioScreen(driver);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify audio playlist should display correct after clicking on back and forword button..");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuTabName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",4);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",3);
        performAction.pause(3);

        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",9);

        performAction.pause(2);

        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.pause(2);

        performAction.waitForElement(FileName, "BackButton");
        performAction.click(FileName, "BackButton");
        performAction.pause(2);

        methods.log("Verify Verify audio playlist should display correct.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",3);

        performAction.pause(2);
    }

}