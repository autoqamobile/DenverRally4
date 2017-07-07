package test.tests.MyProfileScreen;

import io.appium.java_client.android.AndroidDriver;
import javafx.scene.control.RadioButton;
import org.openqa.selenium.By;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by dell on 7/6/2017.
 */
public class VerifyMyProfile extends AbstractPage {
    public VerifyMyProfile(AndroidDriver driver) {
        super(driver);
    }

    public void verifyElementDisplay(String propertyFileName, String elementName){
        Methods methods = new Methods(driver);
        assertThat(methods.findElement(propertyFileName, elementName).isDisplayed()).isTrue();
    }

    public void verifyText(String propertyFileName, String elementName, String text){
        Methods methods = new Methods(driver);
        String getText  = methods.findElement(propertyFileName, elementName).getText().toString();
        // System.out.println(getText);
        assertThat(getText).isEqualToIgnoringCase(text);
    }

    public void verifyRadioButton(String propertyFileName, String elementName){
        Methods methods = new Methods(driver);
        boolean GetText=methods.findElement(propertyFileName, elementName).isSelected();
        System.out.println(GetText);
        assertEquals(GetText,true);
        //assertThat(getText).isEqualToIgnoringCase(true);
        ///assertEquals(name.isSelected(),true);
    }
}
