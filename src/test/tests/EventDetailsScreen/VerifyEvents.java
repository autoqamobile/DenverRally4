package test.tests.EventDetailsScreen;

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
public class VerifyEvents extends AbstractPage {


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public VerifyEvents(AndroidDriver driver) {
        super(driver);
    }

    public void elementIsDisplayed(String fileName, String elementName, int Index) {
        boolean bool;
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(fileName, elementName);


        System.out.println(list.size());
        bool = list.get(Index).isDisplayed();
        if (bool == true) {
            methods.log("Element is display.");
        }

        assertThat(bool).isEqualTo(true);
    }

    public void verifyListOfElementWithText(String propertyFileName, String elementName, String text) {
        Methods methods = new Methods(driver);
        boolean bool = false;
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        System.out.println(list.size());

        for (WebElement el : list) {
            if (el.getText().equals(text)) {
                bool = el.isDisplayed();
                methods.log("Element is display.");
                break;
            }
        }

        assertThat(bool).isEqualTo(true);

    }

    public void verifyCurrentDayInListOfEvent(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        System.out.println(list.size());

        for (WebElement el : list) {
            String text = el.getText().toString();
            assertThat(text).doesNotContain("");
            methods.log("- " + text);
        }
    }

    public void verifyNameDateTimeDisplay(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        System.out.println(list.size());

        for (WebElement el : list) {
            if (el.isDisplayed()) {
                methods.log(el.getText() + " is display.");
            } else {
                assertThat(false).isFalse();
                break;
            }
        }
    }

    public void verifyBannerImageDisplay(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        assertThat(methods.findElement(propertyFileName, elementName).isDisplayed()).isTrue();
    }

    public void verifyEventTimeDate(String Expected, String Actual) {
        assertThat(Expected).contains(Actual);
    }

    public void verifyDescriptionDisplay(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        assertThat(methods.findElement(propertyFileName, elementName).isDisplayed()).isTrue();
    }

    public void verifyEventPinDisplay(String EventName, String EventLocation) {
        assertThat(driver.findElement(By.id(EventName + ". " + EventLocation + ".")).isDisplayed()).isTrue();
    }
    public void verifyEventPinNoDotDisplay(String EventName, String EventLocation) {
        System.out.println(EventName + ". " + EventLocation);
        assertThat(driver.findElement(By.id(EventName + ". " + EventLocation)).isDisplayed()).isTrue();
    }

    public void verifyPurchaseTicketScreenName(String ScreenName, String Actual) {
        assertThat(ScreenName).isEqualToIgnoringCase(Actual);
    }

    public void verifyFreeEvent(String Text) {
        assertThat(Text).isEqualToIgnoringCase("Event Free");
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
