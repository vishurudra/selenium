package com.training;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

@Slf4j
public class DoubleClick {

    public static void main(String args[]) {
        String edgeDriver = "C:\\selenium-master\\selenium-master\\edgedriver_win64\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", edgeDriver);

        WebDriver driver = new EdgeDriver();

        //
        driver.get("https://www.browserstack.com/");

        Actions ac = new Actions(driver);

        WebElement trialaction = driver.findElement(By.xpath("/html/body/div[1]/main/section/article/div[1]/div[1]/div/div/article/div/div/div/div[1]/div/div/div/div/span[1]/a"));
        log.info("trial action {}", trialaction);
        ac.doubleClick(trialaction).perform();

        try {
            synchronized (driver) {
                driver.wait(2000);
            }
        } catch (InterruptedException e) {
            log.error("Exception e", e);
        }


        log.info("final url {}", driver.getCurrentUrl());
        driver.quit();
    }
}
