package com.web.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LinksTest {
    static WebDriver driver;

    @BeforeClass
    public void beforeClaas() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.utest.com/");
    }

    @Test
    public void testWhyUTestUrl() {
        WebElement action = driver.findElement(By.name("Why uTest"));
        action.click();
        String url = driver.getCurrentUrl();
        String expected = "https://www.utest.com/why-utest";
        assertEquals(url,expected);
        driver.get("https://www.utest.com/");

    }
    @Test
    public void testAboutUsUrl() {
        WebElement action = driver.findElement(By.name("About Us"));
        action.click();
        String url = driver.getCurrentUrl();
        String expected = "https://www.utest.com/about-us";
        assertEquals(url,expected);
        driver.get("https://www.utest.com/");

    }
    @Test
    public void testProjectsUrl() {
        WebElement action = driver.findElement(By.name("Projects"));
        action.click();
        String url = driver.getCurrentUrl();
        String expected = "https://www.utest.com/projects";
        assertEquals(url,expected);

    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
