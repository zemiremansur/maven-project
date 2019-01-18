package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.PortUnreachableException;

public class HTMLPopup {
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
    public void doNotDestroyTheWorldTest() {
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        driver.findElement(By.xpath("//span[.='Destroy the World']")).click();
        // locate an element in the pop up window and click
        driver.findElement(By.xpath("//span[.='No']")).click();
    }

    @Test
    public void oopsTest() {
        driver.get("https://sweetalert.js.org/");
        // trigger the pop up
        driver.findElement(By.xpath("(//button[@class='preview'])[2]")).click();
        // close the pop up
        driver.findElement(By.xpath("//button[.='OK']")).click();


    }
}



