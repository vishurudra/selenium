package com.training;

import com.training.util.WebDriverUtil;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleFillTest {
    @Test
    public void testGoogleFillChrome() {
        String baseUrl = "https://www.google.com/";

        WebDriver webDriver = WebDriverUtil.getDriver("CHROME");
        webDriver.get(baseUrl);
        String title = webDriver.getTitle();
        Assert.assertNotNull(title);
        System.out.println("Title" + title);
        WebElement inputbox = webDriver.findElement(By.name("q"));
        inputbox.sendKeys("selenium");
        try {
            Thread.sleep(30 * 100);
        } catch (Exception e) {

        }

        WebElement button = webDriver.findElement(By.name("btnK"));
        button.click();
        try {
            webDriver.close();
        } catch (Exception e) {

        }
    }


}
