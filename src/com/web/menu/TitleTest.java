package com.web.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;


public class TitleTest {
    static WebDriver driver;


    @BeforeClass
    public void beforeClaas() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.utest.com/");
    }

    @Test
    public void testWhyUTest() {

        WebElement element = driver.findElement(By.name("Why uTest"));
        String title1 = element.getText();
        String titleExpected = "Why uTest";
        assertEquals(title1,titleExpected);

    }

    @Test
    public void testAboutUs() {

        WebElement element = driver.findElement(By.name("About Us"));
        String title2 = element.getText();
        String titleExpected = "About Us";
        assertEquals(title2,titleExpected);



    }

    @Test
    public void testProjects() {

        WebElement element = driver.findElement(By.name("Projects"));
        String title3 = element.getText();
        String titleExpected = "Projects";
        assertEquals(title3,titleExpected);


    }

    @Test
    public void testLogIn() {

        WebElement element = driver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container" +
                "/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));
        String title4 = element.getText();
        String titleExpected = "Log In";
        assertEquals(title4, titleExpected);
    }

    @Test
    public void testContactUs() {

        WebElement element = driver.findElement(By.name("Contact Us"));
        String title5 = element.getText();
        String titleExpected = "Contact Us";
        assertEquals(title5,titleExpected);

    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }

}
