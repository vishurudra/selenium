package com.training.elements;

import com.training.util.WebDriverUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class LinkTest {


    static WebDriver driver;
    static String baseUrl = "C:\\selenium-master\\selenium-master\\selenium-junit" +
            "\\src\\test\\resources\\html\\example9.html";

    @Before
    public  void init(){
        driver= WebDriverUtil.getDriver("CHROME");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }

    @After
    public  void clean(){
        driver.quit();
    }


    @Test
    public  void testAllLinks()
    {
        List<WebElement> linkedList = driver.findElements(By.linkText("click here"));
        Assert.assertEquals(linkedList.size(),2);
    }
}
