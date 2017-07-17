package test.tests.LiveStreamScreen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Jsbot on 09-Jun-17.
 */
public class VerifyLiveScreen extends AbstractPage {


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public VerifyLiveScreen(AndroidDriver driver) {
        super(driver);
    }

    public void elementIsDisplayed(String fileName, String elementName) {
        boolean bool;
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(fileName, elementName);
        for(WebElement e:list){
            assertThat(e.isDisplayed()).isTrue();
        }
    }

    public void verifyElementDisplay(String propertyFileName, String elementName){
        Methods methods = new Methods(driver);
       assertThat(methods.findElement(propertyFileName, elementName).isDisplayed()).isTrue();
      /* boolean x=methods.findElement(propertyFileName, elementName).isDisplayed();
       if(x==true)
           System.out.println("True");
       else
           System.out.println("False");*/
    }

    public void verifyText(String propertyFileName, String elementName, String text){
        Methods methods = new Methods(driver);
        String getText  = methods.findElement(propertyFileName, elementName).getText().toString();
        assertThat(getText).isEqualToIgnoringCase(text);

    }

    public void verifyElementDisplayByText(String propertyFileName, String elementName, String text) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        for (WebElement el : list) {
            if (el.getText().equalsIgnoreCase(text)) {
                flag=true;
                methods.log("Text "+el.getText());
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
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        String Text=list.get(Index).getText();
        for (WebElement el : list) {
            if (el.getText().equalsIgnoreCase(Text)) {
                flag=true;
                methods.log("Text "+el.getText());
                //el.click();
                break;
            }

        }
        assertThat(!flag).isFalse();


    }

    public void verifyElementDisplayByIndex2(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);
        boolean flag=false;
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


}
