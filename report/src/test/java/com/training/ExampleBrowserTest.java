package com.training;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ExampleBrowserTest {

    @Test
    public void testBrowser(){
        String baseUrl = "https://www.google.com/";
        String chromeDriverPath="C:\\selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

        String URL= driver.getCurrentUrl();

        String title = driver.getTitle();


        String completeSourceCode = driver.getPageSource();


        driver.close(); //Closed opened window
    }
}
