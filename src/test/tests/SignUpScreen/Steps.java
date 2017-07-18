package test.tests.SignUpScreen;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.config.General.Methods;
import test.config.SeleniumConfig.AbstractPage;

import java.util.Random;

/**
 * Created by dell on 7/3/2017.
 */
public class Steps extends AbstractPage {

    public Steps(WebDriver driver) {
        super(driver);
    }

    public String RendomEmail() {
        // Random rand = new Random(System.currentTimeMillis());
        // int num = rand.nextInt(99999);
        String index = RandomStringUtils.randomNumeric(5);
        //System.out.println(num);
        String EmailId = "auto" + index + "@mailinator.com";
        return EmailId;
    }

    public void EmailVerify(String Email) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mailinator.com");
        driver.findElement(By.id("inboxfield")).sendKeys(Email);
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
    }

    public void startActivity(String AppVersion) {
        Methods method = new Methods(driver);

        method.log("Application  Version : " + AppVersion);

        performAction.pause(2);
        driver.startActivity("com.rally4", "com.rally4.MainActivity");
    }


}
