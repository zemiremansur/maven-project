package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExemple {

    @Test

      public  void test(){

        System.out.println("starting");
        Assert.assertTrue(true);
        System.out.println("done");


    }
    @Test
    public void test2(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("starting");

        softAssert.assertTrue(false);

        softAssert.assertEquals("google", "etsy");

        System.out.println("done");

        softAssert.assertAll();

        System.out.println("really");

    }


    @Test

    public void test3(){

        SoftAssert softAssert = new SoftAssert();

        System.out.println("starting");


        softAssert.assertTrue(false);


        Assert.assertTrue(false);

        System.out.println("done");

        softAssert.assertAll();





    }



}
