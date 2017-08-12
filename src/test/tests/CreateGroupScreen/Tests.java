package test.tests.CreateGroupScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.FundraiserScreen.*;

/**
 * Created by dell on 7/20/2017.
 */
public class Tests extends BrowserConfig {
    String className = "Community";
    public int MenuIndex  = 17;
    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";

    public String AppVersion = excel.getCellFromExcel(ExcelFilePath, ExcelFileName, "General", 8, 1).toString();

    public String FileName = "CreateGroupScreen";
    public String FileName1 = "LoginScreen";
    public String MenuText = "Community";

    public String GroupButton = "Create Group +";
    public String GoToLoginButton = "Go To Login";
    public String LoginScreen = "My Profile";
    public String Email = "test@mailinator.com";
    public String Password = "123456";
    String FundraiserButton = "Create Fundraiser";

    @Test
    public void TC_207() {

        VerifyCreateGroup verify = new VerifyCreateGroup(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on 'create group' button");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);

            methods.log("Verify create group is display.");
            verify.verifyElementDisplayByText(FileName, "TextList", GroupButton);
            performAction.pause(2);
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_208() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Check that If user not login than display popup menu");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);

            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);
            performAction.pause(2);
            methods.log("Verify Login PopUp is display.");
            verify.verifyElementDisplay(FileName, "LoginPopUp");
            performAction.pause(2);
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_209() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on Go To Login the system should redirect to Login page");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);

            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);
            performAction.pause(2);

            performAction.clickOnElementFromList(FileName, "PopUpButton", GoToLoginButton);
            performAction.pause(5);
            methods.log("Verify Login Screen is display.");
            verify.verifyElementDisplayByText(FileName, "TextList", LoginScreen);
            performAction.pause(2);
        } else {
            methods.log("This module is not available.");
        }

    }

    @Test
    public void TC_210() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Click on Go To Login the system should check that popup is close");
            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);

            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);

            performAction.pause(2);
            performAction.clickOnElementFromList(FileName, "PopUpButton", "Cancel");
            performAction.pause(2);
            methods.log("Verify Fundraiser Button is display.");
            verify.verifyElementDisplayByText(FileName, "TextList", GroupButton);
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_211() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : If user is already login Then system should redirect to New Group Screen");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 7);

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
            performAction.pause(2);
            performAction.clickOnElementFromListIndex(FileName, "TextList", 1);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);
            performAction.pause(2);

            methods.log("Verify New Group Screen is display.");
            verify.verifyElementDisplayByText(FileName, "TextList", "New Group");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_212() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : User should able to enter data in 'group name' text field.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*performAction.waitForElement(FileName1, "MyProfileEmail");
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
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);

            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "Hello");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            methods.log("Verify enter valid data in group name text field.");
            verify.verifyElementDisplayByText(FileName, "TextList", "Cover photo");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_213() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : User should able to enter data in 'description' text field.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
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
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);

            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "New group description");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            methods.log("Verify enter valid data in description text field.");
            verify.verifyElementDisplayByText(FileName, "TextList", "Cover photo");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_214() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Check next button");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*erformAction.waitForElement(FileName1, "MyProfileEmail");
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
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);

            performAction.pause(3);
            methods.log("Verify next button is display.");
            verify.verifyElementDisplayByText(FileName, "TextList", "Next");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_215() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Once user will fill valid data  in all fileds and click on 'Next' button then it should redirected on cover photo page.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
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
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);

            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "New group description");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            methods.log("Verify Cover photo screen field.");
            verify.verifyElementDisplayByText(FileName, "TextList", "Cover photo");
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_216() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Once user will click on 'upload an image' then select image popup  should display.");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

        /*performAction.waitForElement(FileName1, "MyProfileEmail");
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
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);

            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "New group description");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
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
    public void TC_217() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : The system should redirect on thank you screen");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
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
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);

            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "New group description");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ImageList", 1);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Submit");
            performAction.pause(7);
            methods.log("Verify thank you screen is display.");
            verify.verifyElementDisplayByIndex1(FileName, "TextList", 2);
            performAction.pause(3);
        } else {
            methods.log("This module is not available.");
        }
    }

    @Test
    public void TC_218() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        test.tests.FundraiserScreen.Steps step = new test.tests.FundraiserScreen.Steps(driver);
        if (performAction.classNameIsAvailable(className, allclass)) {
            step.startActivity(AppVersion);
            methods.log("Test Description : Check and verify 'back to groups' button");

            performAction.pause(15);
            performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", MenuIndex);

       /* performAction.waitForElement(FileName1, "MyProfileEmail");
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
        performAction.clickOnElementFromListIndex(FileName, "TextList", 1);*/
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", MenuText);
            performAction.pause(5);
            performAction.clickOnElementFromList(FileName, "TextList", GroupButton);

            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 0, "Test1234");
            performAction.pause(3);
            performAction.sendKeysByIndex(FileName, "TextBoxList", 1, "New group description");
            driver.hideKeyboard();
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.clickOnElementFromList(FileName, "TextList", "Next");
            performAction.pause(3);
            performAction.clickOnElementFromListIndex(FileName, "ImageList", 1);
            performAction.pause(3);
            performAction.clickOnElementFromList(FileName, "TextList", "Submit");
            performAction.pause(10);
            performAction.clickOnElementFromList(FileName, "TextList", "Back to Groups");
            performAction.pause(10);
            methods.log("Verify New Created Group is display.");
            //performAction.clickOnElementFromListIndex(FileName, "ImageList", 1);
            step.Scroll();
            verify.verifyElementDisplayByText(FileName, "TextList", "Test1234");
            performAction.pause(3);
        } else {
            methods.log("This module is not available.");
        }
    }
}
