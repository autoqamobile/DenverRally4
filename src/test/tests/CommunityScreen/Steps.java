package test.tests.CommunityScreen;

import org.openqa.selenium.WebDriver;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

/**
 * Created by dell on 7/5/2017.
 */
public class Steps extends AbstractPage{

    public Steps(WebDriver driver) {
        super(driver);
    }

    public String getSplitText(String propertyFileName, String elementName,int Index) {
        Methods methods = new Methods(driver);
        String ElementText = methods.findElement(propertyFileName, elementName).getText();
        //System.out.println(ElementText);


            String[] parts = ElementText.split(" ");
            methods.log("Text : " + parts[Index]);

        return ElementText;
    }
    public String getSplitText1(String propertyFileName, String elementName,int Index) {
        Methods methods = new Methods(driver);
        String ElementText = methods.findElement(propertyFileName, elementName).getText();
        //System.out.println(ElementText);


        String[] parts = ElementText.split(",");
        methods.log("Text : " + parts[Index]);

        return ElementText;
    }
}
