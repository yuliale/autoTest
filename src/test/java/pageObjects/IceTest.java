package pageObjects;

import main.AbstractTest;
import main.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by darya.alymova on 12/18/2014.
 */
public class IceTest extends AbstractTest {
    public String HEADER_XP = "//div[contains(@id,'id_header')]";
    public String INPUT_USERNAME_XP = "//input[@name='username']";
    public String INPUT_PASSWORD_XP = "//input[@name='password']";
    public String BUTTON_LOGIN_XP = "//button[@type='submit']";
    public String MODAL_WELCOME_MESSAGE = "//div[@id='playtechModalMessages']";
    public String BUTTON_OK_WELCOME_MESSAGE = MODAL_WELCOME_MESSAGE + "//button[@class='ok']";
    public String LINK_LOGOUT = "//a[contains(@class,'logout')]";
    public String WELCOME_TEXT_HEADER_XP = "//span[@id='welcome']";
    public String POPUP_LOGIN_XP = "//div[@class='login-popup']";
    public String ERROR_LOGIN_POPUP_XP ="//div[contains(@class,'portlet-msg-error')]";
    public String INPUT_USERNAME_POPUP_XP = POPUP_LOGIN_XP + INPUT_USERNAME_XP;
    public String INPUT_PASSWORD_POPUP_XP = POPUP_LOGIN_XP + INPUT_PASSWORD_XP;
    public String BUTTON_LOGIN_POPUP_XP = POPUP_LOGIN_XP + BUTTON_LOGIN_XP;


    @Test(groups = {"smoke","positive","regression"})
    public void loginFromHeaderPositive() {

        Utils.openPage("http://wpl-trtdemo.playtechgaming.com");
        Utils.waitForElementPresent(HEADER_XP, 10);
        if (Utils.isElementPresent(WELCOME_TEXT_HEADER_XP)){
            Utils.clickButton(LINK_LOGOUT);
            Utils.waitForElementPresent(INPUT_USERNAME_XP, 10);
        }
        Utils.fillInputField(INPUT_USERNAME_XP, "player02");
        Utils.fillInputField(INPUT_PASSWORD_XP, "Password1");
        Utils.clickButton(BUTTON_LOGIN_XP);
        Utils.waitForElementPresent(MODAL_WELCOME_MESSAGE, 10);
        Utils.clickButton(BUTTON_OK_WELCOME_MESSAGE);
        boolean result = Utils.waitForElementPresent1(LINK_LOGOUT, 15).isDisplayed();
        Assert.assertEquals(result,true, "error message");


    }


    @Test(groups = {"smoke","negative","regression"})
    public void loginFromHeaderNegative() {

        Utils.openPage("http://wpl-trtdemo.playtechgaming.com");
        Utils.waitForElementPresent(HEADER_XP, 10);
        if (Utils.isElementPresent(WELCOME_TEXT_HEADER_XP)){
            Utils.clickButton(LINK_LOGOUT);
            Utils.waitForElementPresent(INPUT_USERNAME_XP, 10);
        }

        Utils.fillInputField(INPUT_USERNAME_XP, "johndoe122");
        Utils.fillInputField(INPUT_PASSWORD_XP, "123123");
        Utils.clickButton(BUTTON_LOGIN_XP);
        Utils.waitForElementPresent(POPUP_LOGIN_XP, 5);
        boolean result = Utils.isElementPresent(ERROR_LOGIN_POPUP_XP);
        Assert.assertEquals(result,true, "error message");


    }

    @Test(groups = {"smoke","positive","regression"})
    public void loginFromPopupPositive() {

        Utils.openPage("http://wpl-trtdemo.playtechgaming.com");
        Utils.waitForElementPresent(HEADER_XP, 10);
        if (Utils.isElementPresent(WELCOME_TEXT_HEADER_XP)){
            Utils.clickButton(LINK_LOGOUT);
            Utils.waitForElementPresent(INPUT_USERNAME_XP, 10);
        }
        Utils.clickButton(BUTTON_LOGIN_XP);
        Utils.waitForElementPresent(POPUP_LOGIN_XP, 3);
        Utils.fillInputField(INPUT_USERNAME_POPUP_XP, "johndoe1");
        Utils.fillInputField(INPUT_PASSWORD_POPUP_XP, "123123");
        Utils.clickButton(BUTTON_LOGIN_POPUP_XP);
        Utils.waitForElementToBeClickable(BUTTON_OK_WELCOME_MESSAGE, 10);
        Utils.clickButton(BUTTON_OK_WELCOME_MESSAGE);
        Utils.waitForElementPresent(LINK_LOGOUT, 15);
        boolean result = Utils.isElementPresent(LINK_LOGOUT);
        Assert.assertEquals(result,true, "error message");


    }




}
