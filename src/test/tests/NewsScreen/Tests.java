package test.tests.NewsScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.CommunityScreen.VerifyCommunity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dell on 7/6/2017.
 */
public class Tests extends BrowserConfig {
    public String FileName = "NewsScreen";

    @Test
    public void TC_201() {
        NewsVerify verify = new NewsVerify(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        methods.log("Verify news icone is display.");
        verify.verifyElementDisplay(FileName,"NewsMenu");
        performAction.pause(2);

    }

    @Test
    public void TC_202() {

        NewsVerify verify = new NewsVerify(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"NewsMenu");
        performAction.pause(5);
        methods.log("Verify news List is display.");
        verify.verifyElementDisplay(FileName,"NewsPage");
        performAction.pause(2);


    }
    @Test
    public void TC_203() {

        NewsVerify verify = new NewsVerify(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"NewsMenu");
        performAction.pause(5);
        methods.log("Verify news List image is display.");
        verify.verifyElementDisplay(FileName,"NewsListImage");
        performAction.pause(2);


    }

    @Test
    public void TC_204() {

        NewsVerify verify = new NewsVerify(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"NewsMenu");
        performAction.pause(5);
        methods.log("Verify news List image is display.");
        verify.verifyElementDisplay(FileName,"NewsList");
        verify.verifyElementDisplay(FileName,"NewsList1");
        performAction.pause(2);


    }
    //@Test
    public void TC_205() {

        NewsVerify verify = new NewsVerify(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"NewsMenu");
        performAction.pause(5);
        methods.log("Verify news List image is display.");
        verify.verifyElementDisplay(FileName,"NewsDate");
        performAction.pause(2);


    }

   // @Test
    public void TC_206() {

        NewsVerify verify = new NewsVerify(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"NewsMenu");
        performAction.pause(5);
        String SearchData=performAction.getText(FileName,"NewsText");
        performAction.pause(2);
        performAction.click(FileName,"SearchText");
        performAction.pause(2);
        performAction.sendKeys(FileName,"SearchText",SearchData);
        performAction.pause(5);
        performAction.click(FileName,"SearchButton");
        //methods.log("Verify news List image is display.");
        //verify.verifyElementDisplay(FileName,"NewsDate");
        performAction.pause(2);


    }

     @Test
    public void TC_207() {

        NewsVerify verify = new NewsVerify(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"NewsMenu");
        performAction.pause(5);
        performAction.click(FileName,"NewsText");
        performAction.pause(5);
         performAction.click(FileName,"Share");
         performAction.pause(2);

        methods.log("Verify share menu is display.");
        verify.verifyElementDisplay(FileName,"ShareMenu");
        performAction.pause(2);


    }

    @Test
    public void TC_208() {

        NewsVerify verify = new NewsVerify(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"NewsMenu");
        performAction.pause(5);
        performAction.click(FileName,"NewsText");
        performAction.pause(5);
        performAction.click(FileName,"BackButton");
        performAction.pause(2);

        methods.log("Verify news List page is display.");
        verify.verifyElementDisplay(FileName,"NewsPage");
       // DateFormat dateFormat = new SimpleDateFormat("MM dd,YYYY");
       // Date date = new Date();
        performAction.pause(2);


    }
}
