package com.training.elements;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertTest extends  BaseTest{

    static {
        baseUrl =
                ("C:\\selenium-master\\selenium-master\\selenium-junit\\src\\test\\resources\\html\\example16.html");

    }

    @Test
    public  void handleAlert(){
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[10]/div/p/button"));
        button.click();
       Alert alert =  driver.switchTo().alert();

       try{
           Thread.sleep(50*1000L);
       }catch (Exception e){

       }
        System.out.println("alert-->"+alert.getText());
        Assert.assertNotNull(alert.getText());
        alert.accept();


    }
}
