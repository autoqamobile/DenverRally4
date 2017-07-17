package test.tests.MyProfileScreen;

import org.testng.annotations.Test;
import sun.security.util.Password;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;

/**
 * Created by dell on 7/6/2017.
 */
public class Tests extends BrowserConfig {
    public String FileName = "MyProfileScreen";

    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";

    public String MenuName = "Settings";
    public String Email =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"My Profile",4,1).toString();
    public String  Password=excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"My Profile",5,1).toString();
    public String FirstNameUpdate =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"My Profile",6,1).toString();
    public String LastNameUpdate =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"My Profile",7,1).toString();
    public String PasswordUpdate =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"My Profile",8,1).toString();
    public String PhoneNumberUpdate =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"My Profile",9,1).toString();
    public String LocationUpdate =excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"My Profile",10,1).toString();


    @Test
    public void TC_175() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : My Profile details screen should open after clicking on 'Settings' icon.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.pause(3);
        //String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        methods.log("Verify setting Page is display.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","Setting");
        performAction.pause(2);


    }

    @Test
    public void TC_176() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : The system should update first name after clicking on the update button");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        performAction.clear(FileName,"FirstName");
        performAction.sendKeys(FileName,"FirstName",FirstNameUpdate);
        performAction.pause(2);
        driver.hideKeyboard();
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(5);
        performAction.click(FileName,"BackButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        methods.log("Verify Updated First Name is display.");
        verify.verifyText(FileName,"FirstName",FirstNameUpdate);
        performAction.pause(2);
    }

    @Test
    public void TC_177() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : The system should update last name after clicking on the update button");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.pause(3);

        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        performAction.click(FileName,"LastName");
        performAction.pause(2);
        performAction.clear(FileName,"LastName");
        performAction.sendKeys(FileName,"LastName",LastNameUpdate);
        performAction.pause(2);
        driver.hideKeyboard();
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(5);
        performAction.click(FileName,"BackButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        methods.log("Verify Updated Last Name is display.");
        verify.verifyText(FileName,"LastName",LastNameUpdate);
        performAction.pause(2);
    }
    @Test
    public void TC_178() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : The system should update password after clicking on the update button");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.pause(3);

        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        performAction.sendKeys(FileName,"Password",PasswordUpdate);
        performAction.pause(2);
        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"ConfirmPassword");
        performAction.sendKeys(FileName,"ConfirmPassword",PasswordUpdate);
        performAction.pause(5);
        driver.hideKeyboard();
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(5);
        performAction.click(FileName,"BackButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"LogOutButton");

        //performAction.click(FileName,"LogOutButton");
        performAction.pause(3);


        methods.log("Verify password is Updated.");
        performAction.pause(10);
       // performAction.click(FileName,"MyProfileText");
        performAction.pause(2);
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",PasswordUpdate);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        verify.verifyElementDisplayByText1(FileName,"FileName",MenuName);
    }

    @Test
    public void TC_179() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : The system should update phone number after clicking on the update button");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.pause(3);
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);

        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.clear(FileName,"PhoneNumber");
        performAction.sendKeys(FileName,"PhoneNumber",PhoneNumberUpdate);
        performAction.pause(2);
        driver.hideKeyboard();
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(5);
        performAction.click(FileName,"BackButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify Updated Phone Number is display.");
        verify.verifyText(FileName,"PhoneNumber",PhoneNumberUpdate);
        performAction.pause(2);
    }
    @Test
    public void TC_180() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : The system should update location after clicking on the update button");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.pause(3);

        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);

        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.clear(FileName,"Location");
        performAction.sendKeys(FileName,"Location",LocationUpdate);
        performAction.pause(2);
        driver.hideKeyboard();
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
        performAction.pause(5);
        performAction.click(FileName,"BackButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify Updated location is display.");
        verify.verifyText(FileName,"Location",LocationUpdate);
        performAction.pause(2);
    }

   // @Test
    public void TC_181() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : The system should update privacy radio button field after clicking on the update button");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.pause(3);

        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);

        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);

        performAction.pause(2);
        performAction.click(FileName,"Privacy");
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"UpdateButton");
       // performAction.pause(2);
       // performAction.click(FileName,"UpdateButton");
        performAction.pause(5);
        performAction.click(FileName,"BackButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify Updated  privacy is Selected.");
        verify.verifyRadioButton(FileName,"Privacy");
        performAction.pause(2);
    }

    @Test
    public void TC_182() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : The system should redirect to my profile main page");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.pause(3);

        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword",Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu",MenuName);
        performAction.pause(5);

        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);

        performAction.pause(2);
        performAction.click(FileName,"LogOutButton");
        performAction.pause(5);

        methods.log("Verify My Profile Page is display.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","My Profile");
        performAction.pause(2);
    }

    @Test
    public void TC_183() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : The system should back to the profile main page screen");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",7);

        performAction.pause(3);

        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword", Password);

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        performAction.click(FileName,"TopBackButton");
        performAction.pause(5);

        methods.log("Verify UserName is display.");
        verify.verifyElementDisplay(FileName,"VerifyUserName");
        performAction.pause(2);
    }
}
