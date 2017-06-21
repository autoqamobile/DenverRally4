package test.tests.AudioScreen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Jsbot on 09-Jun-17.
 */
public class VerifyAudioScreen extends AbstractPage {


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public VerifyAudioScreen(AndroidDriver driver) {
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
    }

    public void printAudioName(String fileName, String elementName)
    {
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(fileName, elementName);
        for(WebElement e:list){
            methods.log("Audio Name : "+e.getText());
        }
    }


}
