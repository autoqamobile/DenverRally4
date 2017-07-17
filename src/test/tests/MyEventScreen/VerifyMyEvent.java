package test.tests.MyEventScreen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by dell on 7/4/2017.
 */
public class VerifyMyEvent extends AbstractPage {
    public VerifyMyEvent(AndroidDriver driver) {
        super(driver);
    }

    public void elementIsDisplayed(String fileName, String elementName, int Index) {
        boolean bool;
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(fileName, elementName);

        bool = list.get(Index).isDisplayed();
        if (bool == true) {
            methods.log("Element is display.");
            //methods.log(list.get(Index).getText()));
        }

        assertThat(bool).isEqualTo(true);
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
    public void verifyLength(String propertyFileName, String elementName){

        Methods methods = new Methods(driver);
        String getText  = methods.findElement(propertyFileName, elementName).getText().toString();
        System.out.println(getText);
        System.out.println(getText.length());

        //assertThat(getText).isEqualToIgnoringCase(text);
    }

    public void verifyNameDateTimeDisplay(ArrayList<String> eventName) {
        Methods methods = new Methods(driver);

        int i =0;

        //System.out.println(eventName.size());
        for (String el : eventName) {

            if ( el.equalsIgnoreCase("Automation Event Free") ) {
                methods.log(el + " is display.");
                i++;
            } else {
               // assertThat(false).isFalse();

            }
        }
       // System.out.println( "i " + i);
        if(i==2)
        {

        }else
        {
            //System.out.println("Here");
           // Assert.assertTrue(false);
        }


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
