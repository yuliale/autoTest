import main.AbstractTest;
import main.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yuliale on 12/4/2014.
 */
public class YahooTest extends AbstractTest {

    @Test(groups={"smoke","positive","regression"})

    public void searchYahoo() {

        //String startUrl = "https://www.yahoo.com/"; //define basic URL
        String INPUT_YAHOO_SEARCH_XP = "//input[@id='p_13838465-p']"; //define XPath for search input
        String submitButtonId = "//button[@id='search-submit']";
        String query = "panda bear"; //create search query
        String RESULT_LINK_XP= "//*[@id='link-1']"; // define XPath
        int timeToWait = 10; // browser delay
        Utils.openPage("https://www.yahoo.com/");
        Utils.getElementByXpath(INPUT_YAHOO_SEARCH_XP, getWebDriver());
        Utils.fillInputField(query,INPUT_YAHOO_SEARCH_XP );
        Utils.clickButton(submitButtonId);
        Utils.waitForElement(10,RESULT_LINK_XP);

        
        //Initialize web driver
       // WebDriver driver = new ChromeDriver();
        //Go to google page
//        webDriver.get(startUrl);
        //create button
//        WebElement inputSearch = webDriver.findElement(By.id(INPUT_YAHOO_SEARCH_XP));
        //clear the input field entering search query
//        inputSearch.clear();
        //enter search query
//        inputSearch.sendKeys(query);
        //find submit button
//        WebElement buttonSearch = webDriver.findElement(By.id(submitButtonId));
        //click search button
//        buttonSearch.click();
        //xpath of the first result
//        WebDriverWait wait = new WebDriverWait(webDriver, timeToWait);
        //wait until we are able to find RESULT_LINK_XP
//        WebElement linkFirstResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(RESULT_LINK_XP)));
        //WebElement linkFirstResult = driver.findElement(By.xpath(RESULT_LINK_XP));
        // method "contains" returns boolean value so no need to use if/else statement
//        boolean result = linkFirstResult.getText().toLowerCase().contains(query);
        //find first link
        WebElement linkSearch = webDriver.findElement(By.xpath(RESULT_LINK_XP));
        // trigger click on first link
        linkSearch.click();
        Assert.assertTrue(linkSearch.getText().length() > 0);
       // driver.quit();
    }

}

