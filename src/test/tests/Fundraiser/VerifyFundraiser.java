package test.tests.Fundraiser;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by dell on 7/14/2017.
 */
public class VerifyFundraiser extends AbstractPage {



    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public VerifyFundraiser(AndroidDriver driver) {
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

    public void verifyElementDisplayByText(String propertyFileName, String elementName, String text) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        List<WebElement> list = methods.findElementList(propertyFileName, "CauseList");

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

    public String getText(String propertyFileName, String elementName, String text) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        String Text="";
        List<WebElement> list = methods.findElementList(propertyFileName, "EventDetailList");

        for (WebElement el : list) {
            if (el.getText().equalsIgnoreCase(text)) {
                flag=true;
                Text =el.getText();
                el.click();
                break;
            }

        }
        assertThat(!flag).isFalse();

        return Text;
    }

}
