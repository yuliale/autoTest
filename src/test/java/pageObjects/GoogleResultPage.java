package pageObjects;

import main.Utils;

/**
 * Created by yuliale on 12/19/2014.
 */
public class GoogleResultPage {
    String RESULT_LINK_XP= "//div[@id='ires']/ol/div/li[1]";

    public GoogleResultPage(){
        Utils.waitForElementPresent(RESULT_LINK_XP,10);
    }

    public String getResultText(){
        return Utils.getTextByXpath(RESULT_LINK_XP);
    }

    public boolean isResultCorrect (String query){
        return Utils.isAnyWordPresent(getResultText(),query);
    }



}
