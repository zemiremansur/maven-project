package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.WeakHashMap;

public class AmazonSearch {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");

        WebElement input = driver.findElement(By.id("twotabsearchtextbox"));

        input.sendKeys("iphone 8 plus");

        input.submit();

        // driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchterm+ Keys.ENTER);

        String actual = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");

        if (("iphone 8 plus").equals(actual)) {
            System.out.println("PASS");

        } else {
            System.out.println("FAIL");

        }
           driver.close();
    }
}










