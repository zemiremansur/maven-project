package com.cybertek.tests;

import org.testng.annotations.Test;

public class OrderOfThings {

    @Test (priority = 1)
     public  void test1 (){
        System.out.println("Executed 1");
    }

    @Test (priority = 3)
    public  void test2 (){
        System.out.println("Executed 2");
    }

    @Test (priority = 2)
    public  void test3 (){
        System.out.println("Executed 3");
    }








}
