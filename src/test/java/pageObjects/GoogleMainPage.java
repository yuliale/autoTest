package pageObjects;

public class GoogleMainPage extends AbstractPage {
    public static String INPUT_GOOGLE_SEARCH_XP = "//input[@id='gbqfq']";
    public static String BUTTON_SEARCH_XP = "//*[@id='gbqfb']";
    public static String URL_GOOGLE_PAGE = "https://www.google.com.ua";


    // public static String getURL() {return URL_GOOGLE_PAGE;}


    public GoogleMainPage() {

        super(new String[]{INPUT_GOOGLE_SEARCH_XP, BUTTON_SEARCH_XP});
    }

}
       /* String[] elementsToBEPresent = new String[]{INPUT_GOOGLE_SEARCH_XP,BUTTON_SEARCH_XP};
        for(String xpath : elementsToBEPresent){
            Utils.waitForElementPresent(xpath,10);
        }

    }

    public void inputSearchQuery (String query){
        Utils.fillInputField(INPUT_GOOGLE_SEARCH_XP, query);
    }

    public void clickSearchButton (){
        Utils.clickButton(BUTTON_SEARCH_XP);

    }

    public GoogleResultPage search(String query){
        inputSearchQuery (query);
        clickSearchButton();
        return new GoogleResultPage();
    }



    public void prostoTak(){
        int[] intArray = new int[6];
        int[] intArray2 = new int[]{1,2,3};

        intArray[0] = 5;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        for (int element : intArray){
            System.out.println(element);
        }

    }
    */



