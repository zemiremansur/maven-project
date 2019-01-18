package com.cybertek.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

    @Test
    public void test1() {
        String a = "A";
        String b = "A";

        Assert.assertEquals(a, b);


    }

    @Test
    public void test2() {
        String a = "A";
        String b = "AAA";

        Assert.assertTrue( b.contains(a));


    }

//    @Test
//    public void test3(){
//
//
//        WebElement element = null;
//
//   //     boolean b = 1 == 1;
//
//       Assert.assertTrue(element.isDisplayed());




  //  }
}