package com.training;

import com.training.util.WebDriverUtil;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ModifiedGoogleLoadTest {

    @Test
    public void testGoogleLoadChrome() {
        String baseUrl = "https://www.google.com/";
        WebDriver webDriver = WebDriverUtil.getDriver("CHROME");
        webDriver.get(baseUrl);
        String title = webDriver.getTitle();
        Assert.assertNotNull(title);
        System.out.println("Title" + title);
        try {
            webDriver.close();
        } catch (Exception e) {

        }
    }

    @Test
    public void testGoogleLoadFirefox() {
        String baseUrl = "https://www.google.com/";
        WebDriver webDriver = WebDriverUtil.getDriver("FIREFOX");
        webDriver.get(baseUrl);
        String title = webDriver.getTitle();
        Assert.assertNotNull(title);
        System.out.println("Title" + title);
        try {
            webDriver.close();
        } catch (Exception e) {

        }
    }

    @Test
    public void testGoogleLoadEdge() {
        String baseUrl = "https://www.google.com/";
        WebDriver webDriver = WebDriverUtil.getDriver("EDGE");
        webDriver.get(baseUrl);
        String title = webDriver.getTitle();
        Assert.assertNotNull(title);
        System.out.println("Title" + title);
        try {
            webDriver.close();
        } catch (Exception e) {

        }
    }

    @Test
    public void testGoogleLoadHTML() {
        String baseUrl = "https://www.google.com/";
        WebDriver webDriver = WebDriverUtil.getDriver("");
        webDriver.get(baseUrl);
        String title = webDriver.getTitle();
        Assert.assertNotNull(title);
        System.out.println("Title" + title);
        try {
            webDriver.close();
        } catch (Exception e) {

        }
    }

}
