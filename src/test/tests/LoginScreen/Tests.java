package test.tests.LoginScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {
    public String FileName = "LoginScreen";

    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";
    public int UserProfileIndex  = 18;
    public String Email =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"Login",4,1).toString();
    public String EmailForRegistration =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"Login",5,1).toString();
    public String  Password=excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"Login",6,1).toString();
    public String AppVersion = excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"General",8,1).toString();

    @Test
    public void TC_104() {
        Verify verify = new Verify(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);

        methods.log("Test Description : Check guest user get login screen.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(7);
        methods.log("Verify login screen display.");
        verify.verifyElementDisplayByText(FileName, "ListOFMenu", "MyProfileText");
    }

    @Test
    public void TC_105() {
        Verify verify = new Verify(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);

        methods.log("Test Description : Check user get Email address text field.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(5);
        performAction.waitForElement(FileName, "MyProfileEmail");
        performAction.sendKeys(FileName, "MyProfileEmail", Email);
        performAction.pause(2);
        performAction.click(FileName, "MyProfileText");
        performAction.pause(2);
        methods.log("Verify User should able to enter valid and registered email address in email text field.");
        performAction.waitForElement(FileName, "WelcomeBackText");
        verify.verifyElementDisplay(FileName, "WelcomeBackText");
        performAction.getText(FileName, "WelcomeBackText");
        performAction.waitForElement(FileName, "WelcomeBackText2");
        verify.verifyElementDisplay(FileName, "WelcomeBackText2");
        performAction.getText(FileName, "WelcomeBackText2");
        verify.verifyElementDisplay(FileName, "PasswordBox");
    }

    @Test
    public void TC_106() {
        Verify verify = new Verify(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);

        methods.log("Test Description : Check registered email address.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(5);
        performAction.waitForElement(FileName, "MyProfileEmail");
        performAction.sendKeys(FileName, "MyProfileEmail", EmailForRegistration);
        performAction.pause(2);
        performAction.click(FileName, "MyProfileText");
        methods.log("Verify with unregister email address.");
        verify.verifyElementDisplay(FileName, "WelcomeBackText");
        performAction.getText(FileName, "WelcomeBackText");
        methods.log("Verify with register email.");
        performAction.waitForElement(FileName, "MyProfileEmail");
        performAction.clear(FileName, "MyProfileEmail");
        performAction.pause(2);
        performAction.sendKeys(FileName, "MyProfileEmail", Email);
        performAction.pause(2);
        performAction.click(FileName, "MyProfileText");
        performAction.pause(2);
        verify.verifyElementDisplay(FileName, "WelcomeBackText");
        performAction.getText(FileName, "WelcomeBackText");
    }

    @Test
    public void TC_107() {
        Verify verify = new Verify(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);


        methods.log("Test Description : Check email with valid data like : <name>@domain.com.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(5);
        performAction.waitForElement(FileName, "MyProfileEmail");
        performAction.sendKeys(FileName, "MyProfileEmail", Email);
        performAction.pause(2);
        performAction.click(FileName, "MyProfileText");
        methods.log("Verify System should accept email with valid email address format.");
        verify.verifyElementDisplay(FileName, "WelcomeBackText");
        performAction.getText(FileName, "WelcomeBackText");
        performAction.getText(FileName, "WelcomeBackText2");
    }

    @Test
    public void TC_108() {
        Verify verify = new Verify(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);

        methods.log("Test Description : Check space used in initial of email like : (space given) name@gmail.com");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(5);
        performAction.waitForElement(FileName, "MyProfileEmail");
        performAction.sendKeys(FileName, "MyProfileEmail", " "+Email);
        performAction.pause(2);
        performAction.click(FileName, "MyProfileText");
        methods.log("Verify If user will give space in the starting of email and write valid email then system should not accept email with spacing.");
        verify.verifyElementDisplay(FileName, "InvalidEmailMessage");
        performAction.getText(FileName, "InvalidEmailMessage");
    }

    @Test
    public void TC_109() {
        Verify verify = new Verify(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);

        methods.log("Test Description : Check space used in the end of email like : name@gmail.com (space given)");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(5);
        performAction.waitForElement(FileName, "MyProfileEmail");
        performAction.sendKeys(FileName, "MyProfileEmail", " "+Email);
        performAction.pause(2);
        performAction.click(FileName, "MyProfileText");
        methods.log("Verify If user will give space in the end of email then system should not accept email address without space.");
        verify.verifyElementDisplay(FileName, "InvalidEmailMessage");
        performAction.getText(FileName, "InvalidEmailMessage");
    }

    @Test
    public void TC_110() {
        Verify verify = new Verify(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check user get password text field.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(5);
        performAction.waitForElement(FileName, "MyProfileEmail");
        performAction.sendKeys(FileName, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName, "PasswordBox");
        performAction.sendKeys(FileName, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName, "SubmitButton");
        performAction.click(FileName, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName, "SubmitButton1");
        performAction.pause(5);
        methods.log("Verify User should able to enter valid password in email text field.");
        verify.verifyElementDisplay(FileName, "ProfileName");
        performAction.getText(FileName, "ProfileName");
    }

    @Test
    public void TC_111() {
        Verify verify = new Verify(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check login button.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(5);
        performAction.waitForElement(FileName, "MyProfileEmail");
        performAction.sendKeys(FileName, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName, "PasswordBox");
        performAction.sendKeys(FileName, "PasswordBox", Password);
        performAction.pause(2);
        performAction.getText(FileName, "PasswordBox");
    }


    @Test
    public void TC_112() {
        Verify verify = new Verify(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check login button.");
        performAction.pause(7);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(5);
        performAction.waitForElement(FileName, "MyProfileEmail");
        performAction.sendKeys(FileName, "MyProfileEmail", Email);
        performAction.pause(3);
        performAction.click(FileName, "MyProfileText");
        performAction.pause(2);
        performAction.click(FileName, "PasswordBox");
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName, "PasswordBox");
        performAction.sendKeys(FileName, "PasswordBox", Password);
        performAction.androidScrollToElementManually(550, 330);
        performAction.waitForElement(FileName, "SubmitButton");
        performAction.click(FileName, "SubmitButton");
        performAction.pause(5);
        performAction.click(FileName, "SubmitButton1");
        performAction.pause(5);
        methods.log("Verify Once user will tap on login button then it should be clickable.");
        verify.verifyElementDisplay(FileName, "ProfileName");
        performAction.getText(FileName, "ProfileName");
    }
}
