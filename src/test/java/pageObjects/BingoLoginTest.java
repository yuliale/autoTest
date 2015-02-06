package pageObjects;

import main.AbstractTest;
import main.Utils;
import org.testng.annotations.Test;

/**
 * Created by yuliale on 1/9/2015.
 */
public class BingoLoginTest extends AbstractTest {

    public String HEADER_LOGIN_FIELD="//input[@id=\"username\"]";
    public String HEADER_PASSWORD_FIELD="//input[@id=\"password\"]";
    public String HEADER_LOGIN_BUTTON="//button[@type=\"submit\"]";
    public String POP_UP_USERNAME="//div[@class=\"login-popup-username\"]//input[@name=\"username\"]";
    public String POP_UP_PASSWORD="//div[@class=\"login-popup-password\"]//input[@name=\"password\"]";
    public String POP_UP_LOGIN="//button[@class=\"close-modal login-submit-button\"]";
    public String POP_UP_BUTTON="//button[@class=\"ok\"]";
    public String SECOND_POP_UP_BUTTON="//div[@class=\"message-buttons\"]//button[@class=\"ok\"]";
    public String PRESENT_ELEMENT="//a[@class=\"fn-cashier1 deposit-head new-btn\"]";
    public String LOGIN_INPUT="BingoTest1";
    public String PASSWORD_INPUT="Password1";

    @Test (groups = {"smoke","positive","regression"})

        public void loginFromHeaderPositive () {
        Utils.openPage("http://wpl-licensee16-admin.ptdev.eu/");
        Utils.waitForElementPresent(HEADER_LOGIN_FIELD, 5);
        Utils.fillInputField(HEADER_LOGIN_FIELD, LOGIN_INPUT);
        Utils.fillInputField(HEADER_PASSWORD_FIELD,PASSWORD_INPUT);
        Utils.clickButton(HEADER_LOGIN_BUTTON);
        Utils.waitForElementPresent(POP_UP_BUTTON,10);
        Utils.clickButton(POP_UP_BUTTON);
        Utils.waitForElementPresent(SECOND_POP_UP_BUTTON,10);
        Utils.clickButton(SECOND_POP_UP_BUTTON);
        Utils.isElementPresent(PRESENT_ELEMENT);

    }
    @Test (groups = {"smoke","positive","regression"})

    public void loginFromPopUpPositive () {
        Utils.openPage("http://wpl-licensee16-admin.ptdev.eu/");
        Utils.waitForElementPresent(HEADER_LOGIN_FIELD,5);
        Utils.clickButton(HEADER_LOGIN_BUTTON);
        Utils.waitForElementPresent(POP_UP_USERNAME,10);
        Utils.fillInputField(POP_UP_USERNAME, LOGIN_INPUT);
        Utils.fillInputField(POP_UP_PASSWORD,PASSWORD_INPUT);
        Utils.clickButton(POP_UP_LOGIN);
        Utils.waitForElementPresent(POP_UP_BUTTON,10);
        Utils.clickButton(POP_UP_BUTTON);
        Utils.waitForElementPresent(SECOND_POP_UP_BUTTON,10);
        Utils.clickButton(SECOND_POP_UP_BUTTON);
        Utils.isElementPresent(PRESENT_ELEMENT);

    }










}
