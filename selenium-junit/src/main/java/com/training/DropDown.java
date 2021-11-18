package com.training;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

@Slf4j
public class DropDown {

    public static void main(String args[]) {
        String edgeDriver = "C:\\selenium-master\\selenium-master\\edgedriver_win64\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", edgeDriver);

        WebDriver driver = new EdgeDriver();
        driver.navigate().to(
                "http://www.calculator.net/interest-calculator.html");
        driver.manage().window().maximize();

        //Selecting an item from Drop Down list Box
        Select dropdown = new Select(driver.findElement(By.id("ccompound")));
        dropdown.selectByVisibleText("continuously");

        //you can also use dropdown.selectByIndex(1) to select second element as
        //index starts with 0.
        //You can also use dropdown.selectByValue("annually");

        System.out.println("The Output of the IsSelected " +
                driver.findElement(By.id("ccompound")).isSelected());
        System.out.println("The Output of the IsEnabled " +
                driver.findElement(By.id("ccompound")).isEnabled());
        System.out.println("The Output of the IsDisplayed " +
                driver.findElement(By.id("ccompound")).isDisplayed());


        try {
            synchronized (driver) {
                driver.wait(2000);
            }
        } catch (InterruptedException e) {
            log.error("Exception e", e);
        }

        driver.quit();



    }
}
