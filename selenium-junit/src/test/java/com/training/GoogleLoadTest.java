package com.training;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLoadTest {

    @Test
    public void testGoogleLoadChrome() {
        String baseUrl = "https://www.google.com/";
        String chromeDriverPath = "C:\\selenium-master\\selenium-master\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(baseUrl);
        String title = webDriver.getTitle();
        Assert.assertNotNull(title);
        System.out.println("Title" + title);
        try {
            webDriver.close();
        } catch (Exception e) {

        }
    }

    @Test
    public void testGoogleLoadFirefox() {
        String baseUrl = "https://www.google.com/";
        String firefaxDriver = "C:\\selenium-master\\selenium-master\\geckodriver-v0.29.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", firefaxDriver);
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get(baseUrl);
        String title = webDriver.getTitle();
        Assert.assertNotNull(title);
        System.out.println("Title" + title);
        try {
            webDriver.close();
        } catch (Exception e) {

        }
    }

    @Test
    public void testGoogleLoadEdge() {
        String baseUrl = "https://www.google.com/";
        String edgeDriver = "C:\\selenium-master\\selenium-master\\edgedriver_win64\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", edgeDriver);
        WebDriver webDriver = new EdgeDriver();
        webDriver.get(baseUrl);
        String title = webDriver.getTitle();
        Assert.assertNotNull(title);
        System.out.println("Title" + title);
        try {
            webDriver.close();
        } catch (Exception e) {

        }
    }


}
