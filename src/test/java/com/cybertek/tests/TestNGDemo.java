package com.cybertek.tests;

import org.testng.annotations.Test;

public class TestNGDemo {


    @Test
    public void testOne() {

     System.out.println("Hello world! ");


     String expected = "a";
     String actual = "b";

     if(expected.equals(actual)){

         System.out.println("PASS");
     }else {
         System.out.println("FAIL");
     }






    }
}