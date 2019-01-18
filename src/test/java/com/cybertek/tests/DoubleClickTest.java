package com.cybertek.tests;

import com.cybertek.TestBase;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class DoubleClickTest extends TestBase {

    @Test
    public void test(){

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        driver.switchTo().frame(("iframeResult"));

        Actions actions = new Actions(driver);

        WebElement text = driver.findElement(By.id("demo"));


        //double click on element
        // we need to add perform at the and of any action.

        actions.doubleClick(text).perform();

        Assert.assertTrue(text.getAttribute("style").contains("red"));
    }






}
