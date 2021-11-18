package com.training.wait;

import com.training.util.BingUtil;
import com.training.util.WebDriverUtil;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ImplicitWaitTest {

    @Test
    public void testBingWitImplicitWait() {
        WebDriver webDriver = WebDriverUtil.getDriver("CHROME");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BingUtil.perform(webDriver);
    }

    @Test
    public void testBingWitExplicitWait() {
        WebDriver webDriver = WebDriverUtil.getDriver("CHROME");
        webDriver.get("https://www.bing.com");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30);
        webDriverWait.until(ExpectedConditions.
                visibilityOf(webDriver.findElement(By.id("sb_form_q"))));
        WebElement webElement = webDriver.findElement(By.id("sb_form_q"));
        webElement.sendKeys("selenium");

        webElement.sendKeys(Keys.RETURN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String urlAfter = webDriver.getCurrentUrl();
        System.out.println(urlAfter);
        Assert.assertTrue(urlAfter.contains("search"));
    }
    @Test
    public void testFluent(){
        WebDriver webDriver = WebDriverUtil.getDriver("CHROME");

        Wait<WebDriver> wait = new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                        .ignoring(org.openqa.selenium.NoSuchElementException.class);
        webDriver.get("https://www.bing.com");
        wait.until(ExpectedConditions.
                visibilityOf(webDriver.findElement(By.id("sb_form_q"))));
        WebElement webElement = webDriver.findElement(By.id("sb_form_q"));
        webElement.sendKeys("selenium");

        webElement.sendKeys(Keys.RETURN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String urlAfter = webDriver.getCurrentUrl();
        System.out.println(urlAfter);
        Assert.assertTrue(urlAfter.contains("search"));

    }

    public void verifyLogo()
    {
        WebDriver webDriver = WebDriverUtil.getDriver("CHROME");
        webDriver.get("https://www.irctc.co.in");
        Wait<WebDriver> wait = new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
        wait.until(ExpectedConditions.
                visibilityOf(webDriver.findElement(By.className("h_logo"))));
        WebElement IrctcLogo = webDriver.findElement(By.className("h_logo"));
        Assert.assertEquals(true, IrctcLogo.isDisplayed());
    }
}




