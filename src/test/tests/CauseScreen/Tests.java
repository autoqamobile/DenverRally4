package test.tests.CauseScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {
    public String FileName = "CauseScreen";

    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";
    public String SearchBox = "Find a cause";
    public String SearchText =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"Give",4,1).toString();
    public String SearchText2 =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"Give",5,1).toString();


    public String MenuName = "Give";



    @Test
    public void TC_70() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);

        methods.log("Test Description : Verify live stream screen.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(7);
        methods.log("Verify live stream screen is display.");
        verify.verifyElementDisplayByIndex2(FileName, "ListOFMenu",0);

    }

    //@Test
    public void TC_209() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify active cause is display.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
        performAction.pause(7);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", "Give");
        performAction.pause(7);
        performAction.waitForElement(FileName, "CauseScreenVerify");
        methods.log("Verify live stream screen is display.");
    }

    @Test
    public void TC_71() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify search cause with valid name is display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "SearchText",0);
        performAction.pause(2);
        performAction.sendKeyOnElementFromList(FileName, "SearchText", SearchBox,SearchText);
        //performAction.waitForElement(FileName, "SearchButton");
       // performAction.click(FileName, "SearchButton");
        driver.hideKeyboard();
        performAction.pause(5);
        methods.log("Verify search cause with valid name.");
        verify.verifyElementDisplayByTextContent(FileName, "ListOFMenu", SearchText);
    }

    @Test
    public void TC_72() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Verify place holder in search text field is display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);

        methods.log("Verify place holder in search text field.");
        verify.verifyElementDisplayByIndex2(FileName, "SearchText", 0);
    }

    @Test
    public void TC_73() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Search with special characters.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "SearchText",0);
        performAction.pause(2);
        performAction.sendKeyOnElementFromList(FileName, "SearchText", SearchBox,"a*");
        //performAction.waitForElement(FileName, "SearchButton");
        // performAction.click(FileName, "SearchButton");
        driver.hideKeyboard();
        performAction.pause(5);
        methods.log("Verify gives all responses starting with a*.");
        verify.verifyText(FileName, "ValidationMessage", "Search Text should be atleast 3 character long");
        performAction.getText(FileName, "ValidationMessage");
    }

    @Test
    public void TC_74() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : The blank space should trimmed on starting of the first word in the text box.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "SearchText",SearchBox);
        performAction.pause(2);
        performAction.sendKeyOnElementFromList(FileName, "SearchText", SearchBox,SearchText);

        driver.hideKeyboard();
        performAction.pause(5);
        methods.log("Verify search text field cause is display.");
        verify.verifyElementDisplayByTextContent(FileName, "ListOFMenu", SearchText);
    }

    @Test
    public void TC_75() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Check number of result on first load.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(5);

        methods.log("Display count of display cause.");
        verify.countListOfCause(FileName, "NumberOfCause");
    }

    @Test
    public void TC_76() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Search text box should display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);

        methods.log("Verify Search text box should display.");
        verify.verifyElementDisplayByIndex1(FileName, "SearchText",0);
    }

    @Test
    public void TC_77() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : If data will enter in search text box then auto listing cause should display.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.sendKeyOnElementFromList(FileName, "SearchText", SearchBox,SearchText2);
        performAction.pause(5);
        driver.hideKeyboard();

        performAction.pause(5);
        String searchResult = performAction.getText(FileName, "SearchCause");

        methods.log("Verify Search cause text display.");
        verify.containText(searchResult, SearchText2);
    }

    @Test
    public void TC_78() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Cause name should display correct on search result.");
        performAction.pause(7);
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.sendKeyOnElementFromList(FileName, "SearchText", SearchBox,SearchText);
        performAction.pause(5);
        driver.hideKeyboard();

        performAction.pause(5);

        performAction.androidScrollToElement(300);
        performAction.pause(2);
        methods.log("Verify Cause name is display.");
        performAction.waitForElement(FileName, "SearchButton");
        verify.verifyElementDisplay(FileName, "SearchCause");
    }

    @Test
    public void TC_79() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : After clikcing on search cause name, screen should redirect on cause detail screen.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.sendKeyOnElementFromList(FileName, "SearchText", SearchBox,SearchText);
        performAction.pause(5);
        driver.hideKeyboard();

        performAction.pause(5);

        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu",1);
        performAction.pause(2);

        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu",1);
        performAction.pause(7);
        methods.log("Verify church details screen is display.");
        verify.verifyElementDisplay(FileName, "CreateFundraiserButton");
    }

    @Test
    public void TC_80() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Search functionality should work fine after clikcing on search icon or during enter data in search text..");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.waitForElement(FileName, "SearchBox");
        performAction.sendKeyOnElementFromList(FileName, "SearchText", SearchBox,SearchText);
        performAction.pause(5);
        driver.hideKeyboard();

        performAction.pause(5);
        methods.log("Verify search result is display.");
        verify.verifyElementDisplay(FileName, "SearchCause");
    }

    @Test
    public void TC_81() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : After clicking on cause name then cause detail screen should display.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 1);
        performAction.pause(5);
        methods.log("Verify cause detail is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",0);
    }

    @Test
    public void TC_82() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Fundraiser should display in the fundraiser list.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 1);
        performAction.pause(5);
        performAction.androidScrollToElement(200);

        methods.log("Verify fundraiser is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",7);
        verify.printText(FileName,"FundraisersName");
    }

    //@Test
    public void TC_231() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Currency symbol should display correct as configured in admin panel.");
        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
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
    public void TC_83() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Fundraiser detail descrption screen should display after clicking on fundraiser name.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", SearchText);
        performAction.pause(5);
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
    public void TC_84() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Fundraiser name and location name should display correct as per selected fundraiser.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 1);
        performAction.pause(5);
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
    public void TC_85() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : The amount which is collected by fundraiser.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 1);
        performAction.pause(5);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.click(FileName,"FirstFundraiser");
        performAction.pause(5);
        performAction.waitForElement(FileName, "FundraiserTotalAmount");
        methods.log("Verify total amount is display.");
        verify.elementTextDisplay(FileName, "FundraiserTotalAmount");
    }

    @Test
    public void TC_86() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : The amount which is the present goal that need to collect amount.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 1);
        performAction.pause(5);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 5);
        performAction.pause(5);
        methods.log("Verify target amount is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFMenu",5);
    }

    @Test
    public void TC_87() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Give button should display on fundraiser detail screen.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 1);
        performAction.pause(5);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 5);
        performAction.pause(5);
        methods.log("Verify give button is display.");
        verify.verifyElementDisplayByText(FileName, "ListOFMenu","Give");
    }

    @Test
    public void TC_88() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Description text should display in description section.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 1);
        performAction.pause(5);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 5);
        performAction.pause(5);
        methods.log("Verify Description text is display.");
        performAction.androidScrollToElement(200);
        performAction.pause(2);
        verify.verifyElementDisplay(FileName, "FounderScreenDetailText");
        performAction.getText(FileName, "FounderScreenDetailText");

    }

    //@Test
    public void TC_89() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Overview text should display in overview section.");

        performAction.pause(7);
        performAction.click(FileName,"MenuButton");
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

    @Test
    public void TC_90() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);

        Methods methods = new Methods(driver);
        methods.log("Test Description : Fundraiser should share after clicking on share icon.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "ListOFMenu", MenuName);
        performAction.pause(3);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 1);
        performAction.pause(5);
        performAction.androidScrollToElement(200);
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "ListOFMenu", 5);
        performAction.pause(5);
        verify.verifyElementDisplay(FileName, "FounderShare");
        methods.log("Verify share icon is display.");
    }

}
