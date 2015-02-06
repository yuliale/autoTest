package pageObjects;

import main.Utils;

public class YahooResultPage {
    String RESULT_LINK="//ol/li[1]//div[@class='res']//h3//a[@href]";

    public YahooResultPage() {Utils.waitForElementPresent(RESULT_LINK,10);}

    public String getResultText() {return Utils.getTextByXpath(RESULT_LINK);}

    public boolean isResultCorrect (String query) {return Utils.isAnyWordPresent(getResultText (),query);}




}
