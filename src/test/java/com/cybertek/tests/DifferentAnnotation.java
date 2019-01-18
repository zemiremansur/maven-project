package com.cybertek.tests;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentAnnotation {

    @Test
    public  void testOne(){
        System.out.println("This is test one");
    }

    @BeforeMethod

    public void beforeMethod(){
        System.out.println("This is before method");
    }

    @Test

    public  void testTwo(){
      System.out.println("This is test two");
  }


    @AfterMethod

    public void afterMethod(){
        System.out.println("This is after method");
    }

    @AfterClass

    public void afterClass(){
        System.out.println("This is after class");
   }




}
