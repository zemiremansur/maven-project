package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class HelpMe {

    public static WebDriver driver;

    @BeforeMethod
    public void beforeEachTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //max the window
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void afterEachTest() {
        if (driver != null) {
            driver.quit();
        }
    }



    public static void selectDropDownByIndex(By by, int index) {

      WebElement dropDownWebElement = driver.findElement(by);
       Select dropDown = new Select(dropDownWebElement);
        dropDown.selectByIndex(index);

    }

    public static void selectDropDownByVisiableTest(By by, String value) {

        WebElement dropDownWebElement = driver.findElement(by);
        Select dropDown = new Select(dropDownWebElement);
        dropDown.selectByVisibleText(value);

    }

    public static void clickBtn(By by){

        WebElement btn = driver.findElement(by);

        btn.click();
    }

    public  static void enterMessage(By by, String message){

        WebElement element = driver.findElement(by);
        element.sendKeys(message);










    }
}