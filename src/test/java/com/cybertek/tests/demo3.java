package com.cybertek.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class demo3 extends HelpMe{


    @Test(enabled = false)
    public void amazonHomePageDropDown() throws InterruptedException {
        driver.get("https://www.amazon.com/");

        HelpMe.selectDropDownByIndex(By.id("searchDropdownBox"),1);

        Thread.sleep(5000);

    }

    @Test(enabled = false)
    public void google() throws InterruptedException {

        driver.get("https://www.google.com/");

        HelpMe.enterMessage(By.name("q"),"Java book");

        HelpMe.clickBtn(By.name("btnK"));


        Thread.sleep(5000);

    }

    @Test

    public void amazonHomePageDropDown2() throws InterruptedException {

        driver.get("https://www.amazon.com/");

        HelpMe.selectDropDownByVisiableTest(By.id("searchDropdownBox"),"Books");

        Thread.sleep(5000);

    }




}






