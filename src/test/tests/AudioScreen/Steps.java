package test.tests.AudioScreen;

import org.openqa.selenium.WebDriver;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

/**
 * Created by Jsbot on 09-Jun-17.
 */
public class Steps extends AbstractPage {

    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Steps(WebDriver driver) {
        super(driver);
    }

    public void startActivity(String AppVersion)
    {
        Methods method = new Methods(driver);

        method.log("Application  Version : "+AppVersion);

        method.pause(2);
        driver.startActivity("com.rally4","com.rally4.MainActivity");
    }




}
