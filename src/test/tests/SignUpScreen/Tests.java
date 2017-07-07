package test.tests.SignUpScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.EventModule.*;

/**
 * Created by dell on 7/3/2017.
 */
public class Tests extends BrowserConfig {
    public String FileName = "SignUpScreen";


    @Test
    public void TC_028() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
       //String Email= step.RendomEmail();
        methods.log("Verify My Profile screen is display.");
        verify.verifyText(FileName,"MyProfileText","My Profile");
        performAction.pause(2);
        //System.out.println(Email);

    }
    @Test
    public void TC_029() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        methods.log("Verify Sign Up screen is display.");
        verify.verifyText(FileName,"SignUpText","Please create an Account");
        performAction.pause(2);


    }
    @Test
    public void TC_031() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "FirstNameField");
        performAction.click(FileName,"FirstNameField");
        performAction.sendKeys(FileName,"FirstNameField","Test");

        performAction.pause(2);
       // performAction.click(FileName,"SignUpText");
        performAction.waitForElement(FileName, "LastNameField");
        performAction.click(FileName,"LastNameField");
        performAction.sendKeys(FileName,"LastNameField","Test1");
        performAction.pause(2);
        performAction.waitForElement(FileName, "LastNameText");
        //performAction.click(FileName,"LastNameText");
        driver.hideKeyboard();
        performAction.waitForElement(FileName, "PasswordField");
        performAction.click(FileName,"PasswordField");
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.androidScrollToElementManually(550,330);
        performAction.pause(2);
        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.click(FileName,"ConfirmPasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"ConfirmPasswordField","123456");
        performAction.pause(2);

        performAction.tap(FileName,"SubmitButton");
        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(15);

        methods.log("Verify user name is display.");
        verify.verifyText(FileName,"VerifyUserName","Test Test1");
        performAction.pause(5);


    }

    @Test
    public void TC_032() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "FirstNameField");
        performAction.click(FileName,"FirstNameField");
        performAction.sendKeys(FileName,"FirstNameField","-T e@s.t");

        performAction.pause(2);
        // performAction.click(FileName,"SignUpText");
        performAction.waitForElement(FileName, "LastNameField");
        performAction.click(FileName,"LastNameField");
        performAction.sendKeys(FileName,"LastNameField","-T e@st.1");
        performAction.pause(2);
        performAction.waitForElement(FileName, "LastNameText");
        //performAction.click(FileName,"LastNameText");
        driver.hideKeyboard();
        performAction.waitForElement(FileName, "PasswordField");
        performAction.click(FileName,"PasswordField");
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.androidScrollToElementManually(550,330);
        performAction.pause(2);
        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.click(FileName,"ConfirmPasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"ConfirmPasswordField","123456");
        performAction.pause(2);

        performAction.tap(FileName,"SubmitButton");
        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(15);

        //methods.log("Verify user name is display.");
        //verify.verifyText(FileName,"VerifyUserName","Test Test1");
        //performAction.pause(5);

    }

    @Test
    public void TC_034() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        methods.log("Verify valid email format.");
        verify.verifyText(FileName,"SignUpText","Please create an Account");
        performAction.pause(10);


    }
    @Test
    public void TC_043() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail"," "+Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        methods.log("Verify valid email format.");
        verify.verifyText(FileName,"SignUpText","Please create an Account");
        performAction.pause(20);


    }
    @Test
    public void TC_045() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email+" ");
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        methods.log("Verify valid email format.");
        performAction.getText(FileName,"EmailValidationMsg");
        //verify.verifyText(FileName,"SignUpText","Please create an Account");
        performAction.pause(20);


    }

    @Test
    public void TC_046() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "FirstNameField");
        performAction.click(FileName,"FirstNameField");
        performAction.sendKeys(FileName,"FirstNameField","Test");

        performAction.pause(2);
        // performAction.click(FileName,"SignUpText");
        performAction.waitForElement(FileName, "LastNameField");
        performAction.click(FileName,"LastNameField");
        performAction.sendKeys(FileName,"LastNameField","Test1");
        performAction.pause(2);
        performAction.waitForElement(FileName, "LastNameText");
        //performAction.click(FileName,"LastNameText");
        driver.hideKeyboard();
        performAction.waitForElement(FileName, "PasswordField");
        performAction.click(FileName,"PasswordField");
        performAction.sendKeys(FileName,"PasswordField","12345");
        performAction.pause(2);
        performAction.androidScrollToElementManually(550,330);
        performAction.pause(2);
        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.click(FileName,"ConfirmPasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"ConfirmPasswordField","12345");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.pause(2);


        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(15);

        methods.log("Verify Password validation message is display.");
        verify.verifyText(FileName,"PasswordValidationText","Password should be atleast 6 character long.");
        performAction.pause(5);

        methods.log("Enter 6 Character in password");
        performAction.clear(FileName, "PasswordField");
        performAction.waitForElement(FileName, "PasswordField");
        performAction.click(FileName,"PasswordField");
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.pause(2);
        performAction.androidScrollToElementManually(550,330);
        performAction.pause(2);
        performAction.clear(FileName, "ConfirmPasswordField");
        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.click(FileName,"ConfirmPasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"ConfirmPasswordField","123456");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(15);

    }

    @Test
    public void TC_049() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "FirstNameField");
        performAction.click(FileName,"FirstNameField");
        performAction.sendKeys(FileName,"FirstNameField","Test");

        performAction.pause(2);
        // performAction.click(FileName,"SignUpText");
        performAction.waitForElement(FileName, "LastNameField");
        performAction.click(FileName,"LastNameField");
        performAction.sendKeys(FileName,"LastNameField","Test1");
        performAction.pause(2);
        performAction.waitForElement(FileName, "LastNameText");
        //performAction.click(FileName,"LastNameText");
        driver.hideKeyboard();
        performAction.waitForElement(FileName, "PasswordField");
        performAction.click(FileName,"PasswordField");
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.pause(2);
        performAction.androidScrollToElementManually(550,330);
        performAction.pause(2);
        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.click(FileName,"ConfirmPasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"ConfirmPasswordField","123456");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(5);
        methods.log("Verify user profile image is display.");
        verify.elementIsDisplayed(FileName,"VerifyUserProfileImage",0);
        methods.log("Verify user name is display.");
        verify.verifyText(FileName,"VerifyUserName","Test Test1");
        performAction.pause(3);

    }

    @Test
    public void TC_050() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "FirstNameField");
        performAction.click(FileName,"FirstNameField");
        performAction.sendKeys(FileName,"FirstNameField","Test");

        performAction.pause(2);
        // performAction.click(FileName,"SignUpText");
        performAction.waitForElement(FileName, "LastNameField");
        performAction.click(FileName,"LastNameField");
        performAction.sendKeys(FileName,"LastNameField","Test1");
        performAction.pause(2);
        performAction.waitForElement(FileName, "LastNameText");
        //performAction.click(FileName,"LastNameText");
        driver.hideKeyboard();
        performAction.waitForElement(FileName, "PasswordField");
        performAction.click(FileName,"PasswordField");
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.pause(2);
        performAction.androidScrollToElementManually(550,330);
        performAction.pause(2);
        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.click(FileName,"ConfirmPasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"ConfirmPasswordField","123456");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.tap(FileName,"SubmitButton1");

        step.EmailVerify(Email);

        performAction.pause(5);


       /* methods.log("Verify user profile image is display.");
        verify.elementIsDisplayed(FileName,"VerifyUserProfileImage",0);
        methods.log("Verify user name is display.");
        verify.verifyText(FileName,"VerifyUserName","Test Test1");
        performAction.pause(3);*/

    }

    @Test
    public void TC_052() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        performAction.pause(10);
        performAction.click(FileName,"ProfileLink");
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "FirstNameField");
        performAction.click(FileName,"FirstNameField");
        performAction.sendKeys(FileName,"FirstNameField","Test");

        performAction.pause(2);
        // performAction.click(FileName,"SignUpText");
        performAction.waitForElement(FileName, "LastNameField");
        performAction.click(FileName,"LastNameField");
        performAction.sendKeys(FileName,"LastNameField","Test1");
        performAction.pause(2);
        performAction.waitForElement(FileName, "LastNameText");
        //performAction.click(FileName,"LastNameText");
        driver.hideKeyboard();
        performAction.waitForElement(FileName, "PasswordField");
        performAction.click(FileName,"PasswordField");
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.pause(2);
        performAction.androidScrollToElementManually(550,330);
        performAction.pause(2);
        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.click(FileName,"ConfirmPasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"ConfirmPasswordField","123456");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(5);
        performAction.click(FileName,"VerifyUserName");
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.click(FileName,"LogoutButton");

        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.waitForElement(FileName, "LoginPassword");
        performAction.click(FileName,"LoginPassword");
        performAction.sendKeys(FileName,"LoginPassword","123456");
       // performAction.pause(2);
       // performAction.androidScrollToElementManually(550,330);
        driver.hideKeyboard();
        performAction.pause(2);
        performAction.click(FileName,"LoginButton");
        performAction.click(FileName,"LoginButton");
        performAction.pause(10);
       methods.log("Verify user profile image is display.");
        verify.elementIsDisplayed(FileName,"VerifyUserProfileImage",0);
        methods.log("Verify user name is display.");
        verify.verifyText(FileName,"VerifyUserName","Test Test1");
        performAction.pause(3);

    }
}
