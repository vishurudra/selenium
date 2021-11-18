package com.training.elements;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HiddenTest extends BaseTest{
    static {
        baseUrl="C:\\selenium-master\\selenium-master\\selenium-junit\\src\\test\\resources\\html\\hidden;.html";
    }

    @Test
    public  void testHidden(){
       WebElement hiden= driver.findElement(By.id("yes"));
        Assert.assertEquals(hiden.getAttribute("value"),"Yes");
    }
}
