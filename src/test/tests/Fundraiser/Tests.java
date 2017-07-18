package test.tests.Fundraiser;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.CommunityScreen.*;

/**
 * Created by dell on 7/14/2017.
 */
public class Tests extends BrowserConfig {

    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";

    public String AppVersion = excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"General",8,1).toString();

    public String FileName = "Fundraiser";
    public String MenuText = "Give";
    public String CauseName ="Hope Worldwide";
    public String GoToLoginButton ="Go To Login";
    public String LoginScreen ="My Profile";


    String FundraiserButton ="Create Fundraiser";
    @Test
    public void TC_184() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step=new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : 'Create Fundraiser' button should display on screen");

        performAction.pause(10);
        performAction.click(FileName, "MenuLink");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
        performAction.pause(3);
        step.ScrollAndClick(CauseName);
        performAction.pause(3);
        methods.log("Verify Fundraiser Button is display.");
        verify.verifyElementDisplayByText(FileName,"CauseList",FundraiserButton);
        performAction.pause(2);


    }

    @Test
    public void TC_185() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step=new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check that If user not login than display popup menu");

        performAction.pause(10);
        performAction.click(FileName, "MenuLink");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
        performAction.pause(5);
        step.ScrollAndClick(CauseName);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);
        performAction.pause(2);
        methods.log("Verify Login PopUp is display.");
        verify.verifyElementDisplay(FileName,"LoginPopUp");
        performAction.pause(2);


    }

    @Test
    public void TC_186() {

        VerifyFundraiser verify = new VerifyFundraiser(driver);
        Methods methods = new Methods(driver);
        Steps step=new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Click on Go To Login the system should redirect to Login page");

        performAction.pause(10);
        performAction.click(FileName, "MenuLink");
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName, "MenuTextList", MenuText);
        performAction.pause(2);
        step.ScrollAndClick(CauseName);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName, "TextList", FundraiserButton);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName, "GoToLogin", GoToLoginButton);
        performAction.pause(2);
        methods.log("Verify Login Screen is display.");
        verify.verifyElementDisplayByText(FileName,"TextList",LoginScreen);
        performAction.pause(2);


    }
}
