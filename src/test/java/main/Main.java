package main;

import org.testng.annotations.Test;

/**
 * Created by yuliale on 12/9/2014.
 */
public class Main {

    public static void main(String[] args) {

        @Test
                searchGoogle();
        @Test
                searchYahoo();
        @Test
                loginYahoo();
        @Test
                IceLoginTest();
    }
}
