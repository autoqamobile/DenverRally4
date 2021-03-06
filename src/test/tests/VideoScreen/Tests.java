package test.tests.VideoScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {
    String className = "Media";
    public String FileName = "VideoScreen";
    public int MenuIndex  = 17;
    public String MenuName = "Media";
    public String TabName = "Video";
    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";
    public String AppVersion = excel.getCellFromExcel(ExcelFilePath, ExcelFileName, "General", 8, 1).toString();

    //Video Playlist//
    @Test
    public void TC_53() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify playlist screen display.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
            performAction.pause(7);
            performAction.waitForElement(FileName, "VideoScreenVerify");
            methods.log("Verify playlist display.");
            verify.verifyElementDisplay(FileName, "VideoScreenVerify");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_54() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify individual video alignment.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
            performAction.pause(7);
            performAction.waitForElement(FileName, "FirstVideoPlayList");
            methods.log("Verify video alignment.");
            verify.verifyElementDisplay(FileName, "FirstVideoPlayList");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_55() {

        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify The video which are labeled as active in database, Only those active video should display in video list screen.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
            performAction.pause(7);
            performAction.waitForElement(FileName, "FirstVideoPlayList");
            methods.log("Verify video list.");
            verify.verifyElementDisplay(FileName, "FirstVideoPlayList");
            verify.printText(FileName, "VideoPlayListNames");
        } else {
            methods.log("This module is not available.");
        }

    }

    //Video Tracks Screen//
    @Test
    public void TC_56() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify Video track detail screen should display.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
            performAction.pause(7);
            performAction.waitForElement(FileName, "VideoPlayList3Text");
            String playListName = performAction.getText(FileName, "VideoPlayList3Text");
            performAction.click(FileName, "FirstVideoPlayList");
            performAction.pause(7);
            performAction.waitForElement(FileName, "FirstVideo");
            methods.log("Verify Video track detail screen should display.");
            verify.verifyText(FileName, "VideoListScreenHeader", playListName);
            verify.verifyText(FileName, "Videos", "Videos");
            verify.verifyElementDisplay(FileName, "VideoListScreenTracks");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_57() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify Correct video list should display.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
            performAction.pause(7);
            performAction.waitForElement(FileName, "FirstVideoPlayList");
            performAction.click(FileName, "FirstVideoPlayList");
            performAction.pause(7);
            performAction.waitForElement(FileName, "FirstVideo");
            methods.log("Verify Correct video list should display.");
            verify.verifyElementDisplay(FileName, "FirstVideo");
            verify.printText(FileName, "VideosName");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_58() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify The actual period of video file should display");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
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
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_59() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify share icon should display");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
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
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_60() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify Video player should display after clicking on video file");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
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
        } else {
            methods.log("This module is not available.");
        }
    }

    //Video Player Screen//
    @Test
    public void TC_61() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify System should support video files.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
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
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_62() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify Check Play, Pause, Stop, Next, Previous, Close button should display.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
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
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_63() {
        VerifyVideoScreen verify = new VerifyVideoScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify video playlist should display correct after clicking on back and forword button..");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", TabName);
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
        } else {
            methods.log("This module is not available.");
        }
    }

}
