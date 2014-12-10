package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yuliale on 11/28/2014.
 */
public class SearchTest extends AbstractTest {

    @Test(groups={"smoke","positive","regression"})

    public void searchGoogle() {

        //Initialize web driver
      //  WebDriver driver = new ChromeDriver();
        //Go to google page
        webDriver.get ("https://www.google.com.ua");
        //create button
        String INPUT_GOOGLE_SEARCH_XP = "//input[@id='gbqfq']";
        WebElement inputSearch=webDriver.findElement(By.xpath(INPUT_GOOGLE_SEARCH_XP));
        //clear the input field entering search query
        inputSearch.clear();
        //create search query
        String query = "qa wiki";
        //enter search query
        inputSearch.sendKeys("qa wiki");
        //click search button

        WebElement buttonSearch=webDriver.findElement(By.id("gbqfb"));
        buttonSearch.click();
        //xpath of the first result
        String RESULT_LINK_XP= "//div[@id='ires']/ol/div/li[1]";
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement linkFirstResult2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(RESULT_LINK_XP)));
        WebElement linkFirstResult = webDriver.findElement(By.xpath(RESULT_LINK_XP));
        boolean result;

        result = linkFirstResult.getText().toLowerCase().contains(query);

        Assert.assertEquals(result, true);
    }
}


