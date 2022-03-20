package com.telran.qa23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ContactsTest {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd =new ChromeDriver();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app");
       // wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/"); это другой способ написания команды высше
    }

    @Test
    public void testName(){

        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        wd.findElements(By.cssSelector("[href]"));
        wd.findElements(By.className("container"));
        wd.findElements(By.id("root"));
    }
    @Test
    public void testName2(){
        wd.findElements(By.tagName("script"));
        List<WebElement> scr = wd.findElements(By.tagName("script"));
        System.out.println("script = " + scr.size());
    }
    @AfterMethod
    public void tearDown(){
        wd.quit();
//        wd.close();
    }
}
