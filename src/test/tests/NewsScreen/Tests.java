package test.tests.NewsScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;

/**
 * Created by dell on 7/6/2017.
 */
public class Tests extends BrowserConfig {
    public String FileName = "NewsScreen";

    public String MenuName = "News";
    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";
    public String AppVersion = excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"General",8,1).toString();
    @Test
    public void TC_163() {
        VerifyNews verify = new VerifyNews(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : News icon should display on home screen");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);

        performAction.pause(5);
        methods.log("Verify news icone is display.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","News");
        performAction.pause(2);

    }

    @Test
    public void TC_164() {

        VerifyNews verify = new VerifyNews(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : News list Screen should open after clicking on 'News' icon");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"ListOFMenu", MenuName);
        performAction.pause(5);
        methods.log("Verify news List is display.");
        verify.verifyElementDisplayByIndex1(FileName,"ListOFMenu",0);
        performAction.pause(2);


    }
    @Test
    public void TC_165() {

        VerifyNews verify = new VerifyNews(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : All images should display to the news list");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"ListOFMenu", MenuName);
        performAction.pause(5);
        methods.log("Verify news List image is display.");
        verify.verifyElementDisplay(FileName,"NewsListImage");
        performAction.pause(2);


    }

    @Test
    public void TC_166() {

        VerifyNews verify = new VerifyNews(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : News list should display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"ListOFMenu", MenuName);
        performAction.pause(5);
        methods.log("Verify news List image is display.");
        verify.verifyElementDisplayByIndex1(FileName,"ListOFMenu",1);
        // verify.verifyElementDisplay(FileName,"NewsList1");
        performAction.pause(2);


    }
    @Test
    public void TC_167() {

        VerifyNews verify = new VerifyNews(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : News date should display like : July 04, 2017");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"ListOFMenu", MenuName);
        performAction.pause(5);
        methods.log("Verify news List image is display.");
        verify.verifyElementDisplayByIndex1(FileName,"ListOFMenu",2);
        performAction.pause(2);


    }

    // @Test
    public void TC_168() {

        VerifyNews verify = new VerifyNews(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Search functionality should work fine after clikcing on search icon or during enter data in search text.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList", MenuName);
        performAction.pause(5);
        String SearchData=performAction.getText(FileName,"NewsText");
        performAction.pause(2);
        performAction.click(FileName,"SearchText");
        performAction.pause(2);
        performAction.sendKeys(FileName,"SearchText",SearchData);
        performAction.pause(5);
        performAction.click(FileName,"SearchButton");
        //methods.log("Verify news List image is display.");
        //verify.verifyElementDisplay(FileName,"NewsDate");
        performAction.pause(2);


    }

    @Test
    public void TC_169() {

        VerifyNews verify = new VerifyNews(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : News should share after clicking on share icon.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"ListOFMenu", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu", 1);

        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu", "Share");

        performAction.pause(2);

        methods.log("Verify share menu is display.");
        verify.verifyElementDisplay(FileName,"ShareMenu");
        performAction.pause(2);


    }

    @Test
    public void TC_170() {

        VerifyNews verify = new VerifyNews(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : The system should back to the news list screen");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);

        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList", MenuName);
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu", 1);
        performAction.pause(5);
        performAction.click(FileName,"BackButton");
        performAction.pause(2);

        methods.log("Verify news List page is display.");
        verify.verifyElementDisplayByIndex1(FileName,"ListOFMenu",0);
        performAction.pause(2);

    }
}