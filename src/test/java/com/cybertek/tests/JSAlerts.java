package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void oopsTest(){
        driver.get("https://sweetalert.js.org/");
        // trigger the pop up
        driver.findElement(By.xpath("(//button[@class='preview'])[1]")).click();

        // switch to alert
        Alert alert = driver.switchTo().alert();

        alert.accept();  // clicking OK on a pop up
    }


    @Test
    public void dismiss(){
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        // trigger the pop up
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss(); // clicking Cancel on a pop up

    }

    @Test
    public void alertText(){
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        // trigger the pop up
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");   // typing on the alert
        alert.accept();
    }

}
