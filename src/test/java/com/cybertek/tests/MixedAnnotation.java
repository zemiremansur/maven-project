package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MixedAnnotation {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.out.println("Setting up the drivers here");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUpTMethod(){
        System.out.println("Opening a browser");
        driver = new ChromeDriver();
        System.out.println("go to website and login");
        driver.get("https://google.com");
    }

    @Test
    public void testOne(){
        System.out.println("Testing testing testing: account info");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("logout");
        System.out.println("closing browser");
        driver.quit();

    }

    @AfterClass
    public void afterClass(){
        System.out.println("report everything");
    }


    @Test
    public void testTwo(){
        System.out.println("Testing testing testing: payment");
    }





}