package test.tests.LiveStreamScreen;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.List;

/**
 * Created by Jsbot on 09-Jun-17.
 */
public class Steps extends AbstractPage {

    public Steps(WebDriver driver) {
        super(driver);
    }

    public void Scroll()
    {
        Methods methods = new Methods(driver);
        boolean Flag=false;
        String FileName = "LiveStreamScreen";

        WebElement bottomElement=methods.getElement(FileName,"BottomElement");

        WebElement topElement= methods.getElement(FileName,"TopElement");
        TouchAction action = new TouchAction(driver);
        action.longPress(bottomElement).moveTo(topElement).release().perform();

    }
}
