package test.tests.CommunityScreen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.List;

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

    public void verifyElementDisplayByText(String propertyFileName, String elementName, String text) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        List<WebElement> list = methods.findElementList(propertyFileName, "EventDetailList");

        for (WebElement el : list) {
            if (el.getText().equalsIgnoreCase(text)) {
                flag=true;
                methods.log("Text "+el.getText());
                el.click();
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
