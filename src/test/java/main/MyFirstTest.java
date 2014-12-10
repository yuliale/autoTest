package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by yuliale on 12/4/2014.
 */
public class MyFirstTest {

    public static void main(String [] args) {

    //Initialize web driver
    WebDriver driver = new ChromeDriver();
    //Go to google page
    driver.get ("https://www.yahoo.com");
    //create button
    String INPUT_YAHOO_SEARCH_XP = "//input[@id='p_13838465-p']";
    WebElement inputSearch=driver.findElement(By.xpath(INPUT_YAHOO_SEARCH_XP));
    //clear the input field entering search query
    inputSearch.clear();
    //create search query
    String query = "panda bear: baby";
    //enter search query
    inputSearch.sendKeys("panda bear");
    //click search button

    WebElement buttonSearch=driver.findElement(By.id("search-submit"));
    buttonSearch.click();
    //xpath of the first result
    String RESULT_LINK_XP= "//*[@id='link-1']";
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement linkFirstResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(RESULT_LINK_XP)));
    //        WebElement linkFirstResult = driver.findElement(By.xpath(RESULT_LINK_XP));
    boolean result;
    if (linkFirstResult.getText().toLowerCase().contains(query)) {
        result = true;
    } else {result = false; }

        //split query words
        boolean result1 = false;
        String[] queryWords = query.split("[ : ]");
        for (int i=0; i < queryWords.length; i++) {
            if (linkFirstResult.getText().toLowerCase().contains(queryWords[i])) {
                result = true;
                break;
            }
        }

        WebElement linkSearch=driver.findElement(By.id("link-1"));
        linkSearch.click();
        driver.quit();



}

}

