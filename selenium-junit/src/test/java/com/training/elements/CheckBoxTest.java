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

public class CheckBoxTest {

    static WebDriver driver;
    static String baseUrl = "C:\\selenium-master\\selenium-master\\selenium-junit" +
            "\\src\\test\\resources\\html\\example7.html";

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
    public  void testCheckBoxClick(){
        WebElement checkBox = driver.findElement(By.id("myCheck"));
        checkBox.click();
        WebElement p = driver.findElement(By.id("text"));
        Assert.assertEquals(p.getText(),"Checkbox is CHECKED");



    }
}
