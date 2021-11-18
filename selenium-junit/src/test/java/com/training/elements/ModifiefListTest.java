package com.training.elements;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ModifiefListTest extends BaseTest{
    static {
        baseUrl = "C:\\selenium-master\\selenium-master\\selenium-junit" +
                "\\src\\test\\resources\\html\\example9.html";
    }
    @Test
    public  void testAllLinks()
    {
        List<WebElement> linkedList = driver.findElements(By.linkText("click here"));
        Assert.assertEquals(linkedList.size(),2);
    }

}
