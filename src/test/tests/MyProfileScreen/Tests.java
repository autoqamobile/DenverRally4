package test.tests.MyProfileScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;

/**
 * Created by dell on 7/6/2017.
 */
public class Tests extends BrowserConfig {
    public String FileName = "MyProfileScreen";

    @Test
    public void TC_175() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        methods.log("Verify setting Page is display.");
        verify.verifyElementDisplay(FileName,"SettingPage");
        performAction.pause(2);


    }

    @Test
    public void TC_176() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        performAction.clear(FileName,"FirstName");
        performAction.sendKeys(FileName,"FirstName","TestUpdate");
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
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        methods.log("Verify Updated First Name is display.");
        verify.verifyText(FileName,"FirstName","TestUpdate");
        performAction.pause(2);
    }

    @Test
    public void TC_177() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        performAction.clear(FileName,"LastName");
        performAction.sendKeys(FileName,"LastName","TestUpdate1");
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
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        methods.log("Verify Updated Last Name is display.");
        verify.verifyText(FileName,"LastName","TestUpdate1");
        performAction.pause(2);
    }
    @Test
    public void TC_178() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        performAction.sendKeys(FileName,"Password","1234567");
        performAction.pause(2);
        driver.hideKeyboard();
        performAction.pause(2);
        performAction.sendKeys(FileName,"ConfirmPassword","1234567");
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
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"LogOutButton");

        performAction.click(FileName,"LogOutButton");
        performAction.pause(3);


        methods.log("Verify password is Updated.");
        performAction.pause(5);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(2);
        performAction.click(FileName,"Email");
        performAction.sendKeys(FileName,"Email",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","1234567");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
    }

    @Test
    public void TC_179() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","1234567");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);

        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.clear(FileName,"PhoneNumber");
        performAction.sendKeys(FileName,"PhoneNumber","912345687");
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
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify Updated Phone Number is display.");
        verify.verifyText(FileName,"PhoneNumber","912345687");
        performAction.pause(2);
    }
    @Test
    public void TC_180() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","1234567");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);

        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.clear(FileName,"Location");
        performAction.sendKeys(FileName,"Location","Navsari");
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
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify Updated location is display.");
        verify.verifyText(FileName,"Location","Navsari");
        performAction.pause(2);
    }

   // @Test
    public void TC_181() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","1234567");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
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
        performAction.click(FileName,"SettingIcon");
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
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","1234567");

        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(5);
        performAction.click(FileName,"SettingIcon");
        performAction.pause(5);

        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);

        performAction.pause(2);
        performAction.click(FileName,"LogOutButton");
        performAction.pause(5);

        methods.log("Verify My Profile Page is display.");
        verify.verifyText(FileName,"MyProfileText","My Profile");
        performAction.pause(2);
    }

    @Test
    public void TC_183() {
        VerifyMyProfile verify = new VerifyMyProfile(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= "auto38183@mailinator.com";
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);

        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","1234567");

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
