import main.AbstractTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yuliale on 12/10/2014.
 */
public class IceLoginTest extends AbstractTest {

    private static final String basicURL = "http://wpl-trtdemo.playtechgaming.com/en_GB/home";// define start URL
    private static final String LOGIN_INPUT = "//form[@id='login']/input[@name='username']"; // login field
    private static final String PASSWORD_INPUT = "//form[@id='login']/input[@name='password']";// password field
    private static final String BUTTON_LOGIN_XP = "//form[@id='login']/button[@type='submit']";// login button
    private static final String logIn = "Testpt-1"; // login
    private static final String password = "Password1";
    int timeToWait = 10; // browser delay

    @Test(groups="smoke, positive, regression")
    public void loginFromHeader() {
        //initialize ChromeDriver class
        //  WebDriver driver = new ChromeDriver();
        //go to the page
        webDriver.get(basicURL);
        //wait until finding INPUT_LOGIN_XP
        WebDriverWait wait = new WebDriverWait(webDriver, timeToWait);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LOGIN_INPUT)));
        //search field
        WebElement loginInput = webDriver.findElement(By.xpath(LOGIN_INPUT));
        //find password field
        WebElement passwordInput = webDriver.findElement(By.xpath(PASSWORD_INPUT));
        //search sign in button
        WebElement signInSearch = webDriver.findElement(By.xpath(BUTTON_LOGIN_XP));

        //enter login
        loginInput.sendKeys(logIn);
        //enter password
        passwordInput.sendKeys(password);
        //click login
        signInSearch.click();
        Assert.assertTrue(isLoggedIn());
    }

    @Test(groups="smoke, positive, regression")
    public void loginFromPopup() {

    }

    private boolean isLoggedIn() {
        return webDriver.findElement(By.xpath(BUTTON_LOGIN_XP)).isDisplayed();
    }


}
