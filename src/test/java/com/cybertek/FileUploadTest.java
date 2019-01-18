package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {


    @Test
    public void test(){


        //file upload class at saturday 1/5/2019

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        String path = "//Users//yimuran//Downloads//test.txt";

        chooseFile.sendKeys(path);

        driver.findElement(By.id("file-submit")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());


    }











}
