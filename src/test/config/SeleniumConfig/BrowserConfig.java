package test.config.SeleniumConfig;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import test.config.General.JsonFileConfig;
import test.config.General.Methods;
import test.config.General.PerformAction;
import test.config.General.Verify;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Viral on 11/26/2016.
 */
public class BrowserConfig {

    public boolean autoLog;
    protected AndroidDriver driver;
    //protected WebDriver driver;
    protected PerformAction performAction;
    protected Verify verify;
    protected String targetBrowser;
    JsonFileConfig fileConfig = new JsonFileConfig();


    @BeforeTest(alwaysRun = true)
    public void fetchSuiteConfiguration(ITestContext testContext) {
        targetBrowser = testContext.getCurrentXmlTest().getParameter("selenium.browser");
    }


    @BeforeMethod
    public void browserConfig() {
        autoLog = fileConfig.getAutoLog();

        DesiredCapabilities capability = null;
        String APKFilePath = fileConfig.getAPKFilePath();

        String deviceName = fileConfig.getdeviceName();
        String appiumVersion = fileConfig.getAppiumVersion();
        String platformVersion = fileConfig.getPlatformVersion();

        String Browser = fileConfig.getBrowser();

        if (fileConfig.checkForSauceLab()) {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platform", fileConfig.getSauceLabPlatform());
            caps.setCapability("version", fileConfig.getSauceLabVersion());
            caps.setBrowserName(fileConfig.getBrowser());
            String URL = "https://" + fileConfig.getSauceLabUserName() + ":" + fileConfig.getSauceLabAccessKey() + "@ondemand.saucelabs.com:443/wd/hub";

        } else {

            if (Browser.equalsIgnoreCase("Android")) {

                DesiredCapabilities caps = DesiredCapabilities.android();

                caps.setCapability("appiumVersion", /*"1.4.13"*/appiumVersion);
                caps.setCapability("deviceName", deviceName);
                caps.setCapability("deviceType", "phone");
                caps.setCapability("deviceOrientation", "portrait");
                caps.setCapability("browserName", "");
                //caps.setCapability("platformVersion", "4.4");
                caps.setCapability("platformVersion", platformVersion);
                caps.setCapability("platformName", "Android");
                caps.setCapability("app", APKFilePath);
                //caps.setCapability("noReset",true);
                caps.setCapability("appPackage", "com.awesomeproject");
                caps.setCapability("appActivity", "com.awesomeproject.MainActivity");
                try {
                    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            }
        }
        Methods methods = new Methods(driver);

        if (autoLog) {
            methods.log("Open Browser : " + Browser);
        }
        performAction = new PerformAction(driver);
        verify = new Verify(driver);

    }


    @AfterMethod
    public void close() {
        driver.quit();
    }


}
