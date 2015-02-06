package pageObjects;

import main.AbstractTest;
import org.testng.annotations.Test;

/**
 * Created by yuliale on 1/26/2015.
 */
public class YahooSearchTest extends AbstractTest {

    @Test(groups = {"smoke","positive","regression"})

    public void searchYahoo(){
        String query="panda bear";

        //Utils.openPage(YahooMainPage.getUrlYahooPage());
        //YahooMainPage yahooMainPage=new YahooMainPage();
        //YahooResultPage yahooResultPage=yahooMainPage.search(query);
        //org.testng.Assert.assertEquals(yahooResultPage.isResultCorrect(query), true);


    }
}
