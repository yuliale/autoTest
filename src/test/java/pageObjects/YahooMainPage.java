package pageObjects;

/**
 * Created by yuliale on 1/26/2015.
 */

public class YahooMainPage extends AbstractPage {

    public static String INPUT_YAHOO_SEARCH_XP = "//input[contains(@class,'compact-input-enabled')]";
    public static String BUTTON_SEARCH_XP = "//button[@id='search-submit']";
    public static String URL_YAHOO_PAGE = "https://www.yahoo.com";

    public static String SIGN_IN_LINK_XP = "//em[contains(@class, 'social-enabled-txt')]";
    public static String ACCOUNT_LINK_XP = "//em[contains(@class, 'social-enabled-txt medium')]";


    public YahooMainPage() {
        super(new String[]{INPUT_YAHOO_SEARCH_XP, BUTTON_SEARCH_XP});
    }

    
}