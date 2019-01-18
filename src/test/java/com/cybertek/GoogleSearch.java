package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver  driver = new ChromeDriver();
        driver.get("https://www.google.com.hk/?client=safari&channel=iphone_bm&gws_rd=cr");

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("uyghur food ");
        search.submit();

      //  WebElement  image = ((ChromeDriver) driver).findElementByClassName("");












      // driver.close();








    }
}
