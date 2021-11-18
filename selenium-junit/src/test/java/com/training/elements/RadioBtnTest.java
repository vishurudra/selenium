package com.training.elements;

import com.training.util.WebDriverUtil;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class RadioBtnTest {
    static WebDriver driver;
    static String baseUrl = "C:\\selenium-master\\selenium-master\\selenium-junit\\src\\test\\resources\\html\\example5.html";

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
    public void testYes(){
        WebElement yes= driver.findElement(By.id("yes"));
        yes.click();
        WebElement check = driver.findElement(By.id("buttoncheck"));
        check.click();
        WebElement output = driver.findElement(By.className("radiobutton"));
        String outputText = output.getText();
        Assert.assertEquals("Radio button is checked and it's value is Yes",outputText);
;    }

    @Test
    public  void testNo(){

    }

    @Test
    public void  testResetBeforeSelect() {
    }

    @Test
    public void  testResetAfterSelect(){
        WebElement yes= driver.findElement(By.id("yes"));
        yes.click();
        WebElement check = driver.findElement(By.id("buttoncheck"));
        check.click();
        WebElement reset = driver.findElement(By.xpath("/html/body/div[2]/form/p[2]/input[1]"));
        reset.click();
        System.out.println("selected--->" +yes.getAttribute("checked"));


    }


}
