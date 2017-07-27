package test.tests.LiveStreamScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.General.PerformAction;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.VideoScreen.VerifyVideoScreen;


public class Tests extends BrowserConfig {
    String className = "Media";
    public String FileName = "LiveStreamScreen";
    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";
    public String AppVersion = excel.getCellFromExcel(ExcelFilePath, ExcelFileName, "General", 8, 1).toString();
    public String MenuName = "Media";
    public int MenuIndex  = 17;

    @Test
    public void TC_64() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);
        Steps step = new Steps(driver);
        Methods methods = new Methods(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);

            methods.log("Test Description : Verify live stream screen.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
            performAction.pause(7);
            step.Scroll();
            performAction.pause(3);
            methods.log("Verify live stream screen is display.");
            verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu", 5);
        } else {
            methods.log("This module is not available.");
        }
    }

    //@Test
    public void TC_65() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify  live video in schedule time.");
            performAction.pause(7);
            performAction.click(FileName, "MenuButton");
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
            performAction.pause(7);
            performAction.waitForElement(FileName, "VerifyLiveScreen");
            methods.log("Verify live video in schedule time.");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_66() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);
        Steps step = new Steps(driver);
        Methods methods = new Methods(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);

            methods.log("Test Description : Verify the Video time is displayed.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);

            performAction.pause(7);
            step.Scroll();
            performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 4);


            performAction.pause(2);
            methods.log("Verify the Video Date.");
            // performAction.getText(FileName,"Broadcasted");
            // verify.verifyElementDisplayByText(FileName, "ListOFMenu", VideoDate);
        } else {
            methods.log("This module is not available.");
        }

    }


    @Test
    public void TC_67() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);
        Steps step = new Steps(driver);
        Methods methods = new Methods(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);

            methods.log("Test Description : Verify  share video  functionality.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
            performAction.pause(7);
            step.Scroll();
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 5);

            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", "Share");

            methods.log("Verify share video.");
            verify.verifyElementDisplay(FileName, "SharePenal");
        } else {
            methods.log("This module is not available.");
        }
    }

    //@Test
    public void TC_68() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);

        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify  live video in schedule time.");
            performAction.pause(7);
            performAction.click(FileName, "MenuButton");
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", "Media");
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", "Live");
            performAction.pause(7);
            performAction.waitForElement(FileName, "VerifyLiveScreen");
            methods.log("Verify live video in schedule time.");
        } else {
            methods.log("This module is not available.");
        }
    }


    @Test
    public void TC_69() {
        VerifyLiveScreen verify = new VerifyLiveScreen(driver);
        Steps step = new Steps(driver);
        Methods methods = new Methods(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);

            methods.log("Test Description : Verify broadcast date is displayed.");
            performAction.pause(7);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(7);
            performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 3);
            performAction.pause(7);
            step.Scroll();
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 5);

            performAction.pause(2);
            methods.log("Verify broadcast Date.");
            // performAction.getText(FileName,"Broadcasted");
            verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu", 5);
        } else {
            methods.log("This module is not available.");
        }
    }


}
