package test.tests.Fundraiser;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.List;

/**
 * Created by dell on 7/14/2017.
 */
public class Steps extends AbstractPage {

    public Steps(WebDriver driver) {
        super(driver);
    }

    public void Scroll()
    {
        Methods methods = new Methods(driver);
        boolean Flag=false;
        String FileName = "Fundraiser";

        WebElement bottomElement=methods.getElement(FileName,"BottomElement");

        WebElement topElement= methods.getElement(FileName,"TopElement");
        TouchAction action = new TouchAction(driver);
        action.longPress(bottomElement).moveTo(topElement).release().perform();

        //methods.pause(5);

        /*for(int i=0; i<50;i++) {
            TouchAction action = new TouchAction(driver);
            inner:
            if(i==0) {
                action.longPress(bottomElement).moveTo(topElement).release().perform();
                List<WebElement> list = methods.findElementList(FileName, "CauseList");

                for (WebElement el : list) {
                    if (el.getText().equalsIgnoreCase(text)) {
                        methods.log("Click on "+text+".");
                        Flag=true;
                        el.click();

                        break;
                    }

                }
                if(Flag)
                    break;

            }
            else
            {

                WebElement bottomElement1=methods.getElement(FileName,"BottomElement1");
                WebElement bottomElement2=methods.getElement(FileName,"BottomElement2");
                action.longPress(bottomElement2).moveTo(bottomElement1).release().perform();
                List<WebElement> list = methods.findElementList(FileName, "CauseList");

                for (WebElement el : list) {
                    if (el.getText().equalsIgnoreCase(text)) {

                        methods.log("Click on "+text+".");
                        Flag=true;
                        el.click();
                        break;
                    }
                }
                if(Flag)
                    break;

            }
        }*/

    }

    public void ScrollCommunity(String text)
    {
        Methods methods = new Methods(driver);
        boolean Flag=false;
        String FileName = "CommunityScreen";
        methods.pause(5);
        for(int i=0; i<50;i++) {
            TouchAction action = new TouchAction(driver);

            WebElement topElement=methods.getElement(FileName,"CommunityTop");
            WebElement bottomElement=methods.getElement(FileName,"CommunityBottomt");
            action.longPress(bottomElement).moveTo(topElement).release().perform();
            List<WebElement> list = methods.findElementList(FileName, "EventTextList");

            for (WebElement el : list) {
                if (el.getText().equalsIgnoreCase(text)) {
                    //methods.log("Click on "+text+".");
                    Flag=true;
                    // el.click();
                    break;
                }
            }
            if(Flag)
            {
                break;
            }




        }


    }

    public void ScrollCommunityEvent(String text)
    {
        Methods methods = new Methods(driver);
        boolean Flag=false;
        String FileName = "CommunityScreen";
        methods.pause(5);
        for(int i=0; i<50;i++) {
            TouchAction action = new TouchAction(driver);

            WebElement topElement=methods.getElement(FileName,"CommunityTop");
            WebElement bottomElement=methods.getElement(FileName,"CommunityBottomt");
            action.longPress(bottomElement).moveTo(topElement).release().perform();
            List<WebElement> list = methods.findElementList(FileName, "EventTextList");

            for (WebElement el : list) {
                if (el.getText().equalsIgnoreCase(text)) {
                    methods.log("Click on "+text+".");
                    Flag=true;
                    el.click();
                    break;
                }
            }
            if(Flag)
            {
                break;
            }




        }


    }

    public void startActivity(String AppVersion)
        {
            Methods method = new Methods(driver);

            method.log("Application  Version : "+AppVersion);

            method.pause(2);
            driver.startActivity("com.rally4","com.rally4.MainActivity");
        }

}
