package test.tests.ActivityScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.CauseScreen.*;

/**
 * Created by dell on 7/24/2017.
 */
public class Tests extends BrowserConfig {

    public String FileName = "ActivityScreen";
   // public int MenuIndex  = 6;
    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";
   public String AppVersion = excel.getCellFromExcel(ExcelFilePath, ExcelFileName, "General", 8, 1).toString();


    @Test
    public void TC_219() {
        VerifyCauseScreen verify = new VerifyCauseScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

            step.startActivity(AppVersion);
            methods.log("Test Description : Check activity screen.");
            performAction.pause(15);

            methods.log("Verify activity screen is display.");
            verify.verifyElementDisplayByIndex2(FileName, "ListOFText", 1);

    }

    @Test
    public void TC_220() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check activity list.");
        performAction.pause(10);

        methods.log("Verify activity list is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 1);
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 4);
    }

    @Test
    public void TC_221() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check activity type.");
        performAction.pause(10);

        methods.log("Verify activity type is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 0);

    }

    @Test
    public void TC_222() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check activity name.");
        performAction.pause(10);

        methods.log("Verify activity name is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 1);

    }

    @Test
    public void TC_223() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check activity day.");
        performAction.pause(10);

        methods.log("Verify activity day is display.");
        verify.verifyElementDisplayByIndex2(FileName, "ListOFText", 2);
        verify.splitAndDisplayDay(FileName, "ListOFText", 2);
    }

    @Test
    public void TC_224() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check activity Time.");
        performAction.pause(10);

        methods.log("Verify activity Time is display.");
        verify.verifyElementDisplayByIndex2(FileName, "ListOFText", 2);
        verify.splitAndDisplayTime(FileName, "ListOFText", 2);
    }

    @Test
    public void TC_225() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Click on activity screen.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        methods.log("Verify activity Page is display.");
        verify.verifyElementDisplayByText1(FileName, "ListOFText", "View Details");
    }

    @Test
    public void TC_226() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check close button.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        methods.log("Verify close button is display.");
        verify.verifyElementDisplayByIndex2(FileName, "ListOFText",4);
    }

    @Test
    public void TC_227() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Click on close button.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",4);
        performAction.pause(2);
        methods.log("Verify activity list screen is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText",1);
    }

    @Test
    public void TC_228() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check activity type on activity screen.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        methods.log("Verify activity type is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 0);

    }

    @Test
    public void TC_229() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check activity name on activity screen.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        methods.log("Verify activity name is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 1);

    }

    @Test
    public void TC_230() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check activity day on activity screen.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        methods.log("Verify activity day is display.");
        verify.verifyElementDisplayByIndex2(FileName, "ListOFText", 2);
        verify.splitAndDisplayDay(FileName, "ListOFText", 2);
    }

    @Test
    public void TC_231() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check activity Time on activity screen.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        methods.log("Verify activity Time is display.");
        verify.verifyElementDisplayByIndex2(FileName, "ListOFText", 2);
        verify.splitAndDisplayTime(FileName, "ListOFText", 2);
    }

    @Test
    public void TC_232() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check 'View Details' button.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        methods.log("Verify view details button is display.");
        verify.verifyElementDisplayByText(FileName, "ListOFText", "View Details");

    }

    @Test
    public void TC_233() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Click on 'View Details' button.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName,"ListOFText","View Details");
        performAction.pause(2);
        methods.log("Verify activity details screen is display.");
        verify.verifyElementDisplayByText1(FileName, "ListOFText", "share");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 0);
    }

    @Test
    public void TC_234() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Click on back button.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",3);
        performAction.pause(2);
        performAction.clickOnElementFromListIndex(FileName,"ListOFImage",0);
        performAction.pause(2);
        methods.log("Verify activity screen is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 1);
        verify.verifyElementDisplayByIndex2(FileName, "ListOFText", 4);
    }

    @Test
    public void TC_235() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check Next button.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);

        methods.log("Verify Next button is display.");
        verify.verifyElementDisplayByText(FileName, "ListOFText", "Next");

    }

    @Test
    public void TC_236() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Click on Next button.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);

        methods.log("First activity name :");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText",1);
        performAction.clickOnElementFromList(FileName,"ListOFText","Next");
        performAction.pause(2);
        methods.log("Verify next activity is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 1);

    }

    @Test
    public void TC_237() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check Previous button.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName,"ListOFText","Next");
        performAction.pause(2);
        methods.log("Verify previous button is display.");
        verify.verifyElementDisplayByText(FileName, "ListOFText", "prev");

    }

    @Test
    public void TC_238() {
        VerifyActivityScreen verify = new VerifyActivityScreen(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Click on Previous button.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFText",1);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName,"ListOFText","Next");
        performAction.pause(2);
        methods.log("Current activity name :");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText",1);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName,"ListOFText","prev");
        performAction.pause(2);
        methods.log("Verify Previous activity is display.");
        verify.verifyElementDisplayByIndex1(FileName, "ListOFText", 1);

    }
}
