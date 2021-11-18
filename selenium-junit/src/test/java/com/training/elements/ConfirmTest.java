package com.training.elements;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConfirmTest extends BaseTest{

    static {
        baseUrl =
                ("C:\\selenium-master\\selenium-master\\selenium-junit\\src\\test\\resources\\html\\example16.html");

    }

    @Test
    public void testConfirm(){
        WebElement confirmButton = driver.findElement(By.xpath("/html/body/div/div[11]/div/p[1]/button"));
        confirmButton.click();
        Alert confirm = driver.switchTo().alert();
        Assert.assertNotNull(confirm.getText());
        System.out.println("confirm--->"+confirm.getText());

        //for yes click confirm.accept
        confirm.accept();


        confirmButton.click();

        confirm.dismiss();

    }
}
