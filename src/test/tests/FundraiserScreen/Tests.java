package test.tests.FundraiserScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;

/**
 * Created by dell on 7/14/2017.
 */
public class Tests extends BrowserConfig {
    String className = "Give";

    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";

    public String AppVersion = excel.getCellFromExcel(ExcelFilePath, ExcelFileName, "General", 8, 1).toString();
    public int MenuIndex  = 17;
    public String FileName = "FundraiserScreen";
    public String FileName1 = "LoginScreen";

    public String MenuText = "Give";
    public String CauseName = "Hope Worldwide";
    public String GoToLoginButton = "Go To Login";
    public String LoginScreen = "My Profile";
    public String Email = "test@mailinator.com";
    public String Password = "123456";
    String FundraiserButton = "Create Fundraiser";

    @Test
    public void TC_184() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : 'Create Fundraiser' button should display on screen");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "MenuTextList", 1);

            //step.ScrollAndClick(CauseName);
            performAction.pause(3);
            methods.log("Verify Fundraiser Button is display.");
            verify.verifyElementDisplayByText(FileName, "CauseList", "Create Fundraiser");
            performAction.pause(2);
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_185() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Check that If user not login than display popup menu");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);

            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "MenuTextList", 1);

            //step.ScrollAndClick(CauseName);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);
            performAction.pause(2);
            methods.log("Verify Login PopUp is display.");
            verify.verifyElementDisplay(FileName, "LoginPopUp");
            performAction.pause(2);
        } else {
            methods.log("This module is not available.");
        }


    }

    @Test
    public void TC_186() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on Go To Login the system should redirect to Login page");

            performAction.pause(10);
            performAction.clickOnElementFromListIndex(FileName, "MenuTextList", MenuIndex);

            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            //step.ScrollAndClick(CauseName);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(2);

            performAction.clickOnElementFromList(FileName, "PopUpButton", GoToLoginButton);
            performAction.pause(2);
            methods.log("Verify Login Screen is display.");
            verify.verifyElementDisplayByText(FileName, "TextList", LoginScreen);
            performAction.pause(2);
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_187() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on Go To Login the system should check that popup is close");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            //step.ScrollAndClick(CauseName);

            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "PopUpButton", "Cancel");
            performAction.pause(2);
            methods.log("Verify Fundraiser Button is display.");
            verify.verifyElementDisplayByText(FileName, "CauseList", "Create Fundraiser");
        } else {
            methods.log("This module is not available.");
        }

    }

    //@Test
    public void TC_188() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : check after click on login button the system should redirect to New Fundeaiser page");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "PopUpButton", GoToLoginButton);
            performAction.pause(5);
            performAction.sendKeys(FileName1, "MyProfileEmail", Email);
            performAction.pause(3);
            performAction.click(FileName1, "MyProfileText");
            performAction.pause(2);
            performAction.click(FileName1, "PasswordBox");
            performAction.androidScrollToElementManually(550, 330);
            performAction.waitForElement(FileName1, "PasswordBox");
            performAction.sendKeys(FileName1, "PasswordBox", Password);
            performAction.androidScrollToElementManually(550, 330);
            performAction.waitForElement(FileName1, "SubmitButton");
            performAction.click(FileName1, "SubmitButton");
            performAction.pause(5);
            performAction.click(FileName1, "SubmitButton1");
            performAction.pause(5);
            methods.log("Verify Fundraiser Button is display.");
            verify.verifyElementDisplayByText(FileName, "CauseList", "New Fundraiser");
        } else {
            methods.log("This module is not available.");
        }


    }

    @Test
    public void TC_189() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : If user is already login Then system should redirect to New Fundeaiser page");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex(FileName, "MenuTextList", 7);

            performAction.waitForElement(FileName1, "MyProfileEmail");
            performAction.sendKeys(FileName1, "MyProfileEmail", Email);
            performAction.androidScrollToElementManually(550, 330);
            performAction.pause(3);
            performAction.click(FileName1, "MyProfileText");
            performAction.pause(2);
            performAction.click(FileName1, "PasswordBox");
            performAction.androidScrollToElementManually(550, 330);
            performAction.waitForElement(FileName1, "PasswordBox");
            performAction.sendKeys(FileName1, "PasswordBox", Password);
            performAction.androidScrollToElementManually(550, 330);
            performAction.waitForElement(FileName1, "SubmitButton");
            performAction.click(FileName1, "SubmitButton");
            performAction.pause(5);
            performAction.click(FileName1, "SubmitButton1");
            performAction.pause(5);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);
            performAction.pause(3);

            methods.log("Verify Fundraiser Button is display.");
            verify.verifyElementDisplayByText(FileName, "CauseList", "New Fundraiser");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_190() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : User should able to enter valid data in fundraiser title text field.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);


            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "Hello");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            methods.log("Verify enter valid data in fundraiser title text field.");
            verify.verifyElementDisplayByText(FileName, "TextList", "Cover photo");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_191() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : User should able to enter valid data in description text field.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);


            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "Hello");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            methods.log("Verify enter valid data in  description text field.");
            verify.verifyElementDisplayByText(FileName, "TextList", "Cover photo");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_192() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : User should able to checked custom goal field.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);


            performAction.pause(3);
            methods.log("Verify to checked custom goal field");
            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 8);
            performAction.pause(2);


            // verify.verifyElementDisplayByText(FileName,"TextList","FundraiserScreen goal");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_193() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : If user checked custom goal then system should display new field Fundraiser goal TextBox");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);


            performAction.pause(3);

            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 8);
            performAction.pause(2);

            methods.log("Verify to checked custom goal field");
            verify.verifyElementDisplayByText(FileName, "TextList", "Fundraiser goal");
        } else {
            methods.log("This module is not available.");
        }

    }


    @Test
    public void TC_194() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : User should able to enter valid data in fundraiser goal text field.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(2);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);


            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "Hello");
            driver.hideKeyboard();

            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 8);
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 8);
            // performAction.pause(2);
            // performAction.clickOnElementFromList(FileName, "TextList","Costom goal");
            performAction.pause(5);
            performAction.sendKeysByIndex1(FileName, "TextBoxList", 2, "10000");
       /* performAction.sendKeysByIndex1(FileName, "TextBoxList",2, "0");
        performAction.sendKeysByIndex1(FileName, "TextBoxList",2, "0");
        performAction.sendKeysByIndex1(FileName, "TextBoxList",2, "0");*/
            driver.hideKeyboard();
            performAction.androidScrollToElement(50);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            methods.log("Verify enter valid data in Costom goal field.");
            verify.verifyElementDisplayByText(FileName, "TextList", "Cover photo");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_195() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : User should able to checked custom time field.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);


            performAction.pause(3);
            methods.log("Verify to checked custom time field");
            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 9);
            performAction.pause(2);
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_196() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : If user checked custom time then system should show new two field start date and stop date ");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);


            performAction.pause(3);

            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 9);
            performAction.pause(2);

            methods.log("Verify start date and stop date id display");
            verify.verifyElementDisplayByText(FileName, "TextList", "Active Time");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_197() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description :Click on start date then system should open calendar popup.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(3);

            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 9);
            performAction.pause(2);
            performAction.androidScrollToElement(50);
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 4);
            performAction.pause(2);
            methods.log("Verify calendar popup is display");
            verify.verifyElementDisplay(FileName, "CalendarElement");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_198() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description :Click on stop date then system should open calendar popup.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(6);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(3);

            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 9);
            performAction.pause(2);
            performAction.androidScrollToElement(50);
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 4);
            performAction.pause(2);
            methods.log("Verify calendar popup is display");
            verify.verifyElementDisplay(FileName, "CalendarElement");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_199() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description :Click on start date ok button then system should redirect to clock popup");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(3);

            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 9);
            performAction.pause(2);
            performAction.androidScrollToElement(50);
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 4);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "CalendarText", "28");
            performAction.pause(2);

            performAction.clickOnElementFromList(FileName, "CalendarButton", "OK");
            performAction.pause(2);

            methods.log("Verify clock popup is display");
            verify.verifyElementDisplay(FileName, "CalendarElement");
        } else {
            methods.log("This module is not available.");
        }


    }

    @Test
    public void TC_200() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on clock popup ok button");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(6);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(3);

            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 9);
            performAction.pause(2);
            performAction.androidScrollToElement(50);
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 4);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "CalendarText", "28");
            performAction.pause(2);

            performAction.clickOnElementFromList(FileName, "CalendarButton", "OK");
            performAction.pause(5);
            performAction.clickOnElementFromListIndex(FileName, "ClockText", 5);
            performAction.pause(5);
            performAction.clickOnElementFromListIndex(FileName, "ClockText", 6);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "CalendarButton", "OK");
            performAction.pause(2);
            methods.log("Verify date and time is display");
            verify.verifyElementDisplayByIndex1(FileName, "TextList", 4);
        } else {
            methods.log("This module is not available.");
        }


    }

    @Test
    public void TC_201() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify selected date time is display in stop textbox.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(35);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(6);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);


            performAction.pause(3);

            performAction.clickOnElementFromListIndex(FileName, "CheckBoxList", 9);
            performAction.pause(2);
            performAction.androidScrollToElement(50);
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 6);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "CalendarText", "29");
            performAction.pause(2);

            performAction.clickOnElementFromList(FileName, "CalendarButton", "OK");
            performAction.pause(5);
            performAction.clickOnElementFromListIndex(FileName, "ClockText", 5);
            performAction.pause(5);
            performAction.clickOnElementFromListIndex(FileName, "ClockText", 6);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "CalendarButton", "OK");
            performAction.pause(2);
            methods.log("Verify date and time is display");
            verify.verifyElementDisplayByIndex1(FileName, "TextList", 6);
        } else {
            methods.log("This module is not available.");
        }


    }

    @Test
    public void TC_202() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Verify selected date time is display in stop textbox.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(3);

            performAction.androidScrollToElement(50);
            performAction.pause(3);
            methods.log("Verify date and time is display");
            verify.verifyElementDisplayByText(FileName, "TextList", "Next");
        } else {
            methods.log("This module is not available.");
        }


    }

    @Test
    public void TC_203() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on next button.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "Hello");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            methods.log("Verify Cover photo screen is display.");
            verify.verifyElementDisplayByText(FileName, "TextList", "Cover photo");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_204() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on next button.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "Hello");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Upload an image");
            performAction.pause(3);
            methods.log("Verify Select image popup is display.");
            verify.verifyElementDisplayByText(FileName, "TextList", "Select image");
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_205() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on next button.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);


            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "Hello");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ImageList", 1);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Submit");
            performAction.pause(3);
            methods.log("Verify thank you screen is display.");
            verify.verifyElementDisplayByIndex1(FileName, "TextList", 2);
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_206() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on next button.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*performAction.waitForElement(FileName1, "MyProfileEmail");
        performAction.sendKeys(FileName1, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName1, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName1, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "PasswordBox");
        performAction.sendKeys(FileName1, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName1, "SubmitButton");
        performAction.click(FileName1, "SubmitButton");
        performAction.pause(2);
        performAction.click(FileName1, "SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
            performAction.pause(5);
            step.Scroll();
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);

            performAction.pause(2);

            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test123456");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "Hello");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ImageList", 1);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Submit");
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", "Back to causes");
            //performAction.clickOnElementFromList(FileName, "TextList", "Back to causes");
            performAction.pause(5);
            methods.log("Verify New Created Fundraiser is display.");
            step.findFundraiser("Test123456");
        } else {
            methods.log("This module is not available.");
        }

    }
}
