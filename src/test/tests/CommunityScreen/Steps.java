package test.tests.CommunityScreen;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.List;

/**
 * Created by dell on 7/5/2017.
 */
public class Steps extends AbstractPage {

    public Steps(WebDriver driver) {
        super(driver);
    }

    public String getSplitText(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);
        String ElementText = methods.findElement(propertyFileName, elementName).getText();
        //System.out.println(ElementText);


        String[] parts = ElementText.split(" ");
        methods.log("Text : " + parts[Index]);

        return ElementText;
    }

    public String getSplitText1(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);
        String ElementText = methods.findElement(propertyFileName, elementName).getText();
        //System.out.println(ElementText);


        String[] parts = ElementText.split(",");
        methods.log("Text : " + parts[Index]);

        return ElementText;
    }

    public void Scroll() {
        Methods methods = new Methods(driver);
        boolean Flag = false;
        String FileName = "CommunityScreen";

        WebElement bottomElement = methods.getElement(FileName, "BottomElement");

        WebElement topElement = methods.getElement(FileName, "TopElement");
        TouchAction action = new TouchAction(driver);
        action.longPress(bottomElement).moveTo(topElement).release().perform();

    }

    public void ScrollAndClick(String text) {
        Methods methods = new Methods(driver);
        boolean Flag = false;
        String FileName = "CommunityScreen";

        WebElement bottomElement = methods.getElement(FileName, "BottomElement");

        WebElement topElement = methods.getElement(FileName, "TopElement");

        methods.pause(5);
        // try {

        for (int i = 0; i < 50; i++) {
            TouchAction action = new TouchAction(driver);

            if (i == 0) {
                action.longPress(bottomElement).moveTo(topElement).release().perform();
                List<WebElement> list = methods.findElementList(FileName, "EventTextList");

                for (WebElement el : list) {
                    if (el.getText().equalsIgnoreCase(text)) {
                        methods.log("Click on " + text + ".");
                        Flag = true;
                        el.click();

                        break;
                    }

                }
                if (Flag)
                    break;
                    /*String Text = methods.getText(FileName, "Community");

                    if (text.equalsIgnoreCase(Text)) {
                        System.out.println(text + "==" + Text);
                        break;
                    }*/
            } else {
                WebElement bottomElement1 = methods.getElement(FileName, "BottomElement1");
                WebElement bottomElement2 = methods.getElement(FileName, "BottomElement2");
                action.longPress(bottomElement2).moveTo(bottomElement1).release().perform();
                List<WebElement> list = methods.findElementList(FileName, "EventTextList");

                for (WebElement el : list) {
                    if (el.getText().equalsIgnoreCase(text)) {
                        methods.log("Click on " + text + ".");
                        Flag = true;
                        el.click();
                        break;
                    }
                }
                if (Flag)
                    break;
                    /*String Text=methods.getText(FileName,"Community");
                   // System.out.println(Text);
                    //System.out.println(text+"=="+Text);
                    methods.pause(2);
                    if(text.equalsIgnoreCase(Text)) {
                        System.out.println(text+"=="+Text);
                        break;
                    }*/


            }
        }

       /* }
        catch (Exception e) {

        }*/
    }

    public void ScrollCommunity() {
        Methods methods = new Methods(driver);
        boolean Flag = false;
        String FileName = "CommunityScreen";
        methods.pause(5);
        //for(int i=0; i<50;i++) {
        TouchAction action = new TouchAction(driver);

        WebElement topElement = methods.getElement(FileName, "CommunityTop");
        WebElement bottomElement = methods.getElement(FileName, "CommunityBottomt");
        action.longPress(bottomElement).moveTo(topElement).release().perform();
                /*List<WebElement> list = methods.findElementList(FileName, "EventTextList");

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
                }*/


        //}


    }

    public void ScrollCommunityEvent(String text) {
        Methods methods = new Methods(driver);
        boolean Flag = false;
        String FileName = "CommunityScreen";
        methods.pause(5);
        for (int i = 0; i < 50; i++) {
            TouchAction action = new TouchAction(driver);

            WebElement topElement = methods.getElement(FileName, "CommunityTop");
            WebElement bottomElement = methods.getElement(FileName, "CommunityBottomt");
            action.longPress(bottomElement).moveTo(topElement).release().perform();
            List<WebElement> list = methods.findElementList(FileName, "EventTextList");

            for (WebElement el : list) {
                if (el.getText().equalsIgnoreCase(text)) {
                    methods.log("Click on " + text + ".");
                    Flag = true;
                    el.click();
                    break;
                }
            }
            if (Flag) {
                break;
            }


        }


    }

/*  public void ScrollCommunity1(String text)
   {
       Methods methods = new Methods(driver);
       boolean Flag=false;
       String FileName = "CommunityScreen";
       methods.pause(5);
       for(int i=0; i<50;i++) {
           TouchAction action = new TouchAction(driver);

           WebElement topElement=performAction.getElementFromElementList(FileName,"CommunityImage",1);
           WebElement bottomElement=performAction.getElementFromElementList(FileName,"CommunityImage",2);
           action.longPress(bottomElement).moveTo(topElement).release().perform();
           List<ArrayList> list = performAction.getEveryElementtestIntoList1(FileName, "EventTextList");

           for (int j=0; j< list.size();j++) {
               WebElement WE = (WebElement) list.get(j);

               if (WE.getText().equalsIgnoreCase(text)) {
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


   }*/


    public void startActivity(String AppVersion) {
        Methods method = new Methods(driver);

        method.log("Application  Version : " + AppVersion);

        performAction.pause(2);
        driver.startActivity("com.rally4", "com.rally4.MainActivity");
    }


}
