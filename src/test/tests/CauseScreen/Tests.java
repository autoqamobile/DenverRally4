package test.tests.CauseScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {
    public String FileName = "CauseScreen";

    @Test
    public void TC_207() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify live stream screen.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(7);
        performAction.waitForElement(FileName, "CauseScreenVerify");
        methods.log("Verify live stream screen is display.");
        verify.verifyText(FileName, "CauseScreenVerify", "Causes");
    }

    @Test
    public void TC_209() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify active cause is display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(7);
        performAction.waitForElement(FileName, "CauseScreenVerify");
        methods.log("Verify live stream screen is display.");
    }

    @Test
    public void TC_213() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify search cause with valid name is display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(7);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.click(FileName, "SearchBox");
        performAction.pause(2);
        performAction.sendKeys(FileName, "SearchBox", "AUTOMATION CAUSE");
        performAction.waitForElement(FileName, "SearchButton");
        performAction.click(FileName, "SearchButton");
        methods.log("Verify search cause with valid name.");
        verify.verifyText(FileName, "SearchResultText", "AUTOMATION CAUSE");
    }

    @Test
    public void TC_215() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify place holder in search text field is display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(7);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.click(FileName, "SearchBox");
        performAction.pause(2);
        performAction.sendKeys(FileName, "SearchBox", "AUTOMATION CAUSE");
        performAction.waitForElement(FileName, "SearchButton");
        performAction.click(FileName, "SearchButton");
        performAction.pause(5);
        methods.log("Verify place holder in search text field.");
        verify.verifyText(FileName, "SearchBox", "AUTOMATION CAUSE");
    }

    @Test
    public void TC_216() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Search with special characters.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(7);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.click(FileName, "SearchBox");
        performAction.pause(2);
        performAction.sendKeys(FileName, "SearchBox", "AUTOMATION CAUSE");
        performAction.waitForElement(FileName, "SearchButton");
        performAction.click(FileName, "SearchButton");
        performAction.pause(5);
        methods.log("Verify gives all responses starting with a.");
    }

    public void TC_218() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : The blank space should trimmed on starting of the first word in the text box.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(7);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.click(FileName, "SearchBox");
        performAction.pause(2);
        performAction.sendKeys(FileName, "SearchBox", "AUTOMATION CAUSE");
        performAction.waitForElement(FileName, "SearchButton");
        performAction.pause(5);
        methods.log("Verify search text field cause is display.");
        verify.verifyText(FileName, "SearchBox", "AUTOMATION CAUSE");
    }

    public void TC_220() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Check number of result on first load.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);

        methods.log("Display count of display cause.");
        verify.countListOfCause(FileName, "NumberOfCause");
    }

    public void TC_221() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Search text box should display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);

        performAction.waitForElement(FileName, "SearchBox");
        methods.log("Verify Search text box should display.");
        verify.elementIsDisplayed(FileName, "SearchBox");
    }

    public void TC_222() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : If data will enter in search text box then auto listing cause should display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.click(FileName, "SearchBox");
        performAction.pause(2);
        performAction.sendKeys(FileName, "SearchBox", "AUTO");
        performAction.pause(5);

        String searchResult = performAction.getText(FileName, "SearchCause");

        methods.log("Verify Search cause text display.");
        verify.containText(searchResult, "AUTO");
    }

    public void TC_224() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Cause name should display correct on search result..");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.click(FileName, "SearchBox");
        performAction.pause(2);
        performAction.sendKeys(FileName, "SearchBox", "AUTOMATION CAUSE");
        performAction.waitForElement(FileName, "SearchButton");
        performAction.pause(5);
        methods.log("Verify Cause name is display.");
        verify.elementIsDisplayed(FileName, "SearchCause");
    }

    public void TC_225() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : After clikcing on search cause name, screen should redirect on cause detail screen.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.click(FileName, "SearchBox");
        performAction.pause(2);
        performAction.sendKeys(FileName, "SearchBox", "AUTOMATION CAUSE");
        performAction.pause(5);
        performAction.waitForElement(FileName,"FirstSearchCause");
        performAction.click(FileName,"FirstSearchCause");
        performAction.pause(7);
        methods.log("Verify church details screen is display.");
        verify.elementIsDisplayed(FileName, "CreateFundraiserButton");
    }

}
