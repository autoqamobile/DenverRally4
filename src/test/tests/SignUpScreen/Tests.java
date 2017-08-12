package test.tests.SignUpScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.EventModule.*;

/**
 * Created by dell on 7/3/2017.
 */
public class Tests extends BrowserConfig {
    public String FileName = "SignUpScreen";
    public int UserProfileIndex  = 18;
    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";
    public String AppVersion = excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"General",8,1).toString();


    @Test
    public void TC_091() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify User should get Sign Up link on login screen.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);

        performAction.pause(3);
       //String Email= step.RendomEmail();
        methods.log("Verify My Profile screen is display.");
        verify.verifyText(FileName,"MyProfileText","My Profile");
        performAction.pause(2);
        //System.out.println(Email);

    }
    @Test
    public void TC_092() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify User should redirect on Sign Up screen.");

        performAction.pause(15);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);

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
    public void TC_093() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify User should able to enter valid data in name text field.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);

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
        step.Scroll(FileName,"FirstNameField","LastNameField");
        performAction.waitForElement(FileName, "PasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.pause(2);
        step.Scroll(FileName,"FirstNameField","LastNameField");

        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.sendKeys(FileName,"ConfirmPasswordField","123456");
        performAction.pause(2);
        step.Scroll(FileName,"FirstNameField","LastNameField");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(5);

        methods.log("Verify user name is display.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","Test Test1");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Settings");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Logout");
    }

    //@Test
    public void TC_094() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify name field and should not accept any special character with space and dash and dots.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);

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
        performAction.pause(2);
        performAction.androidScrollToElementManually(550,330);
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
        performAction.pause(15);

        //methods.log("Verify user name is display.");
        //verify.verifyText(FileName,"VerifyUserName","Test Test1");
        //performAction.pause(5);

    }

    @Test
    public void TC_095() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify email with valid data like : <name>@domain.com");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);

        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        methods.log("Verify valid email format.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","Please create an Account");
        performAction.pause(10);


    }

    //@Test
    public void TC_096() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify space used in initial of email like : (space given) name@gmail.com.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);

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
    public void TC_097() {
        test.tests.SignUpScreen.VerifyEvents verify = new test.tests.SignUpScreen.VerifyEvents(driver);
        Methods methods = new Methods(driver);
        test.tests.SignUpScreen.Steps step=new  test.tests.SignUpScreen.Steps(driver);
        methods.log("Test Description : Verify space used in the end of email like : name@gmail.com (space given).");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
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
    public void TC_098() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify User should able to enter valid \"Minimum 6 characters\" password ");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);

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

        step.Scroll(FileName,"FirstNameField","LastNameField");
        performAction.waitForElement(FileName, "PasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"PasswordField","12345");
        performAction.pause(2);
        step.Scroll(FileName,"FirstNameField","LastNameField");

        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.sendKeys(FileName,"ConfirmPasswordField","12345");
        performAction.pause(2);
        step.Scroll(FileName,"FirstNameField","LastNameField");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(5);

        methods.log("Verify Password validation message is display.");
        verify.verifyElementDisplayByText(FileName,"ListOFMenu","Password should be atleast 6 character long.");
        performAction.pause(5);

        methods.log("Enter 6 Character in password");
        performAction.clear(FileName, "PasswordField1");
        step.Scroll(FileName,"FirstNameField","LastNameField");
        performAction.waitForElement(FileName, "PasswordField");
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.pause(2);
        performAction.androidScrollToElementManually(550,330);
        performAction.pause(2);
        performAction.androidScrollToElementManually(550,330);
        performAction.pause(2);
        performAction.clear(FileName, "ConfirmPasswordField1");
        performAction.waitForElement(FileName, "ConfirmPasswordField1");

        performAction.pause(2);
        performAction.sendKeys(FileName,"ConfirmPasswordField1","123456");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(5);
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Settings");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Logout");

    }

    @Test
    public void TC_099() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify Once user will fill valid data  in all fileds and click on 'Sign Up' button then it should redirected on Thanks screen.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
        performAction.pause(3);
        String Email= step.RendomEmail();
        performAction.click(FileName,"MyProfileEmail");
        performAction.sendKeys(FileName,"MyProfileEmail",Email);
        performAction.click(FileName,"MyProfileText");
        performAction.pause(3);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.waitForElement(FileName, "FirstNameField");
        performAction.click(FileName,"FirstNameField");
        performAction.sendKeys(FileName,"FirstNameField","Test");

        performAction.pause(2);
        // performAction.click(FileName,"SignUpText");
        performAction.waitForElement(FileName, "LastNameField");
        performAction.click(FileName,"LastNameField");
        performAction.sendKeys(FileName,"LastNameField","Test1");
        performAction.pause(2);
        step.Scroll(FileName,"FirstNameField","LastNameField");
        performAction.waitForElement(FileName, "PasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.pause(2);
        step.Scroll(FileName,"FirstNameField","LastNameField");

        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.sendKeys(FileName,"ConfirmPasswordField","123456");
        performAction.pause(2);
        step.Scroll(FileName,"FirstNameField","LastNameField");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton1");
        performAction.pause(5);
        methods.log("Verify user profile image is display.");
        verify.elementIsDisplayed(FileName,"VerifyUserProfileImage",0);
        methods.log("Verify user name is display.");
        verify.verifyText(FileName,"VerifyUserName","Test Test1");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Settings");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Logout");

    }

    //@Test
    public void TC_100() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify Once user will sign up successfully then user should get confirmation email on registered email address.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
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
   // @Test
    public void TC_101() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify Email address should be validated before sending email under successful page.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
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

    @Test
    public void TC_102() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Verify After confirmation user should able to login to the application with valid credentials.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
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
        step.Scroll(FileName,"FirstNameField","LastNameField");
        performAction.waitForElement(FileName, "PasswordField");
        performAction.pause(2);
        performAction.sendKeys(FileName,"PasswordField","123456");
        performAction.pause(2);
        step.Scroll(FileName,"FirstNameField","LastNameField");

        performAction.waitForElement(FileName, "ConfirmPasswordField");
        performAction.sendKeys(FileName,"ConfirmPasswordField","123456");
        performAction.pause(2);
        step.Scroll(FileName,"FirstNameField","LastNameField");
        performAction.pause(2);
        performAction.tap(FileName,"SubmitButton");
        performAction.pause(2);
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
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Settings");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName,"ListOFMenu","Logout");

    }

    //@Test
    public void TC_103() {
        VerifyEvents verify = new VerifyEvents(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("user entry should update in database before and after activate the account.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex("ActivityScreen", "ListOFGroup", UserProfileIndex);
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
