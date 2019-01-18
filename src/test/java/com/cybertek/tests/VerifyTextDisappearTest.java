package com.cybertek.tests;

import com.cybertek.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTextDisappearTest extends TestBase {


    @Test
    public void verify() {

        driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");

        WebElement text = driver.findElement(By.id("myDIV"));

        //   System.out.println(text.getText());

        Assert.assertTrue(text.isDisplayed());

        WebElement button = driver.findElement(By.xpath("//button[.='Toggle Hide and Show']"));

        button.click();

        Assert.assertFalse(text.isDisplayed());

        // same useful  with next line
        //  Assert.assertTrue(!text.isDisplayed());
        //   System.out.println(text.getText());

    }


    @Test

    public void verify2() {


        driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_html_remove");

        driver.manage().window().fullscreen();

        driver.switchTo().frame("iframResult");

        WebElement text = driver.findElement(By.xpath("//body/p"));

        Assert.assertTrue(text.isDisplayed());

        WebElement button = driver.findElement(By.xpath("//body/botton"));

        button.click();


        //  Assert.assertFalse(elementDisplayed(By.xpath("//body/p")));
    }

//    private boolean elementDisplayed(By xpath) {
//
//
//        try {
//            return   driver.findElement(xpath).isDisplayed();
//
//        }catch (NoSuchElementException e) {
//
//            return false;
//        }

//    }

    public boolean elementExists(By by) {

//        String name ;
//        By AAA;

        try {
            return driver.findElement(by).isDisplayed();

        } catch (NoSuchElementException e) {

            return false;
        }

    }




       public boolean elementDisplayedS(By by) {

           return driver.findElements(by).isEmpty();

       }
    }



