package com.training.util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingUtil {


    public static void perform(WebDriver webDriver){
        webDriver.get("https://www.bing.com");
        WebElement webElement = webDriver.findElement(By.id("sb_form_q"));
        webElement.sendKeys("selenium");

        webElement.sendKeys(Keys.RETURN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String urlAfter=webDriver.getCurrentUrl();
        System.out.println(urlAfter);
        Assert.assertTrue(urlAfter.contains("search"));
    }
}
