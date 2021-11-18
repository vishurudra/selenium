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

public class FormTest {

    static WebDriver driver;
    static String baseUrl = "C:\\selenium-master\\selenium-master\\selenium-junit\\src\\test\\resources\\html\\example6.html";

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
    public  void testFillCorrect(){
        WebElement email=driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("psw"));
        WebElement repeatPassword = driver.findElement(By.name("psw-repeat"));
        email.sendKeys("v@gmail.com");
        password.sendKeys("123");
        repeatPassword.sendKeys("123");
        WebElement register = driver.findElement(By.className("registerbtn"));
        String urlBeforeSubmit = driver.getCurrentUrl();
        register.click();
        String urlAfterSubmit = driver.getCurrentUrl();
        Assert.assertNotEquals(urlAfterSubmit,urlBeforeSubmit);
        String contents = driver.getPageSource();
        System.out.println("contents-->"+contents);
        Assert.assertTrue(contents.contains("Done"));




    }


}
