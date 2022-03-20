package com.telran.qa23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FlixBusTestId {
    WebDriver wds;

    @BeforeMethod
    public void setUp(){
        wds =new ChromeDriver();
        wds.get("https://global.flixbus.com");
    }

    @Test
    public void testName1(){
        WebElement element = wds.findElement(By.id("gatsby-focus-wrapper"));

    }

    @Test
    public void testName3(){
        wds.findElements(By.tagName("script"));
        List<WebElement> scr = wds.findElements(By.tagName("script"));
        System.out.println("script = " + scr.size());
    }

    @AfterMethod
    public void tearDown(){
        wds.quit();
//      wd.close();
    }
}
