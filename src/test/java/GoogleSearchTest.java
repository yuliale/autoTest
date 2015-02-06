import main.AbstractTest;
import main.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.GoogleMainPage;
import pageObjects.GoogleResultPage;


/**
 * Created by yuliale on 11/28/2014.
 */
public class GoogleSearchTest extends AbstractTest {

    @Test(groups = {"smoke","positive","regression"})
    public void searchGoogle() {
//        String INPUT_GOOGLE_SEARCH_XP = "//input[@id='gbqfq']";
//        String BUTTON_SEARCH_XP = "//*[@id='gbqfb']";
        String query = "qa wiki";
//        String RESULT_LINK_XP = "//div[@id='ires']/ol/div/li[1]";


        Utils.openPage(GoogleMainPage.getURL());
        GoogleMainPage googleMainPage = new GoogleMainPage();
        GoogleResultPage googleResultPage = googleMainPage.search(query);
        Assert.assertEquals(googleResultPage.isResultCorrect(query),true);


    }

}


