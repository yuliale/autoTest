import main.AbstractTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by AloneWolf on 07.12.2014.
 */
public class LoginTest extends AbstractTest {

    @Test(groups={"smoke","positive","regression"})

    public void loginYahoo() {

        String startUrl = "https://www.yahoo.com/"; //define basic URL
        String signInLink = "y-link-1";
        String errorClass = "yregertxt";
        String INPUT_LOGIN_XP = "//input[@id='username']"; //define XPath for search input
        String INPUT_PASSWORD_XP = "//input[@id='passwd']";
        String login = "julialeonenko"; //login input
        String fakeLogin = "yulialeonenko";
        String password = "MynewAccount12"; // password input
        String signInButton = "//*[@id='.save']";
        int timeToWait = 10; // browser delay
        
        //initialize ChromeDriver class
      //  WebDriver driver = new ChromeDriver();
        //go to yahoo page
        webDriver.get(startUrl);
        //search button
        WebElement buttonSearch = webDriver.findElement(By.className(signInLink));
        //click button
        buttonSearch.click();
        //initialize WebDriverWait class
        WebDriverWait wait = new WebDriverWait(webDriver, timeToWait);
        //wait until finding INPUT_LOGIN_XP
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(INPUT_LOGIN_XP)));

        /************************ finding objects on the page ***************/
        //find login field
        WebElement loginInput = webDriver.findElement(By.xpath(INPUT_LOGIN_XP));
        //find password field
        WebElement passwordInput = webDriver.findElement(By.xpath(INPUT_PASSWORD_XP));
        //search sign in button
        WebElement signInSearch = webDriver.findElement(By.xpath(signInButton));

        /*********************** first wrong login ***********************/
      /*  //enter fake login
        loginInput.sendKeys(fakeLogin);
        //enter password
        passwordInput.sendKeys(password);
        //click sign in button
        signInSearch.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(errorClass)));*/
        /*********************** correct login ***********************/
        //enter login
        loginInput.sendKeys(login);
        //enter fake password
        passwordInput.sendKeys(password);
        //click sign in button
        signInSearch.click();
         /*driver.quit();*/
    }
}
