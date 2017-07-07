package test.tests.NewsScreen;

import io.appium.java_client.android.AndroidDriver;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by dell on 7/6/2017.
 */
public class NewsVerify extends AbstractPage {



    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public NewsVerify(AndroidDriver driver) {
        super(driver);
    }
    public void verifyElementDisplay(String propertyFileName, String elementName){
        Methods methods = new Methods(driver);
        assertThat(methods.findElement(propertyFileName, elementName).isDisplayed()).isTrue();
    }

    public void verifyText(String propertyFileName, String elementName, String text){
        Methods methods = new Methods(driver);
        String getText  = methods.findElement(propertyFileName, elementName).getText().toString();
        assertThat(getText).isEqualToIgnoringCase(text);
        System.out.println("Text : "+getText);

    }
}
