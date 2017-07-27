package test.tests.ActivityScreen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by dell on 7/24/2017.
 */
public class VerifyActivityScreen extends AbstractPage {


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public VerifyActivityScreen(AndroidDriver driver) {
        super(driver);
    }

    public void verifyElementDisplayByText(String propertyFileName, String elementName, String text) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        for (WebElement el : list) {
            if (el.getText().equalsIgnoreCase(text)) {
                flag=true;
                methods.log("Text: "+el.getText());
                //el.click();
                break;
            }

        }
        assertThat(!flag).isFalse();


    }

    public void verifyElementDisplayByText1(String propertyFileName, String elementName, String text) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        for (WebElement el : list) {
            if (el.getText().equalsIgnoreCase(text)) {
                flag=true;
                //methods.log("Text "+el.getText());
                //el.click();
                break;
            }

        }
        assertThat(!flag).isFalse();


    }

    public void verifyElementDisplayByIndex1(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        try
        {


            List<WebElement> list = methods.findElementList(propertyFileName, elementName);

            String Text=list.get(Index).getText();
            for (WebElement el : list) {
                if (el.getText().equalsIgnoreCase(Text)) {
                    flag=true;
                    methods.log("Text : "+el.getText());
                    //el.click();
                    break;
                }

            }
            assertThat(!flag).isFalse();
        }
        catch (Exception e)
        {
            methods.log("");
        }

    }

    public void verifyElementDisplayByIndex2(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        try {
            List<WebElement> list = methods.findElementList(propertyFileName, elementName);

            String Text=list.get(Index).getText();
            for (WebElement el : list) {
                if (el.getText().equalsIgnoreCase(Text)) {
                    flag=true;
                    // methods.log("Text "+el.getText());
                    //el.click();
                    break;
                }

            }
            assertThat(!flag).isFalse();
        }
        catch (Exception e)
        {
            methods.log("");
        }

    }

    public void verifyElementDisplayByIndex(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);
        assertThat(list.get(Index).isDisplayed()).isTrue();


    }

    public void splitAndDisplayTime(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);

        try {
            List<WebElement> list = methods.findElementList(propertyFileName, elementName);

            String Text=list.get(Index).getText();
            String TxtArray[]=Text.split(" ");

            if(TxtArray.length>=3)
                System.out.println("Text: "+TxtArray[1]+" "+TxtArray[2]);
            else
                assertThat(false).isFalse();
        }
        catch (Exception e)
        {
            methods.log("");
        }

    }

    public void splitAndDisplayDay(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);

        try {
            List<WebElement> list = methods.findElementList(propertyFileName, elementName);

            String Text=list.get(Index).getText();
            String TxtArray[]=Text.split(" ");

            if(TxtArray.length>=3)
                System.out.println("Text: "+TxtArray[0]);
            else
                assertThat(false).isFalse();
        }
        catch (Exception e)
        {
            methods.log("");
        }

    }
}
