package test.config.General;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import test.config.SeleniumConfig.AbstractPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Viral on 12/11/2016.
 */
public class PerformAction extends AbstractPage {

    protected static Wait<WebDriver> wait;
    JsonFileConfig jsonFileConfig = new JsonFileConfig();
    boolean autoLog = jsonFileConfig.getAutoLog();


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public PerformAction(WebDriver driver) {
        super(driver);
    }


    /**
     * @param fileName    : name of file where element is declared
     * @param elementName : name of element defined into propertyfile
     */
    public void click(String fileName, String elementName) {
        Methods methods = new Methods(driver);
        if (autoLog) {
            methods.log("Click on " + elementName);

        }
        methods.findElement(fileName, elementName).click();
    }
    public WebElement getElement(String fileName, String elementName) {
        Methods methods = new Methods(driver);
        if (autoLog) {
            methods.log("Click on " + elementName);

        }

        return methods.findElement(fileName, elementName);
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     * @param text             : any text you want to entered into text fields
     */
    public void sendKeys(String propertyFileName, String elementName, String text) {

        Methods methods = new Methods(driver);

        System.out.println(autoLog);

        if (autoLog) {
            methods.log("Enter Text " + text + " into " + elementName + " text fields");

        }
        methods.findElement(propertyFileName, elementName).sendKeys(text);
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     * @param text             : any text you want to entered into text fields
      @param Index             : any Index you want to entered into text fields
     */
    public void sendKeysByIndex(String propertyFileName, String elementName,int Index, String text) {

        Methods methods = new Methods(driver);

        System.out.println(autoLog);

        if (autoLog) {
            methods.log("Enter Text " + text + " into " + elementName + " text fields");

        }
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        list.get(Index).sendKeys(text);
       // methods.findElement(propertyFileName, elementName).sendKeys(text);
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     * @param number             : any number you want to entered into text fields
     @param Index             : any Index you want to entered into text fields
     */
    public void sendKeysByIndex1(String propertyFileName, String elementName,int Index, String number) {

        Methods methods = new Methods(driver);

        System.out.println(autoLog);

       /* if (autoLog) {
            methods.log("Enter Text " + number + " into " + elementName + " text fields");

        }*/
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        list.get(Index).click();
        String Num[]=number.split("");
        for(int i=Num.length-1; i>=0;i--)
            driver.getKeyboard().pressKey(Num[i]);

        // methods.findElement(propertyFileName, elementName).sendKeys(text);
    }

    public void sendKeys(String fileName, String elementName) {

        Methods methods = new Methods(driver);

        String text = methods.getAutoText(fileName, elementName);


        if (autoLog) {
            methods.log("Enter Text " + text + " into " + elementName + " text fields");

        }
        methods.findElement(fileName, elementName).sendKeys(text);
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void clear(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        if (autoLog) {
            methods.log("Clear value from " + elementName + " text fields");

        }

        methods.findElement(propertyFileName, elementName).clear();
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public String getText(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        String ElementText = methods.findElement(propertyFileName, elementName).getText();


        if (autoLog) {
            methods.log("Text : " + ElementText);
        }
        return ElementText;
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public String getTagName(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        String ElementText = methods.findElement(propertyFileName, elementName).getTagName();

        if (autoLog) {
            methods.log("Tag Name of " + ElementText + " is " + ElementText);
        }
        return ElementText;
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void selectValueFromDroupDown(String propertyFileName, String elementName, String value) {

        Methods methods = new Methods(driver);
        if (autoLog) {
            methods.log("Select" + value + " from " + elementName + " drop down box ");
        }

        Select dropdown = new Select(methods.findElement(propertyFileName, elementName));

        dropdown.selectByVisibleText(value);
    }

    /**
     * @param scrollHeight hight in pixel
     */
    public void scrollingByCoordinates(int scrollHeight) {


        JavascriptExecutor jse = driver;
        jse.executeScript("window.scrollBy(0," + scrollHeight + ")");
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void scrollingToElement(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        if (autoLog) {
            methods.log("Scroll to the element " + elementName);
        }

        JavascriptExecutor jse = driver;
        jse.executeScript("arguments[0].scrollIntoView();", (methods.findElement(propertyFileName, elementName)));
    }

    /**
     * Web Page Scrolling To Page Bottom.
     */
    public void scrollingToBottom() {
        Methods methods = new Methods(driver);

        if (autoLog) {
            methods.log("Scroll to the bottom");
        }

        JavascriptExecutor jse = driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void scrollToElementUsingPageDownKeys(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        methods.findElement(propertyFileName, elementName).sendKeys(Keys.PAGE_DOWN);

    }

    /**
     * Switch to new window
     */

    public void switchToNewWindow() {

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */

    public void selectRandomOptionFromCombo(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        String selectedOption = "";
        WebElement selectCombo = methods.findElement(propertyFileName, elementName);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> getAllOption = selectCombo.findElements(By.xpath("option"));
        int index = new Random().nextInt(getAllOption.size());
        WebElement abc = getAllOption.get(index);
        selectedOption = abc.getText();
        System.out.println("Selected Option Is----====>" + selectedOption);
        abc.click();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void stopPageLoading() {
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
    }


    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */

    public void moveToFrameWithElement(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        driver.switchTo().frame(methods.findElement(propertyFileName, elementName));

    }

    public void browserQuit() {
        driver.quit();
    }

    public void browserClose() {
        driver.close();
    }


    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void mouseHoverOn(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        Actions action = new Actions(driver);
        action.moveToElement(methods.findElement(propertyFileName, elementName)).build().perform();
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void rightClickOn(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        if (autoLog) {
            methods.log("Right click on " + elementName);
        }
        Actions action = new Actions(driver).contextClick(methods.findElement(propertyFileName, elementName));
        action.build().perform();

    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void doubleClick(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        if (autoLog) {
            methods.log("Double click on " + elementName);
        }

        Actions action = new Actions(driver);
        action.doubleClick(methods.findElement(propertyFileName, elementName)).build().perform();
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     */
    public void clickAndHold(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);

        if (autoLog) {
            methods.log("Click and hold " + elementName);
        }

        Actions action = new Actions(driver);
        action.clickAndHold(methods.findElement(propertyFileName, elementName)).build().perform();
    }

    /**
     * @param secs
     */
    public void pause(int secs) {
        Methods methods = new Methods(driver);

        if (autoLog) {
            //methods.log("Pause for " + secs + " seconds");
        }

        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException interruptedException) {

        }
    }

    public void tap(String fileName, String elementName) {
        Methods methods = new Methods(driver);
        if (autoLog) {
            methods.log("Click on " + elementName);
        }

        driver.tap(1, methods.findElement(fileName, elementName),2);


    }
    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     * @param text             : text of element to be select
     */

    public void clickOnElementFromList(String propertyFileName, String elementName, String text) {
        Methods methods = new Methods(driver);
        boolean flag=false;
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        for (WebElement el : list) {
            if (el.getText().equalsIgnoreCase(text)) {
                methods.log("Click on "+text+".");
                el.click();
                flag=true;
                break;
            }
        }
        assertThat(!flag).isFalse();
    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     * @param text             : text of element to be select
     */

    public void sendKeyOnElementFromList(String propertyFileName, String elementName, String text,String sendKey) {
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        for (WebElement el : list) {
            if (el.getText().equals(text)) {
                methods.log("Click on "+text+".");
                el.sendKeys(sendKey);
                break;
            }
        }

    }


    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     * @param index             : index of element to be select
     */

    public void clickOnElementFromListIndex(String propertyFileName, String elementName, int index) {
        Methods methods = new Methods(driver);
        try
        {
            List<WebElement> list = methods.findElementList(propertyFileName, elementName);
            methods.log("Click on index number "+index+" .");
            list.get(index).click();
        }
        catch (Exception e)
        {
            methods.log("Index Not Available....!!!!");
        }


    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     * @param index             : index of element to be select
     */

    public WebElement getElementFromElementList(String propertyFileName, String elementName, int index) {
        Methods methods = new Methods(driver);
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        return list.get(index);
    }

    public int getListOfElementCount(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        int count;
        List<WebElement> list = methods.findElementList(propertyFileName, elementName);
        count = list.size();
        methods.log("List Size : " + count);
        return count;

    }

    /**
     * @param propertyFileName : name of file where element is declared
     * @param elementName      : name of element defined into propertyfile
     *                         Get every element text.
     */

    public ArrayList getEveryElementtestIntoList(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);


        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        ArrayList<String> eventNameList = new ArrayList<>();

        //System.out.println(list.size());

        for (WebElement el : list) {
            String text = el.getText().toString();
            eventNameList.add(text);

        }

        return eventNameList;

    }

    public ArrayList getEveryElementtestIntoList1(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);


        List<WebElement> list = methods.findElementList(propertyFileName, elementName);

        ArrayList<String> eventNameList = new ArrayList<>();

        System.out.println(list.size());

        for (WebElement el : list) {
            String text = el.getText().toString();
            eventNameList.add(text);

        }

        return eventNameList;
    }

    public void waitForElement(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        methods.waitForElement(propertyFileName, elementName);
    }


    public void waitForElementToBeDisapper(String propertyFileName, String elementName) {
        Methods methods = new Methods(driver);
        methods.waitForElementToBeDisapper(propertyFileName, elementName);
    }

    public void openURL() {
        String URL = jsonFileConfig.getURL();
        driver.get(URL);
    }

    public void openURL(String url) {

        driver.get(url);

    }

    /**
     * Get Current Page URL.
     *
     * @return Return Current Page URL in String.
     */
    //
    public String getCurrentURL() {
        String CurrentURL = driver.getCurrentUrl();

        return CurrentURL;
    }

    /**
     * Get Current Page Source.
     *
     * @return Return Current Page Source In String.
     */
    public String getPageSource() {
        String PageSource = driver.getPageSource();

        return PageSource;
    }

    /**
     * Web Page refresh.
     */
    public void refresh() {
        driver.navigate().refresh();
    }

    /**
     * Go To Previous Page.
     */
    public void goToPreviuosPage() {
        driver.navigate().back();
    }

    public void androidScrollToElement(int value) {


        TouchAction action = new TouchAction(driver);
        action.press(0, 600)
                .waitAction(200)
                .moveTo(0, value)
                .release()
                .perform();

    }

    public void androidScrollToElementManually(int start, int end) {


        TouchAction action = new TouchAction(driver);
        action.press(0, start)
                .waitAction(200)
                .moveTo(0, end)
                .release()
                .perform();

    }

    
    public boolean classNameIsAvailable(String className, ArrayList<String> allAvailableClasses)
    {
        boolean bool = false;
        for(String availableClass : allAvailableClasses)
        {

            if(availableClass.equalsIgnoreCase(className))
            {
                bool = true;
                break;
            }
        }
        
        return  bool;
    }
    
    
    

}
