package com.training.elements;

import com.training.util.WebDriverUtil;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseTest {


    static WebDriver driver;
    static String baseUrl = "";

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

}
