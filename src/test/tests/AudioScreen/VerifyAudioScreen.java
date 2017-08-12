package test.tests.AudioScreen;

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
public class VerifyAudioScreen extends AbstractPage {


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public VerifyAudioScreen(AndroidDriver driver) {
        super(driver);
    }

    public void elementIsDisplayed(String fileName, String elementName) {
        boolean bool;
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(fileName, elementName);
        for(WebElement e:list){
            assertThat(e.isDisplayed()).isTrue();
        }
    }

    public void verifyElementDisplay(String propertyFileName, String elementName){
        Methods methods = new Methods(driver);
        assertThat(methods.findElement(propertyFileName, elementName).isDisplayed()).isTrue();
    }

    public void printAudioName(String fileName, String elementName)
    {
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(fileName, elementName);
        for(WebElement e:list){
            methods.log("Audio Name : "+e.getText());
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


    public boolean verifyClassName(String propertyFileName, String elementName, String text) {
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
        return flag;


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
        try
        {


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
        catch (Exception e)
        {
            methods.log("");
        }

    }

    public void verifyElementDisplayByIndex2(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        try {
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
        catch (Exception e)
    {
        methods.log("");
    }

    }

    public boolean ClassExist(String ClassName) {
       boolean flag=false;

        String ClassList[]={"NewsScreen","CommunityScreen","MyEventScreen","MyProfileScreen","LoginScreen","SignUpScreen","FundraiserScreen","CreateGroupScreen","VideoScreen","CauseScreen","AudioScreen","EventDetailsScreen","EventModule","LiveStreamScreen",""};
        for(int i=0;i<ClassList.length;i++)
        {
            if(ClassList[i].equalsIgnoreCase(ClassName))
                flag=true;

        }
        return flag;
    }

    public void verifyElementDisplayByIndex(String propertyFileName, String elementName, int Index) {
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);
        assertThat(list.get(Index).isDisplayed()).isTrue();


    }
}
