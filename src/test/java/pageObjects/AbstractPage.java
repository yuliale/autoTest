package pageObjects;


import static main.Utils.waitForElement;
import static main.Utils.waitForElementToDisappear;

/**
 * Created by yuliale on 2/3/2015.
 */
public class AbstractPage {
    public AbstractPage(String[] elementsToBePresent, String[] elementsToBeAbsent) {
        if (elementsToBePresent!=null){
            for (String xpath : elementsToBePresent) {
                waitForElement(10, xpath);
            }}
        if (elementsToBeAbsent!=null){
            for (String xpath : elementsToBeAbsent) {
                waitForElementToDisappear(10, xpath);
            }}

    }

    public AbstractPage(String[] elementsToBePresent){
        this (elementsToBePresent, null);
    }


}
