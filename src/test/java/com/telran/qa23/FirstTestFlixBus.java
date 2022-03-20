package com.telran.qa23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestFlixBus {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd =new ChromeDriver();
        wd.get("https://global.flixbus.com/");
    }

    @Test
    public void openFlixBusTest() {
        System.out.println("Site FlixBus opened!");
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
