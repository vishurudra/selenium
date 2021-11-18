package com.training;

import com.training.util.BingUtil;
import com.training.util.WebDriverUtil;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BingGenericTest {


    @Test
    public void testBingFillWithChrome() {
        WebDriver webDriver = WebDriverUtil.getDriver("CHROME");
        BingUtil.perform(webDriver);
    }

    @Test
    public void testBingFillWithEdge() {
        WebDriver webDriver = WebDriverUtil.getDriver("EDGE");
        BingUtil.perform(webDriver);
    }

    @Test
    public void testBingFillWithFirefox() {
        WebDriver webDriver = WebDriverUtil.getDriver("FIREFOX");
        BingUtil.perform(webDriver);
    }


    @Test
    public void testBingFillWithHTML() {
        WebDriver webDriver = WebDriverUtil.getDriver("");
        BingUtil.perform(webDriver);
    }



}
