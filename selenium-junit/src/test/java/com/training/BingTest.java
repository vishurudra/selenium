package com.training;

import com.training.util.WebDriverUtil;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingTest {


    @Test
    public void testBingFill() {
        WebDriver webDriver = WebDriverUtil.getDriver("CHROME");
        perform(webDriver);
    }


    private void perform(WebDriver webDriver){
        try {
            webDriver.get("https://www.bing.com");
            WebElement webElement = webDriver.findElement(By.id("sb_form_q"));
            webElement.sendKeys("selenium");
            try {
                Thread.sleep(30 * 100);
            } catch (Exception e) {
            }
            webElement.sendKeys(Keys.RETURN);
            String urlAfter = webDriver.getCurrentUrl();
            Assert.assertTrue(urlAfter.contains("search"));
        }catch (Exception e){

        }finally {
            try{
                webDriver.close();
            }catch (Exception e){

            }
        }


    }
}
