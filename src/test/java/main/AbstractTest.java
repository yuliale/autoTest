package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


@ContextConfiguration(locations={"/spring-config.xml"})
public class AbstractTest extends AbstractTestNGSpringContextTests{

    public static WebDriver webDriver;

    //annotation before any test
    @BeforeClass(alwaysRun = true)
    protected void setUp(){
        webDriver = new ChromeDriver();
    }

    @AfterClass(alwaysRun = true)
    protected void tearDown(){
        webDriver.quit();
    }

}
