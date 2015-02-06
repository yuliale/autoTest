package main;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

/**
 * Created by yuliale on 12/12/2014.
 */
public class Utils {

    //general
    public static WebElement getElementByXpath (String xpath, WebDriver driver){
        WebElement element = null;
        try{
            element = driver.findElement(By.xpath(xpath));
        } catch (NoSuchElementException e){
            System.err.println("No element was found " + xpath);
        }

        return element;
    }

    //url

    public static void openPage (String url){
        AbstractTest.getWebDriver().get(url);
    }


    public static void fillInputField(String xpath, String value) {
        WebDriver driver = AbstractTest.getWebDriver();
        WebElement inputField = driver.findElement(By.xpath(xpath));
        inputField.clear();
        inputField.sendKeys(value);

    }


    public static void clickButton(String xpath) {
        WebDriver driver = AbstractTest.getWebDriver();
        WebElement button = getElementByXpath(xpath, driver);
        button.click();
    }

    public static void waitForElementPresent(String xpath, int timeOutSeconds){
        WebDriver driver = AbstractTest.getWebDriver();
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(driver, timeOutSeconds);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        } catch (NoSuchElementException e) {
            System.err.println("No element was found " + xpath);
        }

    }

    public static WebElement waitForElementPresent1(String xpath, int timeOutSeconds) {
        WebDriver driver = AbstractTest.getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, timeOutSeconds);
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        } catch (NoSuchElementException e) {
            System.err.println("No element was found " + xpath);
            return null;
        }
    }

    public static String getTextByXpath (String xpath){
        WebDriver driver = AbstractTest.getWebDriver();
        WebElement element = driver.findElement(By.xpath(xpath));
        return element.getText();
    }

    public static WebElement waitForElement (int timeOutSeconds,String xpath){
        WebDriverWait wait = new WebDriverWait(AbstractTest.getWebDriver(), timeOutSeconds);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public static void checkBoxClick (String xpath, WebDriver driver){
        WebElement checkBox = driver.findElement(By.xpath(xpath));
        if(checkBox.getAttribute("checked") == null){
            checkBox.click();
            // writing it shortly in a test
            //Utils.checkBoxClick(xpath_to_checkbox, driver);
        }

    }

    public static boolean isAnyWordPresent (String fullText,String textToBeSplit){
        boolean result = false;
        String[] queryWords = textToBeSplit.split("[ :-]");
        for (int i = 0; i < queryWords.length; i++){
            if (fullText.toLowerCase().contains(queryWords[i])){
                result = true;
            }
        }
        return result;

    }

    public static boolean isElementPresent (String xPath){
        boolean isElementPresent = false;
        WebDriver driver = AbstractTest.getWebDriver();
        if (driver.findElements(By.xpath(xPath)).size() != 0){
            isElementPresent = true;
        }

        return isElementPresent;
    }

   public static void waitForElementToBeClickable(String xpath, int timeOutSeconds){
        WebDriver driver = AbstractTest.getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, timeOutSeconds);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        } catch (InvalidElementStateException e) {
            System.err.println("No element was found " + xpath);
        }

    }

    public static Boolean waitForElementToDisappear(int TimeOutSeconds, String xpath) {
        WebDriver driver = AbstractTest.getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, TimeOutSeconds);
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }


}