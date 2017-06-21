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
        performAction.getText(FileName, "EventName");
    }

    //@Test
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
        performAction.sendKeys(FileName, "SearchBox", "a**");
        performAction.waitForElement(FileName, "SearchButton");
        performAction.click(FileName, "SearchButton");
        performAction.pause(5);
        methods.log("Verify gives all responses starting with a**.");
        verify.verifyText(FileName, "ValidationMessage", "No Cause available for a**");
        performAction.getText(FileName, "ValidationMessage");
    }

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
    public void TC_224() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Cause name should display correct on search result.");
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
        verify.verifyElementDisplay(FileName, "SearchCause");
    }

    @Test
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
        performAction.waitForElement(FileName, "FirstSearchCause");
        performAction.click(FileName, "FirstSearchCause");
        performAction.pause(7);
        methods.log("Verify church details screen is display.");
        verify.verifyElementDisplay(FileName, "CreateFundraiserButton");
    }

    @Test
    public void TC_226() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Search functionality should work fine after clikcing on search icon or during enter data in search text..");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.click(FileName, "SearchBox");
        performAction.pause(2);
        performAction.sendKeys(FileName, "SearchBox", "AUTOMATION CAUSE");
        performAction.waitForElement(FileName, "SearchButton");
        performAction.pause(5);
        methods.log("Verify search result is display.");
        verify.verifyElementDisplay(FileName, "SearchCause");
    }

    @Test
    public void TC_227() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : After clicking on cause name then cause detail screen should display.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.waitForElement(FileName, "CreateFundraiserButton");
        methods.log("Verify cause detail is display.");
        verify.verifyElementDisplay(FileName, "CreateFundraiserButton");
    }

    @Test
    public void TC_229() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Fundraiser should display in the fundraiser list.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.waitForElement(FileName, "FirstFundraiser");
        methods.log("Verify fundraiser is display.");
        verify.verifyElementDisplay(FileName, "FirstFundraiser");
        verify.printText(FileName,"FundraisersName");
    }

    //@Test
    public void TC_231() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Currency symbol should display correct as configured in admin panel.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.waitForElement(FileName, "FirstFundraiser");
        methods.log("Verify currency symbol is display.");
        /*verify.elementIsDisplayed(FileName, "FirstFundraiser");*/
    }

    @Test
    public void TC_234() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Fundraiser detail descrption screen should display after clicking on fundraiser name.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.waitForElement(FileName, "FirstFundraiser");
        String name = performAction.getText(FileName, "FundraiserName");
        performAction.click(FileName, "FirstFundraiser");
        performAction.pause(5);
        methods.log("Verify fundraiser detail screen is display.");
        verify.verifyElementDisplay(FileName, "GiveButton");
        verify.containText(performAction.getText(FileName,"FundraiserNameFounderScreen"),name);
    }

    @Test
    public void TC_235() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Fundraiser name and location name should display correct as per selected fundraiser.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        methods.log("Verify fundraiser Fundraiser name and location name is display.");
        verify.elementTextDisplay(FileName, "FundraiserLocation");
        String name = performAction.getText(FileName, "FundraiserName");
        performAction.click(FileName, "FirstFundraiser");
        performAction.pause(5);
        verify.containText(performAction.getText(FileName,"FundraiserNameFounderScreen"),name);
    }

    @Test
    public void TC_236() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : The amount which is collected by fundraiser.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.click(FileName,"FirstFundraiser");
        performAction.pause(5);
        performAction.waitForElement(FileName, "FundraiserTotalAmount");
        methods.log("Verify total amount is display.");
        verify.elementTextDisplay(FileName, "FundraiserTotalAmount");
    }

    @Test
    public void TC_237() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : The amount which is the present goal that need to collect amount.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.click(FileName,"FirstFundraiser");
        performAction.pause(5);
        performAction.waitForElement(FileName, "FundraiserTargetAmount");
        methods.log("Verify target amount is display.");
        verify.elementTextDisplay(FileName, "FundraiserTargetAmount");
    }

    @Test
    public void TC_240() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Give button should display on fundraiser detail screen.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.click(FileName,"FirstFundraiser");
        performAction.pause(5);
        performAction.waitForElement(FileName, "GiveButton");
        methods.log("Verify give button is display.");
        verify.verifyElementDisplay(FileName, "GiveButton");
    }

    //@Test
    public void TC_241() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Description text should display in description section.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.waitForElement(FileName, "FounderScreenDetailTab");
        performAction.click(FileName, "FounderScreenDetailTab");
        methods.log("Verify Description text is display.");
        performAction.pause(5);
        performAction.androidScrollToElement(200);
        verify.verifyElementDisplay(FileName, "FounderScreenDetailText");
        performAction.getText(FileName, "FounderScreenDetailText");

    }

    //@Test
    public void TC_242() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Overview text should display in overview section.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.waitForElement(FileName, "GiveButton");
        methods.log("Verify Overview text is display.");

    }

    //@Test
    public void TC_243() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Fundraiser should share after clicking on share icon.");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(9);
        performAction.waitForElement(FileName, "FirstCause");
        performAction.click(FileName, "FirstCause");
        performAction.pause(2);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.waitForElement(FileName, "GiveButton");
        methods.log("Verify share icon is display.");
    }

}
