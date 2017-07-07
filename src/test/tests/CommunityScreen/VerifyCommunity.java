package test.tests.CommunityScreen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by dell on 7/5/2017.
 */
public class VerifyCommunity extends AbstractPage {



    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public VerifyCommunity(AndroidDriver driver) {
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
    public void verifyEventPinDisplay(String EventName, String EventLocation) {
        assertThat(driver.findElement(By.id(EventName + ". " + EventLocation + ".")).isDisplayed()).isTrue();
    }
}
