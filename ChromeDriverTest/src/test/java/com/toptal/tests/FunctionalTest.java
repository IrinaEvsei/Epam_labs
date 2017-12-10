package com.toptal.tests;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {

    protected static WebDriver driver;

    @BeforeTest
    public void openPage(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    @After
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    @AfterTest(description = "Stop browser")
    public void stopBrowser() {
        driver.quit();
    }
}
