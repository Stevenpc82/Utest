package com.web.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import static org.testng.Assert.assertEquals;

public class BecomeTest {
    static WebDriver driver;
    @BeforeClass
    public void beforeClaas() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.utest.com/");
    }

    @Test
    public void testBecomeButton() {
        WebElement action = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/a"));
        action.click();
        String url = driver.getCurrentUrl();
        String expected = "https://www.utest.com/signup";
        assertEquals(url,expected);


    }
    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
