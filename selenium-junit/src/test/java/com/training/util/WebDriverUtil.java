package com.training.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebDriverUtil {

    public static WebDriver getDriver(String browser){
        WebDriver webDriver = null;

        switch (browser){
            case "CHROME":
                String chromeDriverPath = "C:\\selenium-master\\selenium-master\\chromedriver_win32\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                 webDriver = new ChromeDriver();
                 break;
            case "FIREFOX":
                String firefaxDriver = "C:\\selenium-master\\selenium-master\\geckodriver-v0.29.0-win64\\geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", firefaxDriver);
                 webDriver = new FirefoxDriver();
                 break;
            case "EDGE":
                String edgeDriver = "C:\\selenium-master\\selenium-master\\edgedriver_win64\\msedgedriver.exe";
                System.setProperty("webdriver.edge.driver", edgeDriver);
                 webDriver = new EdgeDriver();
                 break;
            default:
                webDriver =  new HtmlUnitDriver();
        }

        return  webDriver;
    }

}
